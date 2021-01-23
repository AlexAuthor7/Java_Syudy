package Methord;
/*
 * 递归方法（了解）；一个方法体内调用它自身，重复执行某段代码
 *
 *
 *
 */

public class RecursionMethord {

    public static void main(String[] args) {
        RecursionMethord r = new RecursionMethord();//声明对象
        //7.0
        System.out.println(r.getSum(100));//5050
        //7.1
        System.out.println(r.getMultiply(100));//49500
        //7.2
        System.out.println(r.getSn(10));//10497
        //7.3
        System.out.println(r.Fibonacci(10));

    }

    //7.0: 计算1-100所有自然数的和（递归方法）
    public int getSum(int n) {
        if (n == 1) {
            return 1;//到 1 终止
        } else {
            return n + getSum(n - 1);
        }
    }

    //7.1: 计算n！
    public int getMultiply(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum(n - 1);
        }

    }

    //7.2: 已知有一个数列： f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
    public int getSn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * getSn(n - 1) + getSn(n - 2);
        }
    }
    /*7.3: 斐波那契数列输入
     *     一个数据n，计算斐波那契数列(Fibonacci)的第n个值
     *     1 1 2 3 5 8 13 21 34 55
     *     规律：一个数等于前两个数之和
     *     要求： 计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
     */
    public int Fibonacci(int n){
        if(n == 1){
            System.out.print("1 ");
            return 1;
        }else if(n == 2){
            System.out.print("1 ");
            return 1;
        }else{
            System.out.print(n);
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}