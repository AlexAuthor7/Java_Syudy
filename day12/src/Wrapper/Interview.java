package Wrapper;

public class Interview {


//面试题1：如下两个题目输出结果相同吗？各是什么：
    public void test1(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);// 1.0
        //解释：三元运算符 后的两个表达式类型要相同  所以 1 (Integer)被自动类型提升为 1.0 (Double)
    }
    public void test2(){
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);// 1
    }

//面试题2：
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false，地址不一样
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        //解释 Integer cache[]数组中存的数 从 -128 ~127 m和n都是从里面找的，地址一样
        Integer x = 128;//相当于new了一个Integer对象
        Integer y = 128;
        System.out.println(x == y);//false
        //解释 128 超过 cache[]的范围，所以编译器又new了一个，地址不一样了

    /*  Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
     *
     *  保存了从-128 ~ 127范围内的整数，如果我们使用自动装箱的方式，给Integer赋值范围
     *  在-128 ~ 127范围内时，可以直接使用数组中的元素，不用再new了。目前提高效率
     */

    }

}
