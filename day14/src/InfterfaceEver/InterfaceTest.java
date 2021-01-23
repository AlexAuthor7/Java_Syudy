package InfterfaceEver;

public class InterfaceTest {
    public static void main(String[] args) {
        CompareObject c1 = new ComparebleCircle(3);
        CompareObject c2 = new ComparebleCircle(3);

        System.out.println(c1.compareTO(c2));
    }
}
