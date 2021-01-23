package ThreadEver;

/**
 * @Auther: Alex
 * @Date: 2020/11/30 - 11 - 30 -8:00
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
/*
    练习创建两个分线程，一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
*/
public class ThreadEver1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("线程一");//通过构造器给线程命名

        //setName():设置线程的名字
        t1.setName("线程一");

        //setPriority():设置线程的优先级
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();

        //设置主线程的名字
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority()+":"+i);
            if(i == 20){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
class MyThread1 extends Thread{
    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                //sleep(long millis):暂时阻塞当前线程 n 毫秒
                try {
                    sleep(1);//阻塞当前线程1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+getPriority()+":"+i);
            }
            if(i%20==0){
                //yield():释放当前cpu的执行权
                this.yield();//Thread.currentThread().yield();也可以
            }
        }
    }
}