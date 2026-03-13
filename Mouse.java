class Mouse {

    String brand;
    String model;
    String color;
    double price;
    boolean wireless;
    int dpi;
    int buttons;
    boolean rgb;
    double weight;
    boolean rechargeable;
    boolean bluetooth;
    boolean silentClick;

    Mouse(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Mouse(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Mouse(String brand, String model, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Mouse(String brand, String model, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi){
        this.dpi = dpi;
        System.out.println("DPI : " + dpi);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi, int buttons){
        this.buttons = buttons;
        System.out.println("Buttons : " + buttons);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi, int buttons, boolean rgb){
        this.rgb = rgb;
        System.out.println("RGB : " + rgb);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi, int buttons, boolean rgb, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi, int buttons, boolean rgb, double weight, boolean rechargeable){
        this.rechargeable = rechargeable;
        System.out.println("Rechargeable : " + rechargeable);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi, int buttons, boolean rgb, double weight, boolean rechargeable, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Mouse(String brand, String model, String color, double price, boolean wireless, int dpi, int buttons, boolean rgb, double weight, boolean rechargeable, boolean bluetooth, boolean silentClick){
        this.silentClick = silentClick;
        System.out.println("Silent Click : " + silentClick);
    }
}