class PhoneSettings {

    private int settingId;
    private String wifi;
    private String bluetooth;
    private String mobileData;
    private String brightness;
    private String volume;
    private String airplaneMode;
    private String location;
    private String theme;

    public void setSettingId(int settingId){
        this.settingId = settingId;
    }

    public int getSettingId(){
        return this.settingId;
    }

    public void setWifi(String wifi){
        this.wifi = wifi;
    }

    public String getWifi(){
        return this.wifi;
    }

    public void setBluetooth(String bluetooth){
        this.bluetooth = bluetooth;
    }

    public String getBluetooth(){
        return this.bluetooth;
    }

    public void setMobileData(String mobileData){
        this.mobileData = mobileData;
    }

    public String getMobileData(){
        return this.mobileData;
    }

    public void setBrightness(String brightness){
        this.brightness = brightness;
    }

    public String getBrightness(){
        return this.brightness;
    }

    public void setVolume(String volume){
        this.volume = volume;
    }

    public String getVolume(){
        return this.volume;
    }

    public void setAirplaneMode(String airplaneMode){
        this.airplaneMode = airplaneMode;
    }

    public String getAirplaneMode(){
        return this.airplaneMode;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }

    public void setTheme(String theme){
        this.theme = theme;
    }

    public String getTheme(){
        return this.theme;
    }
}