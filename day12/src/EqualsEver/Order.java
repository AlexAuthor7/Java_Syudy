package EqualsEver;
/*
1.编写Order类，有int型的orderId， String型的orderName，相应的
getter()和setter()方法，两个参数的构造器，重写父类的equals()方法：
public boolean equals(Object obj)， 并判断测试类中创建的两个对象是否
相等。
 */

public class Order {
    int orderId;
    String orderName;

    //构造器
    public Order(String orderName, int orderId) {
        this.orderName = orderName;
        this.orderId = orderId;
    }

    //取值赋值

    //orderTd
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    //orderName
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    //重写equals 方法
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Order) {
            Order order = (Order)obj;//不转换，无法调用Order中特有的属性
            if(this.orderId == order.orderId && this.orderName.equals(order.orderName)){
                return true;
            }

        }
        return false;
    }
    //重写toString()方法
    public String toString() {
        return "Order[orderName=" + orderName + ",orderId=" + orderId+"]";
    }
}