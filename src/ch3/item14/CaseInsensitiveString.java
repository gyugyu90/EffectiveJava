package ch3.item14;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return s;
    }

    @Override
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }

    public static void main(String[] args) {

        String[] a = {"Hello", "heLLo", "world", "World", "foo", "bar"};

        Set<CaseInsensitiveString> s = new TreeSet<>();
        for(String arg: a) {
            s.add(new CaseInsensitiveString(arg));
        }
        System.out.println(s);
    }

}
