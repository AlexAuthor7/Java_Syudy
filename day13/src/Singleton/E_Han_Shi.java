package Singleton;

//饿汉式
public class E_Han_Shi {
    public static void main(String[] args) {

        Bank bank1 = Bank.getInstance();//不用new
        Bank bank2 = Bank.getInstance();//正常情况是 ： 左边声明，右边创建

        //ps：bank1 和 bank2 是一个对象
        System.out.println(bank1 == bank2);//true,地址值一样，是一个对象

    }
}
class Bank{
    //① 私有化类的构造器
    private Bank(){}

    //② 内部创建类的对象
    private static Bank instance = new Bank();

    //③ 提供 公共 静态的方法，返回类的对象
    //④ 要求此对象也必须声明为静态的
    public static Bank getInstance(){//使用静态方法，不用创建对象也能调用
        return instance;
    }
}

