package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        String[] members={"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        Scanner sc = new Scanner(System.in);
        System.out.println("*변경전 정보:"+ Arrays.toString(members));
        while (true){
            System.out.print("수정할 멤버의 이름을 입력하세요");
            String targetMember=sc.nextLine();
            int targetIndex=-1;
            for (int i = 0; i < members.length; i++) {
                if (members[i].equals(targetMember)){
                    targetIndex=i;
                    break;
                }
            }
            if (targetIndex==-1){
                System.out.printf("%s은(는)없는 이름입니다.\n",targetMember);
                continue;
            }
            else{
                System.out.print(targetMember+"의 별명을 변경합니다");
                String editName=sc.nextLine();
                members[targetIndex]=editName;
                System.out.println("변경완료!");
                System.out.println("*변경후 정보:"+ Arrays.toString(members));
                break;
            }


        }
        sc.close();

    }
}
