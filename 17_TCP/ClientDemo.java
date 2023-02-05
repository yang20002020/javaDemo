package ityang;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s1 = new Socket("192.168.0.10", 10000);

        //数据来自键盘录入，直到输入的数据是886，发送数据结束
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象   目的：字节流转换成字符流
        //getOutputStream()字节输出流； BufferedWriter 字符流；
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }else{
              //获取输出流对象
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }
        s1.close();



    }
}
