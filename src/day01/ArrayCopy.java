package day01;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍", "야옹이", "쩝쩝이" };
        //배열복사
//        String[] petCopy = new String[pets.length];
//        for (int i = 0; i < pets.length; i++) {
//            petCopy[i]=pets[i];
//
//        }
        String[] petsCopy = Arrays.copyOf(pets, pets.length);
        pets[1] = "어흥이";
        System.out.println("petCopy = " + petsCopy);
        System.out.println("pets = " + pets);
        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petCopy = " + Arrays.toString(petsCopy));


    }
}
