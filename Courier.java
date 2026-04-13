class Courier{
	Parcel parcels[] = new Parcel[5];
	int index;
	
	public boolean addParcel(Parcel parcel){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isSenderValid = false;
		boolean isDestinationValid = false;
		
		int id = parcel.getParcelId();
		if(id > 0){
			isIdValid = true;
		}
		
		String sender = parcel.getSenderName();
		if(sender != null && !sender.isEmpty()){
			isSenderValid = true;
		}
		
		String dest = parcel.getDestination();
		if(dest != null && !dest.isEmpty()){
			isDestinationValid = true;
		}
		
		if(isIdValid && isSenderValid && isDestinationValid){
			if(index < parcels.length){
				this.parcels[index++] = parcel;
				isAdded = true;
			}else{
				System.out.println("Courier Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Parcel p : parcels){
			if(p != null){
				System.out.println(p.getParcelId()+" "+p.getSenderName()+" "+p.getDestination());
			}
		}
	}
}