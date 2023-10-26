package day11.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day11.stream.Menu.menuList;

public class Filtering {
    public static void main(String[] args) {
        //stream 의 filter기능
        //필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        //메뉴중에 채식주의자가 먹을 수 있는 요리를 필터링

//        List<Dish> dishInVegetarian = menuList.stream()
//                .filter(dish -> dish.isVegeterian())
//                .collect(Collectors.toList());


        menuList.stream()
                .filter(dish -> dish.isVegeterian())
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));


//        for (Dish dish : dishInVegetarian) {
//            System.out.println("dish = " + dish);
//        }
//        dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));


        System.out.println("====육류이면서 600칼로리미만 요리 필터링=======");

        menuList.stream()
                .filter(dish -> dish.getCalories()<600&& dish.getType()== Dish.Type.MEAT)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("요리중 요리이름이 4글자인 요리만 필터링");
        menuList.stream()
                .filter(dish -> dish.getName().length()==4)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("요리에서 300칼로리보다 큰 요리만 필터링");
        menuList.stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3) //상위 top3추출
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("====================");

        menuList.stream()
                .filter(dish -> dish.getCalories()>300)
                .skip(2) //맨앞에 두개 제외 시킴
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));
        System.out.println("메뉴목록에서 처음 등장하는 2개의 생선요리 필터링");
        menuList.stream()
                .filter(dish -> dish.getType()== Dish.Type.FISH)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        List<Integer> numbers=List.of(1,2,1,3,3,2,4,4,5,6);
        //짝수만 필터링
        List<Integer> filteredNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()//중복제거
                .collect(Collectors.toList());

        //중복제거
//        Set<Integer> distinctedNumbers=new HashSet<>(filteredNumber);
        System.out.println("filteredNumber = " + filteredNumber);
//        System.out.println("distinctedNumbers = " + distinctedNumbers);
    }
}
