package day06.abs;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("해피", "푸들", 3);
        Cat cat = new Cat("리리", "코숏", 10);
        Pet[] pets={dog,cat,new Dog("초코","말티즈",4)};

        for (Pet pet : pets) {
            pet.eat();
            pet.takeNap();

        }
    }
}
