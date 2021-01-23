package Wrapper;
/*
练习10
利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
最高分，并输出学生成绩等级。
    提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
     长度。而向量类java.util.Vector可以根据需要动态伸缩。
    创建Vector对象： Vector v=new Vector();
    给向量添加元素： v.addElement(Object obj); //obj必须是对象
    取出向量中的元素： Object obj=v.elementAt(0);
      注意第一个元素的下标是0，返回值是Object类型的。
    计算向量的长度： v.size();
    若与最高分相差10分内： A等； 20分内： B等；
      30分内： C等；其它： D等
 */
import java.util.Scanner;
import java.util.Vector;
public class WrapperEver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector v = new Vector();
        int max = 0;
        for(int i = 1;;i++){
            System.out.println("请输入第" + i + "位学生成绩(以负数代表输入结束)");
            int score = scan.nextInt();

            //判断是否小于0,跳出循环
            if(score < 0){
                break;
            }else if(score > 100) {
                System.out.println("输入的数据非法，请重新输入" );
                i--;
                continue;
            }
            //把成绩加到 V.addElement(Object obj)
//          JDK 5.0 之前
//          Integer inScore = new Integer(score);
//          v.addElement(inScore);//多态

            v.addElement(score);
            //获取最大值
            if(max < score){
                max = score;
            }
        }
        System.out.println("最高分是：" + max);
        //遍历Vector ,得到每个学生的成绩，并与最大值比较，得到每个学生的等级
        char level;//等级
        for(int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);
            //jdk 5.0之前
//          Integer inScore = (Integer)obj;
//          int score = inScore.intValue();

            //jdk 5.0之后
            int score = (int)obj;

            if(max - score <= 10){
                level = 'A';
            }else if(max - score <= 20){
                level = 'B';
            }else if(max - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("学生"+ (i + 1) + " 成绩是" + score + " 等级是" + level);
        }
    }
}
