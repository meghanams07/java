class Esp32Device {

    private int deviceId;
    private String deviceName;
    private String wifiStatus;
    private String bluetoothStatus;
    private String gpioPins;
    private String analogValue;
    private String temperature;
    private String voltage;
    private String mode;

    public void setDeviceId(int deviceId){
        this.deviceId = deviceId;
    }

    public int getDeviceId(){
        return this.deviceId;
    }

    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }

    public String getDeviceName(){
        return this.deviceName;
    }

    public void setWifiStatus(String wifiStatus){
        this.wifiStatus = wifiStatus;
    }

    public String getWifiStatus(){
        return this.wifiStatus;
    }

    public void setBluetoothStatus(String bluetoothStatus){
        this.bluetoothStatus = bluetoothStatus;
    }

    public String getBluetoothStatus(){
        return this.bluetoothStatus;
    }

    public void setGpioPins(String gpioPins){
        this.gpioPins = gpioPins;
    }

    public String getGpioPins(){
        return this.gpioPins;
    }

    public void setAnalogValue(String analogValue){
        this.analogValue = analogValue;
    }

    public String getAnalogValue(){
        return this.analogValue;
    }

    public void setTemperature(String temperature){
        this.temperature = temperature;
    }

    public String getTemperature(){
        return this.temperature;
    }

    public void setVoltage(String voltage){
        this.voltage = voltage;
    }

    public String getVoltage(){
        return this.voltage;
    }

    public void setMode(String mode){
        this.mode = mode;
    }

    public String getMode(){
        return this.mode;
    }
}