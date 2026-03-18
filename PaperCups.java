class PaperCups {

    int cupId;
    String brand;
    String color;
    double price;
    int quantity;
    String material;
    boolean isDisposable;
    double capacity;
    String shape;
    String size;
    String manufacturer;
    String country;
    int packSize;
    double weight;
    String lidType;
    boolean isRecyclable;
    String usageType;
    String printDesign;
    int productionYear;
    String quality;

    PaperCups() {
        this(1, "Generic", "White", 2.5, 50, "Paper", true, 200.0, "Round", "Medium",
             "ABC Ltd", "India", 20, 5.5, "Flat", true, "Hot", "Plain", 2024, "Standard");
        System.out.println("Default Constructor");
    }

    PaperCups(int cupId, String brand, String color, double price, int quantity, String material,
              boolean isDisposable, double capacity, String shape, String size,
              String manufacturer, String country, int packSize, double weight,
              String lidType, boolean isRecyclable, String usageType,
              String printDesign, int productionYear, String quality) {

        this.cupId = cupId;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.isDisposable = isDisposable;
        this.capacity = capacity;
        this.shape = shape;
        this.size = size;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packSize = packSize;
        this.weight = weight;
        this.lidType = lidType;
        this.isRecyclable = isRecyclable;
        this.usageType = usageType;
        this.printDesign = printDesign;
        this.productionYear = productionYear;
        this.quality = quality;

        System.out.println("Parameterized Constructor");
    }

    void displayDetails() {
        System.out.println(cupId + " " + brand + " " + color + " " + price + " " + quantity + " " +
                material + " " + isDisposable + " " + capacity + " " + shape + " " + size + " " +
                manufacturer + " " + country + " " + packSize + " " + weight + " " + lidType + " " +
                isRecyclable + " " + usageType + " " + printDesign + " " + productionYear + " " + quality);
    }
}

