class PostMortemReport {

    private int reportId;
    private String patientName;
    private String age;
    private String gender;
    private String causeOfDeath;
    private String timeOfDeath;
    private String placeOfDeath;
    private String doctorName;
    private String remarks;

    public void setReportId(int reportId){
        this.reportId = reportId;
    }

    public int getReportId(){
        return this.reportId;
    }

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    public String getPatientName(){
        return this.patientName;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getAge(){
        return this.age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setCauseOfDeath(String causeOfDeath){
        this.causeOfDeath = causeOfDeath;
    }

    public String getCauseOfDeath(){
        return this.causeOfDeath;
    }

    public void setTimeOfDeath(String timeOfDeath){
        this.timeOfDeath = timeOfDeath;
    }

    public String getTimeOfDeath(){
        return this.timeOfDeath;
    }

    public void setPlaceOfDeath(String placeOfDeath){
        this.placeOfDeath = placeOfDeath;
    }

    public String getPlaceOfDeath(){
        return this.placeOfDeath;
    }

    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }

    public String getDoctorName(){
        return this.doctorName;
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }
}