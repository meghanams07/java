class Laptop {

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
    boolean backlitKeyboard;

    Laptop(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Laptop(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Laptop(String brand, String model, int ram){
        this.ram = ram;
        System.out.println("RAM : " + ram);
    }

    Laptop(String brand, String model, int ram, int storage){
        this.storage = storage;
        System.out.println("Storage : " + storage);
    }

    Laptop(String brand, String model, int ram, int storage, String processor){
        this.processor = processor;
        System.out.println("Processor : " + processor);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize){
        this.screenSize = screenSize;
        System.out.println("Screen Size : " + screenSize);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery){
        this.battery = battery;
        System.out.println("Battery : " + battery);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os){
        this.os = os;
        System.out.println("OS : " + os);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight, boolean fingerprint){
        this.fingerprint = fingerprint;
        System.out.println("Fingerprint : " + fingerprint);
    }

    Laptop(String brand, String model, int ram, int storage, String processor, double price, String color, double screenSize, int battery, String os, double weight, boolean fingerprint, boolean backlitKeyboard){
        this.backlitKeyboard = backlitKeyboard;
        System.out.println("Backlit Keyboard : " + backlitKeyboard);
    }
}