package day05.ploy.car;

import day04.modi.pac2.C;
import util.Utility;

public class Main {
    public static void main(String[] args) {

        Avante avante = new Avante();
        Avante avante2 = new Avante();
        Mustang mustang = new Mustang();
        Stinger stinger = new Stinger();
        mustang.exhaust();
        Car[] cars={avante,avante2,mustang,stinger};
        for (Car c : cars) {
            c.accelerate();

        }

        Object [] arr={"hello","안녕","nihao",1,false};
        Utility.makeLine();

        Driver park = new Driver();
        park.drive(mustang);
        park.drive(avante2);
        park.drive(stinger);

        Utility.makeLine();
        CarShop shop=new CarShop();
        Mustang myCar = (Mustang) shop.exportCar(6000);//다운캐스팅을 통해 고유의 메서드 이용
        myCar.accelerate();
        myCar.exhaust();

        //객체 다운캐스팅의 전체조건:
        //한번 업캐스팅이된 자식객체만 다시 다운캐스팅가능

        Utility.makeLine();
         Car myStinger1 = new Stinger();
         Stinger ss=(Stinger) myStinger1;

//         Car car=new Car();
//         Avante aaa= (Avante) car;

        Car car2 = shop.exportCar(6000);
        System.out.println(car2 instanceof  Avante);
        System.out.println(car2 instanceof  Stinger);
        System.out.println(car2 instanceof  Mustang);

        if(car2 instanceof Mustang){
            Mustang ms=(Mustang) car2;
            ((Mustang) car2).exhaust();
        }


    }
}
