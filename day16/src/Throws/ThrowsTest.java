package Throws;


import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
    @Test
    public void test() {
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);//java.lang.NumberFormatException
        }catch (NullPointerException e){//异常错误不会进去
            System.out.println("出现空指针异常");
        }catch (NumberFormatException e){
            System.out.println("出现数值转化异常");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void test2 (){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);

        }catch(ArithmeticException e){
            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);//数组角标越界异常，会退出程序
        }finally {
            System.out.println("嘤嘤嘤~~");
        }
    }


    @Test
    public void tset(){
        try{
            method();
        }catch(FileNotFoundException e){
            //处理方式1
        }catch(IOException e){
            //处理方式2
        }

    }


    public void method() throws FileNotFoundException, IOException   {
   /*     File file = new File("hello.txt");
        FileInputstrream fis = new FileInputstrream(file);

        int date = fis.read();
        while (date ！= -1){
            System.out.print(char(date));
            date = fis.read();
        }
        fis.close;*/
    }

}
