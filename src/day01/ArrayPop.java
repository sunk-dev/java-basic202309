package day01;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        //pop:맨끝 데이터 삭제
        int[] arr={10,20,30,40,50};

        //새로운 배열을 생성(기존 사이즈보다 1개작은 배열)
        int[] temp=new int[arr.length-1];

        //맨 앞 데이터부터 순차적으로 새 배열에 복사
        for (int i = 0; i <temp.length ; i++) {
            temp[i]=arr[i];

        }
//        주소값 변경
        arr=temp;
        temp=null;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
