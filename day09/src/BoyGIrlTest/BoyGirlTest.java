package BoyGIrlTest;

public class BoyGirlTest {
    public static void main(String[] args) {
        //男的
        Boy boy = new Boy("罗密欧",20);
        boy.shout();

        //女的
        Girl girl1 = new Girl("朱丽叶",18);
        girl1.marry(boy);

        Girl girl2 = new Girl("祖英台",16);
      /*  girl2.marry(boy);

        boy.marry(girl1);*/



        //对朱丽叶
        int compare = girl1.compare(girl2);
        if(compare > 0){
            System.out.println("娶" + girl2.getName());
        }else if(compare < 0){
            System.out.println("娶" + girl2.getName());
        }else{
            System.out.println("两个都要");
        }

    }
}
