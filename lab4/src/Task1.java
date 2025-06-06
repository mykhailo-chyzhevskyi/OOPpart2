public class Task1 {
    public static void fillEvenAndOddArrays() {
        int[] evenArray = new int[50];
        int[] oddArray = new int[50];

        for (int i = 0; i < 50; i++) {
            evenArray[i] = 2 * i;
            oddArray[i] = 2 * i + 1;
        }

        System.out.println("Парні числа:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nНе парні числа:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}