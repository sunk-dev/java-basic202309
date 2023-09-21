package day05.ploy.car;

public class Mustang extends Car{
    @Override
    public void accelerate() {
        System.out.println("머스탱이 가속합니다.");
    }

    public void exhaust(){
        System.out.println("머스탱의 배기시스템이 작동합니다~");
    }
}
