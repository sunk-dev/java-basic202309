package day01;

import java.util.Date;

public class DataType {
    static  int add(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        System.out.println(add(1,3));
//      1byte==8bit
        byte a = 10;
//        2byte ==16bit
        short b=32767;

        long d=3147483648L;
        float e=3.1489898989898F;//4byte- 소수점 7자리
        System.out.println("e = " + e);
        double f = 1.57575757;

        boolean b1 = true;
        boolean b2 = false;
        
        //2byte
        char cc=65;//대문자 A:65 97:소문자 a
        //한글: 가(44032)-힣 
        System.out.println("cc = " + cc);
        
        //문자열(문자배열)
        char[] str={'h','e','l','l','o'};
        System.out.println("str = " +new String(str));

        //스트링은 기본 타입이 아님.(용량이 정해져 있지 않음) 앞이 대문자== 원시타입아님
        String s="hello";//내부적으로 char 배열로 변환

        Date date = new Date();
        System.out.println(date);

    }
}
