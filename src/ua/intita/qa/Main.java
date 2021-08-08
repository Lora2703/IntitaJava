package ua.intita.qa;

public class Main {
    public static void main(String[] args) {
        Product[] products = {new Product(1, "milk", 123456789, "Molokiya", 25.30, 7, 20),
                new Product(2, "bread", 456789123, "Vinnytsiakhlib", 16.20, 5, 30),
                new Product(3, "butter", 789456123, "Bilozgar", 56.40, 90, 15),
                new Product(4, "milk", 123456789, "Halychyna", 24.85, 8, 24),
                new Product(5, "sugar", 456891234, "Haisynsahar", 21.55, 180, 50),
                new Product(6, "milk", 123456789, "Slovianochka", 23.25, 7, 17),
                new Product(7, "butter", 789456123, "Yagotyn", 58.25, 120, 11)};

        Choice choice = new Choice(products);

        String name = "milk";
        System.out.println("Products: " + name);
        choice.choiceByName(name);
        double price = 24;
        System.out.println("Products: " + name + " price>= " + price);
        choice.choiceByName("milk", 23.25);
        int date = 20;
        System.out.println("Products with shelf life >= " + date);
        choice.choiceByShelfLife(date);

    }
}
