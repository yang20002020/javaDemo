package ityang;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
客户端先写数据再读数据；服务端是先读数据再写数据
 客户端数据来源于文本文件,接收服务器反馈
 服务器：接收的数据,写入到文本文件，给出反馈
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
        //字符流 接收数据
        BufferedReader br=new BufferedReader(isr);



        //把数据写入文本文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\s.txt"));

        String line;
        // //客户端发送完数据后，服务器端br.readLine()也一直在等待数据
        //读取数据的方式一直是阻塞式的
        while((line=br.readLine())!=null){
           bw.write(line);
           bw.newLine();
           bw.flush();
        }
        //上面的代码一直处于循环中，后面的代码不会执行
        System.out.println("******************");
        //给出反馈
        BufferedWriter bwService=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwService.write("文件上传成功");
        bwService.newLine();
        bwService.flush();
        //释放资源
        ss.close();
        bw.close();


    }
}
