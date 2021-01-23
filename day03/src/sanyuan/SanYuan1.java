package sanyuan;
/*
三元运算符
1、结构：(条件表达式)？表达式1：表达式2；
2、说明：表达式结果位boolean类型
        true执行表达式1
        flase执行表达式2
3、表达式1和表达式2要是同一类型
4、三运算符可以嵌套
结论：凡是可以使用三元运算符的都可以改写成if-else,但反过来不行
5、两个都可以用时，优先使用三元
 */
public class SanYuan1 {
    public static void main(String[] args){
        //ex
        int m = 12;
        int n = 5;

        String maxStr = (m > n)? "m大" : ((m == n)?"m和n相等" : "n大");

        System.out.println(maxStr);
        //*************************************
        //练习：获取三个数的最大值
        int n1 = 12;
        int n2 = 20;
        int n3 = -40;
        int max1 = (n1 > n2)? n1 : n2;
        int max2 = (max1 > n3)? max1 : n3;
        System.out.println("三个数中的最大值是" + max2);

        //嵌套也可以，但可读性太差
        //方法二：if-else
        if(m > n){
            System.out.println(m);
        }
        else{
            System.out.println(n);
        }
    }
}
