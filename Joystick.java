class Joystick {

    String brand;
    String model;
    String type;
    boolean wireless;
    int buttons;
    double price;
    boolean vibration;
    boolean analogControl;
    String connectivity;
    double weight;
    boolean rechargeable;
    boolean portable;

    Joystick(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Joystick(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Joystick(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Joystick(String brand, String model, String type, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons){
        this.buttons = buttons;
        System.out.println("Buttons : " + buttons);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration){
        this.vibration = vibration;
        System.out.println("Vibration : " + vibration);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean analogControl){
        this.analogControl = analogControl;
        System.out.println("Analog Control : " + analogControl);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean analogControl, String connectivity){
        this.connectivity = connectivity;
        System.out.println("Connectivity : " + connectivity);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean analogControl, String connectivity, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean analogControl, String connectivity, double weight, boolean rechargeable){
        this.rechargeable = rechargeable;
        System.out.println("Rechargeable : " + rechargeable);
    }

    Joystick(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean analogControl, String connectivity, double weight, boolean rechargeable, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}