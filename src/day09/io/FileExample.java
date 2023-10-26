package day09.io;

import java.io.File;
import java.io.IOException;


public class FileExample {
    //파일을 저장할 기본 경로
    public static final String ROO_PATH="C:";
    public static void main(String[] args) throws IOException {

        //폴더생성
        //파일정보 객체 생성
        File file = new File(ROO_PATH+"/hello");

        //폴더 생성 명령
        if(!file.exists())file.mkdir();

        //파일 생성
        File f = new File(ROO_PATH + "/hello/food.txt");
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성에 실패~");
                e.printStackTrace();
            }
        }



    }
}
