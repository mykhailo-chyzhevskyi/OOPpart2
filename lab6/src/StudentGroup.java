import java.util.Scanner;

public class StudentGroup {
    // Поля класу
    private String groupName;
    private int totalStudents;
    private int maleStudents;
    private int femaleStudents;

    // Метод введення даних
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву групи: ");
        groupName = scanner.nextLine();

        System.out.print("Введіть загальну кількість студентів: ");
        totalStudents = scanner.nextInt();

        System.out.print("Введіть кількість чоловіків: ");
        maleStudents = scanner.nextInt();

        System.out.print("Введіть кількість жінок: ");
        femaleStudents = scanner.nextInt();

        if (maleStudents + femaleStudents != totalStudents) {
            System.out.println("Помилка: сума чоловіків і жінок не дорівнює загальній кількості студентів.");
        }
    }

    // Метод виведення даних
    public void displayData() {
        System.out.println("\nІнформація про групу:");
        System.out.println("Назва групи: " + groupName);
        System.out.println("Загальна кількість студентів: " + totalStudents);
        System.out.println("Кількість чоловіків: " + maleStudents);
        System.out.println("Кількість жінок: " + femaleStudents);
    }

    // Метод обчислення відсотків
    public void calculatePercentages() {
        if (totalStudents == 0) {
            System.out.println("Неможливо обчислити відсотки – кількість студентів дорівнює нулю.");
            return;
        }

        double malePercent = (maleStudents * 100.0) / totalStudents;
        double femalePercent = (femaleStudents * 100.0) / totalStudents;

        System.out.printf("Відсоток чоловіків: %.2f%%\n", malePercent);
        System.out.printf("Відсоток жінок: %.2f%%\n", femalePercent);
    }

    // Головний метод
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();

        group.inputData();
        group.displayData();
        group.calculatePercentages();
    }
}
