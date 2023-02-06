package ityang;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
客户端先写数据再读数据；服务端是先读数据再写数据
 客户端数据来源于文本文件,接收服务器反馈
 服务器：接收的数据,写入到文本文件，给出反馈；代码用线程进行封装，为每一个客户开启一个线程
 */
public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的socket对象
        ServerSocket ss=new ServerSocket(10000);

        while(true) {
            //监听客户端链接 获取socket对象
            Socket s = ss.accept();

            //为每一个客户端开启一个线程
            new Thread(new ServerThread(s)).start();
        }

       // ss.close();//服务器是不关闭的，一般不进行调用close函数


    }
}
