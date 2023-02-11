package ityang;

public class test {
    public static void main(String[] args) {

        useFlyable((int a,int b )->{
          return a+b;
        });
    }


    private static  void useFlyable(Addable e){
        int c=e.add( 10,20);
        System.out.println(c);
    }
}
