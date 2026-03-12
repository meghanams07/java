class Bracelet{

    String brand;
    String material;
    String color;
    int price;
    int size;
    String type;

    Bracelet(){
        System.out.println("Bracelet Default Constructor");
    }

    Bracelet(String brand,String material,String color,int price,int size,String type){
        this.brand=brand;
        this.material=material;
        this.color=color;
        this.price=price;
        this.size=size;
        this.type=type;
    }
}