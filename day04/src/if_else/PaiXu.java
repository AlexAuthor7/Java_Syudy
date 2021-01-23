package if_else;


import java.util.Scanner;
public class PaiXu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个数据");
        double num1 = scan.nextDouble();

        System.out.println("请输入第二个数据");
        double num2 = scan.nextDouble();

        System.out.println("请输入第三个数据");
        double num3 = scan.nextDouble();

        if(num1 >= num2){
            if(num3 >= num1){
                System.out.println(num3 + "," + num1 + "," + num2);
            }else if(num2 >= num3){
                System.out.println(num1 + "," + num2 + "," + num3);
            }else{
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }else if(num2 >= num1)
            if(num3 >= num2){
                System.out.println(num3 + "," + num2 + "," + num1);
            }else if(num1 >= num3){
                System.out.println(num2 + "," + num1 + "," + num3);
            }else{
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }
    }

