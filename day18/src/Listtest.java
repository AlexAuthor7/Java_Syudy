import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *  List除了从Collection集合继承的方法外， List 集合里添加了一些根据索引来操作集合元素的方法。
 * void add(int index, Object ele):在index位置插入ele元素
 * boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
 * Object get(int index):获取指定index位置的元素
 * int indexOf(Object obj):返回obj在集合中首次出现的位置
 * int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
 * Object remove(int index):移除指定index位置的元素，并返回此元素
 * Object set(int index, Object ele):设置指定index位置的元素为ele
 * List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex
 * 位置的子集合
 * @Auther: Alex
 * @Date: 2020/11/27 - 11 - 27 -15:11
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */

public class Listtest {
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("AA");
        list.add(new Person(12,"Tom"));

        System.out.println(list);
        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"BB");
        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1,2,3);
        list.addAll(1,list1);
        list.size();//4+3=7


        list.add(list1);//会被视为一个整体
        list.size();//4+1=5

         //Object get(int index):获取指定index位置的元素
        list.get(1);

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        //注意：List中的是按索引删除、ArrayList中重载了此方法，按对象删除
        list.remove(2);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(1,"CC");

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex
        //注意：是左闭右开区间
        List subList = list.subList(2,4);
    }
}
