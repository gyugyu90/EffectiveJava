package ch3.item10;


import java.util.Objects;

public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }
}
