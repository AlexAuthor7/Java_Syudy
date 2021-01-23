package GenericTest;


import org.junit.Test;

import java.util.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/3 - 12 - 03 -15:28
 * @Description: GenericTest
 * @Verxion: 1.0
 *
 * JDK 5.0新增的特性
 */
public class GenericTest1 {
    //在集合中使用泛型的情况
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(34);
        list.add(84);
        list.add(94);

        //问题一：类型不安全——>要求：在添加数据时进行类型检查——>泛型
        //list.add("Tom");
        for (Object score : list){
            //问题强转时容易出现ClassCastException
            int stuScore = (int)score;
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况:以ArrayList为例
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //需求：存放学生的成绩
        list.add(34);
        list.add(84);
        list.add(94);
        //编译时，进行类型检查，保证数据的安全
        //list.add("Tom");
        //方式一：
        for (Integer score : list){
            //避免了强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }
        //方式二:
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //在集合中使用泛型的情况:以HashMap为例
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("A",90);
        map.put("B",90);
        map.put("C",90);
        map.put("D",90);

        Set<Map.Entry<String,Integer>>  entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"--"+value);
        }
    }
    @Test
    public void test4(){
        Comparator comparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.age - e2.age;
            }
        };
        Set<Employee> set = new TreeSet<>(comparator);

        set.add(new Employee("A",12));
        set.add(new Employee("B",11));
        set.add(new Employee("C",10));
    }
}
