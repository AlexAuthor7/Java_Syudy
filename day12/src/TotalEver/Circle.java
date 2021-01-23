package TotalEver;

public class Circle extends GeometricObject{
    private double radius;

    //构造器
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    //取值赋值
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //计算圆面积
    public double findArea(){
        return radius*radius*3.1415;
    }
    //重写equals()方法
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle circle = (Circle)obj;
            return this.findArea() == circle.findArea();
        }
        return false;
    }

    //重写toString()方法
    public String toString(){
        return "圆的半径是：" + this.radius;
    }

}
