package singleton;

public class TestMain {
    public static void main(String [] args){
        TestStream s=TestStream.getTest();
        s.setName("С��");
        System.out.println(s.getName());
        TestStream s1=TestStream.getTest();
        s1.setName("С��");
        System.out.println(s1.getName());
        s.getInfo();
        s1.getInfo();
        if(s==s1){
            System.out.println("��������ͬһ��ʵ��");
        }else if(s!=s1){
            System.out.println("�����Ĳ���ͬһ��ʵ��");
        }else{
            System.out.println("application error");
        }
    }
}
