class Flipkart{
	Order orders[] = new Order[5];
	int index;
	
	public boolean addOrder(Order order){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isAmountValid = false;
		
		int id = order.getOrderId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = order.getProductName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		double amt = order.getAmount();
		if(amt > 0){
			isAmountValid = true;
		}
		
		if(isIdValid && isNameValid && isAmountValid){
			if(index < orders.length){
				this.orders[index++] = order;
				isAdded = true;
			}else{
				System.out.println("Flipkart Full");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Order o : orders){
			if(o != null){
				System.out.println(o.getOrderId()+" "+o.getProductName()+" "+o.getAmount());
			}
		}
	}
}