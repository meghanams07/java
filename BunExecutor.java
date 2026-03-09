class BunExecutor{
    public static void main(String[] args){

        Bun bun=new Bun();

        bun.name="Sweet Bun";
        bun.price=20;
        bun.flavor="Chocolate";
        bun.size="Medium";
        bun.bakery="Iyengar Bakery";
        bun.fresh=true;
        bun.quantity=10;
        bun.weight=50;
        bun.shape="Round";
        bun.color="Brown";

        System.out.println("Bun name :"+bun.name);
        System.out.println("Price :"+bun.price);
        System.out.println("Flavor :"+bun.flavor);
        System.out.println("Size :"+bun.size);
        System.out.println("Bakery :"+bun.bakery);
        System.out.println("Fresh :"+bun.fresh);
        System.out.println("Quantity :"+bun.quantity);
        System.out.println("Weight :"+bun.weight);
        System.out.println("Shape :"+bun.shape);
        System.out.println("Color :"+bun.color);

        String ingredients[]={"Flour","Sugar","Milk","Butter"};
        System.out.println("Ingredients :");

        for(String i:ingredients){
            System.out.println(i);
        }

        String outlets[]={"Reliance","More","Local Bakery"};
        System.out.println("Outlets :");

        for(String o:outlets){
            System.out.println(o);
        }
    }
}