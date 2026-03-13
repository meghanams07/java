class Fan {

    String brand;
    String type;
    String color;
    double price;
    int blades;
    int speedLevels;
    boolean remoteControl;
    boolean light;
    double power;
    double weight;
    boolean inverterCompatible;
    boolean silentMode;

    Fan(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Fan(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Fan(String brand, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Fan(String brand, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Fan(String brand, String type, String color, double price, int blades){
        this.blades = blades;
        System.out.println("Blades : " + blades);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels){
        this.speedLevels = speedLevels;
        System.out.println("Speed Levels : " + speedLevels);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels, boolean remoteControl){
        this.remoteControl = remoteControl;
        System.out.println("Remote Control : " + remoteControl);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels, boolean remoteControl, boolean light){
        this.light = light;
        System.out.println("Light : " + light);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels, boolean remoteControl, boolean light, double power){
        this.power = power;
        System.out.println("Power : " + power);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels, boolean remoteControl, boolean light, double power, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels, boolean remoteControl, boolean light, double power, double weight, boolean inverterCompatible){
        this.inverterCompatible = inverterCompatible;
        System.out.println("Inverter Compatible : " + inverterCompatible);
    }

    Fan(String brand, String type, String color, double price, int blades, int speedLevels, boolean remoteControl, boolean light, double power, double weight, boolean inverterCompatible, boolean silentMode){
        this.silentMode = silentMode;
        System.out.println("Silent Mode : " + silentMode);
    }
}