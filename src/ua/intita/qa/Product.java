package ua.intita.qa;

public class Product {
    int id;
    String name;
    long UPC;
    String producer;
    double price;
    int shelfLife;
    int number;

    public Product(int id, String name, long UPC, String producer, double price, int shelfLife, int number) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.producer = producer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.number = number;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPC=" + UPC +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", bestBefore='" + shelfLife + '\'' +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public long getUPC() {
        return UPC;
    }

    public void setUPC(long UPC) {
        this.UPC = UPC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
