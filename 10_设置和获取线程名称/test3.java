package ityang;

public class test3 {
    public static void main(String[] args) {
       MyThread m1=new MyThread();//
       MyThread m2=new MyThread();
       MyThread m3=new MyThread("奔驰");
       m1.setName("飞机");
       m2.setName("高铁");
       m1.start();
       m2.start();
       m3.start();
    }
}
