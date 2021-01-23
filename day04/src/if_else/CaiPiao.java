package if_else;
/*
如何获取一个随机数（ 10 ~ 99 ）
ex, int value = (int)(Math.random() * 90 + 10)  //[0.0,1.0) --> [0.0,90.0) --> [10.0,100.0) --> [10,90]

公式：[a,b]     (int)(Math.random()*(b - a + 1) + a)
*/


/*
彩票游戏
假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。

1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。

提示：使用Math.random() 产生随机数
Math.random() 产生[0,1)范围的随机值
Math.random() * 90：[0,90)

 */


import java.util.Scanner;
public class CaiPiao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("输入你的号码(两位数)：");
        int num = scan.nextInt();
        int num1 = num / 10;//十位
        int num2 = num % 10;//个位


        int value = (int)(Math.random() * 90 +10);//得到随机数
        int value1 = value / 10;//十位
        int value2 = value % 10;//个位

        System.out.println("本期中奖号码是:" + value);

        if(num1 == value1 && num2 == value2){
            System.out.println("你获得10000美元奖金");
        }else if(num1 == value2 && num2 == value1){
            System.out.println("你获得3000美元奖金");
        }else if(num1 == value1 || num2 == value2){
            System.out.println("你获得1000美元奖金");
        }else if(num1 == value2 || num2 == value1){
            System.out.println("你获得500美元奖金");
        }else{
            System.out.println("你的彩票作废");
        }
    }
}
