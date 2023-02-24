package it_02;
import it_01.MyService;
import java.util.ServiceLoader;
/*
ServiceLoader 一种加载服务实现的工具
 */
public class test {
    public static void main(String[] args) {
        //加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        //遍历服务
        for(MyService my:myServices){
            my.service();
        }
    }
}
