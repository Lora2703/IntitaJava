package task2;

public class Wheel {
    private String name;
    private double size;
    private String type;

    public Wheel(String name, double size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public void changeWheel() {
        System.out.println("The wheel is changed");
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
