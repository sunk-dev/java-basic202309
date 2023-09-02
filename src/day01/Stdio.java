package day01;

import java.util.Scanner;

public class Stdio {
    public static void main(String[] args) {
//        자바에서 입력을 처리하는 객체
//        입력이 필요한 상황에서 1번 선언하면됨.

        Scanner sc = new Scanner(System.in);
//        문자
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        String inputAge = sc.nextLine();
//        문자열을 정수로 변환
        int age=Integer.parseInt(inputAge);
        int birthYear=2023-age+1;
        System.out.printf("이름: %s,출생:%s년\n",name,birthYear);

        //메모리 자원해제 (하드웨어나 네트웤,데이터베이스 외부장치 접근)
        sc.close();

    }

}
