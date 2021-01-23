package OPP_Package1;
/* 面向对象特征之一：封装与隐藏
 *
 *    一、Java中通过将数据声明为私有的(private)， 再提供公共的（ public）
 *       方法:getXxx()和setXxx()实现对该属性的操作。
 *
 *      以实现下述目的：
 *
 *         隐藏一个类中不需要对外提供的实现细节；
 *         使用者只能通过事先定制好的方法来访问数据， 可以方便地加入控制逻辑，
 *           限制对属性的不合理操作；
 *         便于修改， 增强代码的可维护性；
 *
 */

public class Package {

}
class Animal{
    String name;
    int age;
    int legs;
    public void eat(){
        
    }
}
