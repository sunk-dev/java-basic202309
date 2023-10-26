package day11.lambda;

@FunctionalInterface
public interface GenericFunction<X,Y> {

    //x에서 Y를 추출하는 동작
    Y apply(X x);


}
