package LambdaTest;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/15 - 12 - 15 -16:13
 * @Description: LambdaTest
 * @Verxion: 1.0
 */
public class LambdaTest1 {



    @Test
    public void test1(){
        //语法格式一：无参，无返回值
        Runnable runnable = () -> {
            System.out.println("我爱北京故宫");
        };
        runnable.run();

        //语法格式二：Lambda 需要一个参数，但是没有返回值
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("重庆火锅");

        Consumer<String> con2 = (String s) -> {
            System.out.println(s);
        };
        con2.accept("抄手");

        //语法格式三：数据类型可以省略，因为可由编译器推断得到（类型推断）
        Consumer<String> con3 = (s) -> {
            System.out.println(s);
        };
        con3.accept("小面");

        //语法格式四：Lambda 若只需要一个参数，参数的小阔号可以从省略
        Consumer<String> con4 = s -> {
            System.out.println(s);
        };
        con4.accept("大米");

        //语法格式五：Lambda 需要两个或两个以上的参数，多条执行语句，并且可以有返回值
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> com2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };


        //语法格式六： 当Lambda体只有一条语句时，return与大括号若有，都可以省略

        Comparator<Integer> com3 = (o1,o2) -> o1.compareTo(o2);

        Runnable runnable2 = () -> System.out.println("我爱北京故宫");
        runnable2.run();
    }
    @Test
    public void test2(){
        //使用Lambda表达式
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");

        //使用方法引用
        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("南京");
    }
    @Test
    public void test3(){
        //使用Lambda表达式
        Employee emp = new Employee(1001,"Tom");
        Supplier<String> sup1 = () -> "东京"+emp.getName();
        System.out.println(sup1.get());

        //使用方法引用
        Supplier<String> sup2 = emp::getName;
        System.out.println(sup2.get());
    }
    @Test
    public void tset4(){
        //使用Lambda表达式
        Comparator<Integer> com1 = (t1,t2) -> Integer.compare(t1,t2);

        //使用方法引用
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12, 3));

        //使用Lambda表达式
        Function<Double,Long> func1 = d -> Math.round(d);

        //使用方法引用
        Function<Double,Long> func2 = Math :: round;
    }


    @Test
    public void test5(){
        //使用Lambda表达式
        Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc","abd"));

        //使用方法引用
        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abc","abd"));

    }
    @Test
    public void test6(){
        //使用Lambda表达式
        BiPredicate<String,String> pre1 = (s1,s2) -> s1.equals(s2);
        System.out.println(pre1.test("abc","abd"));

        //使用方法引用
        BiPredicate<String,String> pre2 = String::equals;
        System.out.println(pre2.test("abc","abd"));



        //使用Lambda表达式
        Employee employee = new Employee(1001, "Tom", 23, 2000);

        Function<Employee,String> func1 = e -> e.getName();
        System.out.println(func1.apply(employee));

        //使用方法引用
        Function<Employee,String> func2 = Employee::getName;
        System.out.println(func2.apply(employee));
    }
    @Test
    public void test7(){
        //原版写法
        Supplier<Employee> sup1 = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        //Lambda表达式
        Supplier<Employee> sup2 = () -> new Employee();

        //构造器引用
        Supplier<Employee> sup3 = Employee::new;
        System.out.println(sup2.get());



        //Lambda表达式
        Function<Integer,Employee> func1 = id -> new Employee(id);
        Employee employee = func1.apply(1001);
        System.out.println(employee);

        //构造器引用(id不用写，)
        Function<Integer,Employee> func2 = Employee::new;



        // Lambda表达式
        BiFunction<Integer,String,Employee> biFunc1 = (id,name) -> new Employee(id,name);
        Employee employee2 = biFunc1.apply(1002,"Tom");
        System.out.println(employee2);

        //构造器引用
        BiFunction<Integer,String,Employee> biFunc2 = Employee::new;
        Employee employee3 = biFunc2.apply(1003,"Lucy");

    }
    @Test
    public void test8(){
        //Lambda表达式
        Function<Integer,String[]> func1 = length -> new String[length];
        String[] arr1 = func1.apply(5);
        System.out.println(Arrays.toString(arr1));

        //数组引用
        Function<Integer,String[]> func2 = String[] ::new;
        String[] arr2 = func2.apply(6);
        System.out.println(Arrays.toString(arr2));

    }
}
