package ityang;
/*
定义一个接口Eatable,里面定义个抽象方法:void eat()
定义一个测试类，在测试类中提供两个方法
1.UseEatable(Eatable e)
2.主方法 在方法中调用useEatable方法
 */
public class test {
    public static void main(String[] args) {
         Eatable e= new EatableImp();
         useEatable(e); //终端输出  一天一苹果，医生远离我
        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
              System.out.println("一天之计在于晨");
            }
        }); //终端输出 一天之计在于晨

        //lambda表达式
        useEatable(() -> {
            System.out.println("lambda");
        });
        //1.使用lambda表达式需要一个接口Eatable，接口中有且仅有一个抽象方法
        //2.有函数 比如useEatable 中的 形参有上述接口，需要调用这个接口

    }


    private static  void useEatable(Eatable e){
        e.eat();
    }
}
