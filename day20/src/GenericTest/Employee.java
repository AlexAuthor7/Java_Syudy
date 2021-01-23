package GenericTest;

/**
 * @Auther: Alex
 * @Date: 2020/12/3 - 12 - 03 -16:24
 * @Description: GenericTest
 * @Verxion: 1.0
 */
public class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}
