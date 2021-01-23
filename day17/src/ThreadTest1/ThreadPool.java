package ThreadTest1;



import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Auther: Alex
 * @Date: 2020/12/3 - 12 - 03 -11:33
 * @Description: ThreadTest1
 * @Verxion: 1.0
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1、提供指定线程量的像城池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //设置线程池的属性
        System.out.println(service.getClass());//java.util.concurrent.ThreadPoolExecutor
        ThreadPoolExecutor service2 = (ThreadPoolExecutor) service;//强转
        service2.setCorePoolSize(10);//设置线程个数
        //service2.setKeepAliveTime(); //设置活跃时间

        //2、执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumThread1());//适用于Runnable
        service.submit(new NumThread2());//适用于Callable

        //3、关闭线程池
        service.shutdown();
    }
}
class NumThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%2==0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class NumThread2 implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 1; i <= 100 ; i++) {
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        return null;
    }
}