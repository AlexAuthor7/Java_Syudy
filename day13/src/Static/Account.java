package Static;
/*
编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
码”、“存款余额”、“利率”、“最小余额”，定义封装这些
属性的方法。 账号要自动生成。
编写主类，使用银行账户类，输入、输出3个储户的上述信息。
考虑：哪些属性可以设计成static属性。
 */

public class Account {
    public static void main(String[] args) {
        Customer c1 = new Customer(123,1000);
        Customer c2 = new Customer(123,2000);
        Customer c3 = new Customer(123,3000);

        //打印信息
        c1.getInfo();
        c2.getInfo();
        c3.getInfo();

    }
}
class Customer{
    private int id;
    private int keys;
    private double balance;
    private static double rate = 0.12;
    private static double minBalance = 100;

    private static int init = 1001;//用于自动生成id

    //构造器

    public Customer() {
        this.id = init;
        init++;
    }

    public Customer( int keys, double balance) {
        this();
        this.keys = keys;
        this.balance = balance;
    }

    //取值赋值
    public int getId() {
        return id;
    }

    public int getKeys() {
        return keys;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static int getInit() {
        return init;
    }

    //打印信息
    public void getInfo(){
        System.out.println("账号："+id+",密码："+keys+"，余额："+balance);
    }

}