class Bangle{
    String material;

    Bangle(){
        System.out.println("Bangle class Default constructor");
    }

    Bangle(String material){
        this.material = material;
        System.out.println(this.material);
    }
}