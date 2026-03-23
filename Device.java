class Device {
    String brand;
    String model;

    Device(String brand, String model) {
        System.out.println("Device constructor");
        this.brand = brand;
        this.model = model;
    }

    public void showDeviceDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}