package PolymorphismExer2;
/*
建立InstanceTest 类，在类中定义方法
method(Person e);
在method中:
(1)根据e的类型调用相应类的getInfo()方法。
(2)根据e的类型执行：
如果e为Person类的对象， 输出：
“a person”;
如果e为Student类的对象， 输出：
“a student”
“a person ”
如果e为Graduate类的对象，输出：
“a graduated student”
“a student”
“a person”
 */

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest i1 = new InstanceTest();
        Person per = new Person();//Person
        Person stu = new Student();//Student
        Person gra = new Graduate();//Graduate
        i1.methord(per);//a Person
//      i1.methord(new Person()); 也可以
        i1.methord(stu);//a Student  a Person

        i1.methord(gra);//a Graduated student   a Student   a Person



    }
    public void methord(Person e){
        System.out.println(e.getInfo());
    //方法一：
        if(e instanceof Graduate){//范围小的写上面
            System.out.println("a Graduated student" + "\n" + "a Student" + "\n" + "a Person");
        }else if(e instanceof Student){
            System.out.println("a Student" + "\n" + "a Person");
        }else if(e instanceof Person){
            System.out.println("a Person");
        }
        System.out.println();
/*  方法二：
        if(e instanceof Graduate){
            System.out.println("a Graduated student");
        }
        if(e instanceof Student){
            System.out.println("a Student");
        }
        if(e instanceof Person){
            System.out.println("a Person");
        }

 */
    }
}

class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}

 class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return "Name: "+ name + "\nage: "+ age + "\nschool: "+ school;
    }
 }

 class Graduate extends Student{
    public String major="IT";
    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
    }
 }