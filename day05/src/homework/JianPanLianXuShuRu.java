package homework;
/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
为0时结束程序。

说明
1、两个新结构
> for(;;)   //里面啥也不写
> while(true)

2、如何跳出循环
> 循环条件false
> break;

 */
import java.util.Scanner;
public class JianPanLianXuShuRu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;//记录正数个数
        int negativeNumber = 0;//记录负数个数

        while(true) {     //也可以是for(;;)
            System.out.println("请输入一个整数");
            int number = scan.nextInt();
            //判断number的正负
            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                break;
            }
        }

        System.out.println("正数个数是：" + positiveNumber);
        System.out.println("负数个数是：" + negativeNumber);


    }

}
