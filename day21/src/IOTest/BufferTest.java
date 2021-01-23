package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/5 - 12 - 05 -11:45
 * @Description: IOTest
 * @Verxion: 1.0
 */
public class BufferTest {
    @Test
    public void BufferedStream_Test(){
        //1.造文件
        File source_File = new File("idea.jpg");
        File destination_File = new File("idea2.jpg");

        //2.造流
        //2.1 造节点流
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        //2.2 造缓冲流
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream =null;

        try{
            //2.3实例化
            fileInputStream = new FileInputStream(source_File);
            fileOutputStream = new FileOutputStream(destination_File);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3、复制的细节：读取、写入
            byte[] byteBuffer = new byte[10];
            int len;
            //3.1 用bufferedInputStream去调用 read()方法
            while((len = bufferedInputStream.read(byteBuffer)) != -1){
                //3.2 用bufferedOutputStream去调用 write()方法
                bufferedOutputStream.write(byteBuffer,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            //4、流资源的关闭
            //要求：先关闭外层的流，再关闭内层的流
            //说明：在关闭外层流时，内层的流会自动关闭，所以内层流的关闭，我们可以省略
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
