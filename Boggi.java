class Boggi {
    int boggiId;
    String boggiType;
    int seats;
    String classType;
    int windows;
    int doors;
    String color;
    int weight;
    String material;
    int number;
    String acType;
    int fans;
    int lights;
    String company;
    int year;
    int length;
    int width;
    int height;
    String condition;
    String status;

    public Boggi(int boggiId, String boggiType, int seats, String classType, int windows, 
                int doors, String color, int weight, String material, int number, 
                String acType, int fans, int lights, String company, int year, 
                int length, int width, int height, String condition, String status) {
        this.boggiId = boggiId;
        this.boggiType = boggiType;
        this.seats = seats;
        this.classType = classType;
        this.windows = windows;
        this.doors = doors;
        this.color = color;
        this.weight = weight;
        this.material = material;
        this.number = number;
        this.acType = acType;
        this.fans = fans;
        this.lights = lights;
        this.company = company;
        this.year = year;
        this.length = length;
        this.width = width;
        this.height = height;
        this.condition = condition;
        this.status = status;
    }

    public void displayDetails() {
        System.out.println("BoggiId: " + boggiId);
        System.out.println("BoggiType: " + boggiType);
        System.out.println("Seats: " + seats);
        System.out.println("ClassType: " + classType);
        System.out.println("Windows: " + windows);
        System.out.println("Doors: " + doors);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Number: " + number);
        System.out.println("ACType: " + acType);
        System.out.println("Fans: " + fans);
        System.out.println("Lights: " + lights);
        System.out.println("Company: " + company);
        System.out.println("Year: " + year);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Condition: " + condition);
        System.out.println("Status: " + status);
    }
}