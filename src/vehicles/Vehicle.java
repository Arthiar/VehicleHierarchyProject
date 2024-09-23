package vehicles;

public abstract class Vehicle {
    private String model;
    private int speed;
    private Manufacture manufacture;
    private Engine engine;

    // Constructor
    public Vehicle(String model, int speed, Manufacture manufacture, Engine engine) {
        this.model = model;
        this.speed = speed;
        this.manufacture = manufacture;
        this.engine = engine;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Abstract method to show characteristics
    public abstract void showCharacteristics();
}
