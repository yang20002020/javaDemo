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
        System.out.println("11111111111111111");
        //自定义结束标记
        bw.write("886");
        bw.newLine();
        bw.flush();

        //自定义结束标记 有缺陷 改进为如下方式
        //禁用此套接字的输出流shutdownOutput()
        s1.shutdownOutput();
        //接收反馈
        BufferedReader brClient=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        String data=brClient.readLine();//客户端一直在等待读取数据
        System.out.println("服务器的反馈:"+data);

        s1.close();
        br.close();

    }
}
