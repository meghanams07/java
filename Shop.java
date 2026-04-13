class Shop{
	Mobile mobiles[] = new Mobile[5];
	int index;
	
	public boolean addMobile(Mobile mobile){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isBrandValid = false;
		boolean isPriceValid = false;
		
		int id = mobile.getMobileId();
		if(id > 0){
			isIdValid = true;
		}
		
		String brand = mobile.getBrand();
		if(brand != null && !brand.isEmpty()){
			isBrandValid = true;
		}
		
		double price = mobile.getPrice();
		if(price > 0){
			isPriceValid = true;
		}
		
		if(isIdValid && isBrandValid && isPriceValid){
			if(index < mobiles.length){
				this.mobiles[index++] = mobile;
				isAdded = true;
			}else{
				System.out.println("Shop Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Mobile m : mobiles){
			if(m != null){
				System.out.println(m.getMobileId()+" "+m.getBrand()+" "+m.getPrice());
			}
		}
	}
}