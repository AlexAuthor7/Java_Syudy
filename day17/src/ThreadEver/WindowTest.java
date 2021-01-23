package ThreadEver;

/**
 *
 * @Auther: Alex
 * @Date: 2020/11/30 - 11 - 30 -16:37
 * @Description: ThreadEver
 * @Verxion: 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        //例子：创建三个窗口卖票，总票数为100张
        Window window = new Window();

        Thread w1 = new Thread(window);
        Thread w2 = new Thread(window);
        Thread w3 = new Thread(window);

        w1.setName("窗口 1");
        w2.setName("窗口 2");
        w3.setName("窗口 3");

        w1.start();
        w2.start();
        w3.start();
    }
}
class Window implements Runnable{
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(35);
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