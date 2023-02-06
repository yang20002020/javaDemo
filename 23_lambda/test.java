package ityang;

public class test {
    public static void main(String[] args) {
         MyRunnable my =new MyRunnable();
         Thread t=new Thread(my);
         t.start();
         System.out.println("******");

         //public Thread(Runnable target)
         new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("多线程程序启动1");
             }
         }).start();
        System.out.println("******");
         new Thread(()->{
             System.out.println("多线程程序启动了2");
         }).start();
    }
}
