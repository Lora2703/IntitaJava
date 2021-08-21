package duke.choise;

public class Clothing implements Comparable<Clothing> {
    private String description;
    private double price;
    private String size;
    static final double MINIMUM_PRICE = 10;
    static final double TAX_RATE = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (1 + TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price < MINIMUM_PRICE) ? MINIMUM_PRICE : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return  "description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'';
    }

    @Override
    public int compareTo (Clothing anotherClothing) {
     /*   if (this.getDescription().compareTo(anotherClothing.getDescription()) == 0) {
            return 0;
        }
        if (this.getDescription().compareTo(anotherClothing.getDescription()) > 0) {
            return 1;
        }
        else{
            return -1;
        }*/
        return this.getDescription().compareTo(anotherClothing.getDescription());
    }
}
