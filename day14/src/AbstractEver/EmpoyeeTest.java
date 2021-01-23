package AbstractEver;
/*
编写一个Employee类，声明为抽象类，
包含如下三个属性： name， id， salary。
提供必要的构造器和抽象方法： work()。
对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
请使用继承的思想，设计CommonEmployee类和Manager类，要求类
中提供必要的方法进行属性访问。
 */

public class EmpoyeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager("李华",1001,10000,100000);
        CommonEmployee c1 = new CommonEmployee("小明",2001,4000);

        EmpoyeeTest test = new EmpoyeeTest();
        //经理信息
        test.getInfo(m1);

        //普通员工信息
        test.getInfo(c1);

    }
    public void getInfo(Employee e){//形参一般是父类

        System.out.print("员工:"+e.getName()+",工号:"+e.getId()+",工资:"+e.getSalary());
        if(e instanceof Manager){
            Manager manager = (Manager)e;//向下转型
            System.out.println(",奖金"+manager.getBonus());
       }else{
            System.out.println();
        }
    }



}
