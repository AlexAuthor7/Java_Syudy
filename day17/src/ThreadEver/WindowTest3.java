package ThreadEver;

/**
 * @Auther: Alex
 * @Date: 2020/12/1 - 12 - 01 -14:43
 * @Description: ThreadEver
 * @Verxion: 1.0
 */

/*
使用同步方法来解决
 */
public class WindowTest3 {
    public static void main(String[] args) {

        Window3 window3 = new Window3();

        Thread w1 = new Thread(window3);
        Thread w2 = new Thread(window3);
        Thread w3 = new Thread(window3);

        w1.setName("窗口 1");
        w2.setName("窗口 2");
        w3.setName("窗口 3");

        w1.start();
        w2.start();
        w3.start();
    }
}
class Window3 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            show();
            if(ticket == 0){
                break;
            }
        }
    }
    public synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(35);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"," +"你的票号为：" + ticket);
            ticket--;
        }else{
            System.out.println("没票了");
        }
    }
}
