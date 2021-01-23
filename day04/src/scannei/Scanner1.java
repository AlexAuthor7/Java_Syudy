package scannei;
/*
如何从键盘或取不同类型的变量，需要使用Scanner类

具体实现步骤：
1、导包：import java.util.Scanner;(写在包上面)
2、Scanner的实例化:Scanner scan = new Scanner(System.in);
3、调用Scanner类的相关结构，来获取指定类型的变量

注意：输入指定类型，不匹配时会报异常
*/


import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名");

        String str = scan.next();
        System.out.println(str);

        char strChar = str.charAt(1);//获取索引位1位置上的字符(第二位，0是第一位)
        System.out.println(strChar);
    }
}
