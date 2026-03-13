class Tablet {

    String brand;
    String model;
    int ram;
    int storage;
    String processor;
    double price;
    String color;
    double screenSize;
    int battery;
    String os;
    double weight;
    boolean fingerprint;

    Tablet(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Tablet(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Tablet(String brand, String model, int ram){
        this.ram = ram;
        System.out.println("RAM : " + ram);
    }

    Tablet(String brand, String model, int ram, int storage){
        this.storage = storage;
        System.out.println("Storage : " + storage);
    }

    Tablet(String brand, String model, int ram, int storage, String processor){
        this.processor = processor;
        System.out.println("Processor : " + processor);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize){
        this.screenSize = screenSize;
        System.out.println("Screen Size : " + screenSize);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery){
        this.battery = battery;
        System.out.println("Battery : " + battery);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os){
        this.os = os;
        System.out.println("OS : " + os);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Tablet(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight, boolean fingerprint){
        this.fingerprint = fingerprint;
        System.out.println("Fingerprint : " + fingerprint);
    }
}