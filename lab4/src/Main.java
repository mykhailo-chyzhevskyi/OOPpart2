import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть номер завдання (1-4):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Task1.fillEvenAndOddArrays();
                break;
            case 2:
                Task2.processArray();
                break;
            case 3:
                Task3.calculateSum();
                break;
            case 4:
                Task4.changeOddSigns();
                break;
            default:
                System.out.println("Неправильний вибір. Введіть число від 1 до 4.");
        }
    }
}