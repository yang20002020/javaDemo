package ityang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        DatagramSocket ds=new DatagramSocket();

        //封装键盘录入的数据
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String line;
        InetAddress address=InetAddress.getByName("192.168.0.10");
        int port=12345;
        while((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            //创建数据，并把数据打包
            byte[] bys=line.getBytes();
            int length=bys.length;
            DatagramPacket dp =new DatagramPacket(bys,length,address,port);
            ds.send(dp);
        }



        //关闭发送端
        ds.close();

    }
}
