class SoapHolderExecutor {
    public static void main(String[] args) {

        SoapHolder s1 = new SoapHolder();
        s1.displayDetails();

        SoapHolder s2 = new SoapHolder(10, "Lux", 120.0);
        s2.displayDetails();

        SoapHolder s3 = new SoapHolder(20, "Dove", "Plastic", "Blue", 80.0, "Square", 250.0, "Small", "Standard", false, 1, "India", "Matte", "Medium", "Classic", "Bathroom", "1 year", "HUL", 4.2, true);
        s3.displayDetails();
    }
}