class Driver{
	private int driverId;
	private String driverName;
	private String vehicleType;
	
	public void setDriverId(int driverId){
		this.driverId = driverId;
	}
	
	public void setDriverName(String driverName){
		this.driverName = driverName;
	}
	
	public void setVehicleType(String vehicleType){
		this.vehicleType = vehicleType;
	}
	
	public int getDriverId(){
		return driverId;
	}
	
	public String getDriverName(){
		return driverName;
	}
	
	public String getVehicleType(){
		return vehicleType;
	}
}