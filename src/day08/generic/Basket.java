package day08.generic;

//generic:여러 타입의 객체를 생성할수 있게 해주는 문법
public class Basket<F> {
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
