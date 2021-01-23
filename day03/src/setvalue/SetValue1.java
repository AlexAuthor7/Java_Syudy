package setvalue;
/*
赋值运算符
 */

public class SetValue1 {
    public static void main(String[] args){
        int i1 = 10;
        i1 += (i1++) + (++i1);//i1 = i1 + (11++) + (++i1// )
                              //     10 +   10   +   12(11+1)
        System.out.println(i1);//32
    }
}
