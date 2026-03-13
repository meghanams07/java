class Router {

    String brand;
    String model;
    String type;
    int speed;
    double price;
    int antennas;
    boolean dualBand;
    boolean wifi6;
    int ports;
    double weight;
    boolean usbPort;
    boolean parentalControl;

    Router(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Router(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Router(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Router(String brand, String model, String type, int speed){
        this.speed = speed;
        System.out.println("Speed : " + speed);
    }

    Router(String brand, String model, String type, int speed, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas){
        this.antennas = antennas;
        System.out.println("Antennas : " + antennas);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas, boolean dualBand){
        this.dualBand = dualBand;
        System.out.println("Dual Band : " + dualBand);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas, boolean dualBand, boolean wifi6){
        this.wifi6 = wifi6;
        System.out.println("WiFi 6 : " + wifi6);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas, boolean dualBand, boolean wifi6, int ports){
        this.ports = ports;
        System.out.println("Ports : " + ports);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas, boolean dualBand, boolean wifi6, int ports, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas, boolean dualBand, boolean wifi6, int ports, double weight, boolean usbPort){
        this.usbPort = usbPort;
        System.out.println("USB Port : " + usbPort);
    }

    Router(String brand, String model, String type, int speed, double price, int antennas, boolean dualBand, boolean wifi6, int ports, double weight, boolean usbPort, boolean parentalControl){
        this.parentalControl = parentalControl;
        System.out.println("Parental Control : " + parentalControl);
    }
}