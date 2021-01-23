package InetTest;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Alex
 * @Date: 2020/12/6 - 12 - 06 -11:31
 * @Description: InetTest
 * @Verxion: 1.0
 */
public class TCPTest {
    //实现TCP网络编程
    //例子1：客户端发送信息给服务端， 服务端将数据显示在控制台上
    //客户端
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        try {
            //1、创建InetAddress类的对象，获取IP地址
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            //2、实例化Scoket类的对象——>指明IP地址和端口，形成套接字
            socket = new Socket(inet,8899);
            //3、实例化OutputStream接口,获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //4、在流中写入数据
            os.write("你好，我是客户端".getBytes());//注意要转换为字节
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5、注意：关闭流资源和 释放Socket类的线路（断开与客户端的连接）
            try {
                if(os != null)
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket != null)
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //服务端
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //1、实例化ServerSocket类的对象，指明自己的端口号
            //不用指明自己的IP(自己的IP自己知道)
            serverSocket = new ServerSocket(8899);
            //2、调用accept()方法，监听连接请求，如果客户端请求连接，则接受连接，返回通信套接字
            socket = serverSocket.accept();
            //3、获取输入流
            is = socket.getInputStream();
            //不建议这么写，可能出现乱码
//        byte[] byteBuffer = new byte[20];
//        int len;
//        while((len = is.read(byteBuffer)) != -1){
//            String str = new String(byteBuffer,0,len);
//            System.out.print(str);
//        }

            //4、读取输入的数据
            baos = new ByteArrayOutputStream();
            byte[] byteBuffer = new byte[5];
            int len;
            while((len = is.read(byteBuffer)) != -1){
                baos.write(byteBuffer,0,len);
            }
            System.out.println(baos.toString());
            System.out.println("收到了来自于："+socket.getInetAddress().getHostAddress()+"的信息");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5、关闭资源
            try {
                if(baos != null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
