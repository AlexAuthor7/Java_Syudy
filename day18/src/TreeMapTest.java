import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Auther: Alex
 * @Date: 2020/11/28 - 11 - 28 -17:53
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class TreeMapTest {
    @Test
    public void test(){
        Map map = new TreeMap();

        map.put(new Person(1,"A"),123);
        map.put(new Person(2,"B"),123);
        map.put(new Person(1,"B"),123);
        map.put(new Person(1,"C"),123);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
