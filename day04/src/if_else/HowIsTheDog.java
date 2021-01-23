package if_else;

import java.util.Scanner;
public class HowIsTheDog {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入狗的年龄(整数):");
        int age = scan.nextInt();
        if(age <= 0){
            System.out.println("input error");
        }else if(age > 0 && age <= 2){
            System.out.println("相当于人" + age*10.5 + "岁");
        }else{
            System.out.println("相当于人" + (21 + 4*(age - 2)) + "岁");
        }

    }
}
