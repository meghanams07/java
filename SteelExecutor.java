class SteelExecutor {
    public static void main(String[] args) {
        Steel steel = new Steel();

        steel.addSteel("Carbon Steel");
        steel.addSteel("Alloy Steel");
        steel.addSteel("Stainless Steel");
        steel.addSteel("Tool Steel");
        steel.addSteel("Mild Steel");
        steel.addSteel("High Speed Steel");
        steel.addSteel("Spring Steel");
        steel.addSteel("Structural Steel");
        steel.addSteel("Galvanized Steel");
        steel.addSteel("Cast Steel");

        steel.displaySteel();

        System.out.println("\nGet Steel by Index:");
        steel.getString(2);

        System.out.println("\nGet Index by Name:");
        steel.getIndex("Mild Steel");

        System.out.println("\nUpdate Steel:");
        steel.updateSteel("Carbon Steel", "High Carbon Steel");
        steel.displaySteel();

        System.out.println("\nDelete Steel:");
        steel.deleteSteel("Tool Steel");
        steel.displaySteel();
    }
}