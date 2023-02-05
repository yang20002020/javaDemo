package ityang;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        // public Socket(InetAddress address, int port)
        //方法一
        // InetAddress address=InetAddress.getByName("192.168.0.10");
        // Socket s=new Socket(address,10000);
        //方法二
        Socket s1 = new Socket("192.168.0.10", 10000);
        //获取输出流，写数据
        OutputStream os = s1.getOutputStream();
        os.write("hello，tcp,我来了".getBytes());
        s1.close();
    }
}
