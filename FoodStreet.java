class FoodStreet {

    Stall stall;

    public boolean addStall(Stall stall) {
        this.stall = stall;
        return true;
    }

    public FoodStreet(Stall stall) {
        this.stall = stall;
    }

    public FoodStreet() {
    }

    public void getDetails() {
        System.out.println(this.stall.stallNumber);
        System.out.println(this.stall.stallName);
        System.out.println(this.stall.cuisineType);
        System.out.println(this.stall.priceRange);
        System.out.println(this.stall.isVeg);
        System.out.println(this.stall.location);
        System.out.println(this.stall.openingTime);
        System.out.println(this.stall.closingTime);
    }
}