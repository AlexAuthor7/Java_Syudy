package ThreadTest1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Alex
 * @Date: 2020/12/2 - 12 - 02 -9:38
 * @Description: ThreadTest1
 * @Verxion: 1.0
 */
public class LockTest {
    /*
    解决线程安全问题方式三（JDK 5.0 新增）
    1、实例化ReentrantLock
    2、把需要同步的代码块用 try-finally 抱起来
    3、在 try 开头调用锁定的方法 luck();
    4、在 finally 里调用解锁的方法 unlock();

    面试题：synchronized和Lock的方式有什么异同
    */
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class Window implements Runnable{

    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while(true){
            try {
                //调用lock()方法：锁定
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ",你的票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                //3、调用unlock()方法:解锁
                lock.unlock();
            }
        }
    }
}