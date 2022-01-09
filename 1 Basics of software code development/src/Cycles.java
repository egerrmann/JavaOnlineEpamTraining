import java.util.Scanner;

public class Cycles {
    // 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа.
    public int getSumOfAllPreviousNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Вычислить значения функции на отрезке [а,b] c шагом h:
    public void printFunctionValues(double a, double b, double h) {
        for (double x = a; x <= b; x += h) {
            if (x > 2)
                System.out.println("y = " + x + ", x = " + x);
            else
                System.out.println("y = " + -x + ", x = " + x);
        }
    }

    // 3. Найти сумму квадратов первых ста чисел.
    public int getSumOfSquaresOf100Numbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    // 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
    public long getProductOfSquaresOfFirst200Numbers() {
        long prod = 1;
        for (int i = 1; i <= 200; i++) {
            prod *= i * i;
            if (prod >= Long.MAX_VALUE) {
                System.out.println("The number is too big");
                break;
            }
        }
        return prod;
    }

    // 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид:
    public double getSumOfSeries(double e) {
        double sum = 0;
        for (int i = 0; 1 / Math.pow(2, i) + 1 / Math.pow(3, i) >= e; i++) {
            sum += 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        }
        return sum;
    }

    // 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public void printCharsNumbers() {
        for (int i = 0; i < 150; i++) {
            char character = (char) i;
            System.out.println(i + "\t" + character);
        }
    }

    // 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры.
    public void printDividersOfAllNumbersFromRange() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert m and n:");

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    // 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public void printCommonNumbers(int firstNumber, int secondNumber) {
        String num1 = String.valueOf(firstNumber);
        String num2 = String.valueOf(secondNumber);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                if (num1.charAt(i) == num2.charAt(j) && !result.toString().contains(String.valueOf(num1.charAt(i))))
                    result.append(num1.charAt(i)).append(" ");
            }
        }
        System.out.println(result);
    }
}
