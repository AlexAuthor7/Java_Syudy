package InetTest;
import org.junit.Test;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Alex
 * @Date: 2020/12/6 - 12 - 06 -12:56
 * @Description: InetTest
 * @Verxion: 1.0
 */
public class TCPExer1 {
    //客户端
    @Test
    public void client() throws IOException {
        //3、指明IP地址和端口
        Socket socket = new Socket("127.0.0.1",9090);
        //4、获取输出流
        OutputStream os = socket.getOutputStream();
        //1、获取文件
        FileInputStream fis = new FileInputStream(new File("idea.jpg"));

        byte[] byteBuffer = new byte[1024];
        int len;
        //5、把文件的字节码写入byteBUffer数组中
        while((len = fis.read(byteBuffer)) != -1){
            //6、把数组中的字节码写入输出流中
            os.write(byteBuffer,0,len);
        }

        //7、shutdownInput()；显式地告诉read()，数据已经收到
        socket.shutdownOutput();

        //7、接收服务端的反馈，并显示到控制台上
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] byteBuffer2 = new byte[10];
        int len2;
        while((len2 = is.read(byteBuffer2)) != -1){
            baos.write(byteBuffer2,0,len2);
        }
        System.out.println(baos.toString());

        os.close();
        socket.close();
        fis.close();
        baos.close();
    }

    //服务端
    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("idea6.jpg"));

        byte[] byteBuffer = new byte[1024];
        int len;
        while ((len = is.read(byteBuffer)) != -1) {
            fos.write(byteBuffer,0,len);
        }

        //5、给予客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("照片已收到".getBytes());

        //6、关闭资源
        is.close();
        socket.close();
        serverSocket.close();
        fos.close();
        os.close();
    }
}
