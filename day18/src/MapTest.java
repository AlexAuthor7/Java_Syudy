import org.junit.Test;

import java.util.*;

/**
 * @Auther: Alex
 * @Date: 2020/11/28 - 11 - 28 -16:28
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class MapTest {
    @Test
    public void test(){
        Map map = new HashMap();
        //添加
        map.put("AA",123);
        map.put("BB",123);
        map.put("CC",123);
        //修改
        map.put("AA",321);

        System.out.println(map);//{AA=321, BB=123, CC=123}

        //Object remove(Object key)：移除指定key的key-value对，并返回value
        System.out.println(map.remove("CC"));//123
        System.out.println(map.remove("CCC"));//null

        //void clear()：清空当前map中的所有数据
        map.clear();
        System.out.println(map.size());//0
    }

    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",132);
        map.put("CC",321);

        Map map1 = new HashMap();
        map1.put("BB",132);
        map1.put("CC",321);
        map1.put("AA",123);

        //Object get(Object key)：获取指定key对应的value
        System.out.println(map.get("AA"));//123
        System.out.println(map.get("DD"));//null

        //boolean equals(Object obj)：判断当前map和参数对象obj是否相等
        System.out.println(map.equals(map1));//true
    }

    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",132);
        map.put("CC",321);

        // Set keySet()：返回所有key构成的Set集合
        Set set = map.keySet();
        // Collection values()：返回所有value构成的Collection集合
        Collection values = map.values();
        // Set entrySet()：返回所有key-value对构成的Set集合
        Set entrySet = map.entrySet();
        //方式一
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //方式二
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry)obj;

            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        //方法三 : 通过key找value
        Iterator iterator2 = set.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);

            System.out.println(key+"=="+value);

        }
    }

}
