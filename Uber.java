class Uber{
	Passenger passengers[] = new Passenger[5];
	int index;
	
	public boolean addPassenger(Passenger passenger){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isLocationValid = false;
		
		int id = passenger.getPassengerId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = passenger.getPassengerName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String loc = passenger.getLocation();
		if(loc != null && !loc.isEmpty()){
			isLocationValid = true;
		}
		
		if(isIdValid && isNameValid && isLocationValid){
			if(index < passengers.length){
				this.passengers[index++] = passenger;
				isAdded = true;
			}else{
				System.out.println("Uber Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Passenger p : passengers){
			if(p != null){
				System.out.println(p.getPassengerId()+" "+p.getPassengerName()+" "+p.getLocation());
			}
		}
	}
}