package ityang;
import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            //接收数据写到文本文件
              BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            // BufferedWriter bw=new BufferedWriter(new FileWriter("src\\copy.txt"));
             //解决名字冲突问题
             int count=0;
             File file=new File("src\\copy["+count+"].txt");
             while(file.exists()){
                 count++;
                 file=new File("src\\copy["+count+"].txt");
             }
             BufferedWriter bw=new BufferedWriter(new FileWriter(file));

            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter BwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            BwServer.write("文件上传成功");
            BwServer.newLine();
            BwServer.flush();
            //释放资源
            s.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
