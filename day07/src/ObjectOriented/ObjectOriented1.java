package ObjectOriented;
/*
一、学习面向对象内容的三条主线
    1.Java类及类的成员：属性、方法、构造器；代码块、内部类
    2.面向对象的三大特征：封装性，继承性，多态性
    3.其它关键字：this、super、static、final、abstract

二、步骤，类的对象和使用（面向对象思想落地和实现）：
①设计类，其实就是设计类的成员(类似细胞的结构)
         常见类的成员：①属性：对应类中的成员变量 = field = 域、字段
                     ②方法：对应类中的成员方法 = ne==method = 函数

②创建类的对象 = 类的实例化 = 实例化类

③调用对象的属性和方法
       格式   （对象。属性）
             （对象。方法）

三、说明
> 如果创建了多个类的对象，则每个对象都独立拥有一套类独属性（非static的）
> 如果修改一个对象的属性A,则不影响另一个对象B的属性


四、对象的内存解析

*/

public class ObjectOriented1 {
    public static void main(String[] args) {
        //创建类的对象
        Person p1 = new Person();//创建类的对象 = 类的实例化 = 实例化类
        //类似 Scanner scan = new Scanner(System.in);

        //调用对象的属性    结构：（对象。属性）
        p1.name = "lyhsb";
        p1.isMale = true;
        System.out.println(p1.name);//lyhsb
        System.out.println(p1.age);//1

        //调用对象的方法    结构：（对象。方法）
        p1.eat();
        p1.sleep();
        p1.speak("Chinese");

        //**********************************
        //属性有默认初始化值
        Person p2 = new Person();
        System.out.println(p2.name);//null

        //******************************
        //对象的赋值，类似数组，指向堆空间的同一个对象实体，把对应地址给  p3  ，但不单独在堆中开辟空间
        Person p3 = p1;
        System.out.println(p3.name);//lyhsb
        p3.age = 5;
        System.out.println(p3.age);//5
        System.out.println(p1.age);//5 注意：赋给p3的值也赋给了p1
    }
}
class Person{//设计类
    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以碎觉");
    }
    public void speak(String language){
        System.out.println("人可以说话,使用的是：" + language);
    }
}