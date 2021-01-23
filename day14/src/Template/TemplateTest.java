package Template;
/* 抽象类的应用:模板方法的设计模式
 *  概念：在软件开发中实现一个算法时,整体步骤很固定,通用。这些步骤已经在父类中写好了
 *       而某些部分易变,易变的部分可以抽象出来,共不同的类实现。
 *
 *
 *
 */


import java.util.Scanner;

public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        SubTemplate s1 = new SubTemplate();
        s1.spendTime(n);
    }


}
abstract class Template{
    //计算某段代码执行的时间
    public void spendTime(int n){
        long start = System.currentTimeMillis();
        code(n);//这就是不确定的部分,易变的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+ (end - start));
    }
    public abstract void code(int n);
}
class SubTemplate extends Template{
    @Override
    public void code(int n) {
        for (int i = 2; i < n; i++) {
            boolean isFlage = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    isFlage = false;
                    break;
                }
            }
            if(isFlage){
                System.out.println(i);
            }
        }
    }
}