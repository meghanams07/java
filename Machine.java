class Machine {
    int machineId;
    String machineName;
    String machineType;
    String manufacturer;
    String model;
    int power;
    String fuelType;
    String color;
    int weight;
    String material;
    int speed;
    String operationType;
    String coolingSystem;
    int capacity;
    String safety;
    int year;
    String status;
    String category;
    String maintenance;
    String location;

    public Machine(int machineId, String machineName, String machineType, String manufacturer,
                   String model, int power, String fuelType, String color, int weight,
                   String material, int speed, String operationType, String coolingSystem,
                   int capacity, String safety, int year, String status, String category,
                   String maintenance, String location) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.machineType = machineType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.fuelType = fuelType;
        this.color = color;
        this.weight = weight;
        this.material = material;
        this.speed = speed;
        this.operationType = operationType;
        this.coolingSystem = coolingSystem;
        this.capacity = capacity;
        this.safety = safety;
        this.year = year;
        this.status = status;
        this.category = category;
        this.maintenance = maintenance;
        this.location = location;
    }

    public void getMachineDetails() {
        System.out.println("MachineId: " + machineId);
        System.out.println("MachineName: " + machineName);
        System.out.println("MachineType: " + machineType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Power: " + power);
        System.out.println("FuelType: " + fuelType);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Speed: " + speed);
        System.out.println("OperationType: " + operationType);
        System.out.println("CoolingSystem: " + coolingSystem);
        System.out.println("Capacity: " + capacity);
        System.out.println("Safety: " + safety);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
        System.out.println("Category: " + category);
        System.out.println("Maintenance: " + maintenance);
        System.out.println("Location: " + location);
    }
}