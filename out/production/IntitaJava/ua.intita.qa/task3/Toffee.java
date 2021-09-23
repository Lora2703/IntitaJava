package task3;

public class Toffee extends Sweet {
    public String kindOfToffee;

    public Toffee(String name, double weight, double sugar, String kindOfToffee) {
        super(name, weight, sugar);
        this.kindOfToffee = kindOfToffee;
    }
}