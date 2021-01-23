package BoyGIrlTest;

public class Girl {
    private String name;
    private int age;

    //构造器
    public Girl(){}
    public Girl(String name,int age){
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


    //结婚
    public void marry(Boy boy){//创建对象
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);//this 表示是这个女的（当前对象）
    }
    //比较
    public int compare(Girl girl){
        return this.age - girl.age;
    }




}
