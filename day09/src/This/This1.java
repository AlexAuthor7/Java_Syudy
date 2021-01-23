package This;
/* 关键字：this的使用
 * 1、this可以用来修饰：属性、方法、构造器
 *
 * 2、this修饰属性、方法：
 * this理解为：当前对象
 *
 *  > 在类的方法中，可以使用 ”this.属性“ 或 ”this.方法“ 的格式，
 *    调用当前对象的 属性和方法 。
 *
 *  > 通常我们省略”this。“
 *  > 但是，方法的形参和类的属性同名时，我们必须显式的使用”this.变量名“
 *    的方式，表明此变量是属性，而非形参。
 *
 * 3、this调用构造器
 *
 *
 */

public class This1 {

}
class Person { // 定义Person类
    private String name;
    private int age;


    public Person(){
        this.getInfo();
    }
    public Person(int age){
        this();//this 调用构造器
        this.age = age;
    }
    public Person(String name, int age) {//同名时使用
        this(age);//形参给this(age),再到上面的构造器，再形参给this.age
        this.name = name;//this,表示当前对象
    }
    public void getInfo() {
        System.out.println("姓名： " + name);
        this.speak();
    }
    public void speak() {
        System.out.println("年龄：" + this.age);
    }
}