class Universe {
    int universeId;
    String universeName;
    String type;
    long galaxies;
    long stars;
    long planets;
    String discoveredBy;
    int discoveredYear;
    String theory;
    String age;
    String expansionType;
    String color;
    String dimension;
    String structure;
    String category;
    String origin;
    String temperature;
    String status;
    String observationMethod;
    String description;
    Earth earth;

    public Universe(int universeId, String universeName, String type, long galaxies, long stars, 
                   long planets, String discoveredBy, int discoveredYear, String theory, String age,
                   String expansionType, String color, String dimension, String structure,
                   String category, String origin, String temperature, String status,
                   String observationMethod, String description, Earth earth) {
        this.universeId = universeId;
        this.universeName = universeName;
        this.type = type;
        this.galaxies = galaxies;
        this.stars = stars;
        this.planets = planets;
        this.discoveredBy = discoveredBy;
        this.discoveredYear = discoveredYear;
        this.theory = theory;
        this.age = age;
        this.expansionType = expansionType;
        this.color = color;
        this.dimension = dimension;
        this.structure = structure;
        this.category = category;
        this.origin = origin;
        this.temperature = temperature;
        this.status = status;
        this.observationMethod = observationMethod;
        this.description = description;
        this.earth = earth;
    }

    public void displayDetails() {
        System.out.println("=== UNIVERSE #" + universeId + " DETAILS ===");
        System.out.println("UniverseId: " + universeId);
        System.out.println("UniverseName: " + universeName);
        System.out.println("Type: " + type);
        System.out.println("Galaxies: " + galaxies);
        System.out.println("Stars: " + stars);
        System.out.println("Planets: " + planets);
        System.out.println("DiscoveredBy: " + discoveredBy);
        System.out.println("DiscoveredYear: " + discoveredYear);
        System.out.println("Theory: " + theory);
        System.out.println("Age: " + age);
        System.out.println("ExpansionType: " + expansionType);
        System.out.println("Color: " + color);
        System.out.println("Dimension: " + dimension);
        System.out.println("Structure: " + structure);
        System.out.println("Category: " + category);
        System.out.println("Origin: " + origin);
        System.out.println("Temperature: " + temperature);
        System.out.println("Status: " + status);
        System.out.println("ObservationMethod: " + observationMethod);
        System.out.println("Description: " + description);
        System.out.println();
        this.earth.displayDetails();
        System.out.println("=====================================");
        System.out.println();
    }
}