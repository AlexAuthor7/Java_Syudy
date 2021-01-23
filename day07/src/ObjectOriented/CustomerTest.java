package ObjectOriented;
/*
一、类中方法的声明和使用
   ex：Math类：sqrt() \ random() \
       Scanner类：nextXxx()
       Arrays类：sort() \ binarySearch() \ toString() \ equals() \

   1、如何定义方法
      ex: > public void eat(){}            //void是无返回值
          > public void sleep(int hour){}
          > public String getName(){}      //String是返回两个字符串
          > public String getNation(String nation){}
      总结：有无返回值，有无形参

   2、方法的声明：
      格式：  权限修饰符 返回值类型 方法名 ( 形参列表 ){  方法体  }
      注意：  static、final、abstract 用来修饰方法

   3、说明
      ①权限修饰符(private（小）、public（大）、缺省、protected)
      ②返回值类型
          > 有返回值，必须在方法声明时，指定返回值的类型
            同时，方法中需要使用 return 关键字来返回指定类型的变量或常量
                （格式： ”  return 变量名/常量名  “）
          > 没有返回值，则方法声明时使用void来表示，通常不用 return
            如果使用，只能用” return; “来表示此方法结束
      ③什么时候要有返回值
          > 题目要求
          > 凭经验
      ④方法名：符合规范，见名知意
      ⑤形参列表： 方法可以声明多个形参
                （格式： 数据类型1 形参1，形参2。。）
      ⑥定义方法时要不要形参
          > 题目要求
          > 凭经验
      ⑦方法体

   4、return关键字的使用
      ①使用范围：使用在方法体中
      ②作用：> 结束方法（类似break）
             > 针对有返回值类型的方法，使用” return 变量名/方法名 “方法
               返回所要的数据
      注意：retur后面不能有执行语句

   5、方法的使用：
      ①方法中也可以调用方法
          特别地：自己调自己-->递归方法
      ②方法中不可以定义方法

 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();


    }
}

//客户类
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;


    //方法
    public void eat(){
        System.out.println("吃面包");
    }
    public void sleep(int hour){
        System.out.println("休息了" + hour + "小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info = "我的国籍是：" + nation;
        return info;
    }
}
