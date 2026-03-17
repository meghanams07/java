class Tv {
    int tvId;
    String brand;
    String model;
    int screenSize;
    String resolution;
    String displayType;
    String soundSystem;
    int hdmiPorts;
    int usbPorts;
    String wifi;
    String bluetooth;
    String color;
    int year;
    String powerConsumption;
    String remoteType;
    String operatingSystem;
    String manufacturer;
    String category;
    String warranty;
    String status;
    Channel channel;

    public Tv(int tvId, String brand, String model, int screenSize, String resolution,
              String displayType, String soundSystem, int hdmiPorts, int usbPorts,
              String wifi, String bluetooth, String color, int year, String powerConsumption,
              String remoteType, String operatingSystem, String manufacturer, String category,
              String warranty, String status, Channel channel) {
        this.tvId = tvId;
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.displayType = displayType;
        this.soundSystem = soundSystem;
        this.hdmiPorts = hdmiPorts;
        this.usbPorts = usbPorts;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.color = color;
        this.year = year;
        this.powerConsumption = powerConsumption;
        this.remoteType = remoteType;
        this.operatingSystem = operatingSystem;
        this.manufacturer = manufacturer;
        this.category = category;
        this.warranty = warranty;
        this.status = status;
        this.channel = channel;
    }

    public void displayDetails() {
        System.out.println("=== TV Details ===");
        System.out.println("TvId: " + tvId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("ScreenSize: " + screenSize);
        System.out.println("Resolution: " + resolution);
        System.out.println("DisplayType: " + displayType);
        System.out.println("SoundSystem: " + soundSystem);
        System.out.println("HdmiPorts: " + hdmiPorts);
        System.out.println("UsbPorts: " + usbPorts);
        System.out.println("Wifi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("PowerConsumption: " + powerConsumption);
        System.out.println("RemoteType: " + remoteType);
        System.out.println("OperatingSystem: " + operatingSystem);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Category: " + category);
        System.out.println("Warranty: " + warranty);
        System.out.println("Status: " + status);
        System.out.println();
        this.channel.displayDetails();
        System.out.println("==================");
        System.out.println();
    }
}