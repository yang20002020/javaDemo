package it;
/*
lambda表达式注意事项
必须有上下文环境，才能推导出lambda对应的接口
1.根据局部变量的赋值得知lambda对应的接口
    Runnable r=()->System.out.println("lambda表达式1");
2.根据调用方法的参数得知lambda对应的接口
    new Thread(()->System.out.println("lambda表达式2")).start();

 */

public class test {
    public static void main(String[] args) {
        //使用lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
        useInter(()->{
            System.out.println("好好学习天天向上");
        });

        //使用lambda的时候，必须有上下文环境，才能推到出lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();
        //使用lambda的时候，必须有上下文环境，才能推到出lambda对应的接口
        Runnable r=()->System.out.println("lambda表达式1");
        new Thread(r).start();
        new Thread(()->System.out.println("lambda表达式2")).start();
    }
    private  static void useInter(Inter i){
        i.show();
    }
}
