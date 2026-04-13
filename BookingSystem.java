class BookingSystem{
	Ticket tickets[] = new Ticket[5];
	int index;
	
	public boolean addTicket(Ticket ticket){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isSourceValid = false;
		
		int id = ticket.getTicketId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = ticket.getPassengerName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String source = ticket.getSource();
		if(source != null && !source.isEmpty()){
			isSourceValid = true;
		}
		
		if(isIdValid && isNameValid && isSourceValid){
			if(index < tickets.length){
				this.tickets[index++] = ticket;
				isAdded = true;
			}else{
				System.out.println("BookingSystem Full");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Ticket t : tickets){
			if(t != null){
				System.out.println(t.getTicketId()+" "+t.getPassengerName()+" "+t.getSource());
			}
		}
	}
}