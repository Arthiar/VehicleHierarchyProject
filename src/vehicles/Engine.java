package vehicles;

public abstract class Engine {
    private String type;
    private int power;

    // Constructor
    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Abstract method to show characteristics
    public abstract void showCharacteristics();
}
