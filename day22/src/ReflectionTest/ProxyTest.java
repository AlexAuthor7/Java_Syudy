package ReflectionTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Alex
 * @Date: 2020/12/15 - 12 - 15 -14:03
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
/*
动态代理举例
要想是心啊动态代理，需要解决的问题
问题一：如何根据加载到内存中的被代理类，倒台地创建一个代理类的对象
*

问题二：当通过代理类的对象调用方法时，如何带太地区调用代理类中的同名方法

 */

class ProxyFactory{
    //问题一：调用此方法，返回一个代理类的对象
    public static Object getProxyInstance(Object obj){
        //obj：被代理类的对象
        //创建一份InvocationHandler类的对象
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
class MyInvocationHandler implements InvocationHandler {
    //创建被代理类的对象
    private Object obj;//赋值时，也需要使用被代理类的对象进行赋值

    public void bind (Object obj){
        this.obj = obj;
    }
    //当我们通过代理类的对象，调用方法a时，就会自动地调用如下的方法：invoke();
    //将被代理类要执行的方法a的功能声明在invoke()中

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method：即为代理类的对象调用的方法，此方法就作为了被代理类对象调用的方法
        //obj: 被代理类的对象
        Object returnValue = method.invoke(obj,args);
        //上述方法中的返回值就作为当前类的对象中的invoke()的返回值
        return returnValue;
    }
}




public class ProxyTest {
    public static void main(String[] args) {
        //创建一个被代理类的对象
        SuperMan superMan = new SuperMan();

        //创建一个代理类的对象
        Human proxyInstance = (Human)ProxyFactory.getProxyInstance(superMan);

        //用代理类调用方法
        //当我们通过代理类的随想调用方法时，会自动调用被代理类中同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");

        NikeClothFactory nikeClothFactory = new NikeClothFactory();

        ClothFactory proxyClothFactory  = (ClothFactory)ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyClothFactory.product();
    }
}

interface Human{
    String getBelief();
    void eat(String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I belive I can fly";
    }
    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}
