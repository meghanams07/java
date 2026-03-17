class Earth {
    int planetId;
    String planetName;
    String type;
    double radius;
    double mass;
    double gravity;
    int continents;
    int oceans;
    int countries;
    int population;
    String atmosphere;
    String temperature;
    String rotationPeriod;
    String revolutionPeriod;
    String satellite;
    String color;
    String lifeExistence;
    String category;
    String status;
    String description;

    public Earth(int planetId, String planetName, String type, double radius, double mass,
                double gravity, int continents, int oceans, int countries, int population,
                String atmosphere, String temperature, String rotationPeriod,
                String revolutionPeriod, String satellite, String color, String lifeExistence,
                String category, String status, String description) {
        this.planetId = planetId;
        this.planetName = planetName;
        this.type = type;
        this.radius = radius;
        this.mass = mass;
        this.gravity = gravity;
        this.continents = continents;
        this.oceans = oceans;
        this.countries = countries;
        this.population = population;
        this.atmosphere = atmosphere;
        this.temperature = temperature;
        this.rotationPeriod = rotationPeriod;
        this.revolutionPeriod = revolutionPeriod;
        this.satellite = satellite;
        this.color = color;
        this.lifeExistence = lifeExistence;
        this.category = category;
        this.status = status;
        this.description = description;
    }

    public void displayDetails() {
        System.out.println("=== PLANET #" + planetId + " DETAILS ===");
        System.out.println("PlanetId: " + planetId);
        System.out.println("PlanetName: " + planetName);
        System.out.println("Type: " + type);
        System.out.println("Radius: " + radius + " km");
        System.out.println("Mass: " + mass + " Earth masses");
        System.out.println("Gravity: " + gravity + " m/s²");
        System.out.println("Continents: " + continents);
        System.out.println("Oceans: " + oceans);
        System.out.println("Countries: " + countries);
        System.out.println("Population: " + population);
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("Temperature: " + temperature);
        System.out.println("RotationPeriod: " + rotationPeriod);
        System.out.println("RevolutionPeriod: " + revolutionPeriod);
        System.out.println("Satellite: " + satellite);
        System.out.println("Color: " + color);
        System.out.println("LifeExistence: " + lifeExistence);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);
        System.out.println("================================");
    }
}
