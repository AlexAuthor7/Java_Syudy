package variable3;

/*String 类型变量的使用
1、使用String变量类型时使用一对双引号
2、String 属于引用数据类型，翻译为字符串
3、String 可以和8种基本数据类型计算，但只能是连接计算，符号是“+’
4、运算的结果仍是String类型


*/
public class variable3 {
    public static void main(String[] args){
       String s1 = "hello world";
       String s2 = "a";
       String s3 = "";


       System.out.println(s1);
      //String “”中可以是么都不放，char不可以

      //**********************************************************
        int number = 1001;
        String numberStr = "学号";
        String info = numberStr + number;
      //"+",连接符号
        System.out.println(info);



      //******************************************************
      //练习1
        char c1 = 'a';//a 97  A 65
        int num1 = 10;
        String numStr = "hello";
        System.out.println(c1 + num1 + numStr);
        System.out.println(c1 + numStr + num1);
        System.out.println(c1 + (num1 + numStr));
        System.out.println((c1 + num1) + numStr);
        System.out.println(numStr + num1 + c1);
      /*
        结果如下：
        107hello
        ahello10
        a10hello
        107hello
        hello10a

      */

      //练习2
      //*   *
        System.out.println("*   *");           //*  *
        System.out.println('*' + '\t' + '*');  //93   ,
        System.out.println('*' + "\t" + '*');  //*  * ,
        System.out.println('*' + '\t' + "*");  //51*
        System.out.println('*' + ('\t' + "*"));//*  *
      //''中的char被认为是int类型，+号表示加法（ascll码）
      //""是字符串，+表示连接
      //（）中的先运算

      //***********************************************

      //String str1 = 123 //编译不通过
        String str1 = 123 + "";
        System.out.println(str1);//123

        int num3 = Integer.parseInt(str1);


      //int num4 = (int)str1; 是错误的
    }

}


