class Television {

    String brand;
    String model;
    double price;
    String color;
    double screenSize;
    String displayType;
    boolean smartTV;
    boolean wifi;
    int refreshRate;
    double weight;
    boolean bluetooth;
    boolean voiceControl;

    Television(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Television(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Television(String brand, String model, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Television(String brand, String model, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Television(String brand, String model, double price, String color, double screenSize){
        this.screenSize = screenSize;
        System.out.println("Screen Size : " + screenSize);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType){
        this.displayType = displayType;
        System.out.println("Display Type : " + displayType);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType, boolean smartTV){
        this.smartTV = smartTV;
        System.out.println("Smart TV : " + smartTV);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType, boolean smartTV, boolean wifi){
        this.wifi = wifi;
        System.out.println("WiFi : " + wifi);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType, boolean smartTV, boolean wifi, int refreshRate){
        this.refreshRate = refreshRate;
        System.out.println("Refresh Rate : " + refreshRate);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType, boolean smartTV, boolean wifi, int refreshRate, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType, boolean smartTV, boolean wifi, int refreshRate, double weight, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Television(String brand, String model, double price, String color, double screenSize, String displayType, boolean smartTV, boolean wifi, int refreshRate, double weight, boolean bluetooth, boolean voiceControl){
        this.voiceControl = voiceControl;
        System.out.println("Voice Control : " + voiceControl);
    }
}