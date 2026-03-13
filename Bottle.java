class Bottle {

    String brand;
    String material;
    String color;
    double capacity;
    double price;
    boolean insulated;
    boolean leakProof;
    double height;
    double weight;
    boolean dishwasherSafe;
    boolean reusable;
    boolean ecoFriendly;

    Bottle(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Bottle(String brand, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Bottle(String brand, String material, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Bottle(String brand, String material, String color, double capacity){
        this.capacity = capacity;
        System.out.println("Capacity : " + capacity);
    }

    Bottle(String brand, String material, String color, double capacity, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated){
        this.insulated = insulated;
        System.out.println("Insulated : " + insulated);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated, boolean leakProof){
        this.leakProof = leakProof;
        System.out.println("Leak Proof : " + leakProof);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated, boolean leakProof, double height){
        this.height = height;
        System.out.println("Height : " + height);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated, boolean leakProof, double height, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated, boolean leakProof, double height, double weight, boolean dishwasherSafe){
        this.dishwasherSafe = dishwasherSafe;
        System.out.println("Dishwasher Safe : " + dishwasherSafe);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated, boolean leakProof, double height, double weight, boolean dishwasherSafe, boolean reusable){
        this.reusable = reusable;
        System.out.println("Reusable : " + reusable);
    }

    Bottle(String brand, String material, String color, double capacity, double price, boolean insulated, boolean leakProof, double height, double weight, boolean dishwasherSafe, boolean reusable, boolean ecoFriendly){
        this.ecoFriendly = ecoFriendly;
        System.out.println("Eco Friendly : " + ecoFriendly);
    }
}