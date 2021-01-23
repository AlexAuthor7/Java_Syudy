import org.junit.Test;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @Auther: Alex
 * @Date: 2020/11/27 - 11 - 27 -9:01
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);//自动装箱

        for(Object obj:coll){
//  集合中元素类型  局部变量（int i）: 集合对象
            System.out.println(obj);
        }

        int[] arr = new int []{1,2,3,4,5,6};
        for(int i:arr){
            System.out.println(i);
        }
    }

    //笔试题
    @Test
    public void test3(){
        String[] arr = new String[]{"MM","MM","MM"};
        String[] arr1 = new String[]{"MM","MM","MM"};
        //方式一：普通for循环
        for(int i = 0;i< arr.length;i++){
            arr[i]="GG";
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }//GGGGGG,和不可变性无关
        //方式二：增强for循环
        for(String s :arr1){
            s = "GG"; //重新定义了一个变量，原来的数组不变
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }//MMMMMM

    }
}
