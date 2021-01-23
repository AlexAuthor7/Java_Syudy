package array;

public class ArrayTest1 {
    public static void main(String[] args) {
        //练习1：获取arr中所有元素的和
        int arr[][] = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("数组中元素的和是：" + sum);

        /*
        声明：int[] x,y[];  在给x,y 赋值后，以下能通过编译的是
        提示：一维数组 int[] x;  或 int x[];
             二维数组 int[][]y; 或  int[] y[];  或 int y[][];
        a>  x[0] = y;      no
        b>  y[0] = x;      yes
        c>  y[0][0] = x;   no
        d>  x[0][0] = y;   no
        e>  y[0][0] = x[0];yes
        f>  x = y;         no


        总结 x是一维数组，y是二维数组,x[0]只是一个int型的元素
         */

        //

    }
}
