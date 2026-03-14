class DumbBell {

    String brand;
    String material;
    String color;
    double weight;
    String type;
    String shape;
    double handleLength;
    double diameter;
    String coating;
    boolean adjustable;
    String gripType;
    String usage;
    String manufacturer;
    String country;
    double price;
    String finish;
    int warrantyYears;
    String packagingType;
    boolean rustResistant;
    boolean available;

    DumbBell(String brand, String material, String color, double weight, String type,
             String shape, double handleLength, double diameter, String coating,
             boolean adjustable, String gripType, String usage, String manufacturer,
             String country, double price, String finish, int warrantyYears,
             String packagingType, boolean rustResistant, boolean available) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.type = type;
        this.shape = shape;
        this.handleLength = handleLength;
        this.diameter = diameter;
        this.coating = coating;
        this.adjustable = adjustable;
        this.gripType = gripType;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.finish = finish;
        this.warrantyYears = warrantyYears;
        this.packagingType = packagingType;
        this.rustResistant = rustResistant;
        this.available = available;
    }

    void display() {

        System.out.println("Brand : " + this.brand);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Weight : " + this.weight);
        System.out.println("Type : " + this.type);
        System.out.println("Shape : " + this.shape);
        System.out.println("Handle Length : " + this.handleLength);
        System.out.println("Diameter : " + this.diameter);
        System.out.println("Coating : " + this.coating);
        System.out.println("Adjustable : " + this.adjustable);
        System.out.println("Grip Type : " + this.gripType);
        System.out.println("Usage : " + this.usage);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country : " + this.country);
        System.out.println("Price : " + this.price);
        System.out.println("Finish : " + this.finish);
        System.out.println("Warranty Years : " + this.warrantyYears);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Rust Resistant : " + this.rustResistant);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}