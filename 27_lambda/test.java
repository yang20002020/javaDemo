package ityang;
/*
省略规则：
参数类型可以省略，但是有多个参数的情况下，只能省略一个
如果参数有且只有一个，那么小括号可以省略
如果代码块的语句只有一个，可以省略大括号和分号，甚至是return
 */
public class test {
    public static void main(String[] args) {

        useAddable((int a,int b )->{
          return a+b;
        });
        //参数的类型可以省略
        //但是有多个参数的情况下，不能只省略一个
        useAddable(( a,b )->{
            return a+b;
        });

        useFlyAble((String s)->{
            System.out.println("有参函数："+s);
        });
        useFlyAble((s)->{
            System.out.println("有参函数："+s);
        });
        //如果参数有且仅有一个，那么小括号可以省略
        useFlyAble(s->{
            System.out.println("有参函数："+s);
        });
        //如果代码块有且仅有一个，那么可以省略大括号
        useFlyAble(s->System.out.println("有参函数："+s));
       // useAddable((x,y)-> return x+y); 需要省略return
        useAddable((x,y)->  x+y);


    }

    private static  void useAddable(Addable e){
        int c=e.add( 10,20);
        System.out.println(c);
    }
    private static void useFlyAble(Flyable a){
        a.fly("风和日丽");
    }
}
