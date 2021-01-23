package bijiaodaxiao;

public class BiJiaoBaXiao {
    public static void main(String[] args){
        //三元法
        int a = 100,b = 20,c = 3;
        int max1 = (a > b)? a : b;
        int max2 = (max1 > c)? max1 : c;
        System.out.println("最大的数是" + max2);

        //if_elsr法
        if(a > b && a > c){
            System.out.println("最大的数是" + a);
        }else if(b > a && b > c){
            System.out.println("最大的数是" + b);
        }else{
            System.out.println("最大的数是" + c);
        }


    }
}
