import java.util.Scanner;

public class Task5 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        Double f;

        if (x < -2) {
            f = Math.exp(2 * x);
        } else if (x >= -2 && x <= 5) {
            double tanX = Math.tan(x);
            if (Math.abs(tanX) < 1e-10) {
                System.out.println("Значення не визначене (ctg(x) не існує для tan(x) = 0).");
                return;
            } else {
                f = 1.0 / tanX;
            }
        } else {
            f = Math.pow(x, 4);
        }

        System.out.println("f(x) = " + f);
    }
}
