class Stand {

    String name;
    String type;
    String material;
    String color;
    double height;
    double width;
    double weight;
    double price;
    String brand;
    String manufacturer;
    String country;
    String usage;
    boolean foldable;
    boolean adjustable;
    String finish;
    String shape;
    String durability;
    int warrantyYears;
    String packagingType;
    boolean available;

    Stand(String name, String type, String material, String color, double height,
          double width, double weight, double price, String brand,
          String manufacturer, String country, String usage, boolean foldable,
          boolean adjustable, String finish, String shape, String durability,
          int warrantyYears, String packagingType, boolean available) {

        this.name = name;
        this.type = type;
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.country = country;
        this.usage = usage;
        this.foldable = foldable;
        this.adjustable = adjustable;
        this.finish = finish;
        this.shape = shape;
        this.durability = durability;
        this.warrantyYears = warrantyYears;
        this.packagingType = packagingType;
        this.available = available;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Height : " + this.height);
        System.out.println("Width : " + this.width);
        System.out.println("Weight : " + this.weight);
        System.out.println("Price : " + this.price);
        System.out.println("Brand : " + this.brand);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country : " + this.country);
        System.out.println("Usage : " + this.usage);
        System.out.println("Foldable : " + this.foldable);
        System.out.println("Adjustable : " + this.adjustable);
        System.out.println("Finish : " + this.finish);
        System.out.println("Shape : " + this.shape);
        System.out.println("Durability : " + this.durability);
        System.out.println("Warranty Years : " + this.warrantyYears);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}