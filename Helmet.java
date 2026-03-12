class Helmet {

    String brand;
    String type;
    String color;
    int size;
    double weight;
    String material;
    int price;
    String safetyRating;
    String visorType;
    String country;

    Helmet() {
        System.out.println("Helmet Default Constructor");
    }

    Helmet(String brand, String type, String color, int size, double weight,
           String material, int price, String safetyRating, String visorType, String country) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.price = price;
        this.safetyRating = safetyRating;
        this.visorType = visorType;
        this.country = country;
    }
}