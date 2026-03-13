class Charger {

    String brand;
    String model;
    int power;
    String type;
    double price;
    int ports;
    boolean fastCharging;
    boolean wireless;
    String connectorType;
    double weight;
    boolean portable;
    boolean smartProtection;

    Charger(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Charger(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Charger(String brand, String model, int power){
        this.power = power;
        System.out.println("Power : " + power);
    }

    Charger(String brand, String model, int power, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Charger(String brand, String model, int power, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Charger(String brand, String model, int power, String type, double price, int ports){
        this.ports = ports;
        System.out.println("Ports : " + ports);
    }

    Charger(String brand, String model, int power, String type, double price, int ports, boolean fastCharging){
        this.fastCharging = fastCharging;
        System.out.println("Fast Charging : " + fastCharging);
    }

    Charger(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Charger(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean wireless, String connectorType){
        this.connectorType = connectorType;
        System.out.println("Connector Type : " + connectorType);
    }

    Charger(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean wireless, String connectorType, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Charger(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean wireless, String connectorType, double weight, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }

    Charger(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean wireless, String connectorType, double weight, boolean portable, boolean smartProtection){
        this.smartProtection = smartProtection;
        System.out.println("Smart Protection : " + smartProtection);
    }
}