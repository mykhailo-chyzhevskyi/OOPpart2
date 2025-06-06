import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner selection = new Scanner(System.in);
        System.out.print("Введіть варіант завдання(1-5): ");
        int variant = selection.nextInt();

        switch (variant) {
            case 1:
                Task1.execute();
                break;
            case 2:
                Task2.execute();
                break;
            case 3:
                Task3.execute();
                break;
            case 4:
                Task4.execute();
                break;
            case 5:
                Task5.execute();
                break;
            default:
                System.out.println("Неправильний варіант");
        }
    }
}
