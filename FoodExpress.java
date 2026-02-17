class FoodExpress {

    public static double foodExpressFood(String foodName){

        double price = 0.0d;

        if(foodName == "Classic Cheese Pizza"){ price = 210.00d; return price; }
        else if(foodName == "Spicy Veg Pizza"){ price = 230.00d; return price; }
        else if(foodName == "Chicken Supreme Pizza"){ price = 310.00d; return price; }
        else if(foodName == "Veg Loaded Burger"){ price = 120.00d; return price; }
        else if(foodName == "Chicken Zinger Burger"){ price = 180.00d; return price; }
        else if(foodName == "Double Patty Burger"){ price = 220.00d; return price; }
        else if(foodName == "Veg Fried Momos"){ price = 110.00d; return price; }
        else if(foodName == "Chicken Steamed Momos"){ price = 150.00d; return price; }
        else if(foodName == "Paneer Butter Masala"){ price = 240.00d; return price; }
        else if(foodName == "Butter Chicken"){ price = 290.00d; return price; }
        else if(foodName == "Hyderabadi Biryani"){ price = 320.00d; return price; }
        else if(foodName == "Veg Dum Biryani"){ price = 210.00d; return price; }
        else if(foodName == "Tandoori Roti"){ price = 25.00d; return price; }
        else if(foodName == "Garlic Naan"){ price = 45.00d; return price; }
        else if(foodName == "Chilli Paneer"){ price = 170.00d; return price; }
        else if(foodName == "Dragon Chicken"){ price = 220.00d; return price; }
        else if(foodName == "Veg Hakka Noodles"){ price = 160.00d; return price; }
        else if(foodName == "Chicken Hakka Noodles"){ price = 190.00d; return price; }
        else if(foodName == "Veg Fried Rice"){ price = 150.00d; return price; }
        else if(foodName == "Chicken Fried Rice"){ price = 180.00d; return price; }
        else if(foodName == "Grill Chicken"){ price = 340.00d; return price; }
        else if(foodName == "Fish Fry"){ price = 260.00d; return price; }
        else if(foodName == "Prawn Masala"){ price = 330.00d; return price; }
        else if(foodName == "Veg Sandwich"){ price = 100.00d; return price; }
        else if(foodName == "Club Sandwich"){ price = 150.00d; return price; }
        else if(foodName == "French Fries"){ price = 90.00d; return price; }
        else if(foodName == "Cheese Balls"){ price = 140.00d; return price; }
        else if(foodName == "Onion Rings"){ price = 120.00d; return price; }
        else if(foodName == "Nachos Plate"){ price = 160.00d; return price; }
        else if(foodName == "White Sauce Pasta"){ price = 210.00d; return price; }
        else if(foodName == "Red Sauce Pasta"){ price = 200.00d; return price; }
        else if(foodName == "Chocolate Milkshake"){ price = 130.00d; return price; }
        else if(foodName == "Vanilla Milkshake"){ price = 120.00d; return price; }
        else if(foodName == "Oreo Shake"){ price = 150.00d; return price; }
        else if(foodName == "Cold Coffee"){ price = 110.00d; return price; }
        else if(foodName == "Lemon Iced Tea"){ price = 70.00d; return price; }
        else if(foodName == "Mint Mojito"){ price = 80.00d; return price; }
        else if(foodName == "Hot Chocolate"){ price = 95.00d; return price; }
        else if(foodName == "Choco Lava Cake"){ price = 140.00d; return price; }
        else if(foodName == "Strawberry Cheesecake"){ price = 210.00d; return price; }
        else if(foodName == "Brownie Fudge"){ price = 150.00d; return price; }
        else if(foodName == "Veg Thali"){ price = 220.00d; return price; }
        else if(foodName == "Chicken Thali"){ price = 270.00d; return price; }
        else if(foodName == "Family Pizza Pack"){ price = 650.00d; return price; }
        else if(foodName == "Mega Burger Combo"){ price = 380.00d; return price; }
        else if(foodName == "Party Snack Box"){ price = 420.00d; return price; }
        else if(foodName == "Veg Salad Bowl"){ price = 130.00d; return price; }
        else if(foodName == "Chicken Salad Bowl"){ price = 170.00d; return price; }
        else if(foodName == "Paneer Wrap"){ price = 150.00d; return price; }
        else if(foodName == "Chicken Wrap"){ price = 180.00d; return price; }
        else if(foodName == "Veg Nuggets"){ price = 110.00d; return price; }
        else { System.out.println("Food is not found.."); }

        return price;
    }
}
