package ityang;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
客户端先写数据再读数据；服务端是先读数据再写数据
客户端和服务端之间传输的是字符串
 */
public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的socket对象
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端链接 获取socket对象
        Socket s=ss.accept();
        //获取输入流， 字节输入流
        InputStream is=s.getInputStream();

        InputStreamReader isr=new InputStreamReader(is);
        //字符流
        BufferedReader br=new BufferedReader(isr);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //释放资源
        ss.close();



    }
}
