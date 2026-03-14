class Conditioner {

    String brand;
    String productName;
    String hairType;
    String fragrance;
    String color;
    double quantity;
    double price;
    String ingredients;
    String manufacturer;
    String country;
    String packagingType;
    String texture;
    boolean sulfateFree;
    boolean parabenFree;
    boolean organic;
    String usage;
    String shelfLife;
    String suitableGender;
    String hairConcern;
    boolean available;

    Conditioner(String brand, String productName, String hairType, String fragrance,
                String color, double quantity, double price, String ingredients,
                String manufacturer, String country, String packagingType,
                String texture, boolean sulfateFree, boolean parabenFree,
                boolean organic, String usage, String shelfLife,
                String suitableGender, String hairConcern, boolean available) {

        this.brand = brand;
        this.productName = productName;
        this.hairType = hairType;
        this.fragrance = fragrance;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.ingredients = ingredients;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packagingType = packagingType;
        this.texture = texture;
        this.sulfateFree = sulfateFree;
        this.parabenFree = parabenFree;
        this.organic = organic;
        this.usage = usage;
        this.shelfLife = shelfLife;
        this.suitableGender = suitableGender;
        this.hairConcern = hairConcern;
        this.available = available;
    }

    void display() {

        System.out.println("Brand : " + this.brand);
        System.out.println("Product Name : " + this.productName);
        System.out.println("Hair Type : " + this.hairType);
        System.out.println("Fragrance : " + this.fragrance);
        System.out.println("Color : " + this.color);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Price : " + this.price);
        System.out.println("Ingredients : " + this.ingredients);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country : " + this.country);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Texture : " + this.texture);
        System.out.println("Sulfate Free : " + this.sulfateFree);
        System.out.println("Paraben Free : " + this.parabenFree);
        System.out.println("Organic : " + this.organic);
        System.out.println("Usage : " + this.usage);
        System.out.println("Shelf Life : " + this.shelfLife);
        System.out.println("Suitable Gender : " + this.suitableGender);
        System.out.println("Hair Concern : " + this.hairConcern);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}