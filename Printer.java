class Printer {

    String brand;
    String model;
    String type;
    String color;
    double price;
    boolean wireless;
    boolean duplex;
    int ppm;
    String connectivity;
    double weight;
    boolean scanner;
    boolean copier;

    Printer(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Printer(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Printer(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Printer(String brand, String model, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Printer(String brand, String model, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless, boolean duplex){
        this.duplex = duplex;
        System.out.println("Duplex : " + duplex);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless, boolean duplex, int ppm){
        this.ppm = ppm;
        System.out.println("Pages Per Minute : " + ppm);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless, boolean duplex, int ppm, String connectivity){
        this.connectivity = connectivity;
        System.out.println("Connectivity : " + connectivity);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless, boolean duplex, int ppm, String connectivity, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless, boolean duplex, int ppm, String connectivity, double weight, boolean scanner){
        this.scanner = scanner;
        System.out.println("Scanner : " + scanner);
    }

    Printer(String brand, String model, String type, String color, double price, boolean wireless, boolean duplex, int ppm, String connectivity, double weight, boolean scanner, boolean copier){
        this.copier = copier;
        System.out.println("Copier : " + copier);
    }
}