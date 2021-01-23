package ReflectionTest;

import org.junit.Test;

/**
 * @Auther: Alex
 * @Date: 2020/12/6 - 12 - 06 -21:03
 * @Description: ReflectionTest
 * @Verxion: 1.0
 */
public class Person {


    private String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println("我是一个人");
    }
    public void showNation(){
        System.out.println("中国人");
    }
}
