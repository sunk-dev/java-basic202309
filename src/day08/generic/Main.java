package day08.generic;

import util.Utility;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(10);
        System.out.println(a1.toString());
        System.out.println(a1);
        AppleBasket ab = new AppleBasket();
        ab.setApple(a1);
        Apple apple=ab.getApple();
        Banana b1 = new Banana();

        BananaBasket bb= new BananaBasket();
        bb.setBanana(b1);
        Basket<Apple> appleBasket = new Basket<Apple>();
        Apple app=appleBasket.getFruit();
        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setFruit((new Banana()));
        Basket<Peach> peachBasket= new Basket<Peach>();

        Utility.makeLine();
        GenericList<String> sList = new GenericList<>();
        sList.push("짜장면");
        sList.push("볶음밥");
        sList.push("치킨");
        sList.printArray();

        GenericList<Integer> numbers=new GenericList<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        numbers.printArray();
        GenericList<Apple> aList =new GenericList<>();
        aList.push(new Apple(10));
        aList.push(new Apple(17));
        aList.push(new Apple(30));
        aList.printArray();
    }
}
