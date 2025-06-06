public class Task2 {
    public static void processArray() {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("While:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        System.out.println("\nFor:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }

        System.out.println("\nWhile (парні числа):");
        i = 1;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i += 2;
        }

        System.out.println("\nFor (не парні числа):");
        for (int j = 0; j < numbers.length; j += 2) {
            System.out.print(numbers[j] + " ");
        }

        System.out.println("\nреверс:");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
}