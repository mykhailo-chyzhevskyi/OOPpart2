import java.util.Scanner;

public class Task4 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть x для обчислення f(x):");
        double x = scanner.nextDouble();
        double f;

        if (x > 0) {
            f = x * x + 2;
        } else {
            f = x * x - 2;
        }

        System.out.println("f(x) = " + f);
    }
}