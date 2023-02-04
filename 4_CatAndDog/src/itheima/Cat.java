package itheima;

public class Cat extends  Animal implements Jumpping {
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
     System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
      System.out.println("猫可以跳高了");
    }
}
