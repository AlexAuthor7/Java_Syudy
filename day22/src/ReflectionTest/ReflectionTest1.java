package ReflectionTest;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: Alex
 * @Date: 2020/12/6 - 12 - 06 -21:03
 * @Description: ReflectionTest
 * @Verxion: 1.0
 */
public class ReflectionTest1 {
    //反射之前，对于Person的操作
    @Test
    public void test1(){
        //1、创建类的对象
        Person p1 = new Person("Tom",12);
        //2、通过对象调用属性和方法，不可以调用私有的结构
    }
    //反射之后，对于Person的操作
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Person.class;
        //1、调用构造器\创建类的对象
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance("Tom", 23);
        Person p = (Person)obj;
        //2、调用类的属性和方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);//给属性赋值
        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
    }
    //获取Class的实例的方式(不是创建运行时类，因为运行时类在类加载时就已经存在)
    @Test
    public void test() throws ClassNotFoundException {
        //方式一：调用运行时类的属性：.class
        Class<Person> clazz1 = Person.class;
        //方式二：通过运行时类的对象,调用getClass()方法
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        //调用Class的静态方法：forName(String classPath)
        //要写明全类名（包括包名）
        Class clazz3 = Class.forName("ReflectionTest.ReflectionTest1Person");

        System.out.println(clazz1 == clazz2);//true
        System.out.println(clazz2 == clazz3);//true
        //3个运行时类的对象地址相同
        //2、换句话说，Class的实例就对应着一个运行时类
        //3、加载到内存中的运行时类，会缓存一定的时间，在此时间之内，
        // 我们可以通过不同的方式来获取运行时类

        //方式四：使用类的加载器
        ClassLoader clazz4 = ReflectionTest1.class.getClassLoader();

    }


}
