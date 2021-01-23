package EqualsEver;

public class EqualTest {
    public static void main(String[] args) {
        Order o1 = new Order("Tom",18);
        Order o2 = new Order("Tom",18);

        System.out.println(o1.equals(o2));

    }

}
