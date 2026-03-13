class Camera {

    String brand;
    String model;
    int megapixel;
    String lensType;
    double price;
    String color;
    double weight;
    boolean flash;
    boolean wifi;
    boolean bluetooth;
    boolean video4k;
    boolean touchscreen;

    Camera(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Camera(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Camera(String brand, String model, int megapixel){
        this.megapixel = megapixel;
        System.out.println("Megapixel : " + megapixel);
    }

    Camera(String brand, String model, int megapixel, String lensType){
        this.lensType = lensType;
        System.out.println("Lens Type : " + lensType);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color, double weight, boolean flash){
        this.flash = flash;
        System.out.println("Flash : " + flash);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color, double weight, boolean flash, boolean wifi){
        this.wifi = wifi;
        System.out.println("WiFi : " + wifi);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color, double weight, boolean flash, boolean wifi, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color, double weight, boolean flash, boolean wifi, boolean bluetooth, boolean video4k){
        this.video4k = video4k;
        System.out.println("4K Video : " + video4k);
    }

    Camera(String brand, String model, int megapixel, String lensType, double price, String color, double weight, boolean flash, boolean wifi, boolean bluetooth, boolean video4k, boolean touchscreen){
        this.touchscreen = touchscreen;
        System.out.println("Touchscreen : " + touchscreen);
    }
}