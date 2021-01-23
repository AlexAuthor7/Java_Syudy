package qiantaosunhuan;


//方式二
public class zhiShu2 {
    public static void main(String[] args){


        //获取当前时间的毫秒数，检验优化效果
        //开始时间
        long start = System.currentTimeMillis();
        int count = 0; //计数，有多少个质数
        lable:for(int i = 2;i <= 100000; i++){        //遍历100000以内的所有数

            //遍历小于i的数,注意是<号，不是<=
            for(int j = 2;j <= Math.sqrt(i);j++){
                // 优化前：1598.优化后：43
                if(i % j == 0){//i被j除尽
                    continue lable;
                }
            }
            count++;
        }
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("质数的个数位：" + count); //打印指数个数
        System.out.println("说花费时间为：" + (end-start));//打印时间

    }
}
