package ityang;

public class Producer implements Runnable{
    private Box box;

    public Producer(Box b){
        this.box=b;
    }
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            box.setMilk(i);//生产牛奶
        }

    }
}
