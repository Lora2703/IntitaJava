package duke.choise;

import java.util.Arrays;


public class ShopApp {
    public static void main(String[] args) {

        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Welcome to our shop " + c1.getName());
        System.out.println("MINIMUM PRICE " + Clothing.MINIMUM_PRICE);
        System.out.println("TAX_RATE " + Clothing.TAX_RATE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Short", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"),
                new Clothing("Blue T-Short", 10.5, "S")};

        System.out.println("Min price: " + Clothing.MINIMUM_PRICE);

        c1.addItems(items);
        int measurement = 3;
        c1.setSize(measurement);

        for (Clothing item : items) {
            System.out.println(item.toString());
        }
        System.out.println("After sorting:");
        Arrays.sort(items);
        for (Clothing item : items) {
            System.out.println(item.toString());
        }
        System.out.println("Total: " + c1.getTotalClothingCoast());

        int total = 0;
        int count = 0;
        for (Clothing item : items) {
            if(item.getSize().equals("L")) {
                total += item.getPrice();
                count++;
            }
        }
        try {
            double average = total / count;
            System.out.println("Average price: " + average);
        } catch (ArithmeticException e){
            System.out.println("Error! Dividing by ZERO!!!");
        } finally {
            System.out.println("FINAL");
        }

        System.out.println("BYE");
    }
}
