package Singleton;

//懒汉式
public class Lan_Han_Shi {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);//true
    }
}
class Order{
    //① 私有化类的构造器
    private Order(){}

    //② 内部 声明 的对象,没有初始化  (注意，是声明 不是创建)
    private static Order instance = null;//与饿汉的主要区别

    //③ 提供 公共 静态的方法，返回类的对象
    //④ 要求此对象也必须声明为静态的
    public static Order getInstance(){
        if(instance == null){//判断是否已经创建对象
            instance = new Order();//创建类的对象
        }

        return instance;
    }
}
