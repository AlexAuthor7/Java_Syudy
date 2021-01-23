package Wrapper;
/* 一、包装类
 *  1、概念：针对八种基本数据类型定义相应的引用类型—包装类（封装类）
 *  2、使得基本数据类型有了类的特征
 *      byte     Byte
 *      short    Short
 *      int      Integer   父类Number
 *      long     Long
 *      float    Float
 *      double   Double
 *
 *      boolean  Boolean
 *      char     Character
 * 二、基本数据类型 - 包装类 - String类的转换
 *
 */

public class WrapperTest {
//基本数据类型 --》包装类 ：调用包装类的构造器

    //老版
    public void test1(){
        int i1 = 10;
        Integer I1 = new Integer(i1);
        System.out.println(I1.toString());//10

        Float F1 = new Float(12.3f);//12.3
        Float F2 = new Float("12.3");//12.3

        Boolean B1 = new Boolean(true);//true
        Boolean B2 = new Boolean("reue");//true

        Boolean B3 = new Boolean("true123");//false
    }
    //新版：自动装箱
    public void test2(){
        int num1 = 10;
        method(num1);//编译通过

        Integer I1 = num1;//自动装箱

        boolean b1 = true;
        Boolean B2 = b1;//true

    }

       
//包装类 --》基本数据类型
    //老版
    public void test3(){
        Integer I1 = new Integer(12);
        int i1 = I1.intValue();
        System.out.println(i1 + 1);//13
    }
    //新版：自动拆箱
    public void test4(){
        Integer I1 = 12;//自动装箱
        int i1 = I1;//自动拆箱
    }

//String类 --》包装类/基本数据类型
//  调用parseXxx()的方法

    //老版
    Integer I2 =new Integer("123");//123
    Integer I3 = new Integer("123abc");//报异常：NumberFormatException

    //错误的情况:必须为子父类，才能进行强转
    String  str1 = "123";
//  int num1 = (int)str1;
//  Integer I1 = (Integer)str1;

    //新版：自动装箱
    int i1 =Integer.parseInt(str1);//123

    String s2 = "true";
    boolean b2 = Boolean.parseBoolean(s2);//true

    String s3= "true1";//不是标准的  true  都会输出  false
    boolean b3 = Boolean.parseBoolean(s3);//false



//包装类/基本数据类型 --》String类


    //方法1：连接运算
    int num1 = 10;
    String str2 = num1 + "";//加一个空的字符串
    //方法2：
    float f1 = 12.3f;
    String str3 = String.valueOf(f1);//"12.3"

    Double D1 = new Double(12.4);
    String str4 = String.valueOf(D1);//"12.4"

    public void method(Object obj){
        System.out.println(obj);
    }
}
