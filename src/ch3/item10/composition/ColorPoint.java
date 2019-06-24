package ch3.item10.composition;

import ch3.item10.Color;
import ch3.item10.Point;

import java.util.Objects;

public class ColorPoint {

    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    // ColorPoint의 Point 뷰를 반환
    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
