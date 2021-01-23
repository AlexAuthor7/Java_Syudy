package whiletest;
/*
1、组成要素：
①初始化部分
②循环条件部分
③迭代部分
④循环体部分

2、结构
①初始化部分
while(②循环条件部分)｛
③循环体部分;
④迭代部分;

3、说明
> 写while循环时小心不要漏了迭代部分，否则可能导致是循环。
> 我们写程序，要避免是循环

4、for和while
> 可以相互转化！
> ①不同，作用范围


算法：有限性

}
 */

public class WhileTest {
    public static void main(String[] args) {
        //遍历100以内的所有偶数
        int i = 1;
        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
