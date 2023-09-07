package day02;

import java.util.Arrays;

public class MethodQuiz {
    //
    static String[] foods={"떡볶이","치킨","파스타"};
    static String[] userNames={"홍길동","고길동"};
    //
    static void printFoods(){
        System.out.println(Arrays.toString(foods));
    }
    static void push(String newFood){
        String temp[]=new String[foods.length+1];
        for (int i = 0; i < foods.length; i++) {
            temp[i]=foods[i];

        }
        temp[temp.length-1]=newFood;
        foods=temp;
        temp=null;
    }
    static int indexOf(String targetFood){
        int findIndex=-1;
        for (int i = 0; i < foods.length ; i++) {
            if(targetFood.equals(foods[i])){
                findIndex=i;
                break;

            }

        }
        return findIndex;
    }
    static void remove(String removeFood){
        int removeIndex=indexOf(removeFood);
        if (removeIndex==-1){
            System.out.println("존재하지 않는 음식명 입니다");
        }
        else {
            for (int i = removeIndex; i < foods.length-1 ; i++) {
                foods[i]=foods[i+1];

            }
            String[] temp=new String[foods.length-1];
            for (int i = 0; i < temp.length ; i++) {
                temp[i]=foods[i];

            }
            foods=temp;
            temp=null;
        }
    }
    static boolean include(String isIncludeFood){
        int isIncludeFlag=indexOf(isIncludeFood);
        if(isIncludeFlag==-1)
            return false;
        else return true;
    }
    static void insert(int insertedIndex,String insetedFood){
        String [] temp= new String[foods.length+1];
        for (int i = 0; i < insertedIndex; i++) {
            temp[i]=foods[i];

        }
        temp[insertedIndex]=insetedFood;
        for (int i = insertedIndex+1; i < foods.length ; i++) {
            temp[i]=foods[i];

        }
        temp=foods;
        temp=null;


    }
    static void modify(int modifiedIndex,String modifiedFood){
        foods[modifiedIndex]=modifiedFood;
    }
    public static void main(String[] args) {
        printFoods();//음식들 출력
        push("라면"); //배열에 추가되는
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타"); //파스타의 인덱스 리턴
        System.out.println("idx = " + idx);
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println("idx2 = " + idx2);
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println("idx3 = " + idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();


        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        //clear();  // foods배열 모든 데이터 삭제

        printFoods();



    }

}
