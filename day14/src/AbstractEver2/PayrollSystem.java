package AbstractEver2;

//工资制度
import java.util.Calendar;
import java.util.Scanner;
public class PayrollSystem {
    public static void main(String[] args) {
        int year,month,day;

        //直接当前获取日期
        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.MONTH);//注意 ：一月份的值 是 0

        //创建对象数组
        Employee payInfo[] = new Employee[4];
        //创建对象
        payInfo[0] = new HourlyEmployee("熊大",new MyDate(2000,1,1),100);//匿名对象,匿名类
        payInfo[1] = new HourlyEmployee("熊二",new MyDate(2000,2,2),98);
        payInfo[2] = new SalariedEployee("熊三",new MyDate(2000,3,3));
        payInfo[3] = new SalariedEployee("熊四",new MyDate(2000,4,4));

        //输入现在的日期
        System.out.println("请输入 xxxx年xx月xx日");
        Scanner date = new Scanner(System.in);
        year = date.nextInt();
        month = date.nextInt();
        day = date.nextInt();

        //遍历数组,输出信息
        for (int i = 0; i < payInfo.length; i++) {
            System.out.print(payInfo[i].toString());
            System.out.print("这个月工资是" + payInfo[i].earnings()+"元");
            if(month == payInfo[i].getBirthday().getMonth()){//注意，取对象 --》取Birthday类 --》取 month 属性
                System.out.print(",这个月生日,再奖励100元");
            }
            System.out.println();
        }

    }


}
