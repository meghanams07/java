class UPS {

    String brand;
    String model;
    int capacity;
    String type;
    double price;
    int backupTime;
    boolean inverterCompatible;
    int outputPorts;
    double weight;
    boolean lcdDisplay;
    boolean surgeProtection;
    boolean portable;

    UPS(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    UPS(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    UPS(String brand, String model, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    UPS(String brand, String model, int capacity, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    UPS(String brand, String model, int capacity, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime){
        this.backupTime = backupTime;
        System.out.println("Backup Time : " + backupTime);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime, boolean inverterCompatible){
        this.inverterCompatible = inverterCompatible;
        System.out.println("Inverter Compatible : " + inverterCompatible);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime, boolean inverterCompatible, int outputPorts){
        this.outputPorts = outputPorts;
        System.out.println("Output Ports : " + outputPorts);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime, boolean inverterCompatible, int outputPorts, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime, boolean inverterCompatible, int outputPorts, double weight, boolean lcdDisplay){
        this.lcdDisplay = lcdDisplay;
        System.out.println("LCD Display : " + lcdDisplay);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime, boolean inverterCompatible, int outputPorts, double weight, boolean lcdDisplay, boolean surgeProtection){
        this.surgeProtection = surgeProtection;
        System.out.println("Surge Protection : " + surgeProtection);
    }

    UPS(String brand, String model, int capacity, String type, double price, int backupTime, boolean inverterCompatible, int outputPorts, double weight, boolean lcdDisplay, boolean surgeProtection, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}