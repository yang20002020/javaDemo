package itheima;

public class Test {
    public static void main(String[] args) {
        Jumpping j=new Cat();
          j.jump();
      System.out.println("*****************");
          Animal a=new Cat();

          a.setName("加菲猫");
          a.setAge(10);
          System.out.println(a.getName()+","+a.getAge());
          a.eat();
        ((Cat) a).jump();


    }
}
