class HappyDentExecutor{
    public static void main(String[] args){

        HappyDent gum=new HappyDent();

        gum.flavor="Mint";
        gum.price=10;
        gum.brand="HappyDent";
        gum.quantity=5;
        gum.color="White";
        gum.sugarFree=true;

        System.out.println("Flavor :"+gum.flavor);
        System.out.println("Price :"+gum.price);
        System.out.println("Brand :"+gum.brand);
        System.out.println("Quantity :"+gum.quantity);
        System.out.println("Color :"+gum.color);
        System.out.println("Sugar free :"+gum.sugarFree);

        String ingredients[]={"Mint","Sugar","Flavoring"};
        System.out.println("Ingredients :");

        for(String i:ingredients){
            System.out.println(i);
        }

        String shopNames[]={"Reliance Store","More Store","Local Shop"};
        System.out.println("Shop names :");

        for(String s:shopNames){
            System.out.println(s);
        }
    }
}