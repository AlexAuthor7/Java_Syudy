package Methord;
/*1、基本数据类型的赋值，是给数据值
 *2、引用类数据型的赋值，不是给数据值，是给地址值，指向堆空间中同一个对象实体
 *
 */

public class ValueTransfer {
    public static void main(String[] args) {

        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;//不是赋值，是给地址
        System.out.println("o1=" + o1.orderId + ",o2=" + o2.orderId);
        //o1=1001,o2=1001
        o2.orderId = 1002;//
        System.out.println("o1=" + o1.orderId + ",o2=" + o2.orderId);
        //o1=1002,o2=1002

    }
}
class Order{
    int orderId;
}
