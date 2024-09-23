package vehicles;

public class ICEV extends Vehicle {
    public ICEV(String model, int speed, Manufacture manufacture, CombustionEngine engine) {
        super(model, speed, manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICEV Model: " + getModel() + ", Speed: " + getSpeed() + " km/h, Manufacture: " + getManufacture().getName());
        getEngine().showCharacteristics();
    }
}
