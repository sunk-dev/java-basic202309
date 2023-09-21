package day05.ploy.car;

public class Driver {
    //운전기능
    public void drive(Car car){
        System.out.println("운전을 시작합니다.");
        car.accelerate();

    }

    //오버로딩:같은 이름의 메서드를 하나의 클래스에 중복해서 작성하는것
//    public void drive(Mustang car){
//        System.out.println("운전을 시작합니다.");
//        car.accelerate();
//    }
//    public void drive(Stinger car){
//        System.out.println("운전을 시작합니다.");
//        car.accelerate();
//    }

}
