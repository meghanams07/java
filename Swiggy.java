class Swiggy{
	FoodItem items[] = new FoodItem[5];
	int index;
	
	public boolean addFoodItem(FoodItem item){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isPriceValid = false;
		
		int id = item.getFoodId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = item.getFoodName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		double price = item.getPrice();
		if(price > 0){
			isPriceValid = true;
		}
		
		if(isIdValid && isNameValid && isPriceValid){
			if(index < items.length){
				this.items[index++] = item;
				isAdded = true;
			}else{
				System.out.println("Swiggy Full");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(FoodItem f : items){
			if(f != null){
				System.out.println(f.getFoodId()+" "+f.getFoodName()+" "+f.getPrice());
			}
		}
	}
}