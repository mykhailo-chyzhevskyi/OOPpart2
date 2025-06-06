import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати автомобіль");
            System.out.println("2. Виконати ремонт та заміну водіїв на половині автопарку");
            System.out.println("3. Підвищити потужність та ціну кожної другої машини");
            System.out.println("4. Перевірити досвід водіїв та відправити на курси");
            System.out.println("5. Вибрати рандомний автомобіль");
            System.out.println("6. Вийти");

            System.out.println("Оберіть опцію:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Додати автомобіль:");
                    System.out.println("Введіть марку автомобіля:");
                    String brand = scanner.next();
                    System.out.println("Введіть потужність двигуна:");
                    int enginePower = scanner.nextInt();
                    System.out.println("Введіть ім'я водія:");
                    String driverName = scanner.next();
                    System.out.println("Введіть вік водія:");
                    int driverAge = scanner.nextInt();
                    System.out.println("Введіть стаж водіння:");
                    int drivingExperience = scanner.nextInt();
                    System.out.println("Введіть ціну:");
                    double price = scanner.nextDouble();
                    System.out.println("Введіть рік випуску:");
                    int yearOfManufacture = scanner.nextInt();

                    Driver driver = new Driver(driverName, driverAge, drivingExperience);
                    Car car = new Car(brand, enginePower, driver, price, yearOfManufacture);
                    cars.add(car);
                    break;
                case 2:
                    if (!cars.isEmpty()) {
                        for (int i = 0; i < cars.size() / 2; i++) {
                            Car currentCar = cars.get(i);
                            currentCar.setEnginePower((int) (currentCar.getEnginePower() * 1.1));
                            currentCar.setDriver(new Driver("New Driver " + (i + 1), 25, 2));
                        }
                        System.out.println("Ремонт та заміна водіїв на половині автопарку виконано.");
                    } else {
                        System.out.println("Автопарк порожній. Додайте спочатку автомобілі.");
                    }
                    break;
                case 3:
                    if (!cars.isEmpty()) {
                        for (int i = 0; i < cars.size(); i += 2) {
                            Car currentCar = cars.get(i);
                            currentCar.setEnginePower((int) (currentCar.getEnginePower() * 1.1));
                            currentCar.setPrice(currentCar.getPrice() * 1.05);
                        }
                        System.out.println("Підвищення потужності та ціни кожної другої машини виконано.");
                    } else {
                        System.out.println("Автопарк порожній. Додайте спочатку автомобілі.");
                    }
                    break;
                case 4:
                    if (!cars.isEmpty()) {
                        for (Car currentCar : cars) {
                            if (currentCar.getDriver().getDrivingExperience() < 5 && currentCar.getDriver().getAge() > 25) {
                                currentCar.getDriver().setDrivingExperience(currentCar.getDriver().getDrivingExperience() + 1);
                            }
                        }
                        System.out.println("Перевірка досвіду водіїв та відправлення на курси виконано.");
                    } else {
                        System.out.println("Автопарк порожній. Додайте спочатку автомобілі.");
                    }
                    break;
                case 5:
                    if (!cars.isEmpty()) {
                        int randomIndex = new Random().nextInt(cars.size());
                        Car randomCar = cars.get(randomIndex);
                        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");
                        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
                    } else {
                        System.out.println("Автопарк порожній. Додайте спочатку автомобілі.");
                    }
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Програма завершила роботу.");
                    System.exit(0);
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }
}

class Driver {
    private final String name;
    private final int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}

class Car {
    private final String brand;
    private int enginePower;
    private Driver driver;
    private double price;

    public Car(String brand, int enginePower, Driver driver, double price, int ignoredYearOfManufacture) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
