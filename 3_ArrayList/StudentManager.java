package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            //用键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    // break;
                    System.exit(0);//jvm退出

            }
        }
    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid="";
        while (true) {
            System.out.println("请输入学生学号：");
            sid   = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag == true) {
                System.out.println("学生号已经重复，请重新输入:");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地址");
        String adress = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAdress(adress);
        array.add(s);
        System.out.println("添加学生信息成功！");

    }

    //查看所有学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("没有学生信息，请先输入学生信息！");
            return;
        }
        // \t 等价于tab键
        System.out.println("学号\t\t 姓名\t\t年龄\t\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAdress());
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();
        int flag=-1,temp=0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag=0;
                temp=i;
                break;
            }
        }
        if(flag==-1){
            System.out.println("该信息不存在，请重新输入:");
        }else{
            array.remove(temp);
            System.out.println("删除学生成功！");
        }

    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生的学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生的新姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生的新年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生的新地址:");
        String adress = sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAdress(adress);

        //修改对应学生信息
        for(int i=0;i<array.size();i++){
            Student student=array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改学生信息成功！");
    }

    //判断学生号 是否被占用
    public static boolean isUsed(ArrayList<Student> array,String sid){
        //
        boolean flag=false;
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }

}
