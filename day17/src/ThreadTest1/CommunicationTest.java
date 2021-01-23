package ThreadTest1;

/**
 * @Auther: Alex
 * @Date: 2020/12/2 - 12 - 02 -13:34
 * @Description: ThreadTest1
 * @Verxion: 1.0
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Print print = new Print();

        Thread t1 = new Thread(print);
        Thread t2 = new Thread(print);

        t1.start();
        t2.start();
    }
}
class Print implements Runnable{
    private int num = 1;
    @Override
    public void run() {
       while (true){
           synchronized (this) {
               notify();
               System.out.println(Thread.currentThread().getName() + num);
               num++;
               if (num == 100) {
                   break;
               }

               try {
                   //使用wait()方法使线程进入阻塞状态
                   wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
    }
}