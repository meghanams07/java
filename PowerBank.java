class PowerBank {

    String brand;
    String model;
    int capacity;
    String color;
    double price;
    int outputPorts;
    boolean fastCharging;
    boolean wirelessCharging;
    int inputPower;
    double weight;
    boolean ledIndicator;
    boolean portable;

    PowerBank(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    PowerBank(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    PowerBank(String brand, String model, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    PowerBank(String brand, String model, int capacity, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    PowerBank(String brand, String model, int capacity, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts){
        this.outputPorts = outputPorts;
        System.out.println("Output Ports : " + outputPorts);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts, boolean fastCharging){
        this.fastCharging = fastCharging;
        System.out.println("Fast Charging : " + fastCharging);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts, boolean fastCharging, boolean wirelessCharging){
        this.wirelessCharging = wirelessCharging;
        System.out.println("Wireless Charging : " + wirelessCharging);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts, boolean fastCharging, boolean wirelessCharging, int inputPower){
        this.inputPower = inputPower;
        System.out.println("Input Power : " + inputPower);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts, boolean fastCharging, boolean wirelessCharging, int inputPower, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts, boolean fastCharging, boolean wirelessCharging, int inputPower, double weight, boolean ledIndicator){
        this.ledIndicator = ledIndicator;
        System.out.println("LED Indicator : " + ledIndicator);
    }

    PowerBank(String brand, String model, int capacity, String color, double price, int outputPorts, boolean fastCharging, boolean wirelessCharging, int inputPower, double weight, boolean ledIndicator, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}