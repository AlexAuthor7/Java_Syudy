package fortset;
/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如： 12和20的最大公约数是4，最小公倍数是60。
说明： break关键字的使用
 */

import java.util.Scanner;
public class ForTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入正整数m:");
        int m = scan.nextInt();

        System.out.println("请输入正整数n:");
        int n = scan.nextInt();

        //获取两个数中最小的一个，从小到大开始循环
        int min = (m <= n)? m : n;

        for(int i = min;i >= 1;i--){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数是：" + i);
                break;//达到条件就跳出循环
            }
        }

        //获取两个数中最大的一个，从大到小开始循环
        int max = (m >= n)? m : n;
        for(int i = max;i <= m * n;i++){
            if(i % m == 0 && i % n == 0){
                System.out.println("最小公倍数是: " + i);
                break;
            }
        }

    }
}
