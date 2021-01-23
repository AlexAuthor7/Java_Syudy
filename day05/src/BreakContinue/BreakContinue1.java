package BreakContinue;
/*
break和continue关键字的使用
break:
>适用范围：switch-case、循环结构中
>作用：结束当前循环。
>关键字后面不能声明执行语句
>默认跳出最近的循环
>*加上标签可以指定跳出循环
continue:
>循环结构中
>结束当次循环
>关键字后面不能声明执行语句
>默认跳出最近的循环
>*
 */

public class BreakContinue1 {
    public static void main(String[] args) {
        lable:for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 4;j++){
                //break lable;  //结束指定标识的一层循环结构
                //continue lable;  //结束指定标识的一层循环结构当次循环

        }
    }

    }


}
