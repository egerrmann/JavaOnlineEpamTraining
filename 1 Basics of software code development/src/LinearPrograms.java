public class LinearPrograms {
    // 1. Найдите значение функции: z = ((a – 3) * b / 2) + c.
    public double getFunctionValueFromFirstTask(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    // 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public double getFunctionValueFromSecondTask(double a, double b, double c) {
        double numerator = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        double denominator = 2 * a;
        return numerator / denominator - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    // 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public double getFunctionValueFromThirdTask(double x, double y) {
        double numerator = Math.sin(x) + Math.cos(y);
        double denominator = Math.cos(x) - Math.sin(y);
        return numerator / denominator * Math.tan(x * y);
    }

    // 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.
    public void printChangedNumber(double number) {
        double n = (int)number % 10;
        int d = (int)(number * 1000 % 10);
        System.out.println(d * 100 + d * 10 + d + n / 10 + n / 100 + n / 1000);
    }

    // 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public void printLengthOfTime(int T) {
        int hours = T / 60 / 60;
        int minutes = (T - hours * 60 * 60) / 60;
        int seconds = T - hours * 60 * 60 - minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с.");
    }

    // 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    //принадлежит закрашенной области, и false — в противном случае:
    public void printWhetherPointBelongsToArea(double x, double y) {
        if ((y >= -3 && y <= 0 && x >= -4 && x <= 4) ||
                (y > 0 && y <= 4 && x >= -2 && x <= 2)) {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
