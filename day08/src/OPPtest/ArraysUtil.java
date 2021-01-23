package OPPtest;
/*
 *自定义数组的工具类
 */

public class ArraysUtil {

    //求数组的最大值
    public int getMax(int[] arr){//arr不是真的数组名，只是代指
        int max = 0;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //求数组的最小值
    public int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //求数组的平均值
    public float getMean(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        float mean = (float)sum/arr.length;
        return mean;//
    }

    //求数组的复制
    public int[] copy(int[] arr){
        return null;//引用类型，返回null
    }

    //求数组的总和
    public int getSum(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("总和" + sum);
        return 0;
    }

    //求数组的众数
    public int getMode(int[] arr){
        return 0;
    }

    //反转数组
    public void reverse(int[] arr){

    }//不用返回，已经改变了数组本身

    //数组的查找
    public int getIndex(int[] arr,int dest){//后面的是要查找的元素
        //线性查找
        for(int i = 0;i < arr.length;i++){
            if(dest == arr[i]){
                return i;
            }
        }
        return -1;//返回一个负数，表示没找到（因为数组的脚标大于等于0）
    }

    //数组的排序
    public int sort(int[] arr){
        return 0;
    }

    //遍历数组
    public int print(int[] arr){
        return 0;
    }

}

