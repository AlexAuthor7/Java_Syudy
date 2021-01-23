package ThreadEver;

/**
 * @Auther: Alex
 * @Date: 2020/12/1 - 12 - 01 -18:33
 * @Description: ThreadEver
 * @Verxion: 1.0
 */
public class BankTest {
}
class Bank2{
    private Bank2(){}

    private  static  Bank2 instance = null;

    public static Bank2 getInstance(){
        //方式一：效率低
        /*
        synchronized (Bank.class){
            if(instance == null){
                instance = new Bank();
            }
            return instance;
        }
        */

        //方法二：双重检查，效率高
        if(instance == null){
            synchronized (Bank2.class){
                if(instance == null){
                    instance = new Bank2();
                }
            }
        }
        return instance;
    }
}