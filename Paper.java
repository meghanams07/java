class Paper {

    String brand;
    String type;
    String color;
    String size;
    double thickness;
    double weight;
    String material;
    String texture;
    boolean recycled;
    boolean waterproof;
    String usage;
    String manufacturer;
    String country;
    int sheetsPerPack;
    double price;
    String finish;
    String quality;
    String packagingType;
    int shelfLifeMonths;
    boolean available;

    Paper(String brand, String type, String color, String size, double thickness,
          double weight, String material, String texture, boolean recycled,
          boolean waterproof, String usage, String manufacturer, String country,
          int sheetsPerPack, double price, String finish, String quality,
          String packagingType, int shelfLifeMonths, boolean available) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.thickness = thickness;
        this.weight = weight;
        this.material = material;
        this.texture = texture;
        this.recycled = recycled;
        this.waterproof = waterproof;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.country = country;
        this.sheetsPerPack = sheetsPerPack;
        this.price = price;
        this.finish = finish;
        this.quality = quality;
        this.packagingType = packagingType;
        this.shelfLifeMonths = shelfLifeMonths;
        this.available = available;
    }


    void display() {

        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Size : " + this.size);
        System.out.println("Thickness : " + this.thickness);
        System.out.println("Weight : " + this.weight);
        System.out.println("Material : " + this.material);
        System.out.println("Texture : " + this.texture);
        System.out.println("Recycled : " + this.recycled);
        System.out.println("Waterproof : " + this.waterproof);
        System.out.println("Usage : " + this.usage);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country : " + this.country);
        System.out.println("Sheets Per Pack : " + this.sheetsPerPack);
        System.out.println("Price : " + this.price);
        System.out.println("Finish : " + this.finish);
        System.out.println("Quality : " + this.quality);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Shelf Life (Months) : " + this.shelfLifeMonths);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}