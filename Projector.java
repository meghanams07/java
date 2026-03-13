class Projector {

    String brand;
    String model;
    String technology;
    int brightness;
    String resolution;
    double price;
    boolean wireless;
    boolean hdmi;
    int lampLife;
    double weight;
    boolean bluetooth;
    boolean portable;

    Projector(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Projector(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Projector(String brand, String model, String technology){
        this.technology = technology;
        System.out.println("Technology : " + technology);
    }

    Projector(String brand, String model, String technology, int brightness){
        this.brightness = brightness;
        System.out.println("Brightness : " + brightness);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution){
        this.resolution = resolution;
        System.out.println("Resolution : " + resolution);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price, boolean wireless, boolean hdmi){
        this.hdmi = hdmi;
        System.out.println("HDMI : " + hdmi);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price, boolean wireless, boolean hdmi, int lampLife){
        this.lampLife = lampLife;
        System.out.println("Lamp Life : " + lampLife);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price, boolean wireless, boolean hdmi, int lampLife, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price, boolean wireless, boolean hdmi, int lampLife, double weight, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Projector(String brand, String model, String technology, int brightness, String resolution, double price, boolean wireless, boolean hdmi, int lampLife, double weight, boolean bluetooth, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}