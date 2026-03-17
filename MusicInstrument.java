class MusicInstrument {
    int instrumentId;
    String instrumentName;
    String type;
    String material;
    String originCountry;
    int strings;
    int weight;
    String color;
    String brand;
    int year;
    String soundType;
    String tuning;
    String category;
    String playerType;
    String size;
    String maintenance;
    String usage;
    String manufacturer;
    String status;
    String priceRange;

    public MusicInstrument(int instrumentId, String instrumentName, String type, String material,
                          String originCountry, int strings, int weight, String color, String brand,
                          int year, String soundType, String tuning, String category, String playerType,
                          String size, String maintenance, String usage, String manufacturer,
                          String status, String priceRange) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.type = type;
        this.material = material;
        this.originCountry = originCountry;
        this.strings = strings;
        this.weight = weight;
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.soundType = soundType;
        this.tuning = tuning;
        this.category = category;
        this.playerType = playerType;
        this.size = size;
        this.maintenance = maintenance;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.status = status;
        this.priceRange = priceRange;
    }

    public void getMusicInstrumentDetails() {
        System.out.println("InstrumentId: " + instrumentId);
        System.out.println("InstrumentName: " + instrumentName);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("OriginCountry: " + originCountry);
        System.out.println("Strings: " + strings);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("SoundType: " + soundType);
        System.out.println("Tuning: " + tuning);
        System.out.println("Category: " + category);
        System.out.println("PlayerType: " + playerType);
        System.out.println("Size: " + size);
        System.out.println("Maintenance: " + maintenance);
        System.out.println("Usage: " + usage);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Status: " + status);
        System.out.println("PriceRange: " + priceRange);
    }
}