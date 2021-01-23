package Static;
/* 一、static 关键字的概念
 *   1、理解：静态的
 *   2、我们希望 某些特定数据，在内存空间里只有一份（节省内存空间）
 *   3、static 规定的属性、方法 供所有对象使用
 * 二、static关键字的使用
 *   1、修饰对象：属性、 方法、 代码块、 内部类。
 *   2、修饰属性：静态变量(类变量)
 *     > 属性，按是否使用static修饰，又分为：静态属性 vs 非静态属性(实例变量)
 *       ① 实例变量， 我们创建了类的多个对象，每个对象都独立拥有一套类中的非静态属性。
 *          当修改其中一个对象的非静态属性时，不会导致其他对象中相同的属性值改变
 *       ② 静态变量， 我们创建了类的多个对象，多个对象共享同一个静态变量。
 *          当通过某一个对象修改静态变量时，会导致其他对象中的该属性也改变。
 *
 *     > 说明
 *       ① 静态变量随着类的加载而加载，归类所有。
 *          静态变量的加载，早于对象的加载
 *      *② 静态变量可以通过  “ 类.静态变量 ” 的方式调用
 *       ③ 实例变量随着对象的加载而加载，归对象所有。
 *       ④ 由于类只会加载一次，所以静态变量在内存中也值存在一份(存在方法区的静态域中)
 *       ⑤          类变量        实例变量
 *          类       Yes          *NO
 *          对象      Yes          Yse
 *       ⑥ 静态属性举例 System.out \ Math.PI
 *   3、修饰方法:静态方法
 *      ① 随着了类的加载而加载，可以通过 “ 类.静态方法 ” 的方式调用
 *      ②          静态方法        非静态方法
 *          类       Yes            *NO
 *          对象      Yes            Yse
 *      ③ 静态方法中不能调用  非静态的方法或属性
 *          只能调用  静态的方法和属性
 *      ④ 非静态方法中  既可以调用  静态的方法和属性, 又可以调用  非静态的方法或属性。
 *      ⑤注意
 *         > 静态方法中不能使用 this 关键字 和 super 关键字
 *         > 关于静态方法和静态属性的使用 , 可以从 属性和方法 生命周期的角度取理解。
 *    4、开发中，如何确定一个 属性 是否要声明为static的？
 *      ① 属性是可以被多个对象所共享的，不会随着对象的不同而不同
 *      ② 类中的 常量 常常声明为static 例如Math.PI
 *
 *    5、开发中，如何确定一个 方法 是否要声明为static的？
 *      ① 操作静态属性的方法，通常设置为static的
 *      ② 工具类中的方法， 习惯上声明static ,比如，Math , Arrays ,Collections
 *
 */


public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "中国";
        System.out.println(c1.nation);//中国

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        c2.nation = "Chinese";
        System.out.println(c2.nation);//Chinese，c1给natio赋值时，也给c2赋值了

        System.out.println("Chinese.nation");//可以直接永 “ 类.静态属性 ” 的方式调用

        System.out.println("c1.show()");
        System.out.println("Chinses.eat()");//可以直接永 “ 类.静态方法 ” 的方式调用
    }
}
class Chinese{
    String name;
    int age;
    static String nation;//静态变量

    public void show(){
        System.out.println("我是一个中国人");
    }

    public static void eat(){  //静态方法
        System.out.println("中国人吃中餐");
    }

    //编译不通过
/*    public static void info(){
        System.out.println("名字时"+ name);
    }
    */

}
