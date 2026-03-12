class Bucket{
    String material;
    String color;
    int capacity;

    Bucket(){
        System.out.println("Bucket class Default constructor");
    }

    Bucket(String material, String color, int capacity){
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        System.out.println(this.material + " " + this.color + " " + this.capacity);
    }
}