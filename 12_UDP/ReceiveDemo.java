package ityang;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //socket ���� ָ���˿�
        DatagramSocket ds = new DatagramSocket(10086);
        //����һ�����ݰ������ڽ�������
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        //��������
        ds.receive(dp);
        //�������ݰ�
        //����һ
        byte[] datas = dp.getData();
        String dataString = new String(datas);
        System.out.println(dataString);

        //������
        int len=dp.getLength();
        String str=new String(datas,0,len);
        System.out.println(str);

        //�ر����ݶ�
        ds.close();
    }
}
