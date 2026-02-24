class DoorDash {

    public static double doorDashFood(String foodName){

        double doorDashPrice = 0.0d;

        if(foodName == "Classic Pepperoni Pizza")
		{ doorDashPrice = 259.00d; return doorDashPrice; }
        else if(foodName == "Mexican Veg Pizza")
		{ doorDashPrice = 239.00d; return doorDashPrice; }
        else if(foodName == "Chicken Alfredo Pasta")
		{ doorDashPrice = 219.00d; return doorDashPrice; }
        else if(foodName == "Spicy Chicken Wings")
		{ doorDashPrice = 199.00d; return doorDashPrice; }
        else if(foodName == "Veg Lasagna")
		{ doorDashPrice = 189.00d; return doorDashPrice; }
        else if(foodName == "Cheese Quesadilla")
		{ doorDashPrice = 149.00d; return doorDashPrice; }
        else if(foodName == "Chicken Taco")
		{ doorDashPrice = 129.00d; return doorDashPrice; }
        else if(foodName == "Beef Burger")
		{ doorDashPrice = 179.00d; return doorDashPrice; }
        else if(foodName == "Grilled Sandwich")
		{ doorDashPrice = 119.00d; return doorDashPrice; }
        else if(foodName == "Stuffed Garlic Bread")
		{ doorDashPrice = 139.00d; return doorDashPrice; }
        else if(foodName == "Cheese Corn Balls")
		{ doorDashPrice = 149.00d; return doorDashPrice; }
        else if(foodName == "Veg Burrito")
		{ doorDashPrice = 159.00d; return doorDashPrice; }
        else if(foodName == "Chicken Burrito")
		{ doorDashPrice = 189.00d; return doorDashPrice; }
        else if(foodName == "BBQ Chicken Burger")
		{ doorDashPrice = 169.00d; return doorDashPrice; }
        else if(foodName == "Loaded Fries")
		{ doorDashPrice = 129.00d; return doorDashPrice; }
        else if(foodName == "Nacho Platter")
		{ doorDashPrice = 179.00d; return doorDashPrice; }
        else if(foodName == "Veg Wrap")
		{ doorDashPrice = 119.00d; return doorDashPrice; }
        else if(foodName == "Chicken Wrap Deluxe")
		{ doorDashPrice = 179.00d; return doorDashPrice; }
        else if(foodName == "Cheese Pasta")
		{ doorDashPrice = 199.00d; return doorDashPrice; }
        else if(foodName == "Peri Peri Chicken")
		{ doorDashPrice = 229.00d; return doorDashPrice; }
        else if(foodName == "Veg Nuggets")
		{ doorDashPrice = 99.00d; return doorDashPrice; }
        else if(foodName == "Chicken Nuggets")
		{ doorDashPrice = 139.00d; return doorDashPrice; }
        else if(foodName == "Veg Salad Bowl")
		{ doorDashPrice = 129.00d; return doorDashPrice; }
        else if(foodName == "Caesar Salad")
		{ doorDashPrice = 159.00d; return doorDashPrice; }
        else if(foodName == "Paneer Pizza Slice")
		{ doorDashPrice = 109.00d; return doorDashPrice; }
        else if(foodName == "Chicken Pizza Slice")
		{ doorDashPrice = 129.00d; return doorDashPrice; }
        else if(foodName == "Chocolate Milkshake")
		{ doorDashPrice = 119.00d; return doorDashPrice; }
        else if(foodName == "Vanilla Milkshake")
		{ doorDashPrice = 109.00d; return doorDashPrice; }
        else if(foodName == "Cold Brew Coffee")
		{ doorDashPrice = 99.00d; return doorDashPrice; }
        else if(foodName == "Lemon Iced Tea")
		{ doorDashPrice = 79.00d; return doorDashPrice; }
        else if(foodName == "Peach Iced Tea")
		{ doorDashPrice = 89.00d; return doorDashPrice; }
        else if(foodName == "Cappuccino")
		{ doorDashPrice = 99.00d; return doorDashPrice; }
        else if(foodName == "Latte")
		{ doorDashPrice = 109.00d; return doorDashPrice; }
        else if(foodName == "Mocha")
		{ doorDashPrice = 119.00d; return doorDashPrice; }
        else if(foodName == "Hot Chocolate")
		{ doorDashPrice = 89.00d; return doorDashPrice; }
        else if(foodName == "Choco Lava Cake")
		{ doorDashPrice = 129.00d; return doorDashPrice; }
        else if(foodName == "Blueberry Cheesecake")
		{ doorDashPrice = 199.00d; return doorDashPrice; }
        else if(foodName == "Strawberry Cheesecake")
		{ doorDashPrice = 189.00d; return doorDashPrice; }
        else if(foodName == "Tiramisu")
		{ doorDashPrice = 229.00d; return doorDashPrice; }
        else if(foodName == "Apple Pie")
		{ doorDashPrice = 149.00d; return doorDashPrice; }
        else if(foodName == "Brownie Fudge")
		{ doorDashPrice = 139.00d; return doorDashPrice; }
        else if(foodName == "Veg Combo Meal")
		{ doorDashPrice = 199.00d; return doorDashPrice; }
        else if(foodName == "Chicken Combo Meal")
		{ doorDashPrice = 249.00d; return doorDashPrice; }
        else if(foodName == "Family Pizza Pack")
		{ doorDashPrice = 599.00d; return doorDashPrice; }
        else if(foodName == "Mega Burger Combo")
		{ doorDashPrice = 349.00d; return doorDashPrice; }
        else if(foodName == "Party Nachos Pack")
		{ doorDashPrice = 399.00d; return doorDashPrice; }
        else if(foodName == "Chicken Platter")
		{ doorDashPrice = 459.00d; return doorDashPrice; }
        else if(foodName == "Veg Platter")
		{ doorDashPrice = 359.00d; return doorDashPrice; }
        else if(foodName == "Premium Pasta Box")
		{ doorDashPrice = 289.00d; return doorDashPrice; }
        else if(foodName == "Loaded Chicken Box")
		{ doorDashPrice = 499.00d; return doorDashPrice; }
        else if(foodName == "Ultimate Snack Combo")
		{ doorDashPrice = 299.00d; return doorDashPrice; }
        else if(foodName == "Deluxe Dessert Box")
		{ doorDashPrice = 399.00d; return doorDashPrice; }
        else { System.out.println("Food is not found.."); }

        return doorDashPrice;
    };
	
	public static double doorDashFood(String foodName, int quantity){

        double doorDashPrice = 0.0d;

        if(foodName == "Classic Pepperoni Pizza")
		{ doorDashPrice = 259.00d*quantity; return doorDashPrice; }
        else if(foodName == "Mexican Veg Pizza")
		{ doorDashPrice = 239.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Alfredo Pasta")
		{ doorDashPrice = 219.00d*quantity; return doorDashPrice; }
        else if(foodName == "Spicy Chicken Wings")
		{ doorDashPrice = 199.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Lasagna")
		{ doorDashPrice = 189.00d*quantity; return doorDashPrice; }
        else if(foodName == "Cheese Quesadilla")
		{ doorDashPrice = 149.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Taco")
		{ doorDashPrice = 129.00d*quantity; return doorDashPrice; }
        else if(foodName == "Beef Burger")
		{ doorDashPrice = 179.00d*quantity; return doorDashPrice; }
        else if(foodName == "Grilled Sandwich")
		{ doorDashPrice = 119.00d*quantity; return doorDashPrice; }
        else if(foodName == "Stuffed Garlic Bread")
		{ doorDashPrice = 139.00d*quantity; return doorDashPrice; }
        else if(foodName == "Cheese Corn Balls")
		{ doorDashPrice = 149.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Burrito")
		{ doorDashPrice = 159.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Burrito")
		{ doorDashPrice = 189.00d*quantity; return doorDashPrice; }
        else if(foodName == "BBQ Chicken Burger")
		{ doorDashPrice = 169.00d*quantity; return doorDashPrice; }
        else if(foodName == "Loaded Fries")
		{ doorDashPrice = 129.00d*quantity; return doorDashPrice; }
        else if(foodName == "Nacho Platter")
		{ doorDashPrice = 179.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Wrap")
		{ doorDashPrice = 119.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Wrap Deluxe")
		{ doorDashPrice = 179.00d*quantity; return doorDashPrice; }
        else if(foodName == "Cheese Pasta")
		{ doorDashPrice = 199.00d*quantity; return doorDashPrice; }
        else if(foodName == "Peri Peri Chicken")
		{ doorDashPrice = 229.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Nuggets")
		{ doorDashPrice = 99.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Nuggets")
		{ doorDashPrice = 139.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Salad Bowl")
		{ doorDashPrice = 129.00d*quantity; return doorDashPrice; }
        else if(foodName == "Caesar Salad")
		{ doorDashPrice = 159.00d*quantity; return doorDashPrice; }
        else if(foodName == "Paneer Pizza Slice")
		{ doorDashPrice = 109.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Pizza Slice")
		{ doorDashPrice = 129.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chocolate Milkshake")
		{ doorDashPrice = 119.00d*quantity; return doorDashPrice; }
        else if(foodName == "Vanilla Milkshake")
		{ doorDashPrice = 109.00d*quantity; return doorDashPrice; }
        else if(foodName == "Cold Brew Coffee")
		{ doorDashPrice = 99.00d*quantity; return doorDashPrice; }
        else if(foodName == "Lemon Iced Tea")
		{ doorDashPrice = 79.00d*quantity; return doorDashPrice; }
        else if(foodName == "Peach Iced Tea")
		{ doorDashPrice = 89.00d*quantity; return doorDashPrice; }
        else if(foodName == "Cappuccino")
		{ doorDashPrice = 99.00d*quantity; return doorDashPrice; }
        else if(foodName == "Latte")
		{ doorDashPrice = 109.00d*quantity; return doorDashPrice; }
        else if(foodName == "Mocha")
		{ doorDashPrice = 119.00d*quantity; return doorDashPrice; }
        else if(foodName == "Hot Chocolate")
		{ doorDashPrice = 89.00d*quantity; return doorDashPrice; }
        else if(foodName == "Choco Lava Cake")
		{ doorDashPrice = 129.00d*quantity; return doorDashPrice; }
        else if(foodName == "Blueberry Cheesecake")
		{ doorDashPrice = 199.00d*quantity; return doorDashPrice; }
        else if(foodName == "Strawberry Cheesecake")
		{ doorDashPrice = 189.00d*quantity; return doorDashPrice; }
        else if(foodName == "Tiramisu")
		{ doorDashPrice = 229.00d*quantity; return doorDashPrice; }
        else if(foodName == "Apple Pie")
		{ doorDashPrice = 149.00d*quantity; return doorDashPrice; }
        else if(foodName == "Brownie Fudge")
		{ doorDashPrice = 139.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Combo Meal")
		{ doorDashPrice = 199.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Combo Meal")
		{ doorDashPrice = 249.00d*quantity; return doorDashPrice; }
        else if(foodName == "Family Pizza Pack")
		{ doorDashPrice = 599.00d*quantity; return doorDashPrice; }
        else if(foodName == "Mega Burger Combo")
		{ doorDashPrice = 349.00d*quantity; return doorDashPrice; }
        else if(foodName == "Party Nachos Pack")
		{ doorDashPrice = 399.00d*quantity; return doorDashPrice; }
        else if(foodName == "Chicken Platter")
		{ doorDashPrice = 459.00d*quantity; return doorDashPrice; }
        else if(foodName == "Veg Platter")
		{ doorDashPrice = 359.00d*quantity; return doorDashPrice; }
        else if(foodName == "Premium Pasta Box")
		{ doorDashPrice = 289.00d*quantity; return doorDashPrice; }
        else if(foodName == "Loaded Chicken Box")
		{ doorDashPrice = 499.00d*quantity; return doorDashPrice; }
        else if(foodName == "Ultimate Snack Combo")
		{ doorDashPrice = 299.00d*quantity; return doorDashPrice; }
        else if(foodName == "Deluxe Dessert Box")
		{ doorDashPrice = 399.00d*quantity; return doorDashPrice; }
        else { System.out.println("Food is not found.."); }

        return doorDashPrice;
    };
}
