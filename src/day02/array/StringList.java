package day02.array;

import java.util.Arrays;

public class StringList {
    //스트링 배열을 필드로 등록
    String [] sArr;
    //생성자를 통해 배열 초기화

    StringList() {
        sArr=new String[0];
    }
    StringList(String ...init){
        sArr=new String[init.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i]=init[i];

        }

    }
    //배열 맨끝 데이터 제거
    void pop(){
        String[] temp=new String[sArr.length-1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i]=sArr[i];

        }
        sArr=temp;
    }
    void printArray(){
        System.out.println(Arrays.toString(sArr));
    }

    String[] createTempArr(int more){//새로운 임시배열을 만드는 함수
        String[] tempArr=new String[sArr.length+more];
        int loopCount=(more>=0)?sArr.length:sArr.length+more;
        for (int i = 0; i <loopCount ; i++) {
            tempArr[i]=sArr[i];

        }
        return tempArr;


    }
    public void push(String newFood) {
        String[] tempArr=createTempArr(+1);
        tempArr[tempArr.length-1]=newFood;
        sArr=tempArr;

    }

    public void insert(int insetedIndex, String insertedFood) {
        String[] tempArr=createTempArr(+1);
        for (int i = insetedIndex+1; i <tempArr.length ; i++) {
            tempArr[i]=sArr[i-1];
        }
        tempArr[insetedIndex]=insertedFood;
        sArr=tempArr;

    }
    void remove(int removedIndex){
        String[] tempArr=createTempArr(-1);
        for (int i = removedIndex; i < tempArr.length ; i++) {
            tempArr[i]=sArr[i+1];

        }
        sArr=tempArr;

    }

    void remove(String removedFood) {
        int removedFoodIndex=indexOf(removedFood);
        if(removedFoodIndex==-1){
            System.out.println("removedFoodIndex = " + removedFoodIndex+"없음");
        }
        else{
            remove(removedFoodIndex);
        }

    }


    public boolean includes(String findFood) {
        int findFoodIndex=indexOf(findFood);
        return (findFoodIndex==-1)?false:true;

    }

    public int indexOf(String findFood) {
        int index=-1;
        for (int i = 0; i < sArr.length; i++) {
            if(findFood.equals(sArr[i])){
                index=i;
                break;

            }
        }
        return index;
    }

     int size() {
        return sArr.length;
    }
}
