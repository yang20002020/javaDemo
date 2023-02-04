import java.util.Random;
public class random_2 {
    public static void main(String[] args){
        Random r=new Random();

        int num= r.nextInt(10);//获取随机数值0到10，不包括10
        System.out.println(num);

    }
}
