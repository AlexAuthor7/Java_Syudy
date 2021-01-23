package IOExer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Alex
 * @Date: 2020/12/4 - 12 - 04 -20:09
 * @Description: IOExer
 * @Verxion: 1.0
 */
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file1 = new File("F:\\Java\\IntelliJ IDEA\\Java Study\\day21\\src\\IOExer\\hello.txt");
        //在其中创建多个文件和目录
        File destFile1 = new File(file1.getParent(),"haha1.txt");
        File destFile2 = new File(file1.getParent(),"haha2.txt");
        boolean newFile1 = destFile1.createNewFile();
        boolean newFile2 = destFile1.createNewFile();
        if(newFile1){
            System.out.println("创建成功");
        }
        boolean deleteFile = destFile1.delete();
        if(deleteFile){
            System.out.println("删除成功");
        }
    }
}
