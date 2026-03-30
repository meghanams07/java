class NasaMission {

    private int missionId;
    private String missionName;
    private String launchDate;
    private String rocketName;
    private String missionType;
    private String destination;
    private String status;
    private String crew;
    private String agency;

    public void setMissionId(int missionId){
        this.missionId = missionId;
    }

    public int getMissionId(){
        return this.missionId;
    }

    public void setMissionName(String missionName){
        this.missionName = missionName;
    }

    public String getMissionName(){
        return this.missionName;
    }

    public void setLaunchDate(String launchDate){
        this.launchDate = launchDate;
    }

    public String getLaunchDate(){
        return this.launchDate;
    }

    public void setRocketName(String rocketName){
        this.rocketName = rocketName;
    }

    public String getRocketName(){
        return this.rocketName;
    }

    public void setMissionType(String missionType){
        this.missionType = missionType;
    }

    public String getMissionType(){
        return this.missionType;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDestination(){
        return this.destination;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setCrew(String crew){
        this.crew = crew;
    }

    public String getCrew(){
        return this.crew;
    }

    public void setAgency(String agency){
        this.agency = agency;
    }

    public String getAgency(){
        return this.agency;
    }
}