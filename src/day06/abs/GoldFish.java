package day06.abs;

public class GoldFish extends Pet {

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 어항 아래에서 zzz");

    }

    @Override
    public void eat() {
        System.out.println("금붕어도 사료를 냠");

    }
}
