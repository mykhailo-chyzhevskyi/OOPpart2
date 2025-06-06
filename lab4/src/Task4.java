public class Task4 {
    public static void changeOddSigns() {
        int[] array = {'2, 17, 13, 6, 22, 31, 45, 66, 100, -18'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= -1;
            }
        }

        System.out.println("Після зміни знаку непарних елементів:")
        System.out.println();
    }
}