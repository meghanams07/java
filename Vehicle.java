class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        System.out.println("Vehicle constructor");
        this.brand = brand;
        this.speed = speed;
    }

    public void showVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}