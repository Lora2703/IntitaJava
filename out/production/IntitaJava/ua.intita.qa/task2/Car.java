package task2;

public class Car {
    private String name;
    private int year;
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;

    public Car(String name, int year, Engine engine, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
        this.name = name;
        this.year = year;
        this.engine = engine;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", wheel1=" + wheel1 +
                ", wheel2=" + wheel2 +
                ", wheel3=" + wheel3 +
                ", wheel4=" + wheel4 +
                '}';
    }

    public void drive(Engine engine) {
        engine.startEngine();
        System.out.println("The car is driving");
    }

    public void refuel() {
        System.out.println("The car was refueled");
    }


}
