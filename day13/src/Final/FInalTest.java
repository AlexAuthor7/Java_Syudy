package Final;
/* final 关键字：最终的
 * 1、final 可以修饰的结构：类、方法、变量
 *
 * 2、final 修饰一个类：表示不能被其他类所继承
 *   比如： String类、System类、StringBuffer类(都是被final修饰的)
 * 3、final 修饰一个方法：表明此方法不可以被重写
 *   比如：getClass()
 * 4、final 用来修饰变量(属性),此时的” 变量 “ 就称为一个常量(用大写字母命名)
 *   > final 修饰的属性，一定要初始化
 *   > final 修饰属性,可以考虑赋值的位置有：
 *     ① 显式初始化
 *     ② 代码块中赋值
 *     ③ 在构造器中初始化
 *     ps:不能通过"对象.属性"和”对象.方法“的方式赋值
 *  5、final 修饰局部变量(在方法中声明的变量、形参)
 *      > 方法中的变量: --》常量(用大写字母命名)
 *      > *形参:--》常量
 *         在调用方法时给形参赋值,方法中只能调用,不能修改
 *  6、static final:又来修饰 属性和方法；
 *      > 修饰属性:全局常量 (可以通过类来调用)(接 口)
 */

public class FInalTest {
    final int age = 10;//① 显式初始化
    final int age2;
    final int age3;

    public void doAge(){
        //this.age = 20;  //编译不通过,age已经被fingal修饰
    }
    //代码块
    {
        age2 = 10;//② 代码块中赋值
    }
    //构造器
    public FInalTest() {
        age3 = 10;//③ 在构造器中初始化
    }


}

final class Final{//表示该类不能被其他类所继承
}
