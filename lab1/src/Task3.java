public class Task3 {
    static class User {
        int id;
        int age;
        String name;
        String surname;
        double weight;
        double height;

        User(int id, int age, String name, String surname, double weight, double height) {
            this.id = id;
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.weight = weight;
            this.height = height;
        }
    }

    public static void execute() {
        User[] users = {
                new User(1, 20, "Ivan", "Petrov", 70.5, 1.75),
                new User(2, 22, "Olga", "Ivanova", 65.3, 1.68),
                new User(3, 25, "Sergey", "Sidorov", 80.0, 1.80),
                new User(4, 19, "Anna", "Kovalenko", 55.2, 1.60),
                new User(5, 30, "Pavlo", "Shevchenko", 90.1, 1.90),
                new User(6, 27, "Natalia", "Bondar", 60.0, 1.65),
                new User(7, 24, "Maksym", "Tkachenko", 77.5, 1.85),
                new User(8, 21, "Daria", "Melnyk", 58.0, 1.70),
                new User(9, 23, "Andrii", "Boyko", 72.4, 1.78),
                new User(10, 26, "Yulia", "Marchenko", 68.9, 1.72)
        };

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;
        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.println("Сума віку: " + totalAge);
        System.out.println("Сума ваги: " + totalWeight);
        System.out.println("Сума зросту: " + totalHeight);
    }
}
