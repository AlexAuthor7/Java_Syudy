package ArrayAlgorithm;

/*
一、衡量排序算法的优劣：
1.时间复杂度：分析关键字的比较次数和记录的移动次数
2.空间复杂度： 分析排序算法中需要多少辅助内存
3.稳定性： 若两个记录A和B的关键字值相等，但排序后A、 B的先后次序保
持不变，则称这种排序算法是稳定的。

二、十大内部排序算法
 选择排序
    直接选择排序、 *堆排序
 交换排序
    **冒泡排序、 **快速排序
 插入排序
    直接插入排序、 折半插入排序、 Shell排序
 *归并排序
 桶式排序
 基数排序
 非确定性算法：并行算法、概率算法

*详细操作，见《附录：尚硅谷_宋红康_排序算法.pdf》


*/
public class paixu {
    public static void main(String[] args) {

        int[] arr = new int[]{3,73,7,5,53,41,23,11,67,71,47,37,19,43,31,2,17,13};//混乱的数组
        //冒泡排序：比较相邻的元素
        for(int i = 0; i < arr.length - 1;i++){
            for(int j = 0; j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]) { //交换相邻元素
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++){ //遍历
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        //快速排序**



    }
}
