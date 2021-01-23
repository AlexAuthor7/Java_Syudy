package TotalEver;

public abstract class GeometricObject {
    protected String color;
    protected double weight;
    //构造器
    protected GeometricObject(){}
    protected GeometricObject(String color,double weight){
        this.color =color;
        this.weight = weight;
    }

    //取值赋值
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {

        this.weight = weight;
    }

    //求圆的面积
    public abstract double findArea();
}
