package EqualsReview;
/* 一、回顾 == 的使用
 *  1、可以使用在基本数据类型中和引用数据类型变量中
 *  2、如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等
 *     如果比较的是引用数据类型变量，比较两个对象的地址是否相等，即两个引用是否指向同一个对象实体
 *
 * 二、equals()方法的使用：
 *  1、是一个方法，而非运算符。
 *  2、只能适用于引用数据类型
 *  3、Oject类中equals()的定义：
 *   public boolean(Object obj){
 *      return (this == obj);
 *   }
 *  4、说明：Object类中定义的equals()和==的作用是相同的，比较两个对象的地址是否相同，即两个引用是否指向同一个对象实体
 *
 *  5、想String、Date、File、包装类等都重写了Object类中的equals()方法。重写以后，比较的不是
 *     两个引用对象的实体内容是否相同。
 *  6、通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的“实体内容”是否相同，那么，我们
 *     就需要对Object类中的equals()进行重写
 *
 *
 *
 */

public class EqualsTest {
    //创建对象
    Customer cust = new Customer(10,"tom");
    Equlas eq = new Equlas(10,"tom");


}
class Customer{
    int age;
    String name;
    public Customer(int age,String name){
        this.age = age;
        this.name = name;
    }
    //重写原则：比较两个对象的实体内容（即：name和age）是否相同
   /* public boolean equlas(Object obj) {
        if (this == obj) {

            return true;
        }
        if (obj instanceof EqualsTest) {
            Customer cust = (Customer) obj;
            //比较两个对象的每一个属性是否都一样
            if (this.age == cust.age && this.name.equals(cust.name)) {
                return true;
            } else {
                return false;
            }

        }
    } */
/*      //String类中的equals源码

        private boolean nonSyncContentEquals(AbstractStringBuilder sb) {
            int len = length();
            if (len != sb.length()) {
                return false;
            }
            byte v1[] = value;
            byte v2[] = sb.getValue();
            byte coder = coder();
            if (coder == sb.getCoder()) {
                int n = v1.length;
                for (int i = 0; i < n; i++) {    //运用循环，一个字符一个字符对比
                    if (v1[i] != v2[i]) {
                        return false;
                    }
                }
            } else {
                if (coder != LATIN1) {  // utf16 str and latin1 abs can never be "equal"
                    return false;
                }
                return StringUTF16.contentEquals(v1, v2, len);
            }
            return true;
        }
*/
}





class Equlas{
    int age;
    String name;
    public Equlas(int age,String name){
        this.age = age;
        this.name = name;
    }


}