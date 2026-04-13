class Doctor{
	private int doctorId;
	private String doctorName;
	private String specialization;
	
	public void setDoctorId(int doctorId){
		this.doctorId = doctorId;
	}
	
	public void setDoctorName(String doctorName){
		this.doctorName = doctorName;
	}
	
	public void setSpecialization(String specialization){
		this.specialization = specialization;
	}
	
	public int getDoctorId(){
		return doctorId;
	}
	
	public String getDoctorName(){
		return doctorName;
	}
	
	public String getSpecialization(){
		return specialization;
	}
}