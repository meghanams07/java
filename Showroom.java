class Showroom{
	Car cars[] = new Car[5];
	int index;
	
	public boolean addCar(Car car){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isBrandValid = false;
		boolean isPriceValid = false;
		
		int id = car.getCarId();
		if(id > 0){
			isIdValid = true;
		}
		
		String brand = car.getBrand();
		if(brand != null && !brand.isEmpty()){
			isBrandValid = true;
		}
		
		double price = car.getPrice();
		if(price > 0){
			isPriceValid = true;
		}
		
		if(isIdValid && isBrandValid && isPriceValid){
			if(index < cars.length){
				this.cars[index++] = car;
				isAdded = true;
			}else{
				System.out.println("Showroom Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Car c : cars){
			if(c != null){
				System.out.println(c.getCarId()+" "+c.getBrand()+" "+c.getPrice());
			}
		}
	}
}