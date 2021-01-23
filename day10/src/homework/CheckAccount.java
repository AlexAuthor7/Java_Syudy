package homework;
/*
2、创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
如果（取款金额<账户余额），
可直接取款
如果（取款金额>账户余额），
计算需要透支的额度
判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
将账户余额修改为 0，冲减可透支金额
如果不可以
提示用户超过可透支额的限额
要求： 写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。
使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额。
再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。
再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。
提示：
（1） 子类 CheckAccount 的构造方法需要将从父类继承的 3 个属性和子类自己的属性全
部初始化。
（2） 父类Account的属性balance被设置为private，但在子类CheckAccount的withdraw
方法中需要修改它的值，因此应修改父类的 balance 属性，定义其为 protected。
 */

public class CheckAccount extends Account {
    private double overdraft;
    protected double balance;


    //构造器

    public CheckAccount(int id, double balance,double annualInterestRate,double overdraft) {
        super(id,annualInterestRate);
        this.balance = balance;
        this.overdraft = overdraft;

    }

    //取款方法
    public void withdraw(double amount){
        if(amount < this.balance){
            this.balance -= amount;
        }else{
            if(amount - this.balance <= this.overdraft){
                this.balance = 0;
                this.overdraft -= amount - this.balance;
            }else{
                System.out.println("超过可透支限额");
            }
        }

    }
    //打印信息
    public void print(){
        System.out.println("余额："+ this.balance + "，可透支余额："+ this.overdraft);
    }
}
