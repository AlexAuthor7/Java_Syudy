package Abstract;
/* java 第四大特征 抽象性(abstract 关键字的使用)
 * 一、抽象类
 *   1、概念:有时将父类设计得非常抽象,以至于没有具体的实例,这样的类叫做抽象类
 * 二、abstract 关键字的使用
 *   1、abstract 可以用来修饰的结构:方法,类
 *   2、abstract 修饰类 (抽象类)
 *     ① 此类不能被实例化
 *     ② 抽象类中一定有构造器,便于子类对象实例化时调用(涉及子类对象实例化的全过程)
 *     ③ 开发中 ,都会提供抽象类的子类 ,让子类对象实例化 ,完成相关操作
 *
 *   3、abstract 修饰方法 (抽象方法)
 *     ① 即只有方法的声明,没有方法体
 *     ② 包含抽象方法的类一定是抽象类(防止创建方法后,调用抽象方法),反之,抽象类中不一定要有抽象方法
 *     ③ 若父类是抽象类,且含有抽象对象,则子类中必须重写这些抽象对象
 *
 * 三、abstract 使用上的注意点：
 *    1、abstract 不能修饰：属性、构造器、代码块等结构
 *    2、abstract 不能修饰私有方法(私有方法不能被重写)、静态方法(静态方法不能被覆盖)
 *       被final 修饰过的类和方法
 *
 *
 */

public class AbstractTest {
    public static void main(String[] args) {
        //Person p1 = new Person();
        //报错,Person被abstract修饰,不能被实例化


    }
}
abstract class Person{
    String name;
    int age;

    //构造器
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法
    abstract public void eat();
    public void walk(){
        System.out.println("走路");
    }
}

class Student extends Person{
    public Student(String name,int age){
        super();
    }
    public void eat(){//

    }
}