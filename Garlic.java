class Garlic {

    String name;
    String variety;
    String color;
    String origin;
    double pricePerKg;
    String taste;
    int clovesPerBulb;
    String size;
    boolean organic;
    boolean peeled;
    double moistureContent;
    String packagingType;
    String brand;
    int shelfLifeMonths;
    String storageCondition;
    String exportCountry;
    double weight;
    String cultivationType;
    String harvestSeason;
    boolean available;


    Garlic(String name, String variety, String color, String origin, double pricePerKg,
           String taste, int clovesPerBulb, String size, boolean organic, boolean peeled,
           double moistureContent, String packagingType, String brand, int shelfLifeMonths,
           String storageCondition, String exportCountry, double weight, String cultivationType,
           String harvestSeason, boolean available) {

        this.name = name;
        this.variety = variety;
        this.color = color;
        this.origin = origin;
        this.pricePerKg = pricePerKg;
        this.taste = taste;
        this.clovesPerBulb = clovesPerBulb;
        this.size = size;
        this.organic = organic;
        this.peeled = peeled;
        this.moistureContent = moistureContent;
        this.packagingType = packagingType;
        this.brand = brand;
        this.shelfLifeMonths = shelfLifeMonths;
        this.storageCondition = storageCondition;
        this.exportCountry = exportCountry;
        this.weight = weight;
        this.cultivationType = cultivationType;
        this.harvestSeason = harvestSeason;
        this.available = available;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Variety : " + this.variety);
        System.out.println("Color : " + this.color);
        System.out.println("Origin : " + this.origin);
        System.out.println("Price Per Kg : " + this.pricePerKg);
        System.out.println("Taste : " + this.taste);
        System.out.println("Cloves Per Bulb : " + this.clovesPerBulb);
        System.out.println("Size : " + this.size);
        System.out.println("Organic : " + this.organic);
        System.out.println("Peeled : " + this.peeled);
        System.out.println("Moisture Content : " + this.moistureContent);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Brand : " + this.brand);
        System.out.println("Shelf Life (Months) : " + this.shelfLifeMonths);
        System.out.println("Storage Condition : " + this.storageCondition);
        System.out.println("Export Country : " + this.exportCountry);
        System.out.println("Weight : " + this.weight);
        System.out.println("Cultivation Type : " + this.cultivationType);
        System.out.println("Harvest Season : " + this.harvestSeason);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}