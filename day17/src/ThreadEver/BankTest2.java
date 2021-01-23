package ThreadEver;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Alex
 * @Date: 2020/12/2 - 12 - 02 -12:47
 * @Description: ThreadEver
 * @Verxion: 1.0
 */
public class BankTest2 {
    public static void main(String[] args) {
        Bank bank = new Bank(0);

        Customer2 customer2 = new Customer2(bank);

        Thread c1 = new Thread(customer2);
        Thread c2 = new Thread(customer2);

        c1.setName("甲，");
        c2.setName("乙，");

        c2.start();
        c1.start();

    }
}
class Customer2 implements Runnable{
    private Bank bank;
    private ReentrantLock lock = new ReentrantLock(true);

    public Customer2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            lock.lock();
            bank.deposit();
            lock.unlock();
        }
    }
}

class Bank {

    private double balance = 0;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(){
        balance+=1000;

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"存钱成功，余额为："+balance);
    }
}
