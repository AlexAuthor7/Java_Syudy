package AbstractEver;

public class CommonEmployee extends Employee {

    //构造器

    public CommonEmployee() {}

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println("普通员工的工作");
    }
}
