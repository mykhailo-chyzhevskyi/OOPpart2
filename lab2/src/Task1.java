import java.util.Scanner;

public class Task1 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть коефіцієнти a, b, c для квадратного рівняння ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Безліч рішень." : "Рішень немає.");
            } else {
                double x = -c / b;
                System.out.println("Лінійне рівняння, корінь: " + x);
            }
            return;
        }

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Розв’язки: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Єдиний розв’язок: x = " + x);
        } else {
            System.out.println("Розв’язків немає (D < 0)");
        }
    }
}