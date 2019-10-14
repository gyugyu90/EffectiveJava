package ch4.item30;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.UnaryOperator;

public class GenericMethod {

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    public static void main(String[] args) {
        Set<String> guys = new HashSet<>();
        guys.add("톰");
        guys.add("딕");
        guys.add("해리");

        Set<String> stooges = new HashSet<>();
        stooges.add("래리");
        stooges.add("모에");
        stooges.add("컬리");

        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);

        String[] strings = {"삼베", "대마", "나일론"};
        UnaryOperator<String> sameString = identityFunction();
        for(String s: strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for(Number n: numbers)
            System.out.println(sameNumber.apply(n));

    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비어 있습니다");

        E result = null;
        for (E e: c) {
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }

        return result;
    }

}
