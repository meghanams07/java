class Pen {

    String brand;
    String type;
    String color;
    double price;
    boolean refillable;
    String inkType;
    double length;
    double weight;
    boolean grip;
    String material;
    boolean waterproof;
    boolean smoothWriting;

    Pen(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Pen(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Pen(String brand, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Pen(String brand, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Pen(String brand, String type, String color, double price, boolean refillable){
        this.refillable = refillable;
        System.out.println("Refillable : " + refillable);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType){
        this.inkType = inkType;
        System.out.println("Ink Type : " + inkType);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType, double length){
        this.length = length;
        System.out.println("Length : " + length);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType, double length, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType, double length, double weight, boolean grip){
        this.grip = grip;
        System.out.println("Grip : " + grip);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType, double length, double weight, boolean grip, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType, double length, double weight, boolean grip, String material, boolean waterproof){
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    Pen(String brand, String type, String color, double price, boolean refillable, String inkType, double length, double weight, boolean grip, String material, boolean waterproof, boolean smoothWriting){
        this.smoothWriting = smoothWriting;
        System.out.println("Smooth Writing : " + smoothWriting);
    }
}