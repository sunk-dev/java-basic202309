import java.util.Date;

public class Hello {
//    클래스는 관례적으로 첫글자 대문자, 캐멀케이스 이용
//    클래스 이름은 파일명과 일치해야함.
public static void main(String[] args) {
    System.out.println(200*2);
    System.out.println("Hello Java");
    int a = 100;
    double b = 3.14;
    String str = "Hello";
    boolean flag = true;

    Date date = new Date();
    System.out.println(a+b);
    System.out.println("a = " + a);
}
}
