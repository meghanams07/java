class Pepper {

    String name;
    String type;
    String color;
    String origin;
    double pricePerKg;
    String taste;
    int spiceLevel;
    String form;
    String qualityGrade;
    boolean organic;
    boolean powdered;
    double moistureContent;
    String packagingType;
    String brand;
    int shelfLifeMonths;
    String storageCondition;
    String exportCountry;
    double weight;
    String cultivationType;
    boolean available;


    Pepper(String name, String type, String color, String origin, double pricePerKg,
           String taste, int spiceLevel, String form, String qualityGrade,
           boolean organic, boolean powdered, double moistureContent,
           String packagingType, String brand, int shelfLifeMonths,
           String storageCondition, String exportCountry, double weight,
           String cultivationType, boolean available) {

        this.name = name;
        this.type = type;
        this.color = color;
        this.origin = origin;
        this.pricePerKg = pricePerKg;
        this.taste = taste;
        this.spiceLevel = spiceLevel;
        this.form = form;
        this.qualityGrade = qualityGrade;
        this.organic = organic;
        this.powdered = powdered;
        this.moistureContent = moistureContent;
        this.packagingType = packagingType;
        this.brand = brand;
        this.shelfLifeMonths = shelfLifeMonths;
        this.storageCondition = storageCondition;
        this.exportCountry = exportCountry;
        this.weight = weight;
        this.cultivationType = cultivationType;
        this.available = available;
    }

 
    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Origin : " + this.origin);
        System.out.println("Price Per Kg : " + this.pricePerKg);
        System.out.println("Taste : " + this.taste);
        System.out.println("Spice Level : " + this.spiceLevel);
        System.out.println("Form : " + this.form);
        System.out.println("Quality Grade : " + this.qualityGrade);
        System.out.println("Organic : " + this.organic);
        System.out.println("Powdered : " + this.powdered);
        System.out.println("Moisture Content : " + this.moistureContent);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Brand : " + this.brand);
        System.out.println("Shelf Life (Months) : " + this.shelfLifeMonths);
        System.out.println("Storage Condition : " + this.storageCondition);
        System.out.println("Export Country : " + this.exportCountry);
        System.out.println("Weight : " + this.weight);
        System.out.println("Cultivation Type : " + this.cultivationType);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}