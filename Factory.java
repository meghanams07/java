class Factory {
    int factoryId;
    String factoryName;
    String location;
    String owner;
    int workers;
    String product;
    int area;
    String shift;
    int machinesCount;
    String powerSource;
    String manager;
    int establishedYear;
    String city;
    String country;
    String safetyLevel;
    String color;
    int productionCapacity;
    String status;
    String category;
    String license;
    Machine machine;

    public Factory(int factoryId, String factoryName, String location, String owner, 
                   int workers, String product, int area, String shift, int machinesCount,
                   String powerSource, String manager, int establishedYear, String city,
                   String country, String safetyLevel, String color, int productionCapacity,
                   String status, String category, String license, Machine machine) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.location = location;
        this.owner = owner;
        this.workers = workers;
        this.product = product;
        this.area = area;
        this.shift = shift;
        this.machinesCount = machinesCount;
        this.powerSource = powerSource;
        this.manager = manager;
        this.establishedYear = establishedYear;
        this.city = city;
        this.country = country;
        this.safetyLevel = safetyLevel;
        this.color = color;
        this.productionCapacity = productionCapacity;
        this.status = status;
        this.category = category;
        this.license = license;
        this.machine = machine;
    }

    public void getFactoryDetails() {
        System.out.println("FactoryId: " + factoryId);
        System.out.println("FactoryName: " + factoryName);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Workers: " + workers);
        System.out.println("Product: " + product);
        System.out.println("Area: " + area);
        System.out.println("Shift: " + shift);
        System.out.println("MachinesCount: " + machinesCount);
        System.out.println("PowerSource: " + powerSource);
        System.out.println("Manager: " + manager);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("SafetyLevel: " + safetyLevel);
        System.out.println("Color: " + color);
        System.out.println("ProductionCapacity: " + productionCapacity);
        System.out.println("Status: " + status);
        System.out.println("Category: " + category);
        System.out.println("License: " + license);
        this.machine.getMachineDetails();
    }
}