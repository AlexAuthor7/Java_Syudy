package CommonClass.String;
/*
一、String的特性
    1、String是一个final类,代表不可变的字符序列.不可被继承。
    2、字符串是一个常量,使用“  ”来表示, 他们的值在创建之后不能更改。
    3、String实现了Serializable接口,表示字符串是支持序列化的
             实现了Comparable接口,表示字符串可以比较大小
    4、String 内部定义了final char[] value 数组用于存储字符串数据
    5、String代表不可变的字符字符序列。简称：不可变性。
        体现：1、 当字符串重新赋值时，需要重新指定内存区域赋值,不能再原有的value赋值
             2、 当对现有的字符串惊醒连接操作时,也需要重新指定内存区域赋值,不能再原有的value赋值
             3、 当调用 String的replace ()方法修改指定的字符串时,也需要重新指定内存区域赋值,不能再原有的value赋值
           总结
    6、String 通过字面量的啊方式(区别于new)给一个字符串赋值, 此时字符串 声明在 常量池中
    7、字符串常量池中是不会 存储相同内容的字符串的

二、String的赋值(对象的创建)
    1、详见示例
    2、① String s1 = "abc"; 和 ②String = new String("abc");的区别？
       > 在内存中的位置不同 ①在常量池中 ②在堆空间中(且相同内容的字符串存放的位置不同 -->占用更多的内存空间)

三、面试题1 : 通过 String s = new string("abc"); 方式创建对象时, 在内存中创建几个对象?
 答案：2个 一个在堆空间中 另一个是char[] 对应常量池中的数据"abc"
结论：1、常量与常量的拼接结果在常量池,且常量池中不会存在相同的常量
     2、只要拼接中有一个是变量,结果就在堆中
     3、如果对拼接结果用 intern() ,返回值就在常量池中

 */


import org.junit.Test;

public class StringTest {
    //  1/3、

/*    public final class String
            implements java.io.Serializable, Comparable<String>, CharSequence {
        *//**
         * The value is used for character storage.
         *//*
        private final char value[];
        *//**
         * Cache the hash code for the string
         *//*
        private int hash; // Default to 0
    }
     */


    @Test
    public void test1(){
        //体现1
        String s1 = "abc";//字面量的定义方式,String是一个类,但是给他赋值不用new
        String s2 = "abc";
    //    s1 = "hello";
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        System.out.println(s1 == s2);//true,比较s1 和 s2 的地址值;

        //体现2
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef
        System.out.println(s2);//abc
    }
    @Test
    public void test2(){
        //体现3
        String s1 = "abca";
        //replace 方法,替换某个元素
        String s2 = s1.replace('a','m');
        System.out.println(s1);//abca
        System.out.println(s2);//mbcm

    }
    //二、String的赋值(对象的创建/实例化)
    @Test
    public void test3(){
        //方式一
        String str = "hello";


        //方式二：本质上this.value = new char[0];
        String s1 = new String("hello");

        //方式三：this.value = original.value;
//      String s2 = new String(String original);
        String s2 = new String("hello");

        //方式四：this.value = Arrays.copyOf(value, value.length);
//      String s3 = new String(char[] a);
//      String s4 = new String(char[] a,int startIndex,int count);
    }

    //二、区别
    @Test
    public void test4(){
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//false
        System.out.println(s3 == s4);//false

        Person p1 = new Person("Tom",19);
        Person p2 = new Person("Tom",19);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1 == p2);//true
        //"Tom" 是放在常量池里的,只有一个 ”Tom“
    }

    @Test
    public void test5(){
        String s1 = "ab";
        String s2 = "cd";

        String s3 = "abcd";
        String s4 = "ab"+"cd";
        String s5 = "ab" + s2;//变量名参与后,就不是在常量池中了
        String s6 = s1 + "cd";
        String s7 = s1 + s2;

        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s5==s6);//false
        System.out.println(s3==s7);//false
        System.out.println(s5==s7);//false

        String s8 = s5.intern();//intern()方法：把返回值放回常量池
        System.out.println(s3 == s8);//true
    }


}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}