class Car {

    String brand;
    String model;
    String fuelType;
    int seatingCapacity;
    String transmission;
    double price;
    String color;
    double engineCapacity;
    int mileage;
    boolean airConditioner;
    boolean bluetooth;
    boolean sunroof;

    Car(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Car(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Car(String brand, String model, String fuelType){
        this.fuelType = fuelType;
        System.out.println("Fuel Type : " + fuelType);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
        System.out.println("Seating Capacity : " + seatingCapacity);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission){
        this.transmission = transmission;
        System.out.println("Transmission : " + transmission);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price, String color, double engineCapacity){
        this.engineCapacity = engineCapacity;
        System.out.println("Engine Capacity : " + engineCapacity);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price, String color, double engineCapacity, int mileage){
        this.mileage = mileage;
        System.out.println("Mileage : " + mileage);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price, String color, double engineCapacity, int mileage, boolean airConditioner){
        this.airConditioner = airConditioner;
        System.out.println("Air Conditioner : " + airConditioner);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price, String color, double engineCapacity, int mileage, boolean airConditioner, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Car(String brand, String model, String fuelType, int seatingCapacity, String transmission, double price, String color, double engineCapacity, int mileage, boolean airConditioner, boolean bluetooth, boolean sunroof){
        this.sunroof = sunroof;
        System.out.println("Sunroof : " + sunroof);
    }
}