package ch4.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Chooser<T> {

    private final List<T> choiceList;

    public Chooser(Collection<T> choices) {
        this.choiceList = new ArrayList<>(choices);

    }



}
