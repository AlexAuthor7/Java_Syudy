import ReflectionTest.Person;
import org.junit.Test;

import java.util.Random;

/**
 * @Auther: Alex
 * @Date: 2020/12/14 - 12 - 14 -0:19
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class NewInstanceTest {
    /*
    通过反射创建运行时类的对象
     */
    @Test
    public void test() throws Exception {
        Class clazz = Person.class;
        //如果将Class<Person>，定义为泛型，就不强转了，newInstance()的返回值，就是Person类
        Person obj = (Person)clazz.newInstance();//Person类的对象
    }

    //体会反射的动态性
    @Test
    public void test2() throws Exception {
        int num = new Random().nextInt(3);//0,1,2
        String classPath = "";
        switch(num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "ReflectionTest.Person";
                break;
        }
        Object obj = getInstance(classPath);
        System.out.println(obj);
    }
    //此方法创建一个指定类的对象
    //classPath:指定类的全类名
    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }




}
