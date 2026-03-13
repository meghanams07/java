class LaptopBag {

    String brand;
    String type;
    String color;
    double price;
    int capacity;
    String material;
    boolean waterproof;
    boolean laptopCompartment;
    int pockets;
    double weight;
    boolean adjustableStrap;
    boolean zipper;

    LaptopBag(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    LaptopBag(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    LaptopBag(String brand, String type, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    LaptopBag(String brand, String type, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof){
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, boolean laptopCompartment){
        this.laptopCompartment = laptopCompartment;
        System.out.println("Laptop Compartment : " + laptopCompartment);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, boolean laptopCompartment, int pockets){
        this.pockets = pockets;
        System.out.println("Pockets : " + pockets);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, boolean laptopCompartment, int pockets, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, boolean laptopCompartment, int pockets, double weight, boolean adjustableStrap){
        this.adjustableStrap = adjustableStrap;
        System.out.println("Adjustable Strap : " + adjustableStrap);
    }

    LaptopBag(String brand, String type, String color, double price, int capacity, String material, boolean waterproof, boolean laptopCompartment, int pockets, double weight, boolean adjustableStrap, boolean zipper){
        this.zipper = zipper;
        System.out.println("Zipper : " + zipper);
    }
}