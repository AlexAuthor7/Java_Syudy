package array;
/*
使用二维数组打印一个 10 行杨辉三角。
【提示】
1. 第一行有 1 个元素, 第 n 行有 n 个元素
2. 每一行的第一个元素和最后一个元素都是 1
3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];


【拓展之笔试题】
创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
元素的值各不相同。
 */

public class YangHuiSanJiao {
    public static void main(String[] args){
        int yanghui[][] = new int[10][];

        //赋值
        for(int i = 0;i < yanghui.length;i++) {
            yanghui[i] = new int[i + 1];
            //给首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;

            //给非首末元素赋值
            for (int j = 1; j < yanghui[i].length - 1; j++){
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];

            }
        }

        //遍历二维数组
        for(int i = 0; i < yanghui.length;i++){
            for(int j = 0;j < yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + "  ");
            }
            System.out.println();
        }

        //***************************************************
        int []arr = new int [6];

        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * 30 + 1);
            Label_out:
            for(int j = 0;j < i;j++){
                if(arr[i] == arr[j]){
                    arr[i] = (int)(Math.random() * 30 + 1);
                    break Label_out;
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "  ");
        }


        System.out.println();
        //方式二：
        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++) {// [0,1) [0,30) [1,31)
            arr1[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    i--;        //返回上一次循环
                    break;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }

    }
}
