public class Task3 {
    public static void run() {
        System.out.println("Завдання 3");
        int h = 0;
        while (h <= 2) {
            int m = 0;
            while (m <= 59) {
                System.out.println(h + "h " + m + "min");
                m++;
            }
            h++;
        }
    }
}
