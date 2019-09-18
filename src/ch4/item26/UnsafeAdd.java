package ch4.item26;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAdd {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42)); // will throw exception
        String s = strings.get(0);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

}
