class Map {

    String name;
    String type;
    String region;
    String country;
    String language;
    String scale;
    String publisher;
    String material;
    String colorScheme;
    int yearPublished;
    double price;
    double width;
    double height;
    String format;
    boolean laminated;
    boolean folded;
    String usage;
    String projectionType;
    int pages;
    boolean available;

    Map(String name, String type, String region, String country, String language,
        String scale, String publisher, String material, String colorScheme,
        int yearPublished, double price, double width, double height,
        String format, boolean laminated, boolean folded, String usage,
        String projectionType, int pages, boolean available) {

        this.name = name;
        this.type = type;
        this.region = region;
        this.country = country;
        this.language = language;
        this.scale = scale;
        this.publisher = publisher;
        this.material = material;
        this.colorScheme = colorScheme;
        this.yearPublished = yearPublished;
        this.price = price;
        this.width = width;
        this.height = height;
        this.format = format;
        this.laminated = laminated;
        this.folded = folded;
        this.usage = usage;
        this.projectionType = projectionType;
        this.pages = pages;
        this.available = available;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Region : " + this.region);
        System.out.println("Country : " + this.country);
        System.out.println("Language : " + this.language);
        System.out.println("Scale : " + this.scale);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Material : " + this.material);
        System.out.println("Color Scheme : " + this.colorScheme);
        System.out.println("Year Published : " + this.yearPublished);
        System.out.println("Price : " + this.price);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Format : " + this.format);
        System.out.println("Laminated : " + this.laminated);
        System.out.println("Folded : " + this.folded);
        System.out.println("Usage : " + this.usage);
        System.out.println("Projection Type : " + this.projectionType);
        System.out.println("Pages : " + this.pages);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}