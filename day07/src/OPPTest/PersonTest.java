package OPPTest;
/*
1.创建一个Person类， 其定义如下：
Person
name:String
age:int
sex:int
+study():void
+showAge():void
+addAge(int i):int

要求： (1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，输出字符串
“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */


public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();//18
        p1.addAge(2);//+2=20
        int newAge = p1.addAge(2);//+2=22
        System.out.println(p1.name + "新年龄是" +newAge);//22
        System.out.println(p1.age);//return把22又返回给age
    }
}
