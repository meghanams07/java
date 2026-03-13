class SSD {

    String brand;
    String model;
    int capacity;
    String type;
    double price;
    String interfaceType;
    int readSpeed;
    int writeSpeed;
    double weight;
    boolean nvme;
    boolean portable;
    boolean encryption;

    SSD(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    SSD(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    SSD(String brand, String model, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    SSD(String brand, String model, int capacity, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    SSD(String brand, String model, int capacity, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType){
        this.interfaceType = interfaceType;
        System.out.println("Interface : " + interfaceType);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType, int readSpeed){
        this.readSpeed = readSpeed;
        System.out.println("Read Speed : " + readSpeed);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType, int readSpeed, int writeSpeed){
        this.writeSpeed = writeSpeed;
        System.out.println("Write Speed : " + writeSpeed);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType, int readSpeed, int writeSpeed, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType, int readSpeed, int writeSpeed, double weight, boolean nvme){
        this.nvme = nvme;
        System.out.println("NVMe : " + nvme);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType, int readSpeed, int writeSpeed, double weight, boolean nvme, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }

    SSD(String brand, String model, int capacity, String type, double price, String interfaceType, int readSpeed, int writeSpeed, double weight, boolean nvme, boolean portable, boolean encryption){
        this.encryption = encryption;
        System.out.println("Encryption : " + encryption);
    }
}