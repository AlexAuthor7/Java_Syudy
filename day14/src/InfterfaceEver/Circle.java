package InfterfaceEver;

public class Circle {
    private double radius;

    //构造器
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    //取值
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
interface CompareObject{
    public double compareTO(Object o);
}