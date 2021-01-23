package Main;
/* main 方法的使用说明
 *  1、main 方法作为程序的入口出现
 *  2、main 也是一个普通的静态方法
 *  3、main 方法的形参,是我们与控制台交互的方式(之前使用Scanner)
 */

public class MainTest {
    public static void main(String[] args) {//入口
        Main.main(new String[100]);//调用Main 类中的 main 方法

        //show();  //把show 改为静态方法,变为静态调静态

        MainTest test = new MainTest();
        test.show();

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);//与控制台交互
            //eclipse中Run Configurations,Arguments
        }
    }

    public void show(){
        System.out.println("来吧，展示！");
    }

}
class Main{
    public static void main(String[] args) {//只是普通的静态方法
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }
    }
}