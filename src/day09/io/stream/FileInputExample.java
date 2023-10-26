package day09.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        String path = "C:\\Users\\seon\\Desktop\\develop\\java-basic202309\\src\\day03\\member\\MemberRepository.java";
        try(FileInputStream fis=new FileInputStream(path)) {
//            byte[] data = fis.readAllBytes();
//            long start = System.currentTimeMillis();
//            for (byte b:data) {
//
//                System.out.write((char)b);
//            }
//
//            long end = System.currentTimeMillis();
//            System.out.println("end-start = " + (end - start));

            int data= 0;
//            long start = System.currentTimeMillis();
            while(data!= -1){
                data=fis.read();
                //System.out.write :아스키 출력 담당
                System.out.write((char) data);
            }
//            long end = System.currentTimeMillis();
//            System.out.println("end-start = " + (end - start));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
