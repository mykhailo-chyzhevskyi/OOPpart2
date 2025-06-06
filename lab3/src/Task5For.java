import java.util.Scanner;

public class Task5For {
    public static void run() {
        System.out.println("Завдання 5 for");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть нижню межу: ");
        double low = scanner.nextDouble();
        System.out.print("Введіть верхню межу: ");
        double high = scanner.nextDouble();

        int count = 0;
        for (double x = 1.0; x <= 3.0; x += 0.1) {
            double y = x * x - Math.sin(x);
            System.out.printf("x = %.2f, f(x) = %.4f\n", x, y);
            if (y >= low && y <= high) {
                count++;
            }
        }
        System.out.println("Кількість значень у межах: " + count);
    }
}
