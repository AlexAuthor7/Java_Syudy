package BoyGIrlTest;

public class Boy {
    private String name;
    private int age;
    //构造器
    public Boy(){}
    public Boy(String name,int age){
        this.name = name;
        this.age = age;
    }

    //名字
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    //年龄
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //结婚
    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
    }

    //喊
    public void shout(){
        if(this.age >= 22){
            System.out.println("你可以去合法登记结婚了");
        }else{
            System.out.println("先谈一会恋爱吧");
        }
    }
}
