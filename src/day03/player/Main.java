package day03.player;

public class Main {
    public static void main(String[] args) {
        Player parking= new Player("주차왕파킹");
        Player fucking= new Player("욕설왕퍼킹");
        parking.attack(fucking);
        System.out.println("parking"+parking);
        System.out.println("fucking = " + fucking);
//        new Player();->생성자가 단하나도 없을때 기본 생성자를 만듬
        new Player();

    }
}
