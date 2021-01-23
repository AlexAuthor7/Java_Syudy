package bijiaodaxiao;

public class BiJiaoDaXiao2 {
    public static void main(String[] args){
        double d1 = 2.0,d2 = 5.0;
        //三元法
        double edit = d1 + d2;
        double multiple = d1 * d2;
        double arithmetic = (d1 > 10.0 && d2 < 20.0)? edit : multiple;
        System.out.println(arithmetic);

        //if_else法
        if(d1 > 10.0 && d2 < 20.0){
            System.out.println(edit);
        }else{
            System.out.println(multiple);
        }
    }
}
