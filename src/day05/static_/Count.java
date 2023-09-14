package day05.static_;

public class Count {
//    제한자(modifier)
//    접근 제한자(acess modifier),사용제한자 (usage)
    public static int x;//정적필드:모든객체가 공유
    public int y;//인스턴스 필드:각 객체별로 관리됨

    //정적메서드
//    static 메서드 안에서는 static 필드만 직접참조가능
//    인스턴스 필드는 객체를 명시적으로 밝혀야함
    public static void  m1(Count c){
        System.out.println("call static");
        System.out.println("x = " + x);
        System.out.println("y = " + c.y);

    };
    //인스턴스 메서드
    public void m2(){
        System.out.println("call instance");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    };



}
