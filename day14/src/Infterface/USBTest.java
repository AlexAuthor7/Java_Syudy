package Infterface;
/*   1、接口的具体使用,体现多态性
 *      > 形参类型为A接口 A接口的实现类 B可以直接作为 实参 赋给方法
 *   2、接口，实际上可以看成是一种规范
 *   3、接口的主要用途就是被实现类实现,(体现 面向接口编程思想)
 *
 *  面试题：抽象类和接口有哪些异同？
 *  > 接口和实现类的关系  类似  USB接口和驱动 的关系
 *
 *
 */

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //1、创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferDate(flash);//接口可以当成父类

        //2、创建了接口的非匿名实现类的匿名对象
        computer.transferDate(new Printer());

        //3、创建了接口的匿名实现的非匿名对象
        USB phone = new USB(){
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };//注意,不要漏掉分号
        computer.transferDate(phone);

        //4、创建了接口匿名实现类的 匿名对象
        computer.transferDate(new USB(){
            @Override
            public void start() {}

            @Override
            public void stop() {}
        });
    }
}
class Computer{
    public void transferDate(USB usb){//接口可以当形参使用
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}



interface USB{
    //常量：定义了长、宽、高、最高最低传输素的
    void start();

    void stop();

}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("开启U盘");
    }

    @Override
    public void stop() {
        System.out.println("关闭U盘");
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}