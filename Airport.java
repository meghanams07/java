class Airport{
	Flight flights[] = new Flight[5];
	int index;
	
	public boolean addFlight(Flight flight){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isDestValid = false;
		
		int id = flight.getFlightId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = flight.getFlightName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String dest = flight.getDestination();
		if(dest != null && !dest.isEmpty()){
			isDestValid = true;
		}
		
		if(isIdValid && isNameValid && isDestValid){
			if(index < flights.length){
				this.flights[index++] = flight;
				isAdded = true;
			}else{
				System.out.println("Airport Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Flight f : flights){
			if(f != null){
				System.out.println(f.getFlightId()+" "+f.getFlightName()+" "+f.getDestination());
			}
		}
	}
}