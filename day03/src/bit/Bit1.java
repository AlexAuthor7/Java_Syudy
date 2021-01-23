package bit;

//m = (m^n)^n

public class Bit1 {
    public static void main(String[] args){
        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;

        /*
        方法一:中间变量(推荐)
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        */

        /*
        方法二：加减法（内存少不用定义临时变量）
        只能用于数值型
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        */

        /*
        方法三：使用位运算符
        只能用于数值型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        */

        System.out.println(num1 + "\n" + num2);


    }
}
