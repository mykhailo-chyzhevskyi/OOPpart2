import java.util.Scanner;

public class Task5While {
    public static void run() {
        System.out.println("Завдання 5 while");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть нижню межу: ");
        double low = scanner.nextDouble();
        System.out.print("Введіть верхню межу: ");
        double high = scanner.nextDouble();

        double x = 1.0;
        int count = 0;
        while (x <= 3.0) {
            double y = x * x - Math.sin(x);
            System.out.printf("x = %.2f, f(x) = %.4f\n", x, y);
            if (y >= low && y <= high) {
                count++;
            }
            x += 0.1;
        }
        System.out.println("Кількість значень у межах: " + count);
    }
}
