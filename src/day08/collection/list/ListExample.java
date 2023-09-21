package day08.collection.list;

//컬렉션들이 모여있는 패키지.

import day08.generic.Apple;

import java.util.*;

import static util.Utility.makeLine;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //add(E e):맨끝에 데이터 추가

        list.add("짜장면");
        list.add("볶음밥");
        list.add("라면");
        list.add("파스타");

        System.out.println(list);

        //중간삽입 add(index, E)

        list.add(2, "족발");
        System.out.println("list = " + list);

        int size = list.size();
        System.out.println("size = " + size);

        //indexOf(E e) :해당 데이터의 인덱스 반환

        int index = list.indexOf("파스타");
        System.out.println("파스타 = " + index);

        //contains(E e):해당 데이터 저장 유무 반환
        System.out.println(list.contains("족발"));
        System.out.println(list.contains("마파두부"));

        //remove (index), remove(objext)

        list.remove("파스타");
        list.remove(2);

        System.out.println("list = " + list);


        //set(index,newElement)
        list.set(0, "동파육");
        System.out.println("list = " + list);

        //get(index):리스트에 저장된 데이터 참조
        System.out.println("list.get(1) = " + list.get(1));

        makeLine();
        //반복문 처리
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        for (String s : list) {
            System.out.println("s = " + s);

        }
        //clear():전체 삭제
        //isEmpty():리스트가 비어있는지 확인
        makeLine();
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        makeLine();
        //리스트에 초기값 넣고 시작하기.
        List<Integer> numbers = new ArrayList<>(
                List.of(5, 30, 7, 99, 4, 31)
//                Arrays.asList(5,30,88,11,3,4) => ver 9
        );
        System.out.println("numbers = " + numbers);

        //오름차 정렬 (퀵정렬)
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);

        //내림차정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);

        //배열리스트와 연결리스트
        /**           탐색속도      삽입삭제 속도
         * 배열리스트     빠름         느림
         * 연결리스트     느림         빠름
         */

        List<Apple> apppleList=new LinkedList<>();
        apppleList.add(new Apple(18));




    }
}
