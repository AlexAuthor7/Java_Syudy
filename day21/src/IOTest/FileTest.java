package IOTest;


import org.junit.Test;

import java.io.File;

/**
 * @Auther: Alex
 * @Date: 2020/12/4 - 12 - 04 -19:26
 * @Description: IOTest
 * @Verxion: 1.0
 */
public class FileTest {
    /*
    一、File类的使用
    1、File类的一个对象，代表一个文件或一个文件目录（俗称文件夹）
    2、File类声明在Java.io包下

    1.相对路径：
      绝对路径：包含


     */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("hello.txt");//相对路径
        File file2 = new File("F:\\Java\\IntelliJ IDEA\\Java Study\\day21");//绝对路径
        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("F:\\Java\\IntelliJ IDEA","Java Study");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file2,"hello.txt");
    }
}
