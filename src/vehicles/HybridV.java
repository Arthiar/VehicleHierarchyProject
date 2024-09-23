package vehicles;

public class HybridV extends Vehicle {
    public HybridV(String model, int speed, Manufacture manufacture, HybridEngine engine) {
        super(model, speed, manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("HybridV Model: " + getModel() + ", Speed: " + getSpeed() + " km/h, Manufacture: " + getManufacture().getName());
        getEngine().showCharacteristics();
    }
}
