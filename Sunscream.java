class Sunscream {

    int id;
    String name;
    String type;
    String color;
    double weight;
    double height;
    int powerLevel;
    String origin;
    int speed;
    int strength;
    String weapon;
    String ability;
    int age;
    String leader;
    String team;
    int rank;
    String enemy;
    String vehicleMode;
    boolean isActive;
    double energy;

    public Sunscream() {
        this(1, "Sunscream");
    }

    public Sunscream(int id, String name) {
        this(id, name, "Decepticon", "Grey", 120.5, 15.2, 9000, "Cybertron", 850, 700, "Missiles", "Flight", 300, "Megatron", "Seekers", 2, "Autobots", "Jet", true, 5000.0);
    }

    public Sunscream(int id, String name, String type, String color, double weight, double height,
                     int powerLevel, String origin, int speed, int strength, String weapon,
                     String ability, int age, String leader, String team, int rank,
                     String enemy, String vehicleMode, boolean isActive, double energy) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.powerLevel = powerLevel;
        this.origin = origin;
        this.speed = speed;
        this.strength = strength;
        this.weapon = weapon;
        this.ability = ability;
        this.age = age;
        this.leader = leader;
        this.team = team;
        this.rank = rank;
        this.enemy = enemy;
        this.vehicleMode = vehicleMode;
        this.isActive = isActive;
        this.energy = energy;
    }

    public void display() {
        System.out.println(id + " " + name + " " + type + " " + color + " " + weight + " " + height + " " +
                powerLevel + " " + origin + " " + speed + " " + strength + " " + weapon + " " +
                ability + " " + age + " " + leader + " " + team + " " + rank + " " +
                enemy + " " + vehicleMode + " " + isActive + " " + energy);
    }
}

