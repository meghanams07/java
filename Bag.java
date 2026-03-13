class Bag {

    String brand;
    String type;
    String color;
    double price;
    int capacity;
    String material;
    boolean waterproof;
    int pockets;
    boolean laptopCompartment;
    double weight;
    boolean adjustableStrap;
    boolean zipClosure;

    Bag(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Bag(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Bag(String brand, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Bag(String brand, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Bag(String brand, String type, String color, double price, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof){
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, int pockets){
        this.pockets = pockets;
        System.out.println("Pockets : " + pockets);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, int pockets, boolean laptopCompartment){
        this.laptopCompartment = laptopCompartment;
        System.out.println("Laptop Compartment : " + laptopCompartment);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, int pockets, boolean laptopCompartment, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, int pockets, boolean laptopCompartment, double weight, boolean adjustableStrap){
        this.adjustableStrap = adjustableStrap;
        System.out.println("Adjustable Strap : " + adjustableStrap);
    }

    Bag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, int pockets, boolean laptopCompartment, double weight, boolean adjustableStrap, boolean zipClosure){
        this.zipClosure = zipClosure;
        System.out.println("Zip Closure : " + zipClosure);
    }
}