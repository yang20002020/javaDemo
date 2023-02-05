package ityang;

import java.io.IOException;
import java.net.*;


public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        DatagramSocket ds=new DatagramSocket();

        //创建数据，并把数据打包   DatagramPacket 该类表示数据报包
        // public DatagramPacket(byte[] buf, int length,InetAddress address, int port)
        //调用DatagramSocket 对象的方法 ，发送数据
        //send(DatagramPacket p)
        byte[] bys="hello,udp,我来了".getBytes();
        int length=bys.length;
        InetAddress address=InetAddress.getByName("192.168.0.10");
        int port=10086;
        //构造一个数据包，发送长度为lenth的数据包到指定主机上的指定端口
        DatagramPacket dp =new DatagramPacket(bys,length,address,port);

        ds.send(dp);
        //关闭发送端
        ds.close();

    }
}
