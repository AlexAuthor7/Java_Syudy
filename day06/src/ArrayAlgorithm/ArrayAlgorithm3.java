package ArrayAlgorithm;
//3. 数组的复制、反转、查找(线性查找、二分法查找)

        /*
        使用简单数组
        (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
           他们是int[]类型的数组。
        (2)使用大括号{}，把array1初始化为8个素数： 2,3,5,7,11,13,17,19。
        (3)显示array1的内容。
        (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
        (如array[0]=0,array[2]=2)。打印出array1。
        思考： array1和array2是什么关系？
        > array1 和 array2 的地址值相同，都指向了堆空间中的一个数组实体

        拓展： 修改题目，实现array2对array1数组的复制

         */

public class ArrayAlgorithm3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13};
        //数组的复制
        int[] array2 = new int[array1.length];
        for(int i = 0;i < array2.length;i++){
            array2[i] = array1[i];
        }

        //数组的反转
        for(int i = 0;i < array1.length/2;i++){
            int temp = array1[array1.length - 1 -i];
            array1[array1.length - 1 -i] = array1[i];
            array1[i] = temp;
        }
        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }
        //复制方法二
        for(int i = 0,j = array1.length - 1;i < j;i++,j--){
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
        System.out.println();
        //数组的查找（线性查找）
        int serch = 3;

        boolean isFlag = true;//设置标识

        for(int i = 0;i < array1.length;i++){
            if(serch == array1[i]){  //查找内容
                System.out.println(array1[i]);
                isFlag = false;
                break;//跳出循环
            }
        }
        if(isFlag){
            System.out.println("没找到");
        }

        //数组的查找（二分法查找）
        //前提：数组是有序的
        int head = 0;//初始的首索引
        int end = array1.length - 1;//初始的末索引

        boolean isFlag2 = true;//标识

        while(head <= end){
            int middle = (head + end)/2;//从中间开始找

            if(serch == array1[middle]){
                System.out.println(middle);
                isFlag2 = false;
                break;//找到了，跳出循环
            }else if(serch > array1[middle]){
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }

        if(isFlag2){//判断标识
            System.out.println("没找到");
        }
    }
}
