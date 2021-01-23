package homework;
/*
1、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
deposit()
写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额和月利
率。
提示： 在提款方法 withdraw 中，需要判断用户余额是否能够满足提款数额的要求，如果不
能，应给出提示。
运行结果如图所示
 */
public class Account {
    //属性
    private int id;//账号
    public double balance;//余额
    private double annualInterestRate;//年利率
    //构造器
    public Account(){}//空参构造器

    public Account(int id,double annualInterestRate) {
        this.id = id;
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //方法

    //调用id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //调用balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //调用annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }

    //取款方法
    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("你没有那么多钱");
        }else{
            this.balance -= amount;
        }

    }

    //存款方法
    public void deposit(double amount){
        this.balance += amount;
    }
    //打印余额
    public void print(){
        System.out.println("余额："+ this.balance + "，月利率："+ getMonthlyInterest()*100+"%");
    }
}
