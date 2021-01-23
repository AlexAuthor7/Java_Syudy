package CommonClass.Date2;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class LocalDateTimeTest {
    @Test
    public void test(){
        //now获取当前日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime localDateTime1 = LocalDateTime.of(2020,11,13,10,10);
        System.out.println(localDateTime1);//2020-11-13T10:10

        //getXxx(): 获取当前日期
        System.out.println(localDateTime.getDayOfMonth());//

    //不可变性
        //withXxx()： 设置相关属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);//不可变性
        System.out.println(localDate1);

        //plusXxx(): 加上相关属性
    }

    //Instant的使用
    @Test
    public void test2(){
        //实例化
        //1、now() : 获取本初子午线的时间
        Instant instant = Instant.now();//获取当前时间（0时区）
        System.out.println(instant);//2020-11-13T06:33:33.018859200Z(早八小时)

        //2、atOffset() : 根据时区，添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2020-11-13T14:39:11.752174300+08:00

        //3、toEpochMilli() : 获取1970-01-01 00:00:00到当前时间的毫秒数， 即为时间戳
        long milli = instant.toEpochMilli();
        System.out.println(milli);//1605249977944

        //4、ofEpochMilli(long epochMilli)：
        Instant instant1 = Instant.ofEpochMilli(milli);
        System.out.println(instant1);//2020-11-13T06:48:37.021Z (milli毫秒数对应的日期)

    }
    @Test
    public void test3(){

        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        //格式化：日期 -->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = isoDateTime.format(localDateTime);
        System.out.println(localDateTime);//2020-11-13T15:08:19.007738400

        //解析：字符串 --> 日期
        TemporalAccessor parse = isoDateTime.parse("2020-11-13T15:08:19.007738400");
        System.out.println(parse);//{},ISO resolved to 2020-11-13T15:08:19.007738400
    }
    @Test
    public void test4(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化： 日期 --> 字符串
        System.out.println(formatter);//Value(YearOfEra,4,19,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)' 'Value(ClockHourOfAmPm,2)':'Value(MinuteOfHour,2)':'Value(SecondOfMinute,2)
        String str = formatter.format(LocalDateTime.now());
        System.out.println(str);//2020-11-13 03:22:34

        //解析:  字符串 --> 日期
        TemporalAccessor parse = formatter.parse("2020-11-13 03:22:34");
        System.out.println(parse);//{SecondOfMinute=34, NanoOfSecond=0, MilliOfSecond=0, MinuteOfHour=22, MicroOfSecond=0, HourOfAmPm=3},ISO resolved to 2020-11-13
    }
}
