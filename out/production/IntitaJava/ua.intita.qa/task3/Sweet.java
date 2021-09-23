package task3;

public class Sweet implements Comparable<Sweet> {
    protected String name;
    protected double weight;
    protected double sugar;

    protected Sweet (String name, double weight, double sugar){
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
    }

    @Override
    public int compareTo(Sweet anotherSweet) {
        return this.getName().compareTo(anotherSweet.getName());
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugar=" + sugar +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getSugar() {
        return sugar;
    }
}







