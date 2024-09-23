package vehicles;

public class HybridEngine extends Engine {
    private String fuelType;
    private int batteryCapacity;

    public HybridEngine(String type, int power, String fuelType, int batteryCapacity) {
        super(type, power);
        this.fuelType = fuelType;
        this.batteryCapacity = batteryCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Hybrid Engine: Type = " + getType() + ", Power = " + getPower() + " kW, Fuel Type = " + fuelType + ", Battery Capacity = " + batteryCapacity + " kWh");
    }
}
