class RAM {

    String brand;
    String model;
    int capacity;
    String type;
    int speed;
    double price;
    int latency;
    boolean rgb;
    String formFactor;
    double voltage;
    boolean heatSpreader;
    boolean overclockable;

    RAM(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    RAM(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    RAM(String brand, String model, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    RAM(String brand, String model, int capacity, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    RAM(String brand, String model, int capacity, String type, int speed){
        this.speed = speed;
        System.out.println("Speed : " + speed);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price, int latency){
        this.latency = latency;
        System.out.println("Latency : " + latency);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price, int latency, boolean rgb){
        this.rgb = rgb;
        System.out.println("RGB : " + rgb);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price, int latency, boolean rgb, String formFactor){
        this.formFactor = formFactor;
        System.out.println("Form Factor : " + formFactor);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price, int latency, boolean rgb, String formFactor, double voltage){
        this.voltage = voltage;
        System.out.println("Voltage : " + voltage);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price, int latency, boolean rgb, String formFactor, double voltage, boolean heatSpreader){
        this.heatSpreader = heatSpreader;
        System.out.println("Heat Spreader : " + heatSpreader);
    }

    RAM(String brand, String model, int capacity, String type, int speed, double price, int latency, boolean rgb, String formFactor, double voltage, boolean heatSpreader, boolean overclockable){
        this.overclockable = overclockable;
        System.out.println("Overclockable : " + overclockable);
    }
}