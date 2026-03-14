class Organ {

    String organName;
    String system;
    String location;
    double weight;
    double size;
    String function;
    String tissueType;
    String bloodSupply;
    String nerveSupply;
    String color;
    boolean vital;
    String disease;
    String doctorSpecialist;
    String hospital;
    String country;
    int studyYear;
    String developmentStage;
    String shape;
    double oxygenUsage;
    boolean healthy;

    Organ(String organName, String system, String location, double weight, double size,
          String function, String tissueType, String bloodSupply, String nerveSupply,
          String color, boolean vital, String disease, String doctorSpecialist,
          String hospital, String country, int studyYear, String developmentStage,
          String shape, double oxygenUsage, boolean healthy) {

        this.organName = organName;
        this.system = system;
        this.location = location;
        this.weight = weight;
        this.size = size;
        this.function = function;
        this.tissueType = tissueType;
        this.bloodSupply = bloodSupply;
        this.nerveSupply = nerveSupply;
        this.color = color;
        this.vital = vital;
        this.disease = disease;
        this.doctorSpecialist = doctorSpecialist;
        this.hospital = hospital;
        this.country = country;
        this.studyYear = studyYear;
        this.developmentStage = developmentStage;
        this.shape = shape;
        this.oxygenUsage = oxygenUsage;
        this.healthy = healthy;
    }

    void display() {

        System.out.println("Organ Name : " + this.organName);
        System.out.println("System : " + this.system);
        System.out.println("Location : " + this.location);
        System.out.println("Weight : " + this.weight);
        System.out.println("Size : " + this.size);
        System.out.println("Function : " + this.function);
        System.out.println("Tissue Type : " + this.tissueType);
        System.out.println("Blood Supply : " + this.bloodSupply);
        System.out.println("Nerve Supply : " + this.nerveSupply);
        System.out.println("Color : " + this.color);
        System.out.println("Vital : " + this.vital);
        System.out.println("Disease : " + this.disease);
        System.out.println("Doctor Specialist : " + this.doctorSpecialist);
        System.out.println("Hospital : " + this.hospital);
        System.out.println("Country : " + this.country);
        System.out.println("Study Year : " + this.studyYear);
        System.out.println("Development Stage : " + this.developmentStage);
        System.out.println("Shape : " + this.shape);
        System.out.println("Oxygen Usage : " + this.oxygenUsage);
        System.out.println("Healthy : " + this.healthy);
        System.out.println("-----------------------------------");
    }
}