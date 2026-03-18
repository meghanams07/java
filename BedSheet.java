class BedSheet {

    int id;
    String brand;
    String material;
    String color;
    String size;
    double price;
    int threadCount;
    String pattern;
    boolean isCotton;
    boolean isKingSize;
    String originCountry;
    int weight;
    String texture;
    boolean isWaterproof;
    String designType;
    int durabilityYears;
    String manufacturer;
    boolean isOrganic;
    int stock;
    String careInstructions;

    BedSheet() {
        this(0, "DefaultBrand", "Cotton", "White", "Single", 500.0, 200, "Plain", true, false,
             "India", 1, "Soft", false, "Basic", 2, "ABC Ltd", false, 10, "Machine Wash");
        System.out.println("Default Constructor");
    }

    BedSheet(int id, String brand, String material, String color, String size, double price,
             int threadCount, String pattern, boolean isCotton, boolean isKingSize,
             String originCountry, int weight, String texture, boolean isWaterproof,
             String designType, int durabilityYears, String manufacturer,
             boolean isOrganic, int stock, String careInstructions) {

        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
        this.threadCount = threadCount;
        this.pattern = pattern;
        this.isCotton = isCotton;
        this.isKingSize = isKingSize;
        this.originCountry = originCountry;
        this.weight = weight;
        this.texture = texture;
        this.isWaterproof = isWaterproof;
        this.designType = designType;
        this.durabilityYears = durabilityYears;
        this.manufacturer = manufacturer;
        this.isOrganic = isOrganic;
        this.stock = stock;
        this.careInstructions = careInstructions;

        System.out.println("Parameterized Constructor");
    }

    BedSheet(int id, String brand) {
        this(id, brand, "Cotton", "Blue", "Double", 800.0, 300, "Printed", true, true,
             "India", 2, "Smooth", false, "Modern", 3, "XYZ Ltd", true, 20, "Hand Wash");
        System.out.println("Two Parameter Constructor");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Thread Count: " + threadCount);
        System.out.println("Pattern: " + pattern);
        System.out.println("Is Cotton: " + isCotton);
        System.out.println("Is King Size: " + isKingSize);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Weight: " + weight);
        System.out.println("Texture: " + texture);
        System.out.println("Is Waterproof: " + isWaterproof);
        System.out.println("Design Type: " + designType);
        System.out.println("Durability Years: " + durabilityYears);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Is Organic: " + isOrganic);
        System.out.println("Stock: " + stock);
        System.out.println("Care Instructions: " + careInstructions);
    }
}

