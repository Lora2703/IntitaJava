package ua.intita.qa;

public class Choice {

    private Product[] products;

    public Choice(Product[] products) {
        this.products = products;
    }

    public void choiceByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public void choiceByName(String name, double price) {
        for (Product product : products) {
            if ((product.getName().equals(name)) & (product.getPrice() <= price)) {
                System.out.println(product);
            }
        }
    }

    public void choiceByShelfLife(int date) {
        for (Product product : products) {
            if (product.getShelfLife() >= date) {
                System.out.println(product);
            }
        }
    }
}
