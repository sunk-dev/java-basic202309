package day02.array;

import java.util.Arrays;

public class StringList_1 {
    //스트링 배열을 필드로 등록
    String [] sArr;
    //생성자를 통해 배열 초기화

    StringList_1() {
        sArr=new String[0];
    }
    StringList_1(String ...init){
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
    int size() {
        return sArr.length;
    }
   //배열의 맨끝에 데이터를 추가하는 기능
    void push(String newData){
        String[] temp= new String[sArr.length+1];
        for (int i = 0; i < sArr.length ; i++) {
            temp[i]=sArr[i];

        }
        temp[temp.length-1]=newData;
        sArr=temp; //메서드 호출이 끝나면 temp가 알아서 소멸됨
    }
//    배열이 비어있는지 확인
    boolean isEmpty(){
        return sArr.length==0?true:false;
    }
//    배열을 전체 삭제하는 메서드
    void clear(){
        sArr=new String[0];
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public String remove(int index) {//보통 배열에서 꺼낸다음에 삭제한 데이터를 리턴함
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    public String remove(String target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length - 1) push(newData);//인덱스가 끝 인덱스일때

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; --i) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }


}
