class Railway{
	Train trains[] = new Train[5];
	int index;
	
	public boolean addTrain(Train train){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isDestValid = false;
		
		int id = train.getTrainId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = train.getTrainName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String dest = train.getDestination();
		if(dest != null && !dest.isEmpty()){
			isDestValid = true;
		}
		
		if(isIdValid && isNameValid && isDestValid){
			if(index < trains.length){
				this.trains[index++] = train;
				isAdded = true;
			}else{
				System.out.println("Railway Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Train t : trains){
			if(t != null){
				System.out.println(t.getTrainId()+" "+t.getTrainName()+" "+t.getDestination());
			}
		}
	}
}