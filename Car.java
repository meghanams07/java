class Car{
	private int carId;
	private String brand;
	private double price;
	
	public void setCarId(int carId){
		this.carId = carId;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getCarId(){
		return carId;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public double getPrice(){
		return price;
	}
}