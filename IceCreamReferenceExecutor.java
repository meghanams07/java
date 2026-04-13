class IceCreamReferenceExecutor {
    public static void main(String[] args) {

        Flavour flavour = new Flavour();
        flavour.flavourId = 2;
        flavour.name = "Vanilla";
        flavour.type = "Dairy";
        flavour.price = 70.0;
        flavour.isAvailable = true;
        flavour.color = "White";
        flavour.ingredients = "Milk, Sugar, Vanilla";
        flavour.popularity = "Medium";

        IceCream iceCream = new IceCream();
        iceCream.flavour = flavour;
        iceCream.getDetails();
    }
}