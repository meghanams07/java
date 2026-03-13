class VRHeadset {

    String brand;
    String model;
    int resolution;
    int refreshRate;
    double price;
    boolean wireless;
    boolean motionTracking;
    int fieldOfView;
    double weight;
    boolean adjustableStrap;
    boolean builtInAudio;
    boolean portable;

    VRHeadset(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    VRHeadset(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    VRHeadset(String brand, String model, int resolution){
        this.resolution = resolution;
        System.out.println("Resolution : " + resolution);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate){
        this.refreshRate = refreshRate;
        System.out.println("Refresh Rate : " + refreshRate);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless, boolean motionTracking){
        this.motionTracking = motionTracking;
        System.out.println("Motion Tracking : " + motionTracking);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless, boolean motionTracking, int fieldOfView){
        this.fieldOfView = fieldOfView;
        System.out.println("Field Of View : " + fieldOfView);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless, boolean motionTracking, int fieldOfView, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless, boolean motionTracking, int fieldOfView, double weight, boolean adjustableStrap){
        this.adjustableStrap = adjustableStrap;
        System.out.println("Adjustable Strap : " + adjustableStrap);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless, boolean motionTracking, int fieldOfView, double weight, boolean adjustableStrap, boolean builtInAudio){
        this.builtInAudio = builtInAudio;
        System.out.println("Built-in Audio : " + builtInAudio);
    }

    VRHeadset(String brand, String model, int resolution, int refreshRate, double price, boolean wireless, boolean motionTracking, int fieldOfView, double weight, boolean adjustableStrap, boolean builtInAudio, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}