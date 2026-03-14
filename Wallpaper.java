class Wallpaper {

    String brand;
    String type;
    String color;
    String pattern;
    String material;
    int width;
    int height;
    double price;
    String texture;
    String designStyle;
    String finish;
    String roomType;
    String country;
    String durability;
    boolean washable;
    boolean waterproof;
    String installationType;
    int warrantyYears;
    String manufacturer;
    String availability;

    
    Wallpaper(String brand, String type, String color, String pattern, String material,
              int width, int height, double price, String texture, String designStyle,
              String finish, String roomType, String country, String durability,
              boolean washable, boolean waterproof, String installationType,
              int warrantyYears, String manufacturer, String availability) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.pattern = pattern;
        this.material = material;
        this.width = width;
        this.height = height;
        this.price = price;
        this.texture = texture;
        this.designStyle = designStyle;
        this.finish = finish;
        this.roomType = roomType;
        this.country = country;
        this.durability = durability;
        this.washable = washable;
        this.waterproof = waterproof;
        this.installationType = installationType;
        this.warrantyYears = warrantyYears;
        this.manufacturer = manufacturer;
        this.availability = availability;
    }

    
    void display() {

        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Pattern : " + this.pattern);
        System.out.println("Material : " + this.material);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Price : " + this.price);
        System.out.println("Texture : " + this.texture);
        System.out.println("Design Style : " + this.designStyle);
        System.out.println("Finish : " + this.finish);
        System.out.println("Room Type : " + this.roomType);
        System.out.println("Country : " + this.country);
        System.out.println("Durability : " + this.durability);
        System.out.println("Washable : " + this.washable);
        System.out.println("Waterproof : " + this.waterproof);
        System.out.println("Installation Type : " + this.installationType);
        System.out.println("Warranty Years : " + this.warrantyYears);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Availability : " + this.availability);
        System.out.println("------------------------------------");
    }
}