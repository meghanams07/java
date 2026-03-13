class Speaker {

    String brand;
    String model;
    double price;
    String color;
    int power;
    boolean bluetooth;
    boolean waterproof;
    int battery;
    double weight;
    boolean microphone;
    boolean wifi;
    boolean portable;

    Speaker(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Speaker(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Speaker(String brand, String model, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Speaker(String brand, String model, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Speaker(String brand, String model, double price, String color, int power){
        this.power = power;
        System.out.println("Power : " + power);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth, boolean waterproof){
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth, boolean waterproof, int battery){
        this.battery = battery;
        System.out.println("Battery : " + battery);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth, boolean waterproof, int battery, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth, boolean waterproof, int battery, double weight, boolean microphone){
        this.microphone = microphone;
        System.out.println("Microphone : " + microphone);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth, boolean waterproof, int battery, double weight, boolean microphone, boolean wifi){
        this.wifi = wifi;
        System.out.println("WiFi : " + wifi);
    }

    Speaker(String brand, String model, double price, String color, int power, boolean bluetooth, boolean waterproof, int battery, double weight, boolean microphone, boolean wifi, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}