package day05.static_;

public class Calculator {

    String color;//계산기 색상
    static double pi;//원주율:모든 계산기가 같은 값을 가짐

    //원의 넓이를 구하는 메서드

    static double calcAreaCircle(int r){
        return pi*r*r;
    }

    //계산기의 색깔을 칠하는 기능
     void paint(String color){
        this.color=color;

    }


}
