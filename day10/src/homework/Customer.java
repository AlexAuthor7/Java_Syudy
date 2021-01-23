package homework;

public class Customer {
    public static void main(String[] args) {
        Account c1 = new Account(1122,20000,0.045);

        c1.withdraw(30000);//取30000元

        c1.print();//打印余额，月利率
        c1.withdraw(2500);//取2500元
        c1.deposit(3000);//存3000元

        //**************************************************************
        System.out.println("******************************************");
        CheckAccount c2 = new CheckAccount(1122,20000,0.045,5000);
        //1
        c2.withdraw(5000);
        c2.print();
        //2
        c2.withdraw(18000);
        c2.print();
        //3
        c2.withdraw(3000);
        c2.print();

    }
}
