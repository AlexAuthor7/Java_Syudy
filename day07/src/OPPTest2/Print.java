package OPPTest2;

public class Print{
    int area;
    int area2;
    public void juxing(){
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int area(){

        area = 10*8;
        System.out.println(area);
        return area;
    }
    public int area2(int m,int n){
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        area2 = m*n;
        System.out.println(area2);
        return area2;
    }
}
