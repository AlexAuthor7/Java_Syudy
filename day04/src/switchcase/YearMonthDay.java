package switchcase;
/*
说明：
1、switch-case结构都可以转化为if-else结构，反之，不成立
2、两者都可以用，且switch-case条件不多时，推荐用switch-case结构
 */

/*
从键盘分别输入年、月、日，判断这一天是当年的第几天
注：判断一年是否是闰年的标准：
1）可以被4整除，但不可被100整除
或
2）可以被400整除
 */
import java.util.Scanner;
public class YearMonthDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入年份：");
        int year = scan.nextInt();

        System.out.println("请输入月份：");
        int month = scan.nextInt();

        System.out.println("请输入日：");
        int day = scan.nextInt();

        int a = year % 4;
        int b = year % 100;
        int c = year % 400;

        if ((a == 0 && b != 0) || c == 0) {
            switch (month) {
                case 1:
                    System.out.println(day + "天");
                    break;
                case 2:
                    System.out.println(31 + day + "天");
                    break;
                case 3:
                    System.out.println(60 + day + "天");
                    break;
                case 4:
                    System.out.println(91 + day + "天");
                    break;
                case 5:
                    System.out.println(121 + day + "天");
                    break;
                case 6:
                    System.out.println(152 + day + "天");
                    break;
                case 7:
                    System.out.println(182 + day + "天");
                    break;
                case 8:
                    System.out.println(213 + day + "天");
                    break;
                case 9:
                    System.out.println(244 + day + "天");
                    break;
                case 10:
                    System.out.println(274 + day + "天");
                    break;
                case 11:
                    System.out.println(305 + day + "天");
                    break;
                case 12:
                    System.out.println(335 + day + "天");
                    break;

            }

        } else {
            switch (month) {
                case 1:
                    System.out.println(day + "天");
                    break;
                case 2:
                    System.out.println(31 + day + "天");
                    break;
                case 3:
                    System.out.println(59 + day + "天");
                    break;
                case 4:
                    System.out.println(90 + day + "天");
                    break;
                case 5:
                    System.out.println(120 + day + "天");
                    break;
                case 6:
                    System.out.println(151 + day + "天");
                    break;
                case 7:
                    System.out.println(181 + day + "天");
                    break;
                case 8:
                    System.out.println(212 + day + "天");
                    break;
                case 9:
                    System.out.println(243 + day + "天");
                    break;
                case 10:
                    System.out.println(273 + day + "天");
                    break;
                case 11:
                    System.out.println(304 + day + "天");
                    break;
                case 12:
                    System.out.println(334 + day + "天");
                    break;

            }
        }

        /*
        标准答案
         switch(month){
        case 12:
            sum+=31;
        case 11:
            sum+=30;
        case 10:
            sum+=31;
        case 9:
            sum+=30;
        case 8:
            sum+=31;
        case 7:
            sum+=31;
        case 6:
            sum+=30;
        case 5:
            sum+=31;
        case 4:
            sum+=30;
        case 3:
            sum+=31;
        case 2:
            sum+=28;
        case 1:
            sum+=day;
            break;
    }
        }
        */
    }
}