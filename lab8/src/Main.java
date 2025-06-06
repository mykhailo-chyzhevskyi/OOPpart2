import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Використання: java Main <ім'я_файлу> <нижня_межа> <верхня_межа>");
            return;
        }

        String fileName = args[0];
        int lowerBound = Integer.parseInt(args[1]);
        int upperBound = Integer.parseInt(args[2]);

        if (lowerBound > upperBound) {
            System.out.println("Помилка: нижня межа більша за верхню.");
            return;
        }

        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("Файл не існував — створено новий: " + fileName);
            }

            // Запис випадкових чисел у файл
            try (FileWriter writer = new FileWriter(file)) {
                Random rand = new Random();
                for (int i = 0; i < 20; i++) {
                    int num = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    writer.write(num + " ");
                }
            }

            System.out.println("Числа успішно записані у файл.");

            // Зчитування та вивід вмісту файлу
            System.out.println("Вміст файлу:");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Сталася помилка при роботі з файлом: " + e.getMessage());
        }
    }
}
