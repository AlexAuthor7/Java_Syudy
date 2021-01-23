package TotalEver;

public class Test {
    public static void main(String[] args) {
        GeometricObject g1 = new GeometricObject("white",1.0);

        Circle c1 = new Circle("white",1.0,1.0);

        Circle c2 = new Circle("white",1.0,1.0);
        //比较颜色
        System.out.println(c1.getColor().equals(c2.getColor()));
        //比较面积
        System.out.println(c1.equals(c2));
        //输出半径
        System.out.println(c1.toString());//圆的半径是：1.0
        System.out.println(c2);//圆的半径是：1.0
    }
}
