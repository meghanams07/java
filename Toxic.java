class Toxic {

    String substanceName;
    String chemicalFormula;
    String category;
    String color;
    String odor;
    String physicalState;
    double toxicityLevel;
    String exposureType;
    String healthEffect;
    String antidote;
    String storageCondition;
    String manufacturer;
    String country;
    double molecularWeight;
    boolean flammable;
    boolean corrosive;
    String hazardLevel;
    int shelfLifeMonths;
    String usage;
    boolean restricted;

    Toxic(String substanceName, String chemicalFormula, String category, String color,
          String odor, String physicalState, double toxicityLevel, String exposureType,
          String healthEffect, String antidote, String storageCondition,
          String manufacturer, String country, double molecularWeight,
          boolean flammable, boolean corrosive, String hazardLevel,
          int shelfLifeMonths, String usage, boolean restricted) {

        this.substanceName = substanceName;
        this.chemicalFormula = chemicalFormula;
        this.category = category;
        this.color = color;
        this.odor = odor;
        this.physicalState = physicalState;
        this.toxicityLevel = toxicityLevel;
        this.exposureType = exposureType;
        this.healthEffect = healthEffect;
        this.antidote = antidote;
        this.storageCondition = storageCondition;
        this.manufacturer = manufacturer;
        this.country = country;
        this.molecularWeight = molecularWeight;
        this.flammable = flammable;
        this.corrosive = corrosive;
        this.hazardLevel = hazardLevel;
        this.shelfLifeMonths = shelfLifeMonths;
        this.usage = usage;
        this.restricted = restricted;
    }

    void display() {

        System.out.println("Substance Name : " + this.substanceName);
        System.out.println("Chemical Formula : " + this.chemicalFormula);
        System.out.println("Category : " + this.category);
        System.out.println("Color : " + this.color);
        System.out.println("Odor : " + this.odor);
        System.out.println("Physical State : " + this.physicalState);
        System.out.println("Toxicity Level : " + this.toxicityLevel);
        System.out.println("Exposure Type : " + this.exposureType);
        System.out.println("Health Effect : " + this.healthEffect);
        System.out.println("Antidote : " + this.antidote);
        System.out.println("Storage Condition : " + this.storageCondition);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country : " + this.country);
        System.out.println("Molecular Weight : " + this.molecularWeight);
        System.out.println("Flammable : " + this.flammable);
        System.out.println("Corrosive : " + this.corrosive);
        System.out.println("Hazard Level : " + this.hazardLevel);
        System.out.println("Shelf Life (Months) : " + this.shelfLifeMonths);
        System.out.println("Usage : " + this.usage);
        System.out.println("Restricted : " + this.restricted);
        System.out.println("-----------------------------------");
    }
}