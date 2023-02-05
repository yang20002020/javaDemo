package ityang;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的socket对象
        ServerSocket ss=new ServerSocket(10000);
        //
        Socket s=ss.accept();
        //获取输入流，
        InputStream is=s.getInputStream();

        byte[] bys=new byte[1024];
        //读数据，
        int len=is.read(bys);
        String data=new String(bys,0,len);
        //并把数据显示在控制台
        System.out.println("数据是:"+data);
        //释放资源
        s.close();
        ss.close();
    }
}
