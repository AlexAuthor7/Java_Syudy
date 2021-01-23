package CommonClass.Date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Calender {
    @Test
    public void test(){
        //1、实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();

        //常用方法
//      get()
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);//这个月的第几天
        int day2 = calendar.get(Calendar.DAY_OF_YEAR);//这年的第几天

//      set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        //把 ”这个月的第几天“ 改成了 22 -- Calendar类的可变性

//      add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        //把 ”这个月的第几天“ 加 3天

//      getTime() :日历类 --> util.Date类
        Date date = calendar.getTime();

//      setTime() : util.Date类 --> 日历类
        Date date2 = new Date();
        calendar.setTime(date2);
    }

}
