class SmartWatch {

    String brand;
    String model;
    double price;
    String color;
    double screenSize;
    int battery;
    String os;
    double weight;
    boolean gps;
    boolean waterproof;
    boolean bluetooth;
    boolean heartRateSensor;

    SmartWatch(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    SmartWatch(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    SmartWatch(String brand, String model, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    SmartWatch(String brand, String model, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize){
        this.screenSize = screenSize;
        System.out.println("Screen Size : " + screenSize);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery){
        this.battery = battery;
        System.out.println("Battery : " + battery);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery, String os){
        this.os = os;
        System.out.println("OS : " + os);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery, String os, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery, String os, double weight, boolean gps){
        this.gps = gps;
        System.out.println("GPS : " + gps);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery, String os, double weight, boolean gps, boolean waterproof){
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery, String os, double weight, boolean gps, boolean waterproof, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    SmartWatch(String brand, String model, double price, String color, double screenSize, int battery, String os, double weight, boolean gps, boolean waterproof, boolean bluetooth, boolean heartRateSensor){
        this.heartRateSensor = heartRateSensor;
        System.out.println("Heart Rate Sensor : " + heartRateSensor);
    }
}