package LambdaTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Auther: Alex
 * @Date: 2020/12/16 - 12 - 16 -19:26
 * @Description: LambdaTest
 * @Verxion: 1.0
 */
public class StreamAPITest {
    @Test
    public void test1(){
        //通过集合
        List<Employee> employees = EmployeeData.getEmployees();
        //default Stream<E> stream() : 返回一个顺序流
        Stream<Employee> stream = employees.stream();

        //default Stream<E> parallelStream() : 返回一个并行流
        Stream<Employee> parallelStream = employees.parallelStream();

        //通过数组
        int[] arr = new int[]{1,2,3,4,5,6,7};
        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流

        IntStream stream1 = Arrays.stream(arr);

        Employee employee = new Employee();

        //通过of()方法
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6);

        //创建无限流

        //迭代
        //遍历前10 个偶数
        Stream.iterate(0,t -> t+2).limit(10).forEach(System.out::println);
        //生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
    @Test//1、筛选与切片
    public void test2(){
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();


        //filter():查询员工表中的薪资大于7000的员工
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        //limit():只要前n个元素
        list.stream().limit(3).forEach(System.out::println);

        //skip():跳过前n个元素
        list.stream().skip(3).forEach(System.out::println);

        //distinct():除去相同的元素（equals()和hashCode()判断）
        list.stream().distinct().forEach(System.out::println);
    }
    @Test//2、映射
    public void test3(){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff");
        List<Employee> employees = EmployeeData.getEmployees();
        //map():对每个数据进行运算，得出新的数据
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::print);
        //练习1：获取员工姓名长度大于3的员工的姓名
        Stream<String> namesStream = employees.stream().map(Employee::getName);
        namesStream.filter(name -> name.length() > 3);

        //flatMap():先map()，再把每个流连起来变成一个流(方法的返回值必须是Stream类型)
        //练习2：
        //map()：按照正常方法得到的是地址
        list.stream().map(StreamAPITest::fromStringToStream).forEach(s -> s.forEach(System.out::print));

        list.stream().flatMap(StreamAPITest::fromStringToStream).forEach(System.out::print);
    }
    @Test//3、排序
    public void test5(){
        List<Integer> list = Arrays.asList(15,34,53,46,76,35);
        //如果要打其他内容，可以这么写
        //sorted():自然排序
        list.stream().sorted().forEach(s -> System.out.print(s+" "));

        //sorted(Comparator com):定制排序
        list.stream().sorted((i1,i2) -> -Integer.compare(i1,i2)).forEach(s -> System.out.print(s + " "));
    }


    //终止操作
    @Test//1、匹配与查找
    public void test6(){
        List<Integer> list = Arrays.asList(15,34,53,46,76,35);
        //allMatch():检查所有元素是否符合条件
        System.out.println(list.stream().allMatch(s -> s > 5));

        //anyMatch():检查是否存在一个元素 符合条件
        System.out.println(list.stream().anyMatch(s -> s > 75));

        //noneMatch():allMatch()取反
        System.out.println(list.stream().noneMatch(s -> s > 5));

        //max():按其中排序的最后一个
        System.out.println(list.stream().max(Integer::compare));
        //min():按其中排序的第一个

        //forEach(): 迭代器
    }
    @Test//2、归约
    public void test7(){
        List<Integer> list = Arrays.asList(15,34,53,46,76,35);
        //reduce(T iden, BinaryOperator b):可以将流中元素反复结合起来，得到一个值。返回 T
        //练习1：计算list的和 再  +10(sum方法正好是两个参数，可以用方法啊引用（BiFunction接口）)
        System.out.println(list.stream().reduce(10, Integer::sum));
        System.out.println(list.stream().reduce(10, (i1, i2) -> i1 + i2));

        //reduce(BinaryOperator b):可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
    }

    @Test//3、收集
    public void test8(){
        List<Integer> list = Arrays.asList(15,34,53,46,76,35);

        //collect(Collector c):把流转换为其他类型
        Set<Integer> set = list.stream().filter(i -> i > 50).collect(Collectors.toSet());
    }


    public static Stream<Character> fromStringToStream(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : str.toCharArray()){
            list.add(c);
        }
        return list.stream();
    }
    @Test//排序
    public void test4(){

    }

}
