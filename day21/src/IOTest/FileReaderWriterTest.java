package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/4 - 12 - 04 -21:33
 * @Description: IOTest
 * @Verxion: 1.0
 */
public class FileReaderWriterTest {

    @Test
    public void testFileReader1() {
        FileReader fileReader = null;//先声明对象
        try {
        //1、实例化File类的对象，指明要操作的文件，没有实例化，会导致close()方法空指针
        File file = new File("hello.txt");//相较于当前Module
        //如果现在main方法里，就是相对于当前工程的


            //2、提供具体的功能
            fileReader = new FileReader(file);


            //3、数据的读入
            //read():返回读入的一个字符，如果达到文件末尾，返回-1
            //read():底层自带迭代器
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                //4、流的关闭操作
                if(fileReader != null){//判断是否实例化，防止空指针
                    fileReader.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @Test//对read()操作的升级：使用read()的重载方法
    public void testFileReader2(){
        //1、File的实例化
        File file = new File("hello.txt");

        FileReader fileReader = null;
        try {
            //2、FileReader的实例化
            fileReader = new FileReader(file);

            //3、读入操作
            char[] charBuffer = new char[5];
            int len;
            while((len = fileReader.read(charBuffer)) != -1){
                //难点：循环条件
                //方法一
                for (int i = 0; i < len; i++) {
                    System.out.print(charBuffer[i]);
                }
            }

            while((len = fileReader.read(charBuffer)) != -1){
                //难点：循环条件
                //方法二
                String str = new String(charBuffer,0,len);
                System.out.print(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            //资源的关闭
            try{
                if(fileReader != null){
                    fileReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    //从内存中写出数据到银盘的文件里
    @Test
    public void testFileWriter(){
        //1、File的实例化墓志铭写出的文件
        File file = new File("hello.txt");

        //2、FileWriter 的实例化,用于数据的写出
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(file,true);
            //3、数据的写出
            String str = "上山打老虎\n";
            fileWriter.write(str);
            fileWriter.write("you are a sutudents");

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                //4、流资源的关闭操作
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    public void copyFile(String source_Path,String destination_Path){
        //1、示例化File类，指明读入文件和写出文件
        File inputFile = new File(source_Path);
        File outputFile = new File(destination_Path);

        //2、声明FileWriter和FileReader类
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream(inputFile);
            fileOutputStream = new FileOutputStream(outputFile,true);
            int len;
            byte[] byteBuffer = new byte[10];
            while((len = fileInputStream.read(byteBuffer)) != -1){
                fileOutputStream.write(byteBuffer,0,len);
            }
            //2.1、实例化FileWriter和FileReader类
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            //4、流资源的关闭
            try {
                if(fileInputStream != null)
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }try {
                if(fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }@Test
    public void tset_FileWriter_FileReader(){
        //1、示例化File类，指明读入文件和写出文件
        File inputFile = new File("hello.txt");
        File outputFile = new File("hello2.txt");

        //2、声明FileWriter和FileReader类
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try{
            fileReader = new FileReader(inputFile);
            fileWriter = new FileWriter(outputFile,true);
            int len;
            char[] charBuffer = new char[10];
            while((len = fileReader.read(charBuffer)) != -1){
                fileWriter.write(charBuffer,0,len);
            }
            //2.1、实例化FileWriter和FileReader类
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            //4、流资源的关闭
            try {
                if(fileReader != null)
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }try {
                if(fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
