package ThreadTest1;

/**
 *
 * @Auther: Alex
 * @Date: 2020/11/30 - 11 - 30 -16:55
 * @Description: ThreadTest1
 * @Verxion: 1.0
 */
/*
创建多线程的方式三：实现Runnable
1、创建一个实现了Runnable类的接口
2、在实现类中重写Runnable中的抽象方法:run()
3、创建实现类的对象
4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
5、通过Thread类的对象调用start()①启动线程②调用当前线程的run()方法-->调用了Runnable类中的target的run()方法

 */
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread2 m1 = new MyThread2();

        //4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(m1);

        t1.start();

        //再启动一个线程
        Thread t2 = new Thread(m1);

        t2.start();
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}