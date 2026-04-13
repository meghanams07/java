class Ticket{
	private int ticketId;
	private String passengerName;
	private String source;
	
	public void setTicketId(int ticketId){
		this.ticketId = ticketId;
	}
	
	public void setPassengerName(String passengerName){
		this.passengerName = passengerName;
	}
	
	public void setSource(String source){
		this.source = source;
	}
	
	public int getTicketId(){
		return ticketId;
	}
	
	public String getPassengerName(){
		return passengerName;
	}
	
	public String getSource(){
		return source;
	}
}