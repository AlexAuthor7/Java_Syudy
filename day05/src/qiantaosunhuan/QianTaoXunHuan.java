package qiantaosunhuan;

/*
嵌套循环的使用：
1、一个循环A，在另一个循环B，的循环体中

2、外层循环：B
   内层循环：A

3、内层循环遍历一遍，相当于外层循环执行一次

4、技巧
> 外层循环控制行数，内层循环控制列数
 */
public class QianTaoXunHuan {
    public static void main(String[] args) {
        /*输入
        ******
        ******
        ******
        ******
        ******
        ******
        */

        for(int i = 1;i <= 6;i++){        //负责行
            for(int j = 1;j <= 6;j++){    //负责列
                System.out.print("*");
            }
            System.out.println();         //换行

        }
        /*输入
        ****
        ***
        **
        *
        */
        for(int i = 1;i <= 4;i++){
            for(int j = 4;j >= i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /*输入
            *
           * *
          * * *
         * * * *
          * * *
           * *
            *
         */
        for(int i = 1;i <= 4;i++){   //行,上部分

            //打印（空格）
            for(int a = 1;a <= 4 -i;a++){//或者也可以 int a = 3;a - i >= 0;a--
                System.out.print(" ");
            }
            //打印（空格）*
            for(int b = 1;b <= i;b++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i = 1;i <= 3;i++){   //行,下部分

            //打印（空格）
            for(int b = 1;b <= i;b++){
                System.out.print(" ");
            }
            //打印（空格）*
            for(int a = 3;a - i >= 0;a--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
