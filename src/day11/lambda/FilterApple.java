package day11.lambda;

import java.util.ArrayList;
import java.util.List;

//사과를 여러가지 방법으로 필터링
public class FilterApple {
    /**
     * @solution try1:사과 바구니에서 녹색 사과들만 필터링하자
     * @problem - 만약에 다른 색깔의 사과를 필터링 해야한다면??
     *            새로운 메서드를 생성해야함.
     * @parm1 basket :전체 사과가 들어있는 바구니
     * @return -녹색 사과만 필터링된 바구니
     */

    public static List<Apple> filterGreenApples(List<Apple> basket){

        //녹색사과만 담을 바구니
        List<Apple> greenBasket=new ArrayList<>();
        for (Apple apple : basket) {
            if(apple.getColor()==Color.GREEN){
                greenBasket.add(apple);
            }

        }
        return greenBasket;


    }
    /**
     * @solution- 색상을 파라미타화함.
     * @problem - 만약 필터 기준이 색상이 아니라 무게라면??
     */

    public static List<Apple> filterApplesByColor(List<Apple> basket,Color color){

        //필터된 사과만 담을 바구니
        List<Apple> filteredBasket =new ArrayList<>();
        for (Apple apple : basket) {
            if(apple.getColor()==color){
                filteredBasket.add(apple);
            }

        }
        return filteredBasket;


    }
    /**
     * @solution -try:동작을 파라미터화 하면 해결된
     * ------------------> 함수를 전달 받을 수 있다면?
     *                    - 자바는 함수를 전달할수 있는가-> 불가능
     *                     -> 자바의 함수는 일급객체가아니고 객체에 소속된 메서드 개념
     *                      -> 그런데 전달되는 함수가 고정되어 있는가?
     *                      - 필터 조건에 따라 함수 내용이 다른다.
     *                      -> 그럼어떻게 함수이름이 통일 되면서 다른내용을 전달할수 있을까?
     *                      _  -> 오버라이딩 (상속,인터페이스)
     *
     * @problem - 사과만 필터링 할수 있음.
     *            다른 과일이나 전자제품을 필터링 불가능
     *
     */
    public static List<Apple> filterApples(List<Apple> basket,ApplePredicate predicate){

        //필터된 사과만 담을 바구니
        List<Apple> filteredBasket =new ArrayList<>();
        for (Apple apple : basket) {
            if(predicate.test(apple)){
                filteredBasket.add(apple);
            }

        }
        return filteredBasket;


    }
    /**
     * @solutin- try4 제너릭 필터 메서드 생성
     */

    public static <T> List<T> filter(List<T> basket,GnericPredicate<T> predicate){

        //필터된 사과만 담을 바구니
        List<T> filteredBasket =new ArrayList<>();
        for (T t : basket) {
            if(predicate.test(t)){
                filteredBasket.add(t);
            }

        }
        return filteredBasket;


    }
}
