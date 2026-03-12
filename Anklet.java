class Anklet{
    String material;

    Anklet(){
        System.out.println("Anklet class Default constructor");
    }

    Anklet(String material){
        this.material = material;
        System.out.println(this.material);
    }
}