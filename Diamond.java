class Diamond {
    int diamondId;
    String diamondName;
    double weight;
    String color;
    String clarity;
    String originCountry;
    int discoveredYear;
    String discoveredBy;
    String cutType;
    String shape;
    String category;
    String hardness;
    double price;
    String owner;
    String displaySection;
    String certification;
    String lightingType;
    String status;
    String usage;
    String rarity;

    public Diamond(int diamondId, String diamondName, double weight, String color,
                  String clarity, String originCountry, int discoveredYear, 
                  String discoveredBy, String cutType, String shape, String category,
                  String hardness, double price, String owner, String displaySection,
                  String certification, String lightingType, String status, 
                  String usage, String rarity) {
        this.diamondId = diamondId;
        this.diamondName = diamondName;
        this.weight = weight;
        this.color = color;
        this.clarity = clarity;
        this.originCountry = originCountry;
        this.discoveredYear = discoveredYear;
        this.discoveredBy = discoveredBy;
        this.cutType = cutType;
        this.shape = shape;
        this.category = category;
        this.hardness = hardness;
        this.price = price;
        this.owner = owner;
        this.displaySection = displaySection;
        this.certification = certification;
        this.lightingType = lightingType;
        this.status = status;
        this.usage = usage;
        this.rarity = rarity;
    }

    public void getDiamondDetails() {
        System.out.println("DiamondId: " + diamondId);
        System.out.println("DiamondName: " + diamondName);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Clarity: " + clarity);
        System.out.println("OriginCountry: " + originCountry);
        System.out.println("DiscoveredYear: " + discoveredYear);
        System.out.println("DiscoveredBy: " + discoveredBy);
        System.out.println("CutType: " + cutType);
        System.out.println("Shape: " + shape);
        System.out.println("Category: " + category);
        System.out.println("Hardness: " + hardness);
        System.out.println("Price: " + price);
        System.out.println("Owner: " + owner);
        System.out.println("DisplaySection: " + displaySection);
        System.out.println("Certification: " + certification);
        System.out.println("LightingType: " + lightingType);
        System.out.println("Status: " + status);
        System.out.println("Usage: " + usage);
        System.out.println("Rarity: " + rarity);
    }
}