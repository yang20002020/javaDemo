package ityang;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s1 = new Socket("192.168.0.10", 10000);

        //数据来源于文本文件
        BufferedReader br =new BufferedReader(new FileReader("src\\ityang\\ClientDemo.java"));


        //封装输出流对象   目的：字节流转换成字符流
        //getOutputStream()字节输出流； BufferedWriter 字符流；
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){
              //获取输出流对象
                bw.write(line);
                bw.newLine();
                bw.flush();

        }
        s1.close();
        br.close();

    }
}
