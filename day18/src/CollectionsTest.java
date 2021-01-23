import org.junit.Test;

import java.util.*;

/**
 * @Auther: Alex
 * @Date: 2020/11/29 - 11 - 29 -10:56
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class CollectionsTest {
    @Test//排序
    public void test1(){
        List list = new ArrayList();
        list.add(12);
        list.add(34);
        list.add(78);
        list.add(56);

        List list2 = new ArrayList();
        list2.add("a");
        list2.add("d");
        list2.add("b");
        list2.add("c");

        //reverse()
        Collections.reverse(list);
        System.out.println(list);

        //shuffle()
        Collections.shuffle(list);
        System.out.println(list);

        //sort(List):自然排序

        //sort(List,Comparator):定制排序
        Collections.sort(list2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return s1.compareTo(s2);
                }
              throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(list2);//[a, b, c, d]

        Collections.swap(list2,0,3);
        System.out.println(list2);//[d, b, c, a]
    }

    @Test
    public void test2(){
        List list2 = new ArrayList();
        list2.add("a");
        list2.add("d");
        list2.add("d");
        list2.add("b");
        list2.add("c");
        list2.add("c");

        //Object max(Collection)：按自然排序，返回最右边的元素
        Object max1 = Collections.max(list2);
        System.out.println(max1);//d

        //Object max(Collection， Comparator)：按定制排序，返回最右边的元素
        Object max2 = Collections.max(list2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(max2);//a

        //min()同理

        System.out.println(Collections.frequency(list2, "c"));//2

        //void copy(List dest,List src)：将src中的内容复制到dest中
        //注意dest长度不能小于src
        //错误写法
//      List dest = new ArrayList();
        //正确写法
        List dest = Arrays.asList(new Object[list2.size()]);
        Collections.copy(dest,list2);
        System.out.println(dest);

        //boolean replaceAll(List list， Object oldVal， Object newVal)：
        Collections.replaceAll(list2,"d","f");
        System.out.println(list2);//[a, f, f, b, c, c]
    }

    @Test
    public void test3(){
        List list2 = new ArrayList();
        list2.add("a");
        list2.add("d");
        list2.add("d");

        //list1是线程安全的
        List list1 = Collections.synchronizedList(list2);
    }

}
