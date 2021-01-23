package ToString;
/* Object类中String()的使用
 *
 *  1、当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *  2、Object类中的toString()的定义：
 *    public String toString() {
 *       return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *    }
 *  3、像String、Date、File、包装类都重写了 Object 类中的 toString() 方法
 *     使得在调用对象的 toString() 方法时，返回“实体内容”信息
 *
 *  4、自定义类也可以重写 toString() 方法，当调用此方法时，返回对象的“实体内容”
 */

import EqualsEver.Order;

import java.util.Date;

public class ToString {
    public static void main(String[] args) {
        Order o1 = new Order("Tom",18);//在EqualsEver包中
        System.out.println(o1.toString());//EqualsEver.Order@7ef20235
        //重写后  Order[orderName=Tom,orderId=18]

        System.out.println(o1);//EqualsEver.Order@7ef20235  //地址值
        //重写后  Order[orderName=Tom,orderId=18]
        String str = new String("MM");
        System.out.println(str);//MM

        Date date = new Date(1212);
        System.out.println(date);//Thu Jan 01 08:00:01 GMT+08:00 1970
    }
}
