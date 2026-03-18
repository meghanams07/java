class Comb {
    int id;
    String brand;
    String color;
    double price;
    int teethCount;
    String material;
    double length;
    double width;
    double weight;
    String type;
    String usage;
    String country;
    String design;
    boolean flexible;
    String handleType;
    int durability;
    String shape;
    String size;
    String packaging;
    String manufacturer;

    public Comb() {
        this(1, "Basic");
        System.out.println("Default Constructor");
    }

    public Comb(int id, String brand) {
        this(id, brand, "Black", 50.0);
        System.out.println("2-parameter Constructor");
    }

    public Comb(int id, String brand, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        System.out.println("4-parameter Constructor");
    }

    public void display() {
        System.out.println(id + " " + brand + " " + color + " " + price);
    }
}

