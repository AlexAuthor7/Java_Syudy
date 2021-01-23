package Methord;
/*  一、可变个数形参
 *    1、JDK 5.0 新增
 *    2、格式： 数据类型 ... 变量名
 *    3、当调用可变形参的方法时，传入的参数个数可以 是0个， 也可以是 多个
 *    4、可变个数的形参，被视为一个数组，只有通过遍历才能打印所有值
 *      ex: > public void show (String ... s1){}
 *          > public void show (String[] s1){}
 *       编译器会认为是同一种情况，不能同时出现
 *    5、可变个数形参 必须在形参列表中声明在末尾，且最多声明一个
 *
 */

public class VariableArgs {
    public static void main(String[] args) {
        VariableArgs test = new VariableArgs();
        test.show("hello","world","!!");
        test.show2(new String[]{"hello","world","!!"});

    }
    public void show (String ... s1){//括号 里是 可变个数的形参
        for(int i = 0;i < s1.length;i++){//可变个数的形参，被视为一个数组，只有通过遍历才能打印所有值
            System.out.print(s1[i] + " ");
        }
    }
    public void show2 (String[] s2){
        for(int i = 0;i < s2.length;i++){
            System.out.print(s2[i] + " ");
        }
    }


}
