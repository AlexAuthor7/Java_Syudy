package Construcror;
/*
编写两个类， TriAngle和TriAngleTest， 其中TriAngle类中声明私有的底
边长base和高height， 同时声明公共方法访问私有变量。 此外， 提供类
必要的构造器。 另一个类中使用这些公共方法， 计算三角形的面积。
 */
public class TriangleTest {
    public static void main(String[] args) {

        Triangle t = new Triangle(3,4);
        System.out.println("三角形的面积十：" + (t.getBase()*t.getHeight())/2);
    }
}
class Triangle{
    private float base;
    private float height;

    //构造器
    public Triangle(float b,float h){
        base = b;
        height = h;
    }


    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }
}
