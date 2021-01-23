package InnerClass;
/*
类的内部成员：内部类
一、内部类的分类：成员内部类(直接定义在一个类里面) vs 局部内部类(定义在方法内、代码块内、构造器内)

二、成员内部类：
 1、作为外部类的成员
   > 调用外部类的结构
   > 可以用static修饰
   > 可以用权限修饰符 修饰
 2、作为一个类：
   > 定义：属性、方法、构造器、代码块、内部类
   > 继承
   > 可以被final修饰-->不能被继承
   > 可以被abstract修饰-->不能实例化

三、关注一下问题
 1、如何实例化  成员内部类对象
   > 静态 "Person.Dog = new Person.Dog();"
   > 非静态 ”Person p = new Person();
            Person.Bird bird = p.new Bird();“
 2、如何在成员内部类中 区分调用外部了的结构
   > name -- 方法的形参
   > this.name -- 内部类的属性
   > Person.this.name -- 外部类的属性
 3、开发中,局部内部类的使用
   > 见分割线下方

 */

public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog类的实例(静态成员内部类)
        Person.Dog dog = new Person.Dog();//“外部类.内部类”

        //创建Bird类的实例(非静态成员内部类)
        Person p = new Person();//先创建外部类的实例
        Person.Bird bird = p.new Bird();//
    }
}
class Person{
    String name;
    public void eat(){
        System.out.println("吃饭");
    }
    //静态成员内部类
    static class Dog{}//直接声明在类中

    //非静态成员内部类
    public class Bird{//可以被权限修饰符 修饰
       String name;
       public void show(){
           eat();//调用外部类的结构
           Person.this.eat();//有重名的 要这样调用
       }
       public void disPlay(String neam){
           System.out.println(name);//方法的形参
           System.out.println(this.name);//内部类的属性
           System.out.println(Person.this.name);//外部类的属性
       }
    }

    //局部内部类(开发中少见)
    public void method(){
        class AA{}//声明在方法内
    }
    {
        class BB{}//声明在代码块内
    }
    public Person(){
        class CC{}//声明在构造器内
    }



//******************************************************
    //局部内部类(常见)
    //返回一个Comparable接口的类的对象：局部内部类
    public Comparable getComparable(){

        //方式一：创建一个实现了Comparable的类

//        class MyComparable implements Comparable{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        //方式二：创建了一个实现这个接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };//加一个分号
    }
}