package EqualsEver2;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean equals(Object obj){
        if(this == obj){//this指当前对象
            return true;
        }
        if(obj instanceof MyDate){
            MyDate myDate = (MyDate)obj;
            /*if(this.day == myDate.day && this.month == myDate.month && this.year == myDate.year){
                return true;
            }*/

            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }
        return false;
    }
}
