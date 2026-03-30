class GpsDetails {

    private int gpsId;
    private String deviceName;
    private String latitude;
    private String longitude;
    private String speed;
    private String direction;
    private String altitude;
    private String status;
    private String timestamp;

    public void setGpsId(int gpsId){
        this.gpsId = gpsId;
    }

    public int getGpsId(){
        return this.gpsId;
    }

    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }

    public String getDeviceName(){
        return this.deviceName;
    }

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    public String getLatitude(){
        return this.latitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    public String getLongitude(){
        return this.longitude;
    }

    public void setSpeed(String speed){
        this.speed = speed;
    }

    public String getSpeed(){
        return this.speed;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return this.direction;
    }

    public void setAltitude(String altitude){
        this.altitude = altitude;
    }

    public String getAltitude(){
        return this.altitude;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }

    public String getTimestamp(){
        return this.timestamp;
    }
}