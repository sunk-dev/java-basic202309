package day01;

public class Casting {
    public static void main(String[] args) {
        byte a=100;//1바이트
        int b=a;//4바이트

        System.out.println("b = " + b);

//        c: 00000000 00000000 0000011 11101000
        int c=1000;
//        d:1(음수) 1101000
        //1의 보수 0010111
        //2의 보수 0011000=>24
        byte d= (byte) c;
        System.out.println("d = " + d);
        
        double n=3.5;
        int m= (int) n;//downCasting 은 데이터 손실이 일어 날수도 있음.
        System.out.println("m = " + m);

        //연산시 일어나는 자동 캐스팅
        int k=100;
        double j=5.5;

        double result = k + j;

//        데이터 크기가 다른 데이터 끼리의 연산은
//        작은쪽을 큰쪽으로 자동 변환후 연산을 진행
        char x='A';
        int y=3;
        char result2 = (char) (x + y);
        System.out.println(result2);

        //int 보다 작은 데이터(byte,short,char)의 연산은 자동으로 int처리됨.
        byte b1=100;
        byte b2=120;
        int result3 = b1 + b2;

        System.out.println('A'+'C');
        int g=24;
        double r=g/5.0;
        System.out.println("r = " + r);



    }
}
