package AbstractEver2;

//员工父类
public abstract class Employee {
    private String name;
    private int number;//工作编码

    private MyDate birthday;//创建MyDate的对象



    private static int init = 0000;

    //构造器
    public Employee() {
        this.number = init;
        init++;
    }

    public Employee(String name,MyDate birthday) {
        this();
        this.name = name;

    }



    //取值

    public MyDate getBirthday() {//注意,取类
        return birthday;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    //抽象方法,返回 时薪*小时
    public abstract double earnings();


    //返回对象的 name, number, birthday


    @Override
    public String toString() {
        return "Employee{" + "name='" + name  + ", number=" + number + ", birthday=" + this.birthday.toDateString() + '}';
    }
}
