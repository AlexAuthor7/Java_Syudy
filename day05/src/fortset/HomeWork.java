package fortset;
/*课后作业
1.打印1~100之间所有奇数的和
2.打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数
器的思想）
3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 */
public class HomeWork {
    public static void main(String[] args) {

        //题1
        int sum1 = 0;//1~100之间所有奇数的和
        for(int i = 1;i <= 100;i++){
            if(i % 2 != 0){
                sum1 += i;
            }

        }
        System.out.println("1~100之间所有奇数的和是： " + sum1);

        //题2
        int sum2 = 0;//7的倍数的整数的个数
        int sum3 = 0;//7的倍数的整数的总和
        for(int i = 1;i <= 100;i++){
            if(i % 7 == 0){
                sum2 += 1;//个数
                sum3 += i;//总和
            }
        }
        System.out.println("1~100之间7的倍数的整数的个数是： " + sum2);
        System.out.println("1~100之间7的倍数的整数的总和是： " + sum3);

        //题3
        for(int i = 100;i <= 999;i++){
            int num1 = i / 100;     //百位
            int num2 = i % 100 / 10;//十位
            int num3 = i % 10;      //个位
            if(i == num1*num1*num1 + num2*num2*num2 + num3*num3*num3){
                System.out.println(i);
            }

        }



    }
}
