package day11.lambda;

public class lightApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()<=100;
    }
}
