package ityang;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //socket ���� ָ���˿�
        DatagramSocket ds = new DatagramSocket(12345);
        //����һ�����ݰ������ڽ�������
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //��������
            ds.receive(dp);
            //�������ݰ�

            byte[] datas = dp.getData();
            int len = dp.getLength();
            String str = new String(datas, 0, len);
            System.out.println(str);

        }
    }
}
