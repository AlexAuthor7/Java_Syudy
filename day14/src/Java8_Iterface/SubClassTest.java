package Java8_Iterface;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        Interface.method1();//接口中定义静态方法,只能由接口本身调用

        s.method3();//superclass, 调用父类中的method3
    }

}
class SuperClass {
    public void method3(){
        System.out.println("superclass");
    }
}
class SubClass extends SuperClass implements Interface{
    //静态方法和默认方法不用重写


}
