package challenges;

public class Car1 {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car1(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    public String startEngine() {
        return "Car -> startEngine() " + getClass().getSimpleName();
    }
    public String accelerate() {
        return "Car -> accelerate() " + getClass().getSimpleName();
    }

    public String brake() {
        return "Car -> brake() " + getClass().getSimpleName();
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
