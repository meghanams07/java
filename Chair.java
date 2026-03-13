class Chair {

    String brand;
    String type;
    String material;
    String color;
    double price;
    int height;
    int width;
    boolean foldable;
    boolean adjustable;
    double weight;
    boolean wheels;
    boolean cushion;

    Chair(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Chair(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Chair(String brand, String type, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Chair(String brand, String type, String material, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Chair(String brand, String type, String material, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Chair(String brand, String type, String material, String color, double price, int height){
        this.height = height;
        System.out.println("Height : " + height);
    }

    Chair(String brand, String type, String material, String color, double price, int height, int width){
        this.width = width;
        System.out.println("Width : " + width);
    }

    Chair(String brand, String type, String material, String color, double price, int height, int width, boolean foldable){
        this.foldable = foldable;
        System.out.println("Foldable : " + foldable);
    }

    Chair(String brand, String type, String material, String color, double price, int height, int width, boolean foldable, boolean adjustable){
        this.adjustable = adjustable;
        System.out.println("Adjustable : " + adjustable);
    }

    Chair(String brand, String type, String material, String color, double price, int height, int width, boolean foldable, boolean adjustable, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Chair(String brand, String type, String material, String color, double price, int height, int width, boolean foldable, boolean adjustable, double weight, boolean wheels){
        this.wheels = wheels;
        System.out.println("Wheels : " + wheels);
    }

    Chair(String brand, String type, String material, String color, double price, int height, int width, boolean foldable, boolean adjustable, double weight, boolean wheels, boolean cushion){
        this.cushion = cushion;
        System.out.println("Cushion : " + cushion);
    }
}