class ExtensionBoard {

    String brand;
    String model;
    int sockets;
    String type;
    double price;
    int cableLength;
    boolean surgeProtection;
    boolean usbPorts;
    String color;
    double weight;
    boolean switchControl;
    boolean portable;

    ExtensionBoard(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    ExtensionBoard(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    ExtensionBoard(String brand, String model, int sockets){
        this.sockets = sockets;
        System.out.println("Sockets : " + sockets);
    }

    ExtensionBoard(String brand, String model, int sockets, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength){
        this.cableLength = cableLength;
        System.out.println("Cable Length : " + cableLength);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength, boolean surgeProtection){
        this.surgeProtection = surgeProtection;
        System.out.println("Surge Protection : " + surgeProtection);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength, boolean surgeProtection, boolean usbPorts){
        this.usbPorts = usbPorts;
        System.out.println("USB Ports : " + usbPorts);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength, boolean surgeProtection, boolean usbPorts, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength, boolean surgeProtection, boolean usbPorts, String color, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength, boolean surgeProtection, boolean usbPorts, String color, double weight, boolean switchControl){
        this.switchControl = switchControl;
        System.out.println("Switch Control : " + switchControl);
    }

    ExtensionBoard(String brand, String model, int sockets, String type, double price, int cableLength, boolean surgeProtection, boolean usbPorts, String color, double weight, boolean switchControl, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}