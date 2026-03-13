class Headphones {

    String brand;
    String model;
    double price;
    String color;
    String type;
    boolean wireless;
    boolean noiseCancellation;
    int battery;
    boolean bluetooth;
    double weight;
    boolean microphone;
    boolean foldable;

    Headphones(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Headphones(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Headphones(String brand, String model, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Headphones(String brand, String model, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Headphones(String brand, String model, double price, String color, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless, boolean noiseCancellation){
        this.noiseCancellation = noiseCancellation;
        System.out.println("Noise Cancellation : " + noiseCancellation);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless, boolean noiseCancellation, int battery){
        this.battery = battery;
        System.out.println("Battery : " + battery);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless, boolean noiseCancellation, int battery, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless, boolean noiseCancellation, int battery, boolean bluetooth, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless, boolean noiseCancellation, int battery, boolean bluetooth, double weight, boolean microphone){
        this.microphone = microphone;
        System.out.println("Microphone : " + microphone);
    }

    Headphones(String brand, String model, double price, String color, String type, boolean wireless, boolean noiseCancellation, int battery, boolean bluetooth, double weight, boolean microphone, boolean foldable){
        this.foldable = foldable;
        System.out.println("Foldable : " + foldable);
    }
}