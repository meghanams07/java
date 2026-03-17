class Element {
    int atomicNumber;
    String elementName;
    String symbol;
    double atomicMass;
    String category;
    int group;
    int period;
    String state;
    String color;
    int discoveredYear;
    String discoveredBy;
    String originCountry;
    double meltingPoint;
    double boilingPoint;
    int electrons;
    int protons;
    int neutrons;
    String usage;
    String status;
    String type;

    public Element(int atomicNumber, String elementName, String symbol, double atomicMass,
                  String category, int group, int period, String state, String color,
                  int discoveredYear, String discoveredBy, String originCountry,
                  double meltingPoint, double boilingPoint, int electrons, int protons,
                  int neutrons, String usage, String status, String type) {
        this.atomicNumber = atomicNumber;
        this.elementName = elementName;
        this.symbol = symbol;
        this.atomicMass = atomicMass;
        this.category = category;
        this.group = group;
        this.period = period;
        this.state = state;
        this.color = color;
        this.discoveredYear = discoveredYear;
        this.discoveredBy = discoveredBy;
        this.originCountry = originCountry;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.electrons = electrons;
        this.protons = protons;
        this.neutrons = neutrons;
        this.usage = usage;
        this.status = status;
        this.type = type;
    }

    public void getElementDetails() {
        System.out.println("AtomicNumber: " + atomicNumber);
        System.out.println("ElementName: " + elementName);
        System.out.println("Symbol: " + symbol);
        System.out.println("AtomicMass: " + atomicMass);
        System.out.println("Category: " + category);
        System.out.println("Group: " + group);
        System.out.println("Period: " + period);
        System.out.println("State: " + state);
        System.out.println("Color: " + color);
        System.out.println("DiscoveredYear: " + discoveredYear);
        System.out.println("DiscoveredBy: " + discoveredBy);
        System.out.println("OriginCountry: " + originCountry);
        System.out.println("MeltingPoint: " + meltingPoint);
        System.out.println("BoilingPoint: " + boilingPoint);
        System.out.println("Electrons: " + electrons);
        System.out.println("Protons: " + protons);
        System.out.println("Neutrons: " + neutrons);
        System.out.println("Usage: " + usage);
        System.out.println("Status: " + status);
        System.out.println("Type: " + type);
    }
}