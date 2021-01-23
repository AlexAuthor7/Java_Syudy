package SuperTest;

public class Student extends Person {
    String major;
    int id = 1000;//学号
    public Student(){
    }

    public Student(String name, String major) {
        super(name);//父类中有空参的构造器，才可以省略，
                    //如果没有空参的构造器，不写“ super(形参列表) ”，就会报错
        this.major = major;
    }
    public Student(String name, String major , int age){
        super(name,age);
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void eat(){
        System.out.println("学生，多吃有营养的食物");
    }
    public void study(){
        System.out.println("学生，学习知识");
        this.eat();//当前子类中
        super.eat();//父类中
        walk();//在子类中没有被重写，可以直接写
    }
    public void show(){
        System.out.println("name = " + this.name + "age = " + this.age);
        System.out.println("id = " + super.id);//父类中的id
        System.out.println("id = " + this.id);//子类中的id
    }

}
