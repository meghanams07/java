class Tripod {

    String brand;
    String model;
    String material;
    int maxHeight;
    int minHeight;
    double price;
    boolean adjustable;
    boolean lightweight;
    double weight;
    boolean portable;
    boolean quickRelease;
    boolean stable;

    Tripod(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Tripod(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Tripod(String brand, String model, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Tripod(String brand, String model, String material, int maxHeight){
        this.maxHeight = maxHeight;
        System.out.println("Max Height : " + maxHeight);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight){
        this.minHeight = minHeight;
        System.out.println("Min Height : " + minHeight);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price, boolean adjustable){
        this.adjustable = adjustable;
        System.out.println("Adjustable : " + adjustable);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price, boolean adjustable, boolean lightweight){
        this.lightweight = lightweight;
        System.out.println("Lightweight : " + lightweight);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price, boolean adjustable, boolean lightweight, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price, boolean adjustable, boolean lightweight, double weight, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price, boolean adjustable, boolean lightweight, double weight, boolean portable, boolean quickRelease){
        this.quickRelease = quickRelease;
        System.out.println("Quick Release : " + quickRelease);
    }

    Tripod(String brand, String model, String material, int maxHeight, int minHeight, double price, boolean adjustable, boolean lightweight, double weight, boolean portable, boolean quickRelease, boolean stable){
        this.stable = stable;
        System.out.println("Stable : " + stable);
    }
}