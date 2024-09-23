package vehicles;

public class Main {
    public static void main(String[] args) {
        // Create Manufacture
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");

        // Create Engine Instances
        CombustionEngine combustionEngine = new CombustionEngine("Combustion", 150, "Gasoline");
        ElectricEngine electricEngine = new ElectricEngine("Electric", 200, 75);
        HybridEngine hybridEngine = new HybridEngine("Hybrid", 180, "Petrol", 50);

        // Create Vehicle Instances
        ICEV icev = new ICEV("Corolla", 180, toyota, combustionEngine);
        BEV bev = new BEV("Model S", 250, tesla, electricEngine);
        HybridV hybridV = new HybridV("Prius", 200, toyota, hybridEngine);

        // Display Characteristics
        icev.showCharacteristics();
        bev.showCharacteristics();
        hybridV.showCharacteristics();
    }
}
