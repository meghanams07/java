class Hardware {
    int hardwareId;
    String hardwareName;
    String type;
    String manufacturer;
    String model;
    String version;
    String compatibility;
    int powerUsage;
    String connectionType;
    String color;
    int weight;
    String material;
    String warranty;
    int year;
    String status;
    String category;
    String chipset;
    String coolingType;
    int speed;
    String portType;

    public Hardware(int hardwareId, String hardwareName, String type, String manufacturer,
                    String model, String version, String compatibility, int powerUsage,
                    String connectionType, String color, int weight, String material,
                    String warranty, int year, String status, String category,
                    String chipset, String coolingType, int speed, String portType) {
        this.hardwareId = hardwareId;
        this.hardwareName = hardwareName;
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.version = version;
        this.compatibility = compatibility;
        this.powerUsage = powerUsage;
        this.connectionType = connectionType;
        this.color = color;
        this.weight = weight;
        this.material = material;
        this.warranty = warranty;
        this.year = year;
        this.status = status;
        this.category = category;
        this.chipset = chipset;
        this.coolingType = coolingType;
        this.speed = speed;
        this.portType = portType;
    }

    public void displayDetails() {
        System.out.println("HardwareId: " + hardwareId);
        System.out.println("HardwareName: " + hardwareName);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Version: " + version);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("PowerUsage: " + powerUsage);
        System.out.println("ConnectionType: " + connectionType);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Warranty: " + warranty);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
        System.out.println("Category: " + category);
        System.out.println("Chipset: " + chipset);
        System.out.println("CoolingType: " + coolingType);
        System.out.println("Speed: " + speed);
        System.out.println("PortType: " + portType);
    }
}