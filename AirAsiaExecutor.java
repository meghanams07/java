class AirAsiaExecutor {
    public static void main(String[] args) {
        AirAsia air = new AirAsia();

        air.addPassenger("Aarav");
        air.addPassenger("Vihaan");
        air.addPassenger("Aditya");
        air.addPassenger("Arjun");
        air.addPassenger("Sai");
        air.addPassenger("Krishna");
        air.addPassenger("Rahul");
        air.addPassenger("Karthik");
        air.addPassenger("Rohan");
        air.addPassenger("Varun");
        air.addPassenger("Nikhil");
        air.addPassenger("Harsha");
        air.addPassenger("Manoj");
        air.addPassenger("Surya");
        air.addPassenger("Vikram");
        air.addPassenger("Deepak");
        air.addPassenger("Yash");
        air.addPassenger("Ankit");
        air.addPassenger("Sanjay");
        air.addPassenger("Pavan");
        air.addPassenger("Tejas");
        air.addPassenger("Abhishek");
        air.addPassenger("Rakesh");
        air.addPassenger("Girish");
        air.addPassenger("Siddharth");
        air.addPassenger("Tarun");
        air.addPassenger("Ajay");
        air.addPassenger("Vijay");
        air.addPassenger("Lokesh");
        air.addPassenger("Mahesh");

        air.displayPassengers();

        System.out.println("\nGet Passenger by Index:");
        air.getString(10);

        System.out.println("\nGet Index by Name:");
        air.getIndex("Rahul");

        System.out.println("\nUpdate Passenger:");
        air.updatePassenger("Sai", "Sai Kumar");
        air.displayPassengers();

        System.out.println("\nDelete Passenger:");
        air.deletePassenger("Varun");
        air.displayPassengers();
    }
}