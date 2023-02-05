package ityang;

public class Box {
    private int milk;
    //定义一个成员变量，表示一个奶箱的状态，true 有牛奶，false表示没有牛奶
    private boolean state = false;

    //消费牛奶
    public synchronized void getMilk() {
    //如果没有牛奶，等待生产
        if(!state){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        //消费牛奶之后修改牛奶箱状态
        state=false;
        //唤醒其他线程
        notifyAll();

    }

    //生产牛奶
    public synchronized void setMilk(int milk) {
        //如果有牛奶，等待消费
        if (state) {
            try {
                wait();//object类
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将" + this.milk + "瓶奶送入奶箱");
        //生产牛奶完毕之后，修改牛奶箱状态
        state=true;
        notifyAll();
    }
}
