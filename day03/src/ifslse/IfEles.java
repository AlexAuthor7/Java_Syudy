package ifslse;
/*
分支结构/条件判断结构
结构：
1、if(条件表达式){执行表达式}

2、二选一
if(条件表达式1){执行表达式1}
else(条件表达式2){执行表达式2}

3、多选一
if（）{}
else if(){}
else if(){}
....
else{}

 */
public class IfEles {
    public static void main(String[] args){
        //ex.
        int age = 50;
        if(age < 0){
            System.out.println("input error");
        }else if(age > 0 && age < 18){
            System.out.println("你未成年");
        }else{
            System.out.println("你成年了");
        }



    }
}
