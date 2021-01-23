package ThreadEver;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者(Producer)将产品交给店员(Clerk)，而消费者(Customer)从店员处
 * 取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 *  这里可能出现两个问题：
 *     生产者比消费者快时，消费者会漏掉一些数据没有取到。
 *     消费者比生产者快时，消费者会取相同的数据。
 * @Auther: Alex
 * @Date: 2020/12/2 - 12 - 02 -20:08
 * @Description: ThreadEver
 * @Verxion: 1.0
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Customer customer = new Customer(clerk);

        Thread p = new Thread(producer);
        Thread c1 = new Thread(customer);
        Thread c2 = new Thread(customer);

        p.setName("生产者 ：");
        c1.setName("消费者1：");
        c2.setName("消费者2：");

        p.start();
        c1.start();
        c2.start();
    }
}
class Clerk{
    private int goods = 0;
    private Producer producer;
    private Customer customer;

    //getter、setter
    public int getGoods() {
        return goods;
    }
    public void setGoods(int goods) {
        this.goods = goods;
    }

    public synchronized void produce(){//生产功能
        if(goods < 20){
            try {
                Thread.sleep(50);//生产也是要时间的呀
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goods++;
            System.out.println(Thread.currentThread().getName()+"生产一个商品，还剩"+goods+"个商品");
            notifyAll();//叫消费者来取货
        }else {
            try {
                System.out.println(" 店员 ：生产者别生产了，够了");
                wait();//先别生产了，够了
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void buy(){//买买买
        if(goods > 0){
          /* try {
                Thread.sleep(1);//取货也要时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName()+"买了一个商品，还剩"+goods+"个商品");
            goods--;
            notifyAll();//叫生产者开始生产
        }else{
            try {
                System.out.println(" 店员 ：顾客你好，没货了，请您等等");
                wait();//没货了，先等等
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer implements Runnable{
    private Clerk clerk;
    //构造器
    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while(true){
            clerk.produce();

        }
    }
}
class Customer implements Runnable{
    private Clerk clerk;
    //构造器
    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while(true){
            clerk.buy();
        }
    }
}
