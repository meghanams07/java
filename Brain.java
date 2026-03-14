class Brain {

    String name;
    String species;
    double weight;
    double volume;
    int neurons;
    int lobes;
    String function;
    String hemisphere;
    String color;
    String structure;
    boolean healthy;
    String disease;
    String researcher;
    String institute;
    String country;
    int studyYear;
    String nervousSystemType;
    String developmentStage;
    double oxygenConsumption;
    boolean active;

    Brain(String name, String species, double weight, double volume, int neurons,
          int lobes, String function, String hemisphere, String color, String structure,
          boolean healthy, String disease, String researcher, String institute,
          String country, int studyYear, String nervousSystemType,
          String developmentStage, double oxygenConsumption, boolean active) {

        this.name = name;
        this.species = species;
        this.weight = weight;
        this.volume = volume;
        this.neurons = neurons;
        this.lobes = lobes;
        this.function = function;
        this.hemisphere = hemisphere;
        this.color = color;
        this.structure = structure;
        this.healthy = healthy;
        this.disease = disease;
        this.researcher = researcher;
        this.institute = institute;
        this.country = country;
        this.studyYear = studyYear;
        this.nervousSystemType = nervousSystemType;
        this.developmentStage = developmentStage;
        this.oxygenConsumption = oxygenConsumption;
        this.active = active;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Species : " + this.species);
        System.out.println("Weight : " + this.weight);
        System.out.println("Volume : " + this.volume);
        System.out.println("Neurons : " + this.neurons);
        System.out.println("Lobes : " + this.lobes);
        System.out.println("Function : " + this.function);
        System.out.println("Hemisphere : " + this.hemisphere);
        System.out.println("Color : " + this.color);
        System.out.println("Structure : " + this.structure);
        System.out.println("Healthy : " + this.healthy);
        System.out.println("Disease : " + this.disease);
        System.out.println("Researcher : " + this.researcher);
        System.out.println("Institute : " + this.institute);
        System.out.println("Country : " + this.country);
        System.out.println("Study Year : " + this.studyYear);
        System.out.println("Nervous System Type : " + this.nervousSystemType);
        System.out.println("Development Stage : " + this.developmentStage);
        System.out.println("Oxygen Consumption : " + this.oxygenConsumption);
        System.out.println("Active : " + this.active);
        System.out.println("-----------------------------------");
    }
}