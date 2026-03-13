class HardDisk {

    String brand;
    String model;
    int capacity;
    String type;
    double price;
    String interfaceType;
    int rpm;
    int cache;
    double weight;
    boolean portable;
    boolean external;
    boolean shockResistant;

    HardDisk(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    HardDisk(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    HardDisk(String brand, String model, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    HardDisk(String brand, String model, int capacity, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    HardDisk(String brand, String model, int capacity, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType){
        this.interfaceType = interfaceType;
        System.out.println("Interface : " + interfaceType);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType, int rpm){
        this.rpm = rpm;
        System.out.println("RPM : " + rpm);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType, int rpm, int cache){
        this.cache = cache;
        System.out.println("Cache : " + cache);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType, int rpm, int cache, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType, int rpm, int cache, double weight, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType, int rpm, int cache, double weight, boolean portable, boolean external){
        this.external = external;
        System.out.println("External : " + external);
    }

    HardDisk(String brand, String model, int capacity, String type, double price, String interfaceType, int rpm, int cache, double weight, boolean portable, boolean external, boolean shockResistant){
        this.shockResistant = shockResistant;
        System.out.println("Shock Resistant : " + shockResistant);
    }
}