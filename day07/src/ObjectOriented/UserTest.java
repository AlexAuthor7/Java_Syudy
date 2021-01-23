package ObjectOriented;
/*
一、类中属性的使用：成员变量 vs 局部变量
   1、相同点：
        ①格式一样：数据类型 变量名 = 变量值；
        ②都是先声明后使用
        ③变量都有其对应的作用域

  2、不同点
        ① 在类中声明的位置不同
          > 属性（成员变量）：直接定义在类的一对{}内
          > 局部变量：声明在方法内，方法形参，代码块内，构造器形参，构造器内部的变量

        ② 权限修饰符的不同
          > 属性：在声明变量时，可以指明其权限，使用权限修饰符
               常用的权限修饰符：private、public、缺省(class前面什么都没写)、protected
          > 局部变量: 不可以使用权限修饰符

        ③ 默认初始化值
          > 属性：类的属性，根据其数据类型，都有默认初始化值
                    整形：0
                    浮点型：0.0
                    char；0（或'\u0000'）
                    boolean型：false
                    引用数据类型（类，接口，数组）：null
          > 局部变量：没有默认初始化值，调用之前一定要赋值
                   特别地：形参在调用时赋值即可

        ④ 在内存中加载的位置不一样
           > 属性：加载在堆空间中  （非static）
           > 局部变量：加载到栈空间中
 */

public class UserTest {
}
class User{
    //属性
    public int age;//public权限
    String name;   //缺省 权限
    public void talk(String language){  //（）里的language就是形参内的 局部变量
        System.out.println("用" + language + "交流");
    }
    public void eat(){
        String food = "面包";//局部变量
    }
}