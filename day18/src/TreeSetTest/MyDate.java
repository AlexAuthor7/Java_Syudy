package TreeSetTest;

/**
 * @Auther: Alex
 * @Date: 2020/11/28 - 11 - 28 -9:31
 * @Description: TreeSetTest
 * @Verxion: 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    //构造器

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getter\setter

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //toString

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
