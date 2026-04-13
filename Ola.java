class Ola{
	Driver drivers[] = new Driver[5];
	int index;
	
	public boolean addDriver(Driver driver){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isVehicleValid = false;
		
		int id = driver.getDriverId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = driver.getDriverName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String vehicle = driver.getVehicleType();
		if(vehicle != null && !vehicle.isEmpty()){
			isVehicleValid = true;
		}
		
		if(isIdValid && isNameValid && isVehicleValid){
			if(index < drivers.length){
				this.drivers[index++] = driver;
				isAdded = true;
			}else{
				System.out.println("Ola Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Driver d : drivers){
			if(d != null){
				System.out.println(d.getDriverId()+" "+d.getDriverName()+" "+d.getVehicleType());
			}
		}
	}
}