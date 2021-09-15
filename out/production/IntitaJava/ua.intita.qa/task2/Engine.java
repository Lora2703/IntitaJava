package task2;

public class Engine {
    private String producer;
    private double volume;
    private String fuel;

    public Engine(String producer, double volume, String fuel) {
        this.producer = producer;
        this.volume = volume;
        this.fuel = fuel;
    }

    public void startEngine() {
        System.out.println("The engine was started");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "producer='" + producer + '\'' +
                ", volume=" + volume +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
