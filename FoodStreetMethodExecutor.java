class FoodStreetMethodExecutor {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.stallNumber = 101;
        stall.stallName = "Spicy Bites";
        stall.cuisineType = "Indian";
        stall.priceRange = 150.50;
        stall.isVeg = false;
        stall.location = "Main Road";
        stall.openingTime = "10:00 AM";
        stall.closingTime = "10:00 PM";

        FoodStreet fs = new FoodStreet();
        fs.addStall(stall);
        fs.getDetails();
    }
}