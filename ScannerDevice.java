class ScannerDevice {

    String brand;
    String model;
    String type;
    String resolution;
    double price;
    boolean wireless;
    boolean usb;
    int speed;
    double weight;
    boolean duplex;
    boolean portable;
    boolean cloudSupport;

    ScannerDevice(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    ScannerDevice(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    ScannerDevice(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    ScannerDevice(String brand, String model, String type, String resolution){
        this.resolution = resolution;
        System.out.println("Resolution : " + resolution);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless, boolean usb){
        this.usb = usb;
        System.out.println("USB : " + usb);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless, boolean usb, int speed){
        this.speed = speed;
        System.out.println("Speed : " + speed);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless, boolean usb, int speed, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless, boolean usb, int speed, double weight, boolean duplex){
        this.duplex = duplex;
        System.out.println("Duplex : " + duplex);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless, boolean usb, int speed, double weight, boolean duplex, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }

    ScannerDevice(String brand, String model, String type, String resolution, double price, boolean wireless, boolean usb, int speed, double weight, boolean duplex, boolean portable, boolean cloudSupport){
        this.cloudSupport = cloudSupport;
        System.out.println("Cloud Support : " + cloudSupport);
    }
}