class ZanduBalm {

    int id;
    String name;
    String type;
    String brand;
    double price;
    int quantity;
    String manufacturer;
    String expiryDate;
    String manufactureDate;
    String color;
    double weight;
    String usage;
    String fragrance;
    boolean isAvailable;
    int rating;
    String country;
    String packaging;
    String effect;
    String ingredients;
    int batchNumber;

    public ZanduBalm() {
        this(1);
        System.out.println("Default constructor");
    }

    public ZanduBalm(int id) {
        this(id, "Zandu Balm");
        System.out.println("1 parameter constructor");
    }

    public ZanduBalm(int id, String name) {
        this(id, name, "Pain Relief");
        System.out.println("2 parameter constructor");
    }

    public ZanduBalm(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.brand = "Zandu";
        this.price = 50.0;
        this.quantity = 10;
        this.manufacturer = "Emami";
        this.expiryDate = "2027";
        this.manufactureDate = "2024";
        this.color = "Yellow";
        this.weight = 8.0;
        this.usage = "External";
        this.fragrance = "Strong";
        this.isAvailable = true;
        this.rating = 5;
        this.country = "India";
        this.packaging = "Bottle";
        this.effect = "Fast Relief";
        this.ingredients = "Herbal";
        this.batchNumber = 101;
        System.out.println("3 parameter constructor");
    }

    public void displayDetails() {
        System.out.println(id + " " + name + " " + type + " " + brand + " " + price + " " + quantity + " " + manufacturer + " " + expiryDate + " " + manufactureDate + " " + color + " " + weight + " " + usage + " " + fragrance + " " + isAvailable + " " + rating + " " + country + " " + packaging + " " + effect + " " + ingredients + " " + batchNumber);
    }
}

