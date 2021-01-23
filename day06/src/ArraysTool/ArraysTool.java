package ArraysTool;

/*
一、java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
   定义在java.util包下


二、常见arrays工具类
1、boolean equals(int[] a,int[] b)   判断两个数组是否相等。
2、String toString(int[] a)          输出数组信息。
3、void fill(int[] a,int val)        将指定值填充到数组之中。
4、void sort(int[] a)                对数组进行排序。
5、int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值。
 */

import java.util.Arrays;

public class ArraysTool {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[]{9,8,7,6,5,4,3,2,1};
        int[] arr3 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr4 = new int[]{3,73,7,5,53,41,23,11,67,71,47,37,19,43,31,2,17,13};//混乱的数组

        //1、boolean equals(int[] a,int[] b) 判断两个数组是否相等。
        boolean isEquals1 = Arrays.equals(arr1,arr2);
        boolean isEquals2 = Arrays.equals(arr1,arr3);
        System.out.println(isEquals1);
        System.out.println(isEquals2);


        //2、String toString(int[] a) 输出数组信息。
        System.out.println(Arrays.toString(arr1));//遍历



        //3、void fill(int[] a,int val) 将指定值填充到数组之中。
        Arrays.fill(arr1,10);//全部替换成10
        System.out.println(Arrays.toString(arr1));//遍历


        //4、void sort(int[] a) 对数组进行排序。
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));//遍历



        //5、int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值。
        int search = Arrays.binarySearch(arr2,3);//注意，是排序后的数组
        System.out.println(search);//负数是没找到


    }




}
