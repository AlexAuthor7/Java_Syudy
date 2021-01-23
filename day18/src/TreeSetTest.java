import org.junit.Test;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Auther: Alex
 * @Date: 2020/11/27 - 11 - 27 -21:13
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class TreeSetTest {
    @Test
    public void test(){
        TreeSet set = new TreeSet();

        set.add(123);
        set.add(456);
        set.add(45);
        set.add(4);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }//按从小到大排序
    }

    @Test
    public void test2(){
        TreeSet set = new TreeSet();

        set.add(new Person(1,"A"));
        set.add(new Person(1,"B"));
        set.add(new Person(1,"C"));
        set.add(new Person(2,"C"));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return Integer.compare(p1.age, p2.age);
                }
                throw new RuntimeException("输入的数据类型不匹配");
            }
        };
        TreeSet set = new TreeSet(com);


        set.add(new Person(1,"A"));
        set.add(new Person(1,"B"));
        set.add(new Person(1,"C"));
        set.add(new Person(2,"C"));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
