class IceCream {

    Flavour flavour;

    public boolean addFlavour(Flavour flavour) {
        this.flavour = flavour;
        return true;
    }

    public IceCream(Flavour flavour) {
        this.flavour = flavour;
    }

    public IceCream() {
    }

    public void getDetails() {
        System.out.println(this.flavour.flavourId);
        System.out.println(this.flavour.name);
        System.out.println(this.flavour.type);
        System.out.println(this.flavour.price);
        System.out.println(this.flavour.isAvailable);
        System.out.println(this.flavour.color);
        System.out.println(this.flavour.ingredients);
        System.out.println(this.flavour.popularity);
    }
}