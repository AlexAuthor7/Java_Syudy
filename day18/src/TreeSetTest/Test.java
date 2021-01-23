package TreeSetTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 1. 定义一个 Employee 类。
 该类包含： private 成员变量 name,age,birthday，其中 birthday 为
 MyDate 类的对象；
 并为每一个属性定义 getter, setter 方法；
 并重写 toString 方法输出 name, age, birthday
 MyDate 类包含:
 private 成员变量 year,month,day；并为每一个属性定义 getter, setter
 方法；
 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：
 TreeSet 需使用泛型来定义）
 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。


 *
 * @Auther: Alex
 * @Date: 2020/11/28 - 11 - 28 -9:36
 * @Description: TreeSetTest
 * @Verxion: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Empliyee && o2 instanceof Empliyee){
                    Empliyee e1 = (Empliyee)o1;
                    Empliyee e2 = (Empliyee)o2;

                    MyDate m1 = e1.getBirthday();
                    MyDate m2 = e2.getBirthday();

                    int year =  m1.getYear() - m2.getYear();
                    if(year == 0){
                        int month = m1.getMonth() - m2.getMonth();
                        if(month == 0){
                            return m1.getDay() - m2.getDay();
                        }
                        return month;
                    }
                    return year;
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        };
        TreeSet set = new TreeSet(com);

        set.add(new Empliyee("E",13,new MyDate(2020,2,1)));
        set.add(new Empliyee("D",3,new MyDate(2020,1,2)));
        set.add(new Empliyee("C",3,new MyDate(2019,1,1)));
        set.add(new Empliyee("B",2,new MyDate(2019,1,2)));
        set.add(new Empliyee("A",13,new MyDate(2018,1,1)));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
