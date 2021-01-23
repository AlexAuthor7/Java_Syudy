import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: Alex
 * @Date: 2020/11/27 - 11 - 27 -17:36
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class SetTest {
    @Test
    public void test(){
        Set set = new HashSet();
        set.add(123);
        set.add("AA");
        set.add(new Person(12,"Tom"));
        set.add(new Person(12,"Tom"));
    }

}
