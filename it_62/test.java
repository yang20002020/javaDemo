package it_62;


import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
通过配置文件运行类中的方法
 */
public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Student s = new Student();
        s.study();
        Teacher t = new Teacher();
        t.teach();
        /*
        class.txt
        //键值对
        className=it_62.Student
        methodName=study
         */
        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\it_62\\class.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        System.out.println("className:"+className);
        String methodName = prop.getProperty("methodName");
        System.out.println("methodName:"+methodName);
        //通过反射来使用
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m = c.getMethod(methodName);
        System.out.println("通过反射调用类中的方法：");
        m.invoke(obj);


    }
}
