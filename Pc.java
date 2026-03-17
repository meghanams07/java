class Pc {
    int pcId;
    String pcName;
    String brand;
    String processor;
    int ram;
    int storage;
    String os;
    String motherboard;
    String graphicCard;
    String cabinetType;
    int usbPorts;
    String wifi;
    String bluetooth;
    String color;
    int powerSupply;
    String keyboardType;
    String mouseType;
    String monitorType;
    int year;
    String status;
    Hardware hardware;

    public Pc(int pcId, String pcName, String brand, String processor, int ram, int storage,
              String os, String motherboard, String graphicCard, String cabinetType,
              int usbPorts, String wifi, String bluetooth, String color, int powerSupply,
              String keyboardType, String mouseType, String monitorType, int year,
              String status, Hardware hardware) {
        this.pcId = pcId;
        this.pcName = pcName;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.motherboard = motherboard;
        this.graphicCard = graphicCard;
        this.cabinetType = cabinetType;
        this.usbPorts = usbPorts;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.color = color;
        this.powerSupply = powerSupply;
        this.keyboardType = keyboardType;
        this.mouseType = mouseType;
        this.monitorType = monitorType;
        this.year = year;
        this.status = status;
        this.hardware = hardware;
    }

    public void displayDetails() {
        System.out.println("PcId: " + pcId);
        System.out.println("PcName: " + pcName);
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("OS: " + os);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("GraphicCard: " + graphicCard);
        System.out.println("CabinetType: " + cabinetType);
        System.out.println("UsbPorts: " + usbPorts);
        System.out.println("Wifi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Color: " + color);
        System.out.println("PowerSupply: " + powerSupply);
        System.out.println("KeyboardType: " + keyboardType);
        System.out.println("MouseType: " + mouseType);
        System.out.println("MonitorType: " + monitorType);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
        this.hardware.displayDetails();
    }
}
