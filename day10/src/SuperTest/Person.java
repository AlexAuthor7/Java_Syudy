package SuperTest;


public class Person{
    String name;
    int age;
    int id = 5555;//身份证号

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this(name);//调用上面的构造器
        this.age = age;
    }
    public void eat(){
        System.out.println("人，吃饭");
    }
    public void walk(){
        System.out.println("人，走路");
    }
}
