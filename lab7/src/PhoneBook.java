import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        int choice;
        do {
            System.out.println("\nМеню:");
            System.out.println("1. Додати запис у телефонну книгу");
            System.out.println("2. Знайти номер за прізвищем");
            System.out.println("3. Видалити запис з телефонної книги");
            System.out.println("4. Вивести всі записи телефонної книги");
            System.out.println("5. Показати кількість записів у книзі");
            System.out.println("6. Вийти");

            System.out.println("Оберіть опцію:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введіть прізвище:");
                    String lastName = scanner.next();
                    System.out.println("Введіть номер телефону:");
                    String phoneNumber = scanner.next();
                    phoneBook.put(lastName, phoneNumber);
                    break;
                case 2:
                    System.out.println("Введіть прізвище для пошуку:");
                    String searchName = scanner.next();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Номер телефону для " + searchName + ": " + phoneBook.get(searchName));
                    } else {
                        System.out.println("У книзі відсутній такий абонент.");
                    }
                    break;
                case 3:
                    System.out.println("Введіть прізвище для видалення:");
                    String deleteName = scanner.next();
                    if (phoneBook.containsKey(deleteName)) {
                        phoneBook.remove(deleteName);
                        System.out.println("Запис для " + deleteName + " був успішно видалений.");
                    } else {
                        System.out.println("У книзі відсутній такий абонент.");
                    }
                    break;
                case 4:
                    System.out.println("Телефонна книга:");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Кількість записів у книзі: " + phoneBook.size());
                    break;
                case 6:
                    System.out.println("Програма завершила роботу.");
                    break;
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
