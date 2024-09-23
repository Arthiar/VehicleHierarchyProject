package vehicles;

public class ElectricEngine extends Engine {
    private int batteryCapacity;

    public ElectricEngine(String type, int power, int batteryCapacity) {
        super(type, power);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Electric Engine: Type = " + getType() + ", Power = " + getPower() + " kW, Battery Capacity = " + batteryCapacity + " kWh");
    }
}
