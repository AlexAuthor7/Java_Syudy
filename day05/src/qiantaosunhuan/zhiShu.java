package qiantaosunhuan;
//100000以内的所有质数
public class zhiShu {
    public static void main(String[] args) {

        boolean isFlag = true;  //标识，一旦i被j除尽，修改其值

        //获取当前时间的毫秒数，检验优化效果
        //开始时间
        long start = System.currentTimeMillis();

        for(int i = 2;i <= 100000; i++){        //遍历100000以内的所有数

            //遍历小于i的数,注意是<号，不是<=
            for(int j = 2;j <= Math.sqrt(i);j++){    //优化二，i改为，Math.sprt(i)，对质数很有效
                                                        // 优化前：1598.优化后：43
                if(i % j == 0){//i被j除尽
                    isFlag = false;
                    break;//优化一：对非质数自然数有效，提高效率
                               //优化前；17033，优化后：1598
                }
            }
            if(isFlag == true){
                System.out.println(i);
            }
            isFlag = true;//重置isFlag

        }
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("说花费时间为：" + (end-start));//打印时间

    }
}
