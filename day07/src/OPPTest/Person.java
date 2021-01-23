package OPPTest;

public class Person {
    String name;
    int age;
    /**
     * sex1:表明是男性
     * sex0;表明是女性
     */
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {
        age += i;
        return age;//返回
    }
}