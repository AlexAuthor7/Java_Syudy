package AbstractEver;

public class Manager extends Employee {
    double bonus;

    //构造器
    public Manager() {}//奖金

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("经理的工作");
    }

    //取值

    public double getBonus() {
        return bonus;
    }
}
