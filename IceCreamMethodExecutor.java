class IceCreamMethodExecutor {
    public static void main(String[] args) {

        Flavour flavour = new Flavour();
        flavour.flavourId = 1;
        flavour.name = "Chocolate";
        flavour.type = "Dairy";
        flavour.price = 80.0;
        flavour.isAvailable = true;
        flavour.color = "Brown";
        flavour.ingredients = "Cocoa, Milk, Sugar";
        flavour.popularity = "High";

        IceCream iceCream = new IceCream();
        iceCream.addFlavour(flavour);
        iceCream.getDetails();
    }
}