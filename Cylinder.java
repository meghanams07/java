class Cylinder {
    int cylinderId;
    String brand;
    String color;
    double height;
    double radius;
    double volume;
    double weight;
    String material;
    String type;
    int capacity;
    boolean isFilled;
    String gasType;
    String manufacturer;
    int manufactureYear;
    double price;
    String country;
    String valveType;
    double pressure;
    String usage;
    int warrantyYears;

    public Cylinder() {
        this(1, "HP", "Red", 10.5, 3.5);
    }

    public Cylinder(int cylinderId, String brand, String color, double height, double radius) {
        this(cylinderId, brand, color, height, radius, 0.0, 15.0, "Steel", "Domestic", 50);
    }

    public Cylinder(int cylinderId, String brand, String color, double height, double radius, double volume, double weight, String material, String type, int capacity) {
        this.cylinderId = cylinderId;
        this.brand = brand;
        this.color = color;
        this.height = height;
        this.radius = radius;
        this.volume = volume;
        this.weight = weight;
        this.material = material;
        this.type = type;
        this.capacity = capacity;
        this.isFilled = true;
        this.gasType = "LPG";
        this.manufacturer = "IndianOil";
        this.manufactureYear = 2024;
        this.price = 1200.50;
        this.country = "India";
        this.valveType = "Standard";
        this.pressure = 200.5;
        this.usage = "Home";
        this.warrantyYears = 5;
    }

    public void displayDetails() {
        System.out.println(cylinderId + " " + brand + " " + color + " " + height + " " + radius + " " + volume + " " + weight + " " + material + " " + type + " " + capacity + " " + isFilled + " " + gasType + " " + manufacturer + " " + manufactureYear + " " + price + " " + country + " " + valveType + " " + pressure + " " + usage + " " + warrantyYears);
    }
}

