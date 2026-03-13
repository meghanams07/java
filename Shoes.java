class Shoes {

    String brand;
    String model;
    String type;
    String color;
    int size;
    double price;
    String material;
    boolean waterproof;
    double weight;
    boolean sportsUse;
    boolean lace;
    boolean washable;

    Shoes(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Shoes(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Shoes(String brand, String model, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Shoes(String brand, String model, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Shoes(String brand, String model, String type, String color, int size){
        this.size = size;
        System.out.println("Size : " + size);
    }

    Shoes(String brand, String model, String type, String color, int size, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Shoes(String brand, String model, String type, String color, int size, double price, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Shoes(String brand, String model, String type, String color, int size, double price, String material, boolean waterproof){
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    Shoes(String brand, String model, String type, String color, int size, double price, String material, boolean waterproof, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Shoes(String brand, String model, String type, String color, int size, double price, String material, boolean waterproof, double weight, boolean sportsUse){
        this.sportsUse = sportsUse;
        System.out.println("Sports Use : " + sportsUse);
    }

    Shoes(String brand, String model, String type, String color, int size, double price, String material, boolean waterproof, double weight, boolean sportsUse, boolean lace){
        this.lace = lace;
        System.out.println("Lace : " + lace);
    }

    Shoes(String brand, String model, String type, String color, int size, double price, String material, boolean waterproof, double weight, boolean sportsUse, boolean lace, boolean washable){
        this.washable = washable;
        System.out.println("Washable : " + washable);
    }
}