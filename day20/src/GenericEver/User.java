package GenericEver;

import java.util.Objects;

/**
 * @Auther: Alex
 * @Date: 2020/12/4 - 12 - 04 -16:36
 * @Description: GenericEver
 * @Verxion: 1.0
 */
public class User {
    private int id;
    private int age;
    private String name;

    //构造器

    public User() {
    }
    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    //getter\setter

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写toString()方法

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    //重写equals()方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }
}
