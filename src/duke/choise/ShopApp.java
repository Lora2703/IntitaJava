package duke.choise;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;
        Customer c1 = new Customer("Pinky", 3);
        c1.setSize("S");

        System.out.println("Welcome to our shop " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Short", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"),
                new Clothing("Blue T-Short", 10.5, "S")};

        System.out.println("Min price: " + Clothing.MINIMUM_PRICE);

        c1.addItems(items);
        int measurement = 3;
        c1.setSize(measurement);

        for (Clothing item : items) {
            System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
        }
        System.out.println("Total: " + c1.getTotalClothingCoast());
    }
}
