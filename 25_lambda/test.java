package ityang;
/*
定义一个接口Flyable,里面定义个抽象方法:void fly(string s)
定义一个测试类，在测试类中提供两个方法
1.UseFlyable(Flyable e)
2.主方法 在方法中调用useFlyable方法
 */
public class test {
    public static void main(String[] args) {
      flyable f=new flyableImp();
      useFlyable(f);//终端显示： 类实现接口:风和日丽，晴空万里
      //匿名内部类
        useFlyable(new flyable() {
            @Override
            public void fly(String s) {
                System.out.println("匿名内部类:"+s);
            }
        });//终端显示:匿名内部类:风和日丽，晴空万里
        //lambda
        useFlyable((String s )->{
            System.out.println("345"+s);
        });//终端显示：345风和日丽，晴空万里
    }



    private static  void useFlyable(flyable e){
        e.fly("风和日丽，晴空万里");
    }
}
