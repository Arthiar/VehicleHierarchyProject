package vehicles;

public class BEV extends Vehicle {
    public BEV(String model, int speed, Manufacture manufacture, ElectricEngine engine) {
        super(model, speed, manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV Model: " + getModel() + ", Speed: " + getSpeed() + " km/h, Manufacture: " + getManufacture().getName());
        getEngine().showCharacteristics();
    }
}
