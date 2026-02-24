class QuickBite {

    public static double quickBiteFood(String foodName){

        double price = 0.0d;

        if(foodName == "Italian Cheese Pizza")
		{ price = 220.00d; return price; }
        else if(foodName == "Mexican Fiesta Pizza")
		{ price = 260.00d; return price; }
        else if(foodName == "Paneer Delight Pizza")
		{ price = 240.00d; return price; }
        else if(foodName == "BBQ Chicken Pizza")
		{ price = 310.00d; return price; }
        else if(foodName == "Veg Loaded Burger")
		{ price = 130.00d; return price; }
        else if(foodName == "Chicken Crunch Burger")
		{ price = 190.00d; return price; }
        else if(foodName == "Double Patty Blast")
		{ price = 230.00d; return price; }
        else if(foodName == "Veg Club Sandwich")
		{ price = 120.00d; return price; }
        else if(foodName == "Chicken Club Sandwich")
		{ price = 160.00d; return price; }
        else if(foodName == "Grilled Paneer Wrap")
		{ price = 170.00d; return price; }
        else if(foodName == "Spicy Chicken Wrap")
		{ price = 200.00d; return price; }
        else if(foodName == "Veg Fried Rice Special")
		{ price = 155.00d; return price; }
        else if(foodName == "Chicken Fried Rice Special")
		{ price = 195.00d; return price; }
        else if(foodName == "Veg Hakka Noodles Deluxe")
		{ price = 150.00d; return price; }
        else if(foodName == "Chicken Hakka Noodles Deluxe")
		{ price = 185.00d; return price; }
        else if(foodName == "Paneer Butter Masala Premium")
		{ price = 250.00d; return price; }
        else if(foodName == "Classic Butter Chicken")
		{ price = 300.00d; return price; }
        else if(foodName == "Veg Dum Biryani Royal")
		{ price = 220.00d; return price; }
        else if(foodName == "Chicken Dum Biryani Royal")
		{ price = 340.00d; return price; }
        else if(foodName == "Mutton Dum Biryani Royal")
		{ price = 390.00d; return price; }
        else if(foodName == "Garlic Naan Special")
		{ price = 50.00d; return price; }
        else if(foodName == "Butter Roti Soft")
		{ price = 35.00d; return price; }
        else if(foodName == "Chilli Paneer Crunch")
		{ price = 180.00d; return price; }
        else if(foodName == "Dragon Chicken Spicy")
		{ price = 220.00d; return price; }
        else if(foodName == "Crispy French Fries")
		{ price = 95.00d; return price; }
        else if(foodName == "Cheese Loaded Fries")
		{ price = 130.00d; return price; }
        else if(foodName == "Nachos Fiesta Plate")
		{ price = 190.00d; return price; }
        else if(foodName == "Veg Steam Momos")
		{ price = 120.00d; return price; }
        else if(foodName == "Chicken Steam Momos")
		{ price = 160.00d; return price; }
        else if(foodName == "Chocolate Thick Shake")
		{ price = 140.00d; return price; }
        else if(foodName == "Strawberry Thick Shake")
		{ price = 135.00d; return price; }
        else if(foodName == "Oreo Blast Shake")
		{ price = 160.00d; return price; }
        else if(foodName == "Classic Cold Coffee")
		{ price = 115.00d; return price; }
        else if(foodName == "Fresh Lemon Soda")
		{ price = 65.00d; return price; }
        else if(foodName == "Mint Mojito Fresh")
		{ price = 80.00d; return price; }
        else if(foodName == "Hot Chocolate Premium")
		{ price = 100.00d; return price; }
        else if(foodName == "Tomato Cream Soup")
		{ price = 90.00d; return price; }
        else if(foodName == "Sweet Corn Delight Soup")
		{ price = 100.00d; return price; }
        else if(foodName == "Mushroom Cream Soup")
		{ price = 110.00d; return price; }
        else if(foodName == "Fudge Brownie Slice")
		{ price = 150.00d; return price; }
        else if(foodName == "Ice Cream Sundae Classic")
		{ price = 170.00d; return price; }
        else if(foodName == "Cheesecake Slice Premium")
		{ price = 200.00d; return price; }
        else if(foodName == "Apple Pie Warm")
		{ price = 180.00d; return price; }
        else if(foodName == "Veg Deluxe Thali")
		{ price = 240.00d; return price; }
        else if(foodName == "Chicken Deluxe Thali")
		{ price = 290.00d; return price; }
        else if(foodName == "Family Pizza Combo Pack")
		{ price = 650.00d; return price; }
        else if(foodName == "Mega Burger Feast Combo")
		{ price = 420.00d; return price; }
        else if(foodName == "Party Snack Fiesta Box")
		{ price = 480.00d; return price; }
        else if(foodName == "Veg Platter Special")
		{ price = 360.00d; return price; }
        else if(foodName == "Chicken Platter Special")
		{ price = 500.00d; return price; }
        else if(foodName == "Paneer Kathi Roll Special")
		{ price = 165.00d; return price; }
        else if(foodName == "Chicken Kathi Roll Special")
		{ price = 195.00d; return price; }
        else if(foodName == "Fresh Veg Salad Bowl")
		{ price = 140.00d; return price; }
        else if(foodName == "Fresh Chicken Salad Bowl")
		{ price = 180.00d; return price; }
        else if(foodName == "Premium Dessert Combo Box")
		{ price = 450.00d; return price; }
        else { System.out.println("Food is not found.."); }

        return price;
    };
	
	public static double quickBiteFood(String foodName, int quantity){

        double price = 0.0d;

        if(foodName == "Italian Cheese Pizza")
		{ price = 220.00d*quantity; return price; }
        else if(foodName == "Mexican Fiesta Pizza")
		{ price = 260.00d*quantity; return price; }
        else if(foodName == "Paneer Delight Pizza")
		{ price = 240.00d*quantity; return price; }
        else if(foodName == "BBQ Chicken Pizza")
		{ price = 310.00d*quantity; return price; }
        else if(foodName == "Veg Loaded Burger")
		{ price = 130.00d*quantity; return price; }
        else if(foodName == "Chicken Crunch Burger")
		{ price = 190.00d*quantity; return price; }
        else if(foodName == "Double Patty Blast")
		{ price = 230.00d*quantity; return price; }
        else if(foodName == "Veg Club Sandwich")
		{ price = 120.00d*quantity; return price; }
        else if(foodName == "Chicken Club Sandwich")
		{ price = 160.00d*quantity; return price; }
        else if(foodName == "Grilled Paneer Wrap")
		{ price = 170.00d*quantity; return price; }
        else if(foodName == "Spicy Chicken Wrap")
		{ price = 200.00d*quantity; return price; }
        else if(foodName == "Veg Fried Rice Special")
		{ price = 155.00d*quantity; return price; }
        else if(foodName == "Chicken Fried Rice Special")
		{ price = 195.00d*quantity; return price; }
        else if(foodName == "Veg Hakka Noodles Deluxe")
		{ price = 150.00d*quantity; return price; }
        else if(foodName == "Chicken Hakka Noodles Deluxe")
		{ price = 185.00d*quantity; return price; }
        else if(foodName == "Paneer Butter Masala Premium")
		{ price = 250.00d*quantity; return price; }
        else if(foodName == "Classic Butter Chicken")
		{ price = 300.00d*quantity; return price; }
        else if(foodName == "Veg Dum Biryani Royal")
		{ price = 220.00d*quantity; return price; }
        else if(foodName == "Chicken Dum Biryani Royal")
		{ price = 340.00d*quantity; return price; }
        else if(foodName == "Mutton Dum Biryani Royal")
		{ price = 390.00d*quantity; return price; }
        else if(foodName == "Garlic Naan Special")
		{ price = 50.00d*quantity; return price; }
        else if(foodName == "Butter Roti Soft")
		{ price = 35.00d*quantity; return price; }
        else if(foodName == "Chilli Paneer Crunch")
		{ price = 180.00d*quantity; return price; }
        else if(foodName == "Dragon Chicken Spicy")
		{ price = 220.00d*quantity; return price; }
        else if(foodName == "Crispy French Fries")
		{ price = 95.00d*quantity; return price; }
        else if(foodName == "Cheese Loaded Fries")
		{ price = 130.00d*quantity; return price; }
        else if(foodName == "Nachos Fiesta Plate")
		{ price = 190.00d*quantity; return price; }
        else if(foodName == "Veg Steam Momos")
		{ price = 120.00d*quantity; return price; }
        else if(foodName == "Chicken Steam Momos")
		{ price = 160.00d*quantity; return price; }
        else if(foodName == "Chocolate Thick Shake")
		{ price = 140.00d*quantity; return price; }
        else if(foodName == "Strawberry Thick Shake")
		{ price = 135.00d*quantity; return price; }
        else if(foodName == "Oreo Blast Shake")
		{ price = 160.00d*quantity; return price; }
        else if(foodName == "Classic Cold Coffee")
		{ price = 115.00d*quantity; return price; }
        else if(foodName == "Fresh Lemon Soda")
		{ price = 65.00d*quantity; return price; }
        else if(foodName == "Mint Mojito Fresh")
		{ price = 80.00d*quantity; return price; }
        else if(foodName == "Hot Chocolate Premium")
		{ price = 100.00d*quantity; return price; }
        else if(foodName == "Tomato Cream Soup")
		{ price = 90.00d*quantity; return price; }
        else if(foodName == "Sweet Corn Delight Soup")
		{ price = 100.00d*quantity; return price; }
        else if(foodName == "Mushroom Cream Soup")
		{ price = 110.00d*quantity; return price; }
        else if(foodName == "Fudge Brownie Slice")
		{ price = 150.00d*quantity; return price; }
        else if(foodName == "Ice Cream Sundae Classic")
		{ price = 170.00d*quantity; return price; }
        else if(foodName == "Cheesecake Slice Premium")
		{ price = 200.00d*quantity; return price; }
        else if(foodName == "Apple Pie Warm")
		{ price = 180.00d*quantity; return price; }
        else if(foodName == "Veg Deluxe Thali")
		{ price = 240.00d*quantity; return price; }
        else if(foodName == "Chicken Deluxe Thali")
		{ price = 290.00d*quantity; return price; }
        else if(foodName == "Family Pizza Combo Pack")
		{ price = 650.00d*quantity; return price; }
        else if(foodName == "Mega Burger Feast Combo")
		{ price = 420.00d*quantity; return price; }
        else if(foodName == "Party Snack Fiesta Box")
		{ price = 480.00d*quantity; return price; }
        else if(foodName == "Veg Platter Special")
		{ price = 360.00d*quantity; return price; }
        else if(foodName == "Chicken Platter Special")
		{ price = 500.00d*quantity; return price; }
        else if(foodName == "Paneer Kathi Roll Special")
		{ price = 165.00d*quantity; return price; }
        else if(foodName == "Chicken Kathi Roll Special")
		{ price = 195.00d*quantity; return price; }
        else if(foodName == "Fresh Veg Salad Bowl")
		{ price = 140.00d*quantity; return price; }
        else if(foodName == "Fresh Chicken Salad Bowl")
		{ price = 180.00d*quantity; return price; }
        else if(foodName == "Premium Dessert Combo Box")
		{ price = 450.00d*quantity; return price; }
        else { System.out.println("Food is not found.."); }

        return price;
    }
}
