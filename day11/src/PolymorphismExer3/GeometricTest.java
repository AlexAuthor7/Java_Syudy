package PolymorphismExer3;
/*
定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形， MyRectangle代表矩形。
定义一个测试类GeometricTest， 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
数类型，利用动态绑定技术）。
 */

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();//创建测试对象
        GeometricObject g1 = new GeometricObject("红色",10);//初始化几何
        GeometricObject r1 = new Circle("蓝色",8,4);//初始化圆形
        GeometricObject m1 = new MyRectangle("绿色",6,4);//初始化矩形


        //比较测试对象面积
        test.equalsArea(r1,m1);

        //显示圆形面积
        test.displayGeometricObject(r1);
        //显示矩形面积
        test.displayGeometricObject(m1);

    }

    //比较测试对象面积
    public void equalsArea(GeometricObject r,GeometricObject m){
        //向下转型
        Circle r1 = (Circle)r;
        MyRectangle m1 = (MyRectangle)m;
        if(r1.findArea() == m1.findArea()){
            System.out.println("面积相等");
        }else if(r1.findArea() > m1.findArea()){
            System.out.println("圆形面积大");
        }else{
            System.out.println("矩形面积大");
        }

    }
    //显示对象的面积
    public void displayGeometricObject(GeometricObject e){
        //向下转型
        if(e instanceof Circle){
            Circle r1 = (Circle)e;
            System.out.println(r1.findArea());
        }else{
            MyRectangle m1 = (MyRectangle)e;
            System.out.println(m1.findArea());
        }
    }
}
class GeometricObject{
    //属性
    String color;
    double weight;

    //构造器
    public GeometricObject(){}

    public GeometricObject(String color,double weight) {
        this.color = color;
        this.weight = weight;
    }

    //方法
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }



}

class Circle extends GeometricObject{
    double radius;

    //构造器
    public Circle(){
    }
    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    //方法
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //计算圆的面积
    public double findArea(){
        return getRadius()*getRadius()*3.1415;
    }
}

class MyRectangle extends GeometricObject{
    double height;

    //构造器
    public MyRectangle(){}
    public MyRectangle(String color, double weight, double height) {
        super(color, weight);
        this.height = height;
    }

    //方法
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        return getHeight()*getWeight();
    }

}

