class Jacket{
    String brand;
    String color;
    String size;
    double price;
    String material;

    Jacket(){
        System.out.println("Jacket class Default constructor");
    }

    Jacket(String brand, String color, String size, double price, String material){
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.material = material;

        System.out.println(this.brand+" "+this.color+" "+this.size+" "+this.price+" "+this.material);
    }
}