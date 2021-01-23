package CodeBlocks;
/* 类的成员之四：代码块(初始化块)
 *  一、代码块的作用
 *   1、用来初始化 类 和 对象
 *   2、只能用satatic 修饰
 *   3、分类：静态代码块 vs 非静态代码块
 *
 *   4、静态代码块
 *     ① 内部可以有输出语句
 *     ② 随着 类 的加载而执行,而且只执行一次
 *     ③ 可以定义多个,执行顺序 按照声明的先后顺序(一般不会声明多个 代码块)
 *     ④ 静态代码块 在 非静态代码块之前执行
 *     ⑤ 静态代码块中 只能 调用 静态的 方法和属性
 *     ⑥ 作用
 *       > 初始化类的信息
 *
 *   5、非静态代码块
 *     ① 内部可以有输出语句
 *     ② 随着 对象 的创建而执行
 *     ③ 每创建一个对象, 就执行一次
 *     ④ 可以定义多个,执行顺序 按照声明的先后顺序(一般不会声明多个 代码块)
 *     ⑤ 非静态代码块中既可以调用 静态的, 也可以调用非静态的 方法和属性
 *     ⑥ 作用：
 *       > 在创建对象时 ,对对象的属性,初始化
 *
 *
 * 二、总结：可以对属性赋值的位置
 *   1、默认初始化
 *   2、显式初始化
 *   3、构造器
 *   4、创建了对象以后,通过 ” 对象.属性 “
 *   5、setXxx()方法
 *   6、在代码块中赋值
 *
 */

public class CodeBlocksTest {
    public static void main(String[] args) {
        String description = Person.description;//静态，直接调
        //静态代码块也被调用了

        System.out.println(description);//利用静态代码块,给description赋初始化值

        Person p1 = new Person();
        //非静态代码块被调用了


    }
}
class Person{
    String name;
    int age;
    static String description;

    //构造器
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块

//  不用static修饰  非静态代码块
    {
        System.out.println("你好。。。");
        age = 1;//利用非静态代码块，赋值
    }

//  用static修饰  静态代码块
    static {
        System.out.println("你好，static");
        description = "我是一个爱学习的人";
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }
    @Override
    public String toString(){
        return "person [name" + ",age=" + age + "]";
    }
    public static void info(){
        System.out.println("我是人");
    }

}
