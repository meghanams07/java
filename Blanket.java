class Blanket {

    String color;
    String material;
    int price;

    Blanket(){
        System.out.println("Blanket Default Constructor");
    }

    Blanket(String color, String material, int price){
        this.color = color;
        this.material = material;
        this.price = price;
    }
}