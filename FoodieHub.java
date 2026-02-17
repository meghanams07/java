class FoodieHub {

    public static double foodieHubFood(String foodName){

        double price = 0.0d;

        if(foodName == "Cheese Lovers Pizza"){ price = 230.00d; return price; }
        else if(foodName == "Spicy Chicken Pizza"){ price = 290.00d; return price; }
        else if(foodName == "Paneer Supreme Pizza"){ price = 260.00d; return price; }
        else if(foodName == "Veggie Paradise Burger"){ price = 140.00d; return price; }
        else if(foodName == "Crispy Chicken Burger"){ price = 210.00d; return price; }
        else if(foodName == "Triple Patty Burger"){ price = 260.00d; return price; }
        else if(foodName == "Veg Momos Special"){ price = 125.00d; return price; }
        else if(foodName == "Chicken Momos Special"){ price = 170.00d; return price; }
        else if(foodName == "Paneer Butter Masala Deluxe"){ price = 270.00d; return price; }
        else if(foodName == "Butter Chicken Deluxe"){ price = 320.00d; return price; }
        else if(foodName == "Royal Veg Biryani"){ price = 240.00d; return price; }
        else if(foodName == "Royal Chicken Biryani"){ price = 360.00d; return price; }
        else if(foodName == "Tandoori Roti Butter"){ price = 40.00d; return price; }
        else if(foodName == "Garlic Butter Naan"){ price = 55.00d; return price; }
        else if(foodName == "Chilli Chicken Crispy"){ price = 230.00d; return price; }
        else if(foodName == "Dragon Paneer"){ price = 200.00d; return price; }
        else if(foodName == "Veg Schezwan Noodles"){ price = 165.00d; return price; }
        else if(foodName == "Chicken Schezwan Noodles"){ price = 205.00d; return price; }
        else if(foodName == "Veg Fried Rice Combo"){ price = 170.00d; return price; }
        else if(foodName == "Chicken Fried Rice Combo"){ price = 215.00d; return price; }
        else if(foodName == "Grilled Fish Special"){ price = 340.00d; return price; }
        else if(foodName == "Prawn Fry Special"){ price = 370.00d; return price; }
        else if(foodName == "Veg Sandwich Classic"){ price = 115.00d; return price; }
        else if(foodName == "Chicken Sandwich Classic"){ price = 155.00d; return price; }
        else if(foodName == "Loaded French Fries"){ price = 120.00d; return price; }
        else if(foodName == "Cheese Corn Nuggets"){ price = 150.00d; return price; }
        else if(foodName == "Nachos Cheese Plate"){ price = 200.00d; return price; }
        else if(foodName == "White Sauce Pasta Deluxe"){ price = 230.00d; return price; }
        else if(foodName == "Red Sauce Pasta Deluxe"){ price = 220.00d; return price; }
        else if(foodName == "Chocolate Milkshake Thick"){ price = 150.00d; return price; }
        else if(foodName == "Strawberry Milkshake Thick"){ price = 145.00d; return price; }
        else if(foodName == "Oreo Chocolate Shake"){ price = 175.00d; return price; }
        else if(foodName == "Cold Coffee Special"){ price = 130.00d; return price; }
        else if(foodName == "Fresh Lime Soda"){ price = 75.00d; return price; }
        else if(foodName == "Mint Cooler"){ price = 85.00d; return price; }
        else if(foodName == "Hot Chocolate Fudge"){ price = 120.00d; return price; }
        else if(foodName == "Brownie With Ice Cream"){ price = 190.00d; return price; }
        else if(foodName == "Strawberry Cheesecake Slice"){ price = 220.00d; return price; }
        else if(foodName == "Premium Dessert Platter"){ price = 500.00d; return price; }
        else { System.out.println("Food is not found.."); }

        return price;
    }
}
