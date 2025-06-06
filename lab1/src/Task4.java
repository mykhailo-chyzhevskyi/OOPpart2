public class Task4 {
    static class Car {
        int horsepower;
        double engineVolume;
        String color;
        String brand;
        String model;
        int year;
        double weight;

        Car(int horsepower, double engineVolume, String color, String brand, String model, int year, double weight) {
            this.horsepower = horsepower;
            this.engineVolume = engineVolume;
            this.color = color;
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.weight = weight;
        }
    }

    public static void execute() {
        Car[] cars = {
                new Car(150, 2.0, "Red", "Toyota", "Camry", 2020, 1500),
                new Car(200, 3.0, "Blue", "BMW", "X5", 2021, 2000),
                new Car(120, 1.6, "Black", "Honda", "Civic", 2019, 1300),
                new Car(180, 2.5, "White", "Ford", "Fusion", 2018, 1600),
                new Car(250, 4.0, "Silver", "Audi", "Q7", 2022, 2200),
                new Car(140, 1.8, "Green", "Mazda", "6", 2017, 1400),
                new Car(170, 2.2, "Yellow", "Opel", "Insignia", 2020, 1550),
                new Car(300, 5.0, "Red", "Mustang", "GT", 2021, 1800),
                new Car(100, 1.4, "Grey", "Hyundai", "i30", 2016, 1200),
                new Car(160, 2.0, "Blue", "Kia", "Sportage", 2019, 1450)
        };

        int totalHorsepower = 0;
        double totalVolume = 0;
        for (Car car : cars) {
            totalHorsepower += car.horsepower;
            totalVolume += car.engineVolume;
        }

        System.out.println("Сума потужностей: " + totalHorsepower);
        System.out.println("Сума об'ємів двигунів: " + totalVolume);
    }
}
