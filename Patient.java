class Patient {
    private int patientId;
    private String name;
    private String disease;

    public void setPatientId(int patientId) { 
	this.patientId = patientId; 
	}
	
    public void setName(String name) { 
	this.name = name; 
	}
	
    public void setDisease(String disease) { 
	this.disease = disease; 
	}

    public int getPatientId() { 
	return patientId;
	}
    public String getName() { 
	return name; 
	}
    public String getDisease() { 
	return disease; 
	}
}