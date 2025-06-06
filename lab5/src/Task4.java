public class Task4 {

    public static void run() {
        int[] array = {10, 25, 3, 99, 46};
        int max = array[0];

        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            }
        }

        System.out.println("\nНайбільше число: " + max);
    }
}
