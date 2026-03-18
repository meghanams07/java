class LionDates {

    int id;
    String name;
    String location;
    int age;
    double weight;
    String color;
    String gender;
    String habitat;
    int speed;
    int teethCount;
    int clawLength;
    boolean isWild;
    String foodType;
    int lifespan;
    String prideName;
    int roarLevel;
    String originCountry;
    double height;
    String healthStatus;
    int tailLength;

    LionDates() {
        this(1, "Leo");
    }

    LionDates(int id, String name) {
        this(id, name, "Forest", 5, 190.5);
    }

    LionDates(int id, String name, String location, int age, double weight) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.age = age;
        this.weight = weight;
        this.color = "Golden";
        this.gender = "Male";
        this.habitat = "Savannah";
        this.speed = 80;
        this.teethCount = 30;
        this.clawLength = 5;
        this.isWild = true;
        this.foodType = "Carnivore";
        this.lifespan = 15;
        this.prideName = "King Pride";
        this.roarLevel = 100;
        this.originCountry = "India";
        this.height = 1.2;
        this.healthStatus = "Healthy";
        this.tailLength = 90;
    }

    void displayDetails() {
        System.out.println(id + " " + name + " " + location + " " + age + " " + weight + " " + color + " " + gender + " " + habitat + " " + speed + " " + teethCount + " " + clawLength + " " + isWild + " " + foodType + " " + lifespan + " " + prideName + " " + roarLevel + " " + originCountry + " " + height + " " + healthStatus + " " + tailLength);
    }
}

