class Mobile {

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

    Mobile(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Mobile(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Mobile(String brand, String model, int ram){
        this.ram = ram;
        System.out.println("RAM : " + ram);
    }

    Mobile(String brand, String model, int ram, int storage){
        this.storage = storage;
        System.out.println("Storage : " + storage);
    }

    Mobile(String brand, String model, int ram, int storage, String processor){
        this.processor = processor;
        System.out.println("Processor : " + processor);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize){
        this.screenSize = screenSize;
        System.out.println("Screen Size : " + screenSize);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery){
        this.battery = battery;
        System.out.println("Battery : " + battery);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os){
        this.os = os;
        System.out.println("OS : " + os);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Mobile(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight, boolean fingerprint){
        this.fingerprint = fingerprint;
        System.out.println("Fingerprint : " + fingerprint);
    }
}