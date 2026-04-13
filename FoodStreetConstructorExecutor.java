class FoodStreetConstructorExecutor {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.stallNumber = 103;
        stall.stallName = "Tandoori Hub";
        stall.cuisineType = "North Indian";
        stall.priceRange = 200.00;
        stall.isVeg = false;
        stall.location = "City Center";
        stall.openingTime = "11:00 AM";
        stall.closingTime = "11:00 PM";

        FoodStreet fs = new FoodStreet(stall);
        fs.getDetails();
    }
}