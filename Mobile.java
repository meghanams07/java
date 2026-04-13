class Mobile{
	private int mobileId;
	private String brand;
	private double price;
	
	public void setMobileId(int mobileId){
		this.mobileId = mobileId;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getMobileId(){
		return mobileId;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public double getPrice(){
		return price;
	}
}