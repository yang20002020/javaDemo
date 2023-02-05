package ityang;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //socket 对象 指定端口
        DatagramSocket ds = new DatagramSocket(10086);
        //创建一个数据包，用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        //接收数据
        ds.receive(dp);
        //解析数据包
        //方法一
        byte[] datas = dp.getData();
        String dataString = new String(datas);
        System.out.println(dataString);

        //方法二
        int len=dp.getLength();
        String str=new String(datas,0,len);
        System.out.println(str);

        //关闭数据端
        ds.close();
    }
}
