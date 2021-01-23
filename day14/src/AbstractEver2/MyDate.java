package AbstractEver2;

public class MyDate {
    private int year;
    private int month;
    private int day;

    //构造器


    public MyDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //取值
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    //返回日期字符串
    public String toDateString(){
        return year + "年" + month +"月"+day+"日";
    }
}
