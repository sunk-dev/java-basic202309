package day09.api.obj;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("모나미", "서울지사");
        Pen redPen = new Pen(company,1,"빨강",500);
        Pen redPencil = new Pen(company,1,"빨강",500);
        Pen bluePen = new Pen(company, 2, "아쿠아", 600);
        System.out.println(redPen.hashCode());
        System.out.println(redPencil.hashCode());
        long time = System.nanoTime();
        System.out.println("time = " + time);


    }
}
