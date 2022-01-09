public class Conditionals {
    // 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public boolean isTriangleExists(double angleA, double angleB, double angleC) {
        return angleA + angleB + angleC == 180;
    }

    public boolean isTriangleRight(double angleA, double angleB, double angleC) {
        return isTriangleExists(angleA, angleB, angleC) &&
                (angleA == 90 || angleB == 90 || angleC == 90);
    }

    // 2. Найти max{min(a, b), min(c, d)}.
    public double getMaxNumberOfMinimals(double a, double b, double c, double d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    // 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public boolean isLineContainsThreePoints(double x1, double y1,
                                             double x2, double y2,
                                             double x3, double y3) {
        return (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
    }

    // 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public boolean isBrickLessThanHole(double A, double B, double x, double y, double z) {
        return (x <= A && (y <= B || z <= B)) ||
                (y <= A && (x <= B || z <= B)) ||
                (z <= A && (y <= B || x <= B));
    }

    // 5. Вычислить значение функции:
    public double getFunctionValue(double x) {
        if (x <= 3)
            return Math.pow(x, 2) - 3 * x + 9;
        else
            return 1 / (Math.pow(x, 3) + 6);
    }
}
