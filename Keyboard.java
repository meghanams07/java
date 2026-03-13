class Keyboard {

    String brand;
    String model;
    String type;
    String color;
    double price;
    boolean wireless;
    boolean rgb;
    int keys;
    String switchType;
    double weight;
    boolean bluetooth;
    boolean rechargeable;

    Keyboard(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Keyboard(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Keyboard(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Keyboard(String brand, String model, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Keyboard(String brand, String model, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless, boolean rgb){
        this.rgb = rgb;
        System.out.println("RGB : " + rgb);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless, boolean rgb, int keys){
        this.keys = keys;
        System.out.println("Keys : " + keys);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless, boolean rgb, int keys, String switchType){
        this.switchType = switchType;
        System.out.println("Switch Type : " + switchType);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless, boolean rgb, int keys, String switchType, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless, boolean rgb, int keys, String switchType, double weight, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Keyboard(String brand, String model, String type, String color, double price, boolean wireless, boolean rgb, int keys, String switchType, double weight, boolean bluetooth, boolean rechargeable){
        this.rechargeable = rechargeable;
        System.out.println("Rechargeable : " + rechargeable);
    }
}