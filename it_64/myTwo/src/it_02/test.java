package it_02;
import it_01.MyService;
import java.util.ServiceLoader;
/*
ServiceLoader һ�ּ��ط���ʵ�ֵĹ���
 */
public class test {
    public static void main(String[] args) {
        //���ط���
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        //��������
        for(MyService my:myServices){
            my.service();
        }
    }
}
