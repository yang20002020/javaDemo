package ityang;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //socket 对象 指定端口
        DatagramSocket ds = new DatagramSocket(12345);
        //创建一个数据包，用于接收数据
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //接收数据
            ds.receive(dp);
            //解析数据包

            byte[] datas = dp.getData();
            int len = dp.getLength();
            String str = new String(datas, 0, len);
            System.out.println(str);

        }
    }
}
