class GameController {

    String brand;
    String model;
    String type;
    boolean wireless;
    int buttons;
    double price;
    boolean vibration;
    boolean motionSensor;
    String connectivity;
    double weight;
    boolean rechargeable;
    boolean portable;

    GameController(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    GameController(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    GameController(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    GameController(String brand, String model, String type, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons){
        this.buttons = buttons;
        System.out.println("Buttons : " + buttons);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration){
        this.vibration = vibration;
        System.out.println("Vibration : " + vibration);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean motionSensor){
        this.motionSensor = motionSensor;
        System.out.println("Motion Sensor : " + motionSensor);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean motionSensor, String connectivity){
        this.connectivity = connectivity;
        System.out.println("Connectivity : " + connectivity);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean motionSensor, String connectivity, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean motionSensor, String connectivity, double weight, boolean rechargeable){
        this.rechargeable = rechargeable;
        System.out.println("Rechargeable : " + rechargeable);
    }

    GameController(String brand, String model, String type, boolean wireless, int buttons, double price, boolean vibration, boolean motionSensor, String connectivity, double weight, boolean rechargeable, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}