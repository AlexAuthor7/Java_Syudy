package Infterface;
/*
 * 一、接口的使用
 *   1、概念：接口与类是并列的结构,表示多个类共有的特征
 *   2、接口使用 interface 关键字 来定义
 *   3、如何定义接口、定义接口的成员
 *       3.1 JDK 7以前 :只能定义常量 和 抽象方法
 *          > 全局常量的声明 ： public static final(但是可以省略前面的修饰成分)
 *          > 抽象方法 public abstract
 *
 *       3.2 JDK 8:除了定义全局变量和抽象方法之外,还可以定义为静态方法，默认方法
 *   4、接口中不能定义构造器--》意味着接口不能实例化
 *   5、在 Java 开发中, 接口通过让类去实践 ( implements ) 的方式来使用
 *      > 如果 实现类 覆盖了接口中所有的抽象方法,则此 实现类 就可以 实例化
 *      > 如果 实现类 没有覆盖接口中所有的抽象方法, 则此 实现类 仍为一个 抽象类 (不能实例化)
 *           需要在class 前加一个 abstract
 *   6、Java 类可以实现多个接口 --》弥补了Java但继承性的局限性
 *   7、继承和实现同时使用时,继承 放在 实现 的前面 (中间用“空格”分开)
 *      当有多个接口时 ,中间用 ”,“ 间隔
 *      格式 class AA extends BB implements CC,DD,EE,FF{}
 *   8、接口与接口之间也可以 继承
 *      ps：是继承 要用 extends
 *   9、接口可以当形参使用
 *
 * 总结：> 类与类之间叫     继承（extends）
 *      > 类与接口之间叫    实现 （impements）(可以多继承)
 *      >*接口与接口之间叫   继承 （estends）(可以多继承)
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *   10、接口的具体使用,体现多态性
 *   11、接口，实际上可以看成是一种规范
 *
 *  面试题：抽象类和接口有哪些异同？
 *  > 接口和实现类的关系  类似  USB接口和驱动 的关系
 *
 *
 */

public class InfterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);//可以调用
        ///Flyable.MIN_SPEED = 3;             //但是不能赋值,省略了public static final

        Plane plane = new Plane();
        plane.fly();

    }
}
//接口
interface Flyable{
    //全局变量
    public static final int MAX_SPEED = 7999;//第一宇宙速度
    int MIN_SPEED = 1;//省略了前面的修饰部分

    //抽象方法
    public abstract void fly();

    void stop();//省略了 public abstract ,但仍然是抽象函数
}
interface Attackble{
    void attack();
}




class Plane implements Flyable{//实现类

    @Override
    public void fly() {
        System.out.println("飞机可以飞");
    }
    @Override
    public void stop() {
        System.out.println("飞机可以停止");
    }
}
abstract class kite implements Flyable{//在class 前面加 abstract 可以不用把抽象方法实现(重写)

}

class Bullet extends Object implements Flyable,Attackble{
// 继承和实现同时使用时,继承 放在 实现 的前面 (中间用“空格”分开)
// 当有多个接口时 ,中间用”,“间隔

    @Override
    public void fly() {
    }
    @Override
    public void stop() {
    }
    @Override
    public void attack() {
    }
}
interface AA{
    void method1();
}

interface BB {
    void method2();
}
interface CC extends AA,BB{}//注意,接口与接口之间是继承,要用 extends