class Webcam {

    String brand;
    String model;
    String resolution;
    int fps;
    double price;
    boolean autoFocus;
    boolean microphone;
    String connectivity;
    double weight;
    boolean tripodSupport;
    boolean usb;
    boolean portable;

    Webcam(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Webcam(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Webcam(String brand, String model, String resolution){
        this.resolution = resolution;
        System.out.println("Resolution : " + resolution);
    }

    Webcam(String brand, String model, String resolution, int fps){
        this.fps = fps;
        System.out.println("FPS : " + fps);
    }

    Webcam(String brand, String model, String resolution, int fps, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus){
        this.autoFocus = autoFocus;
        System.out.println("Auto Focus : " + autoFocus);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus, boolean microphone){
        this.microphone = microphone;
        System.out.println("Microphone : " + microphone);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus, boolean microphone, String connectivity){
        this.connectivity = connectivity;
        System.out.println("Connectivity : " + connectivity);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus, boolean microphone, String connectivity, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus, boolean microphone, String connectivity, double weight, boolean tripodSupport){
        this.tripodSupport = tripodSupport;
        System.out.println("Tripod Support : " + tripodSupport);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus, boolean microphone, String connectivity, double weight, boolean tripodSupport, boolean usb){
        this.usb = usb;
        System.out.println("USB : " + usb);
    }

    Webcam(String brand, String model, String resolution, int fps, double price, boolean autoFocus, boolean microphone, String connectivity, double weight, boolean tripodSupport, boolean usb, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}