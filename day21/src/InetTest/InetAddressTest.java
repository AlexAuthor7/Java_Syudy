package InetTest;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * @Auther: Alex
 * @Date: 2020/12/6 - 12 - 06 -10:45
 * @Description: InetTest
 * @Verxion: 1.0
 */

/*
如何实例化InetAddress类（两个方法）：
* 1、getByName(String host)
* 2、getLocalHost()
 */
public class InetAddressTest {
    public static void main(String[] args){
        try {
            InetAddress inet1 = InetAddress.getByName("10.20.233.209");
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);
            //本机回路地址：127.0.0.1 对应着：localhost
            //方法一
            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);
            //方法二
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);



        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
