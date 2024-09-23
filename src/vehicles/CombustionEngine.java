package vehicles;

public class CombustionEngine extends Engine {
    private String fuelType;

    public CombustionEngine(String type, int power, String fuelType) {
        super(type, power);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Combustion Engine: Type = " + getType() + ", Power = " + getPower() + " kW, Fuel Type = " + fuelType);
    }
}
