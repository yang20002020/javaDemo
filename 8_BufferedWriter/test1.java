package ityang;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) throws IOException {
        //创建treeset集合，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //成绩总分从高到底
                int num = o1.getSum() - o2.getSum();
                // 次要条件
                int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
                int num3 = num2 == 0 ? o1.getMath() - o2.getMath() : num2;
                int num4 = num3 == 0 ? o1.getName().compareTo(o2.getName()) : num3;
                return num4;
            }
        });
        //键盘录入学生数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个学生的成绩数据:");
            System.out.println("姓名:");
            String name = sc.nextLine();
            System.out.println("语文成绩:");
            int chinese = sc.nextInt();
            System.out.println("数学成绩:");
            int math = sc.nextInt();
            System.out.println("英语成绩:");
            int english = sc.nextInt();
            //创建学生对象，把键盘录入的数据对应的赋值给学生对象的成绩变量
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            //把学生对象添加到treeset集合
            ts.add(s);
            //创建字符缓冲输出对象
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ityang\\a.txt"));

            //遍历集合 得到每一个学生对象
            for (Student s1 : ts) {
                //把学生对象的数据拼接成指定格式字符串
                //格式：姓名， 语文成绩，数学成绩，英语成绩,总分
                StringBuilder str = new StringBuilder();
                str.append(s1.getName()).append(",").append(s1.getChinese()).append(",").append(s1.getMath()).append(",").append(s1.getEnglish()).append(",").append(s1.getSum());

                //调用字符缓冲输出流对象的方法写数据
                bw.write(str.toString());
                bw.newLine();
                bw.flush();

            }
            bw.close();
        }


    }


}
