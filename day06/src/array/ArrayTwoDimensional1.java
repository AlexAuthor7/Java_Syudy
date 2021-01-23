package array;
/*
1、二维数组的概念：
元素是一维数组（由数组构成的数组）
2、二维数组的使用：
   > 二数组的声明
   > 如何调用数组指定位置的有元素
   > 如何获取数组的长度
   > 如何遍历数组
   > 数组初始化的值(整形：0 \ 浮点：0.0 \ char型：0或\u0000 ，ps:不是0" \boolean型：false)
                 (引用数据类型：null )
   > 数组的内存解析
    ①数组名 对应地址 信息存放在栈中 如：@2f4d3709
    ②数组的元素：存放在堆中，通过地址找到

 */

public class ArrayTwoDimensional1 {
    public static void main(String[] args) {
        //①二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
          //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5,},{6,7,8}};
        int[] arr4 [] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
        int[] arr5 []  ={{1,2,3},{4,5},{6,7,8}};

          //动态初始化
        String[][] arr2 = new String[4][3];
        String[][] arr3 = new String[3][];


        //②调用二维数组的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr1[1][1]);//null

        //③获取数组的长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//4


        //④如何遍历二维数组
        for(int i = 0;i < arr4.length;i++){
            for(int j = 0;j < arr4[i].length;j++){
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }


        //⑤二维数组的默认初始化值
        System.out.println(arr4[0]);//地址值  [I@2f4d3709//[表示一维I表示int型@后面是地址
        System.out.println(arr4[0][0]);//1

        System.out.println(arr2[0]);//[Ljava.lang.String;@4e50df2e//Ljava.lang.String表示String类型
        System.out.println(arr2[0][0]);//null

        System.out.println(arr3[0]);//null
        System.out.println(arr3[1][0]);//报错，空指针异常 NullPointerException



    }
}