package it_17;

public class Student {
    private String name;
    int age;
    public String address;

    public Student() {

    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //成员方法，一个私有，三个公有
    private void function() {
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method");
    }

    public void method2(String s) {
        System.out.println("method" + s);
    }

    public String method3(String s, int i) {
        return s + "," + i;
    }
    @Override
    public String toString(){
        return "Student{"+
                "name='"+name+'\''+
                "，age="+age+
                ",address='"+address+'\''+
                '}';
    }

}
