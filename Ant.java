class Ant{
    String color;
    int legs;

    Ant(){
        System.out.println("Ant class Default constructor");
    }

    Ant(String color, int legs){
        this.color = color;
        this.legs = legs;
        System.out.println(this.color + " " + this.legs);
    }
}