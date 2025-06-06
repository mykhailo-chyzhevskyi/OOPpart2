public class Task3 {
    public static void calculateSum() {
        double[] realNumbers = {2.5, -1.3, 4.0, 6.6, 3.1};
        double sum = 0;
        for (double num : realNumbers) {
            sum += num;
        }
        System.out.println("Сума дійсних елементів: " + sum);
    }
}