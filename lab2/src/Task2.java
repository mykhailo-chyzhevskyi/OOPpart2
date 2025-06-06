import java.util.Scanner;

public class Task2 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть координати x і y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Точка в I квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка в II квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в III квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в IV квадранті.");
        } else {
            System.out.println("Точка лежить на осі.");
        }
    }
}