package ThreadEver;

/**
 * @Auther: Alex
 * @Date: 2020/12/1 - 12 - 01 -13:39
 * @Description: ThreadEver
 * @Verxion: 1.0
 */
public class WindowTest2 {
    public static void main(String[] args) {
        //例子：创建三个窗口卖票，总票数为100张
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口 1");
        w2.setName("窗口 2");
        w3.setName("窗口 3");

        w1.start();
        w2.start();
        w3.start();
    }
}
class Window2 extends Thread{
    private static int ticket = 100;
    private static Object  obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +"," +"你的票号为：" + ticket);
                    ticket--;
                } else {
                    System.out.println("没票了");
                    break;
                }
            }
        }
    }
}