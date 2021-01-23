package switchcase;
/*
分支结构之二：switch-case
1、格式：
switch(表达式){
case 常量1：
    执行语句1；
    break;//跳出的作用

case 常量2：
    执行语句2
    break;

default:
    执行语句n;
    break;
}

2、说明：
>依据switch表达式中的值,依次匹配各个case中常量，
 一旦匹配成功，则进入相应case，调用其执行语句中，
 没有break,会继续匹配。
>switch中的表达式只能是：byte,short,char,int,枚举类型，String
>case后面只能声明常量，不能声明范围。
>default相当于else，是可选的（可有可无）
>case执行语句相同可以合并
    case 1:
    case 2:
    case 3:
        执行语句



3、注意：
>变量取值过多可以除以10
*/

/*
练习1
1.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
提示： String word = scan.next();char c = word.charAt(0); switch(c){}
*/

import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个在字符：");

        String word = scan.next();
        char c = word.charAt(0);

        switch(c){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
