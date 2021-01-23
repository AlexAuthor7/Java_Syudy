package AbstractEver;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    //构造器

    public Employee() {}

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    //取值


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
