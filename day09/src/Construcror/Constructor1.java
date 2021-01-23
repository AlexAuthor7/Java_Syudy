package Construcror;
/* 类的结构之三：构造器（或构造方法、construtor)的说明
 *
 * 一、构造器的使用：
 *  1、创建对象
 *  2、初始化对象的信息
 *
 * 二、说明
 *  1、如果没有显式的定义类的构造器的话 ，则系统默认提供一个空参的构造器
 *  2、定义构造器的格式，权限修饰符 类名（形参列表）
 *  3、一个类中定义的多个构造器，彼此构成重载
 *  4、一旦显式的的定义了构造器后，系统就不再提供空参的构造器
 *  5、一个类中至少有一个构造器
 *
 * 三、属性的赋值顺序
 *  ①默认初始化
 *  ②显式初始化
 *  ③构造器
 *  ④对象  ”对象.方法“  和  ”对象.属性“  赋值
 *
 *  顺序：① - ② - ③ - ④
 *
 * 三、JavaBean的概念
 *     JavaBean是一种Java语言写成的可重用组件。
 *     所谓javaBean，是指符合如下标准的Java类：
 *          类是公共的
 *          有一个无参的公共的构造器
 *          有属性，且有对应的get、 set方法
 *      用户可以使用JavaBean将功能、处理、值、数据库访问和其他任何可以
 *         用Java代码创造的对象进行打包，并且其他的开发者可以通过内部的JSP
 *         页面、 Servlet、其他JavaBean、 applet程序或者应用来使用这些对象。用
 *         户可以认为JavaBean提供了一种随时随地的复制和粘贴的功能，而不用关
 *         心任何改变。
 */

public class Constructor1 {
    public static void main(String[] args) {
        //创建对象       类 + 构造器
        Person p = new Person();

        Person p1 = new Person("Tom");
        System.out.println(p1.name);
    }



}
class Person{
    //属性
    String name;
    int age;

    //构造器
    public Person(){
        System.out.println("Person...");
    }
    public Person(String n){//构造器的重载
        name = n;
    }


    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }
}
