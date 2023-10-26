package day11.inner;


//이 인터페이스는 람다를 사용할수 있는가?

/**
 * 람다 사용조건:추상메서드가 단 하나여야 만 가능
 */
@FunctionalInterface

public interface Calculator {
    //클래스를 설계하기 위한 명세서
    //계산에 관련된 기능을 명세
    //두개의 정수를 상황에 맞게 연산가능
    int operate(int n1,int n2);

    default  void  abc(){}

}
