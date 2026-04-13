class Amazon{
	Product products[] = new Product[5];
	int index;
	
	public boolean addProduct(Product product){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isPriceValid = false;
		
		int id = product.getProductId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = product.getProductName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		double price = product.getPrice();
		if(price > 0){
			isPriceValid = true;
		}
		
		if(isIdValid && isNameValid && isPriceValid){
			if(index < products.length){
				this.products[index++] = product;
				isAdded = true;
			}else{
				System.out.println("Amazon Storage Full ❌");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Product p : products){
			if(p != null){
				System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice());
			}
		}
	}
}