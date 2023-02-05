package ityang;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
客户端先写数据再读数据；服务端是先读数据再写数据
 */
public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的socket对象
        ServerSocket ss=new ServerSocket(10000);
        //获取socket对象
        Socket s=ss.accept();
        //获取输入流，
        InputStream is=s.getInputStream();

        byte[] bys=new byte[1024];
        //读数据
        int len=is.read(bys);
        String data=new String(bys,0,len);
        //并把数据显示在控制台
        System.out.println("服务器收到的数据:"+data);

        //给出反馈
        OutputStream os=s.getOutputStream();
        os.write("服务端数据已经收到".getBytes());
        //释放资源
         ss.close();
        //s.close(); //可以被屏蔽
    }
}
