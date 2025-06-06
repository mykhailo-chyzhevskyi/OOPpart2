import java.util.Scanner;

// Абстрактний клас Car
abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println(model + " (" + color + ") газує! Максимальна швидкість: " + maxSpeed + " км/год");
    }

    public abstract void brake();

    public void showInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Колір: " + color);
        System.out.println("Максимальна швидкість: " + maxSpeed + " км/год");
    }
}

// Похідний клас Седан
class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Седан " + model + " гальмує плавно.");
    }
}

// Похідний клас Грузовик
class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Грузовик " + model + " гальмує повільно.");
    }
}

// Основний клас
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = null;

        while (true) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Створити Седан");
            System.out.println("2. Створити Грузовик");
            System.out.println("3. Газувати");
            System.out.println("4. Гальмувати");
            System.out.println("5. Показати інформацію про авто");
            System.out.println("6. Вийти");
            System.out.print("Оберіть опцію: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Введіть модель седана: ");
                    String sedanModel = scanner.nextLine();
                    System.out.print("Введіть колір седана: ");
                    String sedanColor = scanner.nextLine();
                    System.out.print("Введіть максимальну швидкість седана: ");
                    int sedanSpeed = Integer.parseInt(scanner.nextLine());
                    car = new Sedan(sedanModel, sedanColor, sedanSpeed);
                    System.out.println("Седан створено.");
                    break;

                case "2":
                    System.out.print("Введіть модель грузовика: ");
                    String truckModel = scanner.nextLine();
                    System.out.print("Введіть колір грузовика: ");
                    String truckColor = scanner.nextLine();
                    System.out.print("Введіть максимальну швидкість грузовика: ");
                    int truckSpeed = Integer.parseInt(scanner.nextLine());
                    car = new Truck(truckModel, truckColor, truckSpeed);
                    System.out.println("Грузовик створено.");
                    break;

                case "3":
                    if (car != null) car.gas();
                    else System.out.println("Спочатку створіть автомобіль.");
                    break;

                case "4":
                    if (car != null) car.brake();
                    else System.out.println("Спочатку створіть автомобіль.");
                    break;

                case "5":
                    if (car != null) car.showInfo();
                    else System.out.println("Автомобіль ще не створено.");
                    break;

                case "6":
                    System.out.println(" Програма завершила роботу.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }
}
