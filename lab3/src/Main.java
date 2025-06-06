import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер завдання (1–6):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Task1.run();
                break;
            case 2:
                Task2.run();
                break;
            case 3:
                Task3.run();
                break;
            case 4:
                Task4.run();
                break;
            case 5:
                Task5For.run();
                break;
            case 6:
                Task5While.run();
                break;
            default:
                System.out.println("Невірний номер завдання.");
        }
    }
}
