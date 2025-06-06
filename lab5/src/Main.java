import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть завдання (1-4):");
        int task = scanner.nextInt();

        switch (task) {
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
            default:
                System.out.println("Невірний вибір!");
        }
    }
}