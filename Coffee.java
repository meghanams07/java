class Coffee{
    String type;

    Coffee(){
        System.out.println("Coffee class Default constructor");
    }

    Coffee(String type){
        this.type = type;
        System.out.println(this.type);
    }
}