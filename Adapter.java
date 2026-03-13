class Adapter {

    String brand;
    String model;
    int power;
    String type;
    double price;
    int ports;
    boolean fastCharging;
    boolean universal;
    String connectorType;
    double weight;
    boolean surgeProtection;
    boolean portable;

    Adapter(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Adapter(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Adapter(String brand, String model, int power){
        this.power = power;
        System.out.println("Power : " + power);
    }

    Adapter(String brand, String model, int power, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Adapter(String brand, String model, int power, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports){
        this.ports = ports;
        System.out.println("Ports : " + ports);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports, boolean fastCharging){
        this.fastCharging = fastCharging;
        System.out.println("Fast Charging : " + fastCharging);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean universal){
        this.universal = universal;
        System.out.println("Universal : " + universal);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean universal, String connectorType){
        this.connectorType = connectorType;
        System.out.println("Connector Type : " + connectorType);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean universal, String connectorType, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean universal, String connectorType, double weight, boolean surgeProtection){
        this.surgeProtection = surgeProtection;
        System.out.println("Surge Protection : " + surgeProtection);
    }

    Adapter(String brand, String model, int power, String type, double price, int ports, boolean fastCharging, boolean universal, String connectorType, double weight, boolean surgeProtection, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}