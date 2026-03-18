class PaperCupsExecutor {
    public static void main(String[] args) {

        PaperCups pc1 = new PaperCups();
        pc1.displayDetails();

        PaperCups pc2 = new PaperCups(2, "EcoCup", "Brown", 3.0, 100, "Recycled Paper", true, 250.0,
                "Round", "Large", "Eco Ltd", "India", 30, 6.0, "Dome", true,
                "Cold", "Printed", 2025, "Premium");
        pc2.displayDetails();
    }
}