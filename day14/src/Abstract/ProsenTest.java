package Abstract;
/* 抽象类的匿名子类
 *
 *
 *
 *
 */

public class ProsenTest {
    public static void main(String[] args) {
        //匿名对象
        methodA(new OrderA());

        //非匿名的类 非匿名对象
        OrderB o1 = new OrderB();
        methodB(o1);

        //匿名对象 非匿名的类
        methodB(new OrderB());

        //匿名的类 匿名的对象
        Order o2 = new Order(){
            //创建了一个匿名子类的对象

            //注意重写抽象方法
            @Override
            public void eat() {

            }
        };//注意分号
        methodA(o2);

    }
    public static void methodA(Order o){
        o.eat();
    }
    public static void methodB(OrderB o){
        o.eat();
        o.sleep();
    }

}
abstract class Order{
    public Order() {
    }

    public abstract void eat();//注：抽象方法没有方法体
}
class OrderA extends Order{
    @Override
    public void eat() {

    }
}
class OrderB extends Order{
    @Override
    public void eat() {

    }

    public void sleep(){
        System.out.println("睡觉");
    }

}



