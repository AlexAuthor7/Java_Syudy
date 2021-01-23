package Methord;
/* 方法的形参传递机制，值传递
 * 1、形参：方法定义时，声明在小括号内的参数
 *    实参：方法调用时，实际传递给形参的值
 *
 * 2、值传递机制
 *   > 如果参数时 基本 数据类型，实参赋值给形参的是，真实存储的数据值（都在栈空间中）（换不了）
 *   > 如果参数时 引用 数据类型，实参赋值给形参的是，地址值（在堆空间中）（换了）
 *
 */

public class ValueTransfer2 {
    public static void main(String[] args) {
        ValueTransfer2 test = new ValueTransfer2();
        int m = 10;
        int n = 20;
        test.swap(m,n);
        System.out.println("m="+m+",n="+n);//m=10,n=20 没换成

        //**************************************************

        Data data = new Data();
        data.a = 10;
        data.b = 20;
        test.swap(data);
        System.out.println("a="+data.a+",b="+data.b);//a=20,b=10 换成了

    }
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("swap中m="+m+",n="+n);//swap中m=20,n=10 换了
    }

    //*********************************************************
    public void swap(Data data) {//引用类型，给地址值
        int temp = data.a;
        data.a = data.b;
        data.b = temp;
    }
}
class Data{
    int a;
    int b;
}

