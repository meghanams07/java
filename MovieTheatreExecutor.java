class MovieTheatreExecutor{
	public static void main(String[] args){
		MovieTheatre theatre = new MovieTheatre();
		theatre.theatreName = "ionex";
		theatre.ownerName = "Alice";
		theatre.location = "Salem, 5 roads";
		theatre.totalScreens = 4;
		theatre.ticketPrice= 230;
		System.out.println("Theatre name is :"+theatre.theatreName);
		System.out.println("Owner name is :"+theatre.ownerName);
		System.out.println("location is :"+theatre.location);
		System.out.println("Total no of screens :"+theatre.totalScreens);
		System.out.println("ticket price is :"+theatre.ticketPrice);
		
		String movieNames[] = {"Jananayagan", "Theri", "Master", "Thupakki"};
		System.out.println("movie name is :");
		for(String movieName:movieNames){
			System.out.println(movieName);
		}

		String showTimings[] = {"9:00 am", "12:30pm", "2:00 pm","6:00pm"};
		System.out.println("show timings is :");
		for(String showTiming: showTimings){
			System.out.println(showTiming);
		}
		
		int seatNumbers[] = {23, 50, 45, 32, 87, 9};
		System.out.println("seat number is :");
		for(int seatNumber:seatNumbers){
			System.out.println(seatNumber);
		}
	
		String snackItems[] = {"popcorn", "coolDrinks"};
		System.out.println("snack item is :");
		for(String snackItem:snackItems){
			System.out.println(snackItem);
		}
		double snackPrices[] = {50.00, 93.45};
		System.out.println("snack price is :");
		for(double snackPrice:snackPrices){
			System.out.println(snackPrice);
		}

	}
}
		
		
		
		
