class FoodStreetReferenceExecutor {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.stallNumber = 102;
        stall.stallName = "Green Leaf";
        stall.cuisineType = "South Indian";
        stall.priceRange = 120.00;
        stall.isVeg = true;
        stall.location = "Food Street Lane";
        stall.openingTime = "9:00 AM";
        stall.closingTime = "9:00 PM";

        FoodStreet fs = new FoodStreet();
        fs.stall = stall;
        fs.getDetails();
    }
}