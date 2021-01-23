package array;
/*
从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10 等级为’A’
成绩>=最高分-20 等级为’B’
成绩>=最高分-30 等级为’C’
其余 等级为’D’
提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num = scan.nextInt();//输入学生人数

        int [] score = new int[num];
        for(int i = 0;i < score.length;i++){
            System.out.println("请输入第"+ (i + 1) + "个学生的成绩");
            score [i] = scan.nextInt();
        }
        //获取数组中的最大值
        int max = 0;
        for(int i = 0;i < score.length;i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        System.out.println("最高分是：" + max);//打印最高分

        for(int i = 0;i < score.length;i++){//用数组长度更好
            char grade;
            if(score[i] >= max - 10){
                grade = 'A';
            }else if(score[i] >= max - 20){
                grade = 'B';
            }else if(score[i] >= max - 30){
                grade = 'C';
            }else{
                grade = 'D';
            }


            System.out.println("学生 " + (i + 1) +" 的分数是:" + score[i] +"  等级是:" + grade);
        }

    }
}
