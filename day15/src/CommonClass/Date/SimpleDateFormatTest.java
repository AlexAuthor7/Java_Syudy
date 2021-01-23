package CommonClass.Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    //练习1：将字符串"2020-11-11"转化为java.sql.Date
    @Test
    public void test() throws ParseException {
        String str = "2020-11-11";

        //实例化SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //转化成util.Date格式
        Date date = simpleDateFormat.parse(str);

        //转化为sql.Date格式  调用构造器
        java.sql.Date date2 = new java.sql.Date(date.getTime());
        System.out.println(date2);

    }

    @Test
    public void test2() throws ParseException {
        String str1 = "1990-01-01";
        String str2 = "2020-09-08";

        //实例化SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //转化成util.Date格式
        Date date1 = simpleDateFormat.parse(str1);
        Date date2 = simpleDateFormat.parse(str2);

        long day = (date2.getTime() - date1.getTime())/(1000*60*60*24)+1;

        if(day%5==4||day%5==0){
            System.out.println("晒网");
        }else{
            System.out.println("打鱼");
        }

    }
}
