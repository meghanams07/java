class Monitor {

    String brand;
    String model;
    double screenSize;
    String resolution;
    double price;
    String panelType;
    int refreshRate;
    boolean curved;
    boolean hdr;
    double weight;
    boolean hdmi;
    boolean displayPort;

    Monitor(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Monitor(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Monitor(String brand, String model, double screenSize){
        this.screenSize = screenSize;
        System.out.println("Screen Size : " + screenSize);
    }

    Monitor(String brand, String model, double screenSize, String resolution){
        this.resolution = resolution;
        System.out.println("Resolution : " + resolution);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType){
        this.panelType = panelType;
        System.out.println("Panel Type : " + panelType);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType, int refreshRate){
        this.refreshRate = refreshRate;
        System.out.println("Refresh Rate : " + refreshRate);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType, int refreshRate, boolean curved){
        this.curved = curved;
        System.out.println("Curved : " + curved);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType, int refreshRate, boolean curved, boolean hdr){
        this.hdr = hdr;
        System.out.println("HDR : " + hdr);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType, int refreshRate, boolean curved, boolean hdr, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType, int refreshRate, boolean curved, boolean hdr, double weight, boolean hdmi){
        this.hdmi = hdmi;
        System.out.println("HDMI : " + hdmi);
    }

    Monitor(String brand, String model, double screenSize, String resolution, double price, String panelType, int refreshRate, boolean curved, boolean hdr, double weight, boolean hdmi, boolean displayPort){
        this.displayPort = displayPort;
        System.out.println("DisplayPort : " + displayPort);
    }
}