class WeddingPlannerExecutor{
	public static void main(String[] args){
		WeddingPlanner planner = new WeddingPlanner();
		planner.plannerName = "Riya";
		planner.companyName = "Dream Weddings";
		planner.location = "Bangalore";
		planner.totalStaff = 25;
		planner.packagePrice = 150000;

		System.out.println("Planner name is :"+planner.plannerName);
		System.out.println("Company name is :"+planner.companyName);
		System.out.println("Location is :"+planner.location);
		System.out.println("Total staff :"+planner.totalStaff);
		System.out.println("Package price :"+planner.packagePrice);

		String eventNames[] = {"Engagement","Mehendi","Reception","Wedding"};
		System.out.println("Event names are :");
		for(String eventName:eventNames){
			System.out.println(eventName);
		}

		String decorationTypes[] = {"Floral","Traditional","Modern"};
		System.out.println("Decoration types are :");
		for(String decorationType:decorationTypes){
			System.out.println(decorationType);
		}

		int guestCounts[] = {200,300,250};
		System.out.println("Guest counts are :");
		for(int guestCount:guestCounts){
			System.out.println(guestCount);
		}

		String foodItems[] = {"Biryani","Paneer","IceCream"};
		System.out.println("Food items are :");
		for(String foodItem:foodItems){
			System.out.println(foodItem);
		}

		double foodPrices[] = {250.50,180.75,90.25};
		System.out.println("Food prices are :");
		for(double foodPrice:foodPrices){
			System.out.println(foodPrice);
		}
	}
}