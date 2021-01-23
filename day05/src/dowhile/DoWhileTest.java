package dowhile;

/*
1、组成要素：
①初始化部分
②循环条件部分
③迭代部分
④循环体部分

2、结构
①
do{
    ③；
    ④；
}while9(②);

3、执行顺序：① --> （③ --> ④ --> ② ）--> （③ --> ④ --> ②）

4、说明
> 至少执行一次循环体
> 开发中，使用while和for多一点，较少使用do-while


 */



public class DoWhileTest {
    public static void main(String[] args) {
        //遍历100以内的偶数,并计算所有偶数的个数和它们的总和
        int num = 1;
        int sum1 = 0;//个数
        int sum2 = 0;//总和
        do{
            if(num % 2 == 0){
                System.out.println(num);
                sum1++;
                sum2 += num;
            }
            num++;


        }while(num <= 100);
        System.out.println("个数" + sum1);
        System.out.println("总和" + sum2);
    }
}
