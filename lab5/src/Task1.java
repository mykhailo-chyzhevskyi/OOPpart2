import java.util.Scanner;

public class Task1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть радіус кола: ");
        double radius = scanner.nextDouble();
        double area = calculateCircleArea(radius);
        System.out.println("Площа кола: " + area);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
