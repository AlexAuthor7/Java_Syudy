package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/5 - 12 - 05 -17:21
 * @Description: IOTest
 * @Verxion: 1.0
 */
public class ObjectInputOutputTest {
    //序列化：将内存中的对象保存到磁盘里
    //使用ObjectOutputStream实现
    @Test
    public void test1 (){
        ObjectOutputStream oos = null;
        try {
            //不用再实话File类了
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //注意：添加一个对象flush()一次
            oos.writeObject(new String("我爱北京"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //反序列化:将磁盘文件中的对象还原为内存中的对象
    //使用ObjectInputStream实现
    @Test
    public void test2 (){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj = ois.readObject();
            String str = (String)obj;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
