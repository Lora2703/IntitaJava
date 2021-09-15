package task2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Mitsubisi", 2.0, "gasoline");
        Wheel wheel = new Wheel("Micheline", 16.0, "spring");
        Car car = new Car("Mitsubishi", 2019, engine, wheel, wheel, wheel, wheel);

        System.out.println(car.getName());

        car.drive(engine);
        wheel.changeWheel();
        car.refuel();
    }
}
