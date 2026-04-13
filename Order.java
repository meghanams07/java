class Order {
    private int orderId;
    private String item;
    private double price;

    public void setOrderId(int orderId) {
	this.orderId = orderId; 
	}
    public void setItem(String item) { 
	this.item = item;
	}
    public void setPrice(double price) { 
	this.price = price; 
	}

    public int getOrderId() { 
	return orderId; 
	}
    public String getItem() {
	return item; 
	}
    public double getPrice() { 
	return price; 
	}
}