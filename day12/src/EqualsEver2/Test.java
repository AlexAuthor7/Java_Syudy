package EqualsEver2;
/*
2.请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖
equals方法，使其判断当两个MyDate类型对象的年月日都相同时，结果
为true，否则为false。 public boolean equals(Object o)
 */

public class Test {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2000,1,1);
        MyDate m2 = new MyDate(2000,1,1);

        System.out.println(m1.equals(m2));
    }
}
