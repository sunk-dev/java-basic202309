package day09.api.strbuilder;

public class StrBuilder {

    private static void makeString(){
        long start=System.currentTimeMillis();
        String s="A";
        for (int i = 0; i < 200000; i++) {
            s+="A";

        }
        long end=System.currentTimeMillis();

        System.out.println("스트링총 소요시간: "+(end-start)+"밀리초");
    }

    private static void makeStringBuilder(){
        long start=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder("A");
        for (int i = 0; i < 200000; i++) {
            sb.append("A");

        }
        long end=System.currentTimeMillis();

        System.out.println("빌더 총 소요시간: "+(end-start)+"밀리초");
    }
    public static void main(String[] args) {
        makeString();
        makeStringBuilder();

    }
}
