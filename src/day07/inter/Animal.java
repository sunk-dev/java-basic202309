package day07.inter;

//class:객체를 만드는 설계도
//interface:class를 만드는 명세서
public interface Animal {
    //필드 선언 불가
    //생성자선언 불가
    // 상수는 선언 가능
    String PET="귀여운 동물들";

    // 기능들을 명세
    public void feed(String foodName);//기본적으로 abstract가들어감
    boolean sleep();

    default  void makeHobby(){};
}
