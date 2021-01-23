package IOTest;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: Alex
 * @Date: 2020/12/5 - 12 - 05 -15:17
 * @Description: IOTest
 * @Verxion: 1.0
 */
public class InputStreamReaderTest {
    //此时处理异常的话仍然应该使用try catch finally
    @Test
    public void test1(){
        InputStreamReader inputStreamReader = null;//没有显式地说明，使用系统默认的字符集
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
            //具体使用那个字符集取决于hello.txt保存时使用的字符集
            inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");

            char[] charBuffer = new char[5];
            int len;
            while((len = inputStreamReader.read(charBuffer)) != -1){
                String str = new String(charBuffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while(true){
                String data = br.readLine();
                //注意点：把data写在括号里，避免空指针
                if("e".equalsIgnoreCase(data)||"exit".equalsIgnoreCase(data)){
                    System.out.println("结束输入");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}
