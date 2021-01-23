package CommonClass.Comparable;


import java.util.Arrays;
import java.util.Comparator;

public class Test {
    @org.junit.Test
    public void test(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("华为",4000,15);
        arr[1] = new Goods("苹果",10000,100);
        arr[2] = new Goods("联想",4000,150);
        arr[3] = new Goods("华硕",6000,200);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @org.junit.Test
    public void test2(){
       String[] arr = new String[]{"DD","CC","BB","AA"};
        Arrays.sort(arr,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return s1.compareTo(s2);//从小到大要加负号
                }

                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    @org.junit.Test
    public void test3(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("华为",4000,15);
        arr[1] = new Goods("苹果",10000,100);
        arr[2] = new Goods("联想",4000,150);
        arr[3] = new Goods("华硕",6000,200);
        Arrays.sort(arr, new Comparator() {

            //按照产品名称从低到高，再按照价格从低到高
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;
                    if(g1.name.equals(g2.name)){//如果名字一样
                        return -Double.compare(g1.price,g2.price);
                    }else{
                        return g1.name.compareTo(g2.name);
                    }
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}
