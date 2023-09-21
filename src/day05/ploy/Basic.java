package day05.ploy;

import java.util.Scanner;

class  A extends Object{}
class  B extends A{}
class  C extends A{}
class  D extends B{}
class  E extends C{}

public class Basic {

    /*           Object
                   |
                   A
                 /  |
                 B  C
                 |  |
                 D  E
     */

    void test(){
        //다형성: 자식객체가 부모타입을 사용할수 있다.
        Object a = new A();
        Object b = new B();
        A c = new C();
        A d = new D();
        A e = new E();

        Object sc = new Scanner(System.in);




    }


}
