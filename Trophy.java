class Trophy {

    String name;
    String material;
    String color;
    double height;
    double weight;
    String shape;
    String eventName;
    String category;
    int year;
    String winnerName;
    String organization;
    String country;
    String manufacturer;
    double price;
    String finish;
    boolean engraved;
    String baseMaterial;
    String designStyle;
    int warrantyYears;
    boolean available;

    Trophy(String name, String material, String color, double height, double weight,
           String shape, String eventName, String category, int year, String winnerName,
           String organization, String country, String manufacturer, double price,
           String finish, boolean engraved, String baseMaterial, String designStyle,
           int warrantyYears, boolean available) {

        this.name = name;
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.shape = shape;
        this.eventName = eventName;
        this.category = category;
        this.year = year;
        this.winnerName = winnerName;
        this.organization = organization;
        this.country = country;
        this.manufacturer = manufacturer;
        this.price = price;
        this.finish = finish;
        this.engraved = engraved;
        this.baseMaterial = baseMaterial;
        this.designStyle = designStyle;
        this.warrantyYears = warrantyYears;
        this.available = available;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
        System.out.println("Shape : " + this.shape);
        System.out.println("Event Name : " + this.eventName);
        System.out.println("Category : " + this.category);
        System.out.println("Year : " + this.year);
        System.out.println("Winner Name : " + this.winnerName);
        System.out.println("Organization : " + this.organization);
        System.out.println("Country : " + this.country);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Price : " + this.price);
        System.out.println("Finish : " + this.finish);
        System.out.println("Engraved : " + this.engraved);
        System.out.println("Base Material : " + this.baseMaterial);
        System.out.println("Design Style : " + this.designStyle);
        System.out.println("Warranty Years : " + this.warrantyYears);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}