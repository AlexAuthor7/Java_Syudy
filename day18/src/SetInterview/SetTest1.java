package SetInterview;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Auther: Alex
 * @Date: 2020/11/28 - 11 - 28 -10:14
 * @Description: SetInterview
 * @Verxion: 1.0
 */
public class SetTest1 {
    @Test
    public void test(){
        HashMap map = new HashMap();//实例化以后，底层创建了长度时16的一维数组Entry[] table
        map.put(1,11);//map.put(key1,value1);
        map.put(2,22);//首先，调用key所在类的hashCode()方法计算key1的哈希值，此哈希值金国某种算法计算以后，得到在Entry中的存放位置

        //如果此位置上的数据为空 --> key1 - value1添加成功 -- 情况1
        //如果此位置上的数据不为空（此位置存在一个或多个数据），比较key1和已经存在的一个或多个数据的哈希值（调用key1所在类的equals()方法）

        //如果key1的哈希值和已存在的数据的哈希值都不相同 --> key1 - value1添加成功 -- 情况2
        //如果key1的哈希值和已经存在的某一个数据的哈希值相同， 调用key所在类的equals()方法

        //如果equals()返回false --> key1 - value1添加成功 -- 情况3
        //如果返回不为true --> 使用value1 去替换相同 key 的value值

        //补充：情况1和情况2中，key1 - value1 和原来的数据以链表的方式存储

        //在不断的添加过程中，会涉及扩容问题，默认扩大为原来的2倍，并将原来的元素复制过来
    }
}
