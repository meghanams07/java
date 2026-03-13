class Bike {

    String brand;
    String model;
    int engineCC;
    String fuelType;
    double price;
    String color;
    int mileage;
    int gears;
    boolean abs;
    boolean electricStart;
    boolean bluetooth;
    boolean discBrake;

    Bike(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Bike(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Bike(String brand, String model, int engineCC){
        this.engineCC = engineCC;
        System.out.println("Engine CC : " + engineCC);
    }

    Bike(String brand, String model, int engineCC, String fuelType){
        this.fuelType = fuelType;
        System.out.println("Fuel Type : " + fuelType);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color, int mileage){
        this.mileage = mileage;
        System.out.println("Mileage : " + mileage);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color, int mileage, int gears){
        this.gears = gears;
        System.out.println("Gears : " + gears);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color, int mileage, int gears, boolean abs){
        this.abs = abs;
        System.out.println("ABS : " + abs);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color, int mileage, int gears, boolean abs, boolean electricStart){
        this.electricStart = electricStart;
        System.out.println("Electric Start : " + electricStart);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color, int mileage, int gears, boolean abs, boolean electricStart, boolean bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Bluetooth : " + bluetooth);
    }

    Bike(String brand, String model, int engineCC, String fuelType, double price, String color, int mileage, int gears, boolean abs, boolean electricStart, boolean bluetooth, boolean discBrake){
        this.discBrake = discBrake;
        System.out.println("Disc Brake : " + discBrake);
    }
}