class Hospital{
	Doctor doctors[] = new Doctor[5];
	int index;
	
	public boolean addDoctor(Doctor doctor){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isSpecValid = false;
		
		int id = doctor.getDoctorId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = doctor.getDoctorName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String spec = doctor.getSpecialization();
		if(spec != null && !spec.isEmpty()){
			isSpecValid = true;
		}
		
		if(isIdValid && isNameValid && isSpecValid){
			if(index < doctors.length){
				this.doctors[index++] = doctor;
				isAdded = true;
			}else{
				System.out.println("Hospital Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Doctor d : doctors){
			if(d != null){
				System.out.println(d.getDoctorId()+" "+d.getDoctorName()+" "+d.getSpecialization());
			}
		}
	}
}