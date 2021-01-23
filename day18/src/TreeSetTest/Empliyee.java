package TreeSetTest;

/**
 * @Auther: Alex
 * @Date: 2020/11/28 - 11 - 28 -9:31
 * @Description: TreeSetTest
 * @Verxion: 1.0
 */
public class Empliyee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    //构造器


    public Empliyee() {
    }

    public Empliyee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


    //getter\setter


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Empliyee){
            Empliyee e = (Empliyee)o;
            return this.name.compareTo(e.name);
        }
        throw new RuntimeException("输入的数据类型错误");
    }

    @Override
    public String toString() {
        return "Empliyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.getYear()+"-"+birthday.getMonth()+"-"+birthday.getDay()+
                '}';
    }
}
