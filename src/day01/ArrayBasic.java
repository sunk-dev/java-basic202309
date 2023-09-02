package day01;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        //자바 배열 특징
//        1. 동종모음 구조 (homogenius collection):같은 타입의 데이터만 저장
//        2. 크기가 고정됨:크기를 동적으로 늘이거나 줄일수 없음
//        3.
//        배열선언
        int[] arr;
        //배열생성
        arr = new int[5];
        //배열초기화
        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 60;
        
        //배열의길이
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("데이터:"+arr[i]);

        }
        System.out.println("==============================");
        //iter : foreach문
        for (int i : arr) {
            System.out.println("데이터:"+i);

        }
//       문자열로 배열 내부 출력
        System.out.println(Arrays.toString(arr));

//        배열 한번에 선언하기
//        int[] numbers=new int[] {1,2,3,4,5,6,7,8,9,10};
        //        배열변수 선언과 함께일때는 new 생략가능
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=new int[]{11,12,13};
        System.out.println(Arrays.toString(numbers));

        //배열 생성만 하고 값을 넣지 않으면 기본값이 생성됨
        byte[] bArr=new byte[5];//정수 기본값0
        double [] dArr=new double[5];//0.0
        boolean[] boArr=new boolean[5];///false
        String [] sArr=new String[3];//그외: null

        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(boArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(sArr));


    }
}
