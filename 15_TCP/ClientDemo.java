package ityang;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s1 = new Socket("192.168.0.10", 10000);
        //获取输出流，写数据
        OutputStream os = s1.getOutputStream();
        //写数据
        os.write("hello，tcp,我来了".getBytes());

        //接收服务器反馈
        InputStream is = s1.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端：" + data);

        //释放资源
        s1.close();//s1 关闭之后 os.close(); is.close();就不需要再写
        // is.close();
        //  os.close();

    }
}
