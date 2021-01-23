package ObjectClass;
/*  java.lang.Object类的使用
 *   1、Object类是所有Java类的根父类
 *   2、如果在类的声明中未使用extends关键字指明其父类， 则默认父类
 *      为java.lang.Object类
 *   3、Object类中定义的功能（属性、方法）具有通用性
 *   4、Object类只声明了一个空参的构造器
 */

public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        //获取类的父类
        System.out.println(order.getClass().getSuperclass());//class java.lang.Object
    }
}
class Order{}