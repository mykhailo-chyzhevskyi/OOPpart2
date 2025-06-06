// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер завдання (1–6):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Task1.solve();
                break;
            case 2:
                Task2.solve();
                break;
            case 3:
                Task3.solve();
                break;
            case 4:
                Task4.solve();
                break;
            case 5:
                Task5.solve();
                break;
            default:
                System.out.println("Невірний номер завдання.");
        }
    }
}
