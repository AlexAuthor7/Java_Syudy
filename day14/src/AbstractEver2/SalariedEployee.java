package AbstractEver2;

//按月计算工资
public class SalariedEployee extends Employee{
    private double monthSalary = 10000;

    //构造器


    public SalariedEployee() {}

    public SalariedEployee(String name,MyDate birthday) {
        super(name,birthday);
    }

    @Override
    public double earnings() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "该员工按  月  计算工资"+"SalariedEployee{" + "monthSalary=" + monthSalary  +super.toString()+'}';
    }
}
