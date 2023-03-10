package ityang;

public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象，这是共享数据区域
       Box b=new Box();
       //创建生产者对象，把奶箱对象作为构造方法参数传递，因为这个类中有生产牛奶的操作
       Producer p=new Producer(b);
       //创建消费者，把奶箱对象作为构造方法参数传递，因为这个类中要有调用获取牛奶的操作
       Customer c=new Customer(b);

       //创建两个线程对象
       Thread t1=new Thread(p);
       Thread t2=new Thread(c);

       t1.start();
       t2.start();

    }
}
