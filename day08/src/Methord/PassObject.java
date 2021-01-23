package Methord;
/*
 *（1）定义一个Circle类， 包含一个double型的radius属性代表圆的半径， 一个
 *     findArea()方法返回圆的面积。
 *（2）定义一个类PassObject， 在类中定义一个方法printAreas()， 该方法的定义
 *     如下： public void printAreas(Circle c, int time)
 *     在printAreas方法中打印输出1到time之间的每个整数半径值， 以及对应的面积。
 *     例如， times为5， 则输出半径1， 2， 3， 4， 5， 以及对应的圆面积。
 *（3）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。 程序运行结果
 *     如图所示。
 */


public class PassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();//声明Circle对象
        PassObject p = new PassObject();//声明PassObject对象


        p.printAreas(circle,5);//因为printAreas中已经声明Circle对象，所以main方法中也要声明才能调用
        System.out.println("now radius is :" + circle.radius);

    }
    public void printAreas(Circle c,int time){//Circle c表示声明circle对象
        System.out.println("Radius\t\tArea");
        for(int i = 1;i <= 5;i++){
            c.radius = i;
            System.out.println(c.radius +"\t\t\t"+ c.findArea());

            c.radius = time + 1;
        }
    }

}
class Circle{
    double radius;
    double PI = 3.14159265;
    public double findArea(){
        return PI*radius*radius;//返回值
    }

}
