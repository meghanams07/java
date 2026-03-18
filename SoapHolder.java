class SoapHolder {

    int holderId;
    String brand;
    String material;
    String color;
    double price;
    String shape;
    double weight;
    String size;
    String type;
    boolean isWallMounted;
    int capacity;
    String countryOfOrigin;
    String finish;
    String durability;
    String design;
    String usage;
    String warranty;
    String manufacturer;
    double rating;
    boolean isWaterResistant;

    public SoapHolder() {
        this(1, "Generic", "Plastic", "White", 50.0, "Rectangle", 200.0, "Medium", "Basic", true, 2, "India", "Matte", "Medium", "Simple", "Bathroom", "6 months", "ABC Pvt Ltd", 4.0, true);
    }

    public SoapHolder(int holderId, String brand, String material, String color, double price, String shape, double weight, String size, String type, boolean isWallMounted, int capacity, String countryOfOrigin, String finish, String durability, String design, String usage, String warranty, String manufacturer, double rating, boolean isWaterResistant) {
        this.holderId = holderId;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.weight = weight;
        this.size = size;
        this.type = type;
        this.isWallMounted = isWallMounted;
        this.capacity = capacity;
        this.countryOfOrigin = countryOfOrigin;
        this.finish = finish;
        this.durability = durability;
        this.design = design;
        this.usage = usage;
        this.warranty = warranty;
        this.manufacturer = manufacturer;
        this.rating = rating;
        this.isWaterResistant = isWaterResistant;
    }

    public SoapHolder(int holderId, String brand, double price) {
        this(holderId, brand, "Steel", "Silver", price, "Oval", 300.0, "Large", "Premium", true, 3, "India", "Glossy", "High", "Modern", "Bathroom", "1 year", "XYZ Ltd", 4.5, true);
    }

    public void displayDetails() {
        System.out.println(holderId + " " + brand + " " + material + " " + color + " " + price + " " + shape + " " + weight + " " + size + " " + type + " " + isWallMounted + " " + capacity + " " + countryOfOrigin + " " + finish + " " + durability + " " + design + " " + usage + " " + warranty + " " + manufacturer + " " + rating + " " + isWaterResistant);
    }
}

