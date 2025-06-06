import java.util.Scanner;

public class Task2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть три числа: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double min = findMinimum(a, b, c);
        System.out.println("Найменше число: " + min);
    }

    public double findMinimum(double a, double b, double c) {
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
}
