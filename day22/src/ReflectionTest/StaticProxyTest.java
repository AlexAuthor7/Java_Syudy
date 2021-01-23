package ReflectionTest;

/**
 * @Auther: Alex
 * @Date: 2020/12/15 - 12 - 15 -13:31
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
/*
静态代理的举例
1、接口、代理类、被代理类
2、特点：代理类和被代理了在编译期间就已经被确定下来
 */

interface ClothFactory{
    void product();
}
//代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory factory;//就拿被代理类的对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void product() {
        System.out.println("代理工厂做一些准备工作");
        factory.product();//调用被代理类的方法
        System.out.println("代理工厂做一些后续的首位工作");

    }
}
//被代理类
class NikeClothFactory implements ClothFactory{
    @Override
    public void product() {
        System.out.println("Nike工厂生产一批运动服");
    }
}


public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类的对象
        NikeClothFactory nike = new NikeClothFactory();

        //创建代理类的对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.product();//通过代理类调用被代理类中的方法
    }
}
