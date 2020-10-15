package ru.vsu.cs.yagodintsevNikitaAndreevich;

public class Program {
    // Соответствуют первому варианту задачи

    public static final Parabola parabola = new Parabola(-2, -5, 1 / 8.0);
    public static final Circle circle = new Circle(-1, -6, 2);

    public static final Line L1 = new Line(-3, 2, 1 / 4.0);
    public static final Line L2 = new Line(1, 0, -4);
    public static final Line L3 = new Line(0, -3, 0);


    public static SimpleColor getColor(double x, double y) {


        if (!parabola.isPointInside(x, y) && L1.isPointAbove(x, y) && !L2.isPointAbove(x, y)) {
            return SimpleColor.YELLOW;
        }

        if (parabola.isPointInside(x, y) && L1.isPointAbove(x, y) && !L2.isPointAbove(x, y)) {
            return SimpleColor.ORANGE;
        }

        if (parabola.isPointInside(x, y) && L1.isPointAbove(x, y) && L2.isPointAbove(x, y)) {
            return SimpleColor.GRAY;
        }

        if (!parabola.isPointInside(x, y) && L1.isPointAbove(x, y) && L2.isPointAbove(x, y)) {
            return SimpleColor.BLUE;
        }

        if (!L1.isPointAbove(x, y) && L2.isPointAbove(x, y) && L3.isPointAbove(x, y)) {
            return SimpleColor.WHITE;
        }

        if (!parabola.isPointInside(x, y) && L2.isPointAbove(x, y) && !L3.isPointAbove(x, y)) {
            return SimpleColor.GRAY;
        }

        if (parabola.isPointInside(x, y) && circle.isPointInside(x, y)) {
            return SimpleColor.ORANGE;
        }

        if (circle.isPointInside(x, y)) {
            return SimpleColor.YELLOW;
        }

        if (!parabola.isPointInside(x, y) && !L1.isPointAbove(x, y) && L3.isPointAbove(x, y)) {
            return SimpleColor.BLUE;
        }




        return SimpleColor.GREEN;

    }
}
