public class Task5 {
    public static void execute() {
        int number = 412;
        int reversed = (number % 10) * 100 + (number / 10 % 10) * 10 + (number / 100);

        System.out.println("Реверс числа: " + reversed);
    }
}
