class SmartLight {

    String brand;
    String model;
    int brightness;
    String colorType;
    double price;
    boolean wifi;
    boolean bluetooth;
    boolean voiceControl;
    int power;
    double weight;
    boolean dimmable;
    boolean portable;

    SmartLight(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    SmartLight(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    SmartLight(String brand, String model, int brightness){
        this.brightness = brightness;
        System.out.println("Brightness : " + brightness);
    }

    SmartLight(String brand, String model, int brightness, String colorType){
        this.colorType = colorType;
        System.out.println("Color Type : " + colorType);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi){
        this.wifi = wifi;
        System.out.println("WiFi : " + wifi);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi, boolean bluetooth, boolean voiceControl){
        this.voiceControl = voiceControl;
        System.out.println("Voice Control : " + voiceControl);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi, boolean bluetooth, boolean voiceControl, int power){
        this.power = power;
        System.out.println("Power : " + power);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi, boolean bluetooth, boolean voiceControl, int power, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi, boolean bluetooth, boolean voiceControl, int power, double weight, boolean dimmable){
        this.dimmable = dimmable;
        System.out.println("Dimmable : " + dimmable);
    }

    SmartLight(String brand, String model, int brightness, String colorType, double price, boolean wifi, boolean bluetooth, boolean voiceControl, int power, double weight, boolean dimmable, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}