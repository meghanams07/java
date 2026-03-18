class PlasticPlateExecutor {
    public static void main(String[] args) {

        PlasticPlate p1 = new PlasticPlate();
        p1.display();

        System.out.println("-----");

        PlasticPlate p2 = new PlasticPlate(2, "Milton", "Blue", 120.0, 12.0);
        p2.display();

        System.out.println("-----");

        PlasticPlate p3 = new PlasticPlate(3, "Cello", "Red", 150.0, 11.5,
                "Square", "Polymer", true, 250.0, "Design", 20,
                "XYZ Ltd", "India", true, false, "Reusable",
                2.5, "Packet", "Premium", "Party");
        p3.display();
    }
}