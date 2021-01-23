package InfterfaceEver;

public class ComparebleCircle extends Circle implements CompareObject {

    public ComparebleCircle(int radius) {
        super(radius);
    }

    @Override
    public double compareTO(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof CompareObject){
            Circle circle = (Circle)o;
            return  getRadius() - circle.getRadius();
        }
        return 0;
    }
}
