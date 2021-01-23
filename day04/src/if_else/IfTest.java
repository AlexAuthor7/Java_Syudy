package if_else;
/*
对于条件表达式
   >如果多个表达式时“互斥”关系，上下无所谓
   >如果不是“互斥”关系，根据实际情况调整上下位置
   >如果是”包含“关系，通常范围小的在上面
 */

import java.util.Scanner;
public class IfTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入期末成绩");

        double grade = scan.nextDouble();

        if(grade == 100){
            System.out.println("奖励宝马");
        }else if(grade < 100 && grade >= 90){
            System.out.println("奖励手机");
        }else if(grade < 90 && grade >= 60){
            System.out.println("奖励手表");
        }else{
            System.out.println("啥都没有");
        }

    }
}
