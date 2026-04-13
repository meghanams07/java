class FoodItem{
	private int foodId;
	private String foodName;
	private double price;
	
	public void setFoodId(int foodId){
		this.foodId = foodId;
	}
	
	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getFoodId(){
		return foodId;
	}
	
	public String getFoodName(){
		return foodName;
	}
	
	public double getPrice(){
		return price;
	}
}