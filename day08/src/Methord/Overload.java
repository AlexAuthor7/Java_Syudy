package Methord;
/*
 * 一、方法的重载（overload）loading...
 *     1、定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数和参数类型不同即可
 *     2、例如
 *          public void reverse(int[] arr){}
 *          public void reverse(String[] arr){}
 *          //调用时 括号 里的是什么 数据类型 就调用哪个 方法
 *     3、与权限修饰符、返回值类型、形参变量名、方法体 无关
 *     4、通过对象调用方法时，如何确定一个指定的方法：
 *        > 方法名
 *        > 参数列表
 *
 */

public class Overload {
    public static void main(String[] args) {
        Overload methord = new Overload();
        methord.getSum(1,2);//1,没有双int型时会打印3（自动类型提升）
        methord.getSum("char",1);//2
        methord.getSum(1,"char");//3
        methord.getSum(2.0,3.0);//4
    }

    //例如，以下都是方法的重载
    public void getSum(int i,int j){
        System.out.println("1");
    }
    public void getSum(String i,int j){
        System.out.println("2");
    }
    public void getSum(int i,String j){
        System.out.println("3");
    }
    public void getSum(double i,double j){//不能用float
        System.out.println("4");
    }
    public void getSum(int i,int j,int k){
        System.out.println("5");
    }


/* 错误情况
 *     public int getSum(int i,int j){ return 0;}
 *     public void getSum(int m,int n){}
 *     private void getSum(int i,int j){}
 */

}
