package day08.collection.map;

import day05.ploy.car.Mustang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapexample {
    public static void main(String[] args) {
        //key,value타입 각각 지정/.
        Map<String,Object> map =new HashMap<>();
        
        //put(k,v)데이터 추가
        map.put("지갑잔액",5600);
        map.put("좋아하는 자동차",new Mustang());
        map.put("저녁메뉴","계란말이");
        System.out.println("map.size() = " + map.size());

        //get(key)
        Object money=map.get("지갑잔액");
        String dinner=(String) map.get("저녁메뉴");

        //중복된 키를 저장하면, 값이 변경된다.

        map.put("저녁메뉴","김치찌개");
        System.out.println(map);

        Set<String> keySet = map.keySet();
        System.out.println("keySet = " + keySet);
        for (String s : keySet) {
            System.out.println("%s %s,map.get(s)");
        }
    }
}
