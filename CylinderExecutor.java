class CylinderExecutor {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.displayDetails();

        Cylinder c2 = new Cylinder(2, "BharatGas", "Blue", 12.0, 4.0);
        c2.displayDetails();

        Cylinder c3 = new Cylinder(3, "Indane", "Orange", 11.5, 3.8, 100.0, 18.0, "Alloy", "Commercial", 60);
        c3.displayDetails();
    }
}