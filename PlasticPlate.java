class PlasticPlate {

    int plateId;
    String brand;
    String color;
    double price;
    double diameter;
    String shape;
    String material;
    boolean isReusable;
    double weight;
    String pattern;
    int quantity;
    String manufacturer;
    String country;
    boolean isMicrowaveSafe;
    boolean isDishwasherSafe;
    String type;
    double thickness;
    String packaging;
    String qualityGrade;
    String usage;

    PlasticPlate() {
        this(1, "Generic", "White", 50.0, 10.5);
    }

    PlasticPlate(int plateId, String brand, String color, double price, double diameter) {
        this(plateId, brand, color, price, diameter, "Round", "Plastic", true, 200.0, "Plain", 10,
             "ABC Ltd", "India", true, true, "Disposable", 2.0, "Box", "A", "Home");
    }

    PlasticPlate(int plateId, String brand, String color, double price, double diameter,
                 String shape, String material, boolean isReusable, double weight,
                 String pattern, int quantity, String manufacturer, String country,
                 boolean isMicrowaveSafe, boolean isDishwasherSafe, String type,
                 double thickness, String packaging, String qualityGrade, String usage) {

        this.plateId = plateId;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.diameter = diameter;
        this.shape = shape;
        this.material = material;
        this.isReusable = isReusable;
        this.weight = weight;
        this.pattern = pattern;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.country = country;
        this.isMicrowaveSafe = isMicrowaveSafe;
        this.isDishwasherSafe = isDishwasherSafe;
        this.type = type;
        this.thickness = thickness;
        this.packaging = packaging;
        this.qualityGrade = qualityGrade;
        this.usage = usage;
    }

    void display() {
        System.out.println(plateId);
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
        System.out.println(diameter);
        System.out.println(shape);
        System.out.println(material);
        System.out.println(isReusable);
        System.out.println(weight);
        System.out.println(pattern);
        System.out.println(quantity);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(isMicrowaveSafe);
        System.out.println(isDishwasherSafe);
        System.out.println(type);
        System.out.println(thickness);
        System.out.println(packaging);
        System.out.println(qualityGrade);
        System.out.println(usage);
    }
}

