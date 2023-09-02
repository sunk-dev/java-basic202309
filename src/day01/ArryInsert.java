package day01;

import java.util.Arrays;

public class ArryInsert {
    public static void main(String[] args) {
        int[]arr={10,20,90,100,110};
        int newData=50;
        int targetIndex=0;
        //20과 90 사이에 50을 넣어보기

//내풀이
//        for (int i = 0; i <targetIndex ; i++) {
//            temp[i]=arr[i];
//
//        }
//        for (int i = targetIndex; i < arr.length; i++) {
//            temp[i+1]=arr[i];
//        }
//        해설
//        1.기존사이즈보다 1칸 큰 배열 생성
        int[] temp=new int[arr.length+1];
//        2.temp에 원본 배열의 데이터를 전부 복사
        for (int i = 0; i < arr.length ; i++) {
            temp[i]=arr[i];

        }
//        3.맨뒤부터 한칸씩 뒤로 이동
        temp[4]=temp[3];
        temp[3]=temp[2];

        for (int i = temp.length-1; i >targetIndex; i--) {
            temp[i]=temp[i-1];//..?

        }

//        4.타겟 인덱스에 새 데이터 추가
        temp[targetIndex]=newData;
//        5.주소값 변경
        arr=temp;
        temp=null;

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("temp = " + Arrays.toString(temp));
    }
}
