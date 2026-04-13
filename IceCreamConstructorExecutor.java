class IceCreamConstructorExecutor {
    public static void main(String[] args) {

        Flavour flavour = new Flavour();
        flavour.flavourId = 3;
        flavour.name = "Strawberry";
        flavour.type = "Dairy";
        flavour.price = 90.0;
        flavour.isAvailable = true;
        flavour.color = "Pink";
        flavour.ingredients = "Milk, Sugar, Strawberry";
        flavour.popularity = "High";

        IceCream iceCream = new IceCream(flavour);
        iceCream.getDetails();
    }
}