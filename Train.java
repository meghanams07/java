class Train{
	private int trainId;
	private String trainName;
	private String destination;
	
	public void setTrainId(int trainId){
		this.trainId = trainId;
	}
	
	public void setTrainName(String trainName){
		this.trainName = trainName;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}
	
	public int getTrainId(){
		return trainId;
	}
	
	public String getTrainName(){
		return trainName;
	}
	
	public String getDestination(){
		return destination;
	}
}