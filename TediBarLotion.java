class TediBarLotion {

    int lotionId;
    String brand;
    String fragrance;
    double price;
    int quantity;
    String color;
    String type;
    String skinType;
    String manufacturer;
    String country;
    double weight;
    String expiryDate;
    String manufactureDate;
    boolean isOrganic;
    int rating;
    String packagingType;
    String size;
    String usage;
    String ingredients;
    boolean isAvailable;

    public TediBarLotion() {
        this(1, "TediBar", "Mild", 120.5, 2, "White", "Baby Lotion", "All Skin",
             "Curatio", "India", 200.0, "12-2026", "01-2024", true, 5,
             "Bottle", "Medium", "Daily Use", "Aloe Vera", true);
    }

    public TediBarLotion(int lotionId, String brand, String fragrance, double price, int quantity,
                         String color, String type, String skinType, String manufacturer,
                         String country, double weight, String expiryDate, String manufactureDate,
                         boolean isOrganic, int rating, String packagingType, String size,
                         String usage, String ingredients, boolean isAvailable) {

        this.lotionId = lotionId;
        this.brand = brand;
        this.fragrance = fragrance;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.type = type;
        this.skinType = skinType;
        this.manufacturer = manufacturer;
        this.country = country;
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.manufactureDate = manufactureDate;
        this.isOrganic = isOrganic;
        this.rating = rating;
        this.packagingType = packagingType;
        this.size = size;
        this.usage = usage;
        this.ingredients = ingredients;
        this.isAvailable = isAvailable;
    }

    public TediBarLotion(int lotionId, String brand, double price) {
        this(lotionId, brand, "Soft", price, 1, "White", "Cream", "Normal",
             "Curatio", "India", 100.0, "12-2025", "01-2024", true, 4,
             "Tube", "Small", "Daily", "Milk", true);
    }

    public void displayDetails() {
        System.out.println(lotionId + " " + brand + " " + fragrance + " " + price + " " + quantity + " " +
                color + " " + type + " " + skinType + " " + manufacturer + " " + country + " " +
                weight + " " + expiryDate + " " + manufactureDate + " " + isOrganic + " " +
                rating + " " + packagingType + " " + size + " " + usage + " " +
                ingredients + " " + isAvailable);
    }
}

