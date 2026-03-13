class GraphicsCard {

    String brand;
    String model;
    int memory;
    String type;
    double price;
    int coreClock;
    int boostClock;
    String interfaceType;
    double weight;
    boolean rayTracing;
    boolean rgb;
    boolean overclocked;

    GraphicsCard(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    GraphicsCard(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    GraphicsCard(String brand, String model, int memory){
        this.memory = memory;
        System.out.println("Memory : " + memory);
    }

    GraphicsCard(String brand, String model, int memory, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock){
        this.coreClock = coreClock;
        System.out.println("Core Clock : " + coreClock);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock, int boostClock){
        this.boostClock = boostClock;
        System.out.println("Boost Clock : " + boostClock);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock, int boostClock, String interfaceType){
        this.interfaceType = interfaceType;
        System.out.println("Interface : " + interfaceType);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock, int boostClock, String interfaceType, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock, int boostClock, String interfaceType, double weight, boolean rayTracing){
        this.rayTracing = rayTracing;
        System.out.println("Ray Tracing : " + rayTracing);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock, int boostClock, String interfaceType, double weight, boolean rayTracing, boolean rgb){
        this.rgb = rgb;
        System.out.println("RGB : " + rgb);
    }

    GraphicsCard(String brand, String model, int memory, String type, double price, int coreClock, int boostClock, String interfaceType, double weight, boolean rayTracing, boolean rgb, boolean overclocked){
        this.overclocked = overclocked;
        System.out.println("Overclocked : " + overclocked);
    }
}