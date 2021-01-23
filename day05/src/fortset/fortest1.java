package fortset;

/*
说明：
1、组成要素：
①初始化部分
②循环条件部分
③迭代部分
④循环体部分

2、结构
for(①；②；④){
     ③
}
 */

public class fortest1 {

    //例题：遍历100以内的偶数

    public static void main(String[] args){
        //法一：双++
        for(int a = 2;a <= 100;a++,a++ ){        //int a 是定义在for循环里的，外面还可以再次定义a
            System.out.println(a);
        }

        //法二：if结构
        int sum = 0;  //记录所有偶数的和
        int count = 0;  //记录偶数的个数
        for(int i = 1;i <= 100;i++){

            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
                count += 1;//count++ 也可以
            }
        }
        System.out.println("总和为" + sum);
        System.out.println("个数为" + count);

    }
}
