class Order{
	private int orderId;
	private String productName;
	private double amount;
	
	public void setOrderId(int orderId){
		this.orderId = orderId;
	}
	
	public void setProductName(String productName){
		this.productName = productName;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public int getOrderId(){
		return orderId;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public double getAmount(){
		return amount;
	}
}