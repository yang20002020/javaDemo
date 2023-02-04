package itheima;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class test {
    public static void main(String[] args)  {
       Scanner sc= new Scanner(System.in);
       System.out.println("请输入分数");
       int score=sc.nextInt();
       Teacher t=new Teacher();
        try {
            t.checkScore(score);
        } catch (scoreException e) {
          //  throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
