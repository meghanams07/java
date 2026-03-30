class BroadcastDetails {

    private int broadcastId;
    private String channelName;
    private String programName;
    private String language;
    private String timing;
    private String duration;
    private String type;
    private String host;
    private String status;

    public void setBroadcastId(int broadcastId){
        this.broadcastId = broadcastId;
    }

    public int getBroadcastId(){
        return this.broadcastId;
    }

    public void setChannelName(String channelName){
        this.channelName = channelName;
    }

    public String getChannelName(){
        return this.channelName;
    }

    public void setProgramName(String programName){
        this.programName = programName;
    }

    public String getProgramName(){
        return this.programName;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return this.language;
    }

    public void setTiming(String timing){
        this.timing = timing;
    }

    public String getTiming(){
        return this.timing;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public String getDuration(){
        return this.duration;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setHost(String host){
        this.host = host;
    }

    public String getHost(){
        return this.host;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}