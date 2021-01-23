package OPPtest;

public class ArraysUtilTest {
    public static void main(String[] args) {
        ArraysUtil util = new ArraysUtil();
        int[] arr1 = new int[]{43,82,59,22,43,52,24,23,34,3,4,32};
        int max = util.getMax(arr1);
        System.out.println("最大值：" + max);

        int min = util.getMin(arr1);
        System.out.println("最小值" + min);

        float mean = util.getMean(arr1);
        System.out.println("平均值" + mean);

        util.getSum(arr1);//打印为421
        int sum = util.getSum(arr1);//打印为421
        System.out.println("总和" + sum);//打印为0，如果用变量赋值，打印返回值

        //查找
        int sort1 = util.getIndex(arr1,3);
        System.out.println("查找1:" + sort1);
        int sort2 = util.getIndex(arr1,5);//19
        System.out.println("查找2:" + sort2);//-1

    }
}
