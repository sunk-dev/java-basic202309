package day09.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        // 바이트 기반 스트림- 이미지, 영상 텍스트, 기타 전부
        // 텍스트 기반 스트림- 텍스트 특화
        
        String msg="멍멍이는 왈왈 \n 고양이는 야옹";
        // try with resources.: auto close  기능(finally기능 대신 권고)

        try(FileOutputStream fos=new FileOutputStream("C:/hello/dog.txt");) {
           
            fos.write(msg.getBytes());//세이브 파일을 생성하는 명령어
            System.out.println("파일 저장 성공");
        } catch (FileNotFoundException e) {
            System.out.println("해당경로를 찾을 수 없습니다");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("출력시스템에 장애가 발생합니닷");
            throw new RuntimeException(e);
            
        }
        
        
       /* 
        finally {
            try {
               if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
