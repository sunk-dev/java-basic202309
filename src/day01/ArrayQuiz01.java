package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foodList=new String[0];
//        String[] foodList={};
        System.out.print("먹고싶은 음식을 입력하세요!: ");
        System.out.print("#입력을 중지하고 싶다면 '그만'이라고 입력하세요 ");

        while (true){
            System.out.print(">>");
            String inputFood=sc.nextLine();
            if (inputFood.equals("그만"))
                break;
            else{
                String[] temp=new String[foodList.length+1];
                for (int i = 0; i < foodList.length ; i++) {
                    temp[i]=foodList[i];
                }
                temp[temp.length-1]=inputFood;
                foodList=temp;
                temp=null;


            }
        }
        System.out.println("foodList = " + Arrays.toString(foodList));


    }
}
