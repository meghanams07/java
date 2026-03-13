class Microphone {

    String brand;
    String model;
    String type;
    String color;
    double price;
    boolean wireless;
    String connectivity;
    int frequencyRange;
    double weight;
    boolean noiseCancellation;
    boolean muteButton;
    boolean portable;

    Microphone(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Microphone(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Microphone(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Microphone(String brand, String model, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Microphone(String brand, String model, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless){
        this.wireless = wireless;
        System.out.println("Wireless : " + wireless);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless, String connectivity){
        this.connectivity = connectivity;
        System.out.println("Connectivity : " + connectivity);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless, String connectivity, int frequencyRange){
        this.frequencyRange = frequencyRange;
        System.out.println("Frequency Range : " + frequencyRange);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless, String connectivity, int frequencyRange, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless, String connectivity, int frequencyRange, double weight, boolean noiseCancellation){
        this.noiseCancellation = noiseCancellation;
        System.out.println("Noise Cancellation : " + noiseCancellation);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless, String connectivity, int frequencyRange, double weight, boolean noiseCancellation, boolean muteButton){
        this.muteButton = muteButton;
        System.out.println("Mute Button : " + muteButton);
    }

    Microphone(String brand, String model, String type, String color, double price, boolean wireless, String connectivity, int frequencyRange, double weight, boolean noiseCancellation, boolean muteButton, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}