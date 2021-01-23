package AbstractEver2;


//按小时计算工资
public class HourlyEmployee extends Employee{
    private double wage = 100;
    private int hour;

    //构造器

    public HourlyEmployee(String name, MyDate birthday,int hour) {
        super(name, birthday);
        this.hour = hour;
    }

    //重写抽象方法,返回工资
    @Override
    public double earnings() {
        return wage * hour;
    }

    //返回员工信息

    @Override
    public String toString() {
        return "该员工按 小时 计算工资"+"HourlyEmployee{+"+ super.toString()+"}";
    }
}
