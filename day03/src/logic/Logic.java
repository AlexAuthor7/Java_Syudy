package logic;
/*
逻辑运算符 &  &&  |  ||  ！  ^
说明：逻辑运算符操作的都是boolean的变量
 */
public class Logic {
    public static void main(String[] args){
        /*区分&和&&

        共同点：1、运算结果相同
               2、当符号左边都是true，二者都会运行符号右边的运算
        不同点：1、当符号左边是false时，&继续执行符号右边的运算，&&不再执行符号右边的运算

        */
        boolean b1 = false;
        int num1 = 10 ;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        }
        else{
            System.out.println("我现在在南京");
        }
        System.out.println("num1="+num1);//11

        boolean b2 = false;
        int num2 = 10 ;
        if(b2 && (num2++ > 0)){//短路把num2++跳过了，没有执行
            System.out.println("我现在在北京");
        }
        else{
            System.out.println("我现在在南京");
        }
        System.out.println();
        System.out.println("num2="+num2);//10

        /*总结：
        true的时候没有区别，false时num的输出结果不一样。
        开发中推荐使用短路。
        */

        //*********************************************
        /*
           区分|和||
           同上
           只是true和false相反
         */

    }
}
