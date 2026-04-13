class Parcel{
	private int parcelId;
	private String senderName;
	private String destination;
	
	public void setParcelId(int parcelId){
		this.parcelId = parcelId;
	}
	
	public void setSenderName(String senderName){
		this.senderName = senderName;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}
	
	public int getParcelId(){
		return parcelId;
	}
	
	public String getSenderName(){
		return senderName;
	}
	
	public String getDestination(){
		return destination;
	}
}