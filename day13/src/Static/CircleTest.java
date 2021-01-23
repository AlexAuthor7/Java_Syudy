package Static;
/* static 关键字的应用
 *
 *
 *
 *
 */

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        //非static,init2每创建一个对象就重新赋值
        System.out.println(c1.getId2());//1001
        System.out.println(c2.getId2());//1001

        //static，init在类加载时就已经赋值，static声明的属性被所有对象共享
        System.out.println(c1.getId());//1001
        System.out.println(c2.getId());//1002,static的作用

        System.out.println(c1.total);//2,计数，调用了该类多少次
        System.out.println(c2.total);//2,计数，调用了该类多少次


    }
}
class Circle{
    private double radius;
    private int id;
    private int id2;

    public Circle(){
        id = init++;//id自动加1
        id2 = init2++;
        total++;
    }
    public Circle(int id){
        this();//调用空参构造器，方便计数
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public int getId2() {
        return id2;
    }

    //使用static
    private static int init = 1001;
    static int total = 0;

    //不使用static
    private int init2 = 1001;

    public double findArea(){
        return Math.PI*radius*radius;
    }
}