class Table {

    String brand;
    String type;
    String material;
    String color;
    double price;
    int length;
    int width;
    int height;
    boolean foldable;
    double weight;
    boolean drawers;
    boolean adjustable;

    Table(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Table(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Table(String brand, String type, String material){
        this.material = material;
        System.out.println("Material : " + material);
    }

    Table(String brand, String type, String material, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Table(String brand, String type, String material, String color, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Table(String brand, String type, String material, String color, double price, int length){
        this.length = length;
        System.out.println("Length : " + length);
    }

    Table(String brand, String type, String material, String color, double price, int length, int width){
        this.width = width;
        System.out.println("Width : " + width);
    }

    Table(String brand, String type, String material, String color, double price, int length, int width, int height){
        this.height = height;
        System.out.println("Height : " + height);
    }

    Table(String brand, String type, String material, String color, double price, int length, int width, int height, boolean foldable){
        this.foldable = foldable;
        System.out.println("Foldable : " + foldable);
    }

    Table(String brand, String type, String material, String color, double price, int length, int width, int height, boolean foldable, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Table(String brand, String type, String material, String color, double price, int length, int width, int height, boolean foldable, double weight, boolean drawers){
        this.drawers = drawers;
        System.out.println("Drawers : " + drawers);
    }

    Table(String brand, String type, String material, String color, double price, int length, int width, int height, boolean foldable, double weight, boolean drawers, boolean adjustable){
        this.adjustable = adjustable;
        System.out.println("Adjustable : " + adjustable);
    }
}