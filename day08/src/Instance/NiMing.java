package Instance;
/*
匿名对象
 */

public class NiMing {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.price = 1999;
        System.out.println(p.price);
        p.send();
        p.game();


        //匿名对象
        new Phone().game();

        //匿名对象的使用
        PhoneMall mall = new PhoneMall();//设置一个中间的类，保存信息
        mall.show(new Phone());

    }

}

class PhoneMall{
    public void show(Phone Phone){//第一个表示Phone类型变量 ，第二个是变量名
        Phone.send();
        Phone.game();
    }

}
class Phone{
    int price;//价格
    public void send(){
        System.out.println("发送邮件");
    }
    public void game(){
        System.out.println("玩游戏");
    }


}
