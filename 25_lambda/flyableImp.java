package ityang;

public class flyableImp implements flyable{
    @Override
    public void fly(String s) {
        System.out.println("类实现接口:"+s);
    }
}
