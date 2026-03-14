class Organizer {

    String brand;
    String type;
    String material;
    String color;
    int compartments;
    double height;
    double width;
    double weight;
    double price;
    String usage;
    String manufacturer;
    String country;
    String shape;
    boolean portable;
    boolean waterproof;
    String closureType;
    String designStyle;
    int warrantyYears;
    String packagingType;
    boolean available;

    Organizer(String brand, String type, String material, String color, int compartments,
              double height, double width, double weight, double price, String usage,
              String manufacturer, String country, String shape, boolean portable,
              boolean waterproof, String closureType, String designStyle,
              int warrantyYears, String packagingType, boolean available) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.compartments = compartments;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.country = country;
        this.shape = shape;
        this.portable = portable;
        this.waterproof = waterproof;
        this.closureType = closureType;
        this.designStyle = designStyle;
        this.warrantyYears = warrantyYears;
        this.packagingType = packagingType;
        this.available = available;
    }

    void display() {

        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Compartments : " + this.compartments);
        System.out.println("Height : " + this.height);
        System.out.println("Width : " + this.width);
        System.out.println("Weight : " + this.weight);
        System.out.println("Price : " + this.price);
        System.out.println("Usage : " + this.usage);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country : " + this.country);
        System.out.println("Shape : " + this.shape);
        System.out.println("Portable : " + this.portable);
        System.out.println("Waterproof : " + this.waterproof);
        System.out.println("Closure Type : " + this.closureType);
        System.out.println("Design Style : " + this.designStyle);
        System.out.println("Warranty Years : " + this.warrantyYears);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}