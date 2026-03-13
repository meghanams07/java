class Motherboard {

    String brand;
    String model;
    String chipset;
    String socketType;
    int ramSlots;
    int maxRam;
    double price;
    String formFactor;
    boolean wifi;
    boolean bluetooth;
    double weight;
    boolean rgb;

    Motherboard(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Motherboard(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Motherboard(String brand, String model, String chipset){
        this.chipset = chipset;
        System.out.println("Chipset : " + chipset);
    }

    Motherboard(String brand, String model, String chipset, String socketType){
        this.socketType = socketType;
        System.out.println("Socket Type : " + socketType);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots){
        this.ramSlots = ramSlots;
        System.out.println("RAM Slots : " + ramSlots);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam){
        this.maxRam = maxRam;
        System.out.println("Max RAM : " + maxRam);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam, double price, String formFactor){
        this.formFactor = formFactor;
        System.out.println("Form Factor : " + formFactor);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam, double price, String formFactor, boolean wifi){
        this.wifi = wifi;
        System.out.println("WiFi : " + wifi);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam, double price, String formFactor, boolean wifi, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam, double price, String formFactor, boolean wifi, boolean bluetooth, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Motherboard(String brand, String model, String chipset, String socketType, int ramSlots, int maxRam, double price, String formFactor, boolean wifi, boolean bluetooth, double weight, boolean rgb){
        this.rgb = rgb;
        System.out.println("RGB : " + rgb);
    }
}