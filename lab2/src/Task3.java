import java.util.Scanner;

public class Task3 {
    public static void solve() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть число: ");
            int num = scanner.nextInt();

            // Перевірка на двозначність
            if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
                System.out.println("Число двозначне.");
            } else {
                System.out.println("Число не є двозначним.");
            }

            // Перевірка на парність
            if (num % 2 == 0) {
                System.out.println("Число парне.");
            } else {
                System.out.println("Число непарне.");
            }
        }
    }
}
