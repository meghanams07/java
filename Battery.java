class Battery {

    String brand;
    String model;
    int capacity;
    String type;
    double voltage;
    double price;
    boolean rechargeable;
    int lifeCycles;
    double weight;
    boolean fastCharge;
    boolean portable;
    boolean ecoFriendly;

    Battery(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Battery(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Battery(String brand, String model, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    Battery(String brand, String model, int capacity, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Battery(String brand, String model, int capacity, String type, double voltage){
        this.voltage = voltage;
        System.out.println("Voltage : " + voltage);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price, boolean rechargeable){
        this.rechargeable = rechargeable;
        System.out.println("Rechargeable : " + rechargeable);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price, boolean rechargeable, int lifeCycles){
        this.lifeCycles = lifeCycles;
        System.out.println("Life Cycles : " + lifeCycles);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price, boolean rechargeable, int lifeCycles, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price, boolean rechargeable, int lifeCycles, double weight, boolean fastCharge){
        this.fastCharge = fastCharge;
        System.out.println("Fast Charge : " + fastCharge);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price, boolean rechargeable, int lifeCycles, double weight, boolean fastCharge, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }

    Battery(String brand, String model, int capacity, String type, double voltage, double price, boolean rechargeable, int lifeCycles, double weight, boolean fastCharge, boolean portable, boolean ecoFriendly){
        this.ecoFriendly = ecoFriendly;
        System.out.println("Eco Friendly : " + ecoFriendly);
    }
}