package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        String[] members={"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        Scanner sc = new Scanner(System.in);
        System.out.println("우리반학생들의 별명:"+ Arrays.toString(members));

        while (true){
            System.out.print("삭제할 학생의 별명을 입력하세요!");
            String deleteTarget=sc.nextLine();
            int targetIndex=-1;
            for (int i = 0; i < members.length; i++) {
                if (members[i].equals(deleteTarget)){
                    targetIndex=i;
                    break;
                }
            }
            if (targetIndex==-1){
                System.out.printf("%s은(는)없는 이름입니다.\n",deleteTarget);
                continue;
            }
            else{
                System.out.print(deleteTarget+"의 별명을 삭제합니다.");

                String[]temp=new String[members.length-1];
                for (int i = targetIndex; i < members.length-1 ; i++) {
                    members[i]=members[i+1];

                }
                for (int i = 0; i < temp.length ; i++) {
                    temp[i]=members[i];

                }
                members=temp;
                temp=null;

                System.out.println("*삭제후 정보:"+ Arrays.toString(members));
                break;
            }


        }

    }
}
