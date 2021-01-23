package ThreadTest1;

/**
 * @Auther: Alex
 * @Date: 2020/11/29 - 11 - 29 -16:47
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3、创建Thread类的子类的的对象
        MyThread t1 = new MyThread();

        //4、通过此对象调用start()方法
        t1.start();

        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println("***");
            }
        }//穿插出现


        //方法二：创建Thread子类的匿名对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
//例子：遍历100以内的所有偶数
/*
方式一：继承Thread类
1、创建一个继承于Thread类的子类
2、重写Thread类的run()方法:将此线程要执行的操作声明在润方法里
3、创建Thread类的子类的的对象
4、通过此对象调用start()方法
 */

//1、创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2、重写Thread类的run()方法:将此线程要执行的操作声明在润方法里
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}