class CylinderExecutor {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();

        cyl.addCylinder("Oxygen Cylinder");
        cyl.addCylinder("LPG Cylinder");
        cyl.addCylinder("Nitrogen Cylinder");
        cyl.addCylinder("Carbon Dioxide Cylinder");
        cyl.addCylinder("Helium Cylinder");
        cyl.addCylinder("Hydrogen Cylinder");
        cyl.addCylinder("Argon Cylinder");
        cyl.addCylinder("Acetylene Cylinder");
        cyl.addCylinder("Propane Cylinder");
        cyl.addCylinder("Butane Cylinder");

        cyl.displayCylinders();

        System.out.println("\nGet Cylinder by Index:");
        cyl.getString(3);

        System.out.println("\nGet Index by Name:");
        cyl.getIndex("Helium Cylinder");

        System.out.println("\nUpdate Cylinder:");
        cyl.updateCylinder("LPG Cylinder", "Domestic LPG Cylinder");
        cyl.displayCylinders();

        System.out.println("\nDelete Cylinder:");
        cyl.deleteCylinder("Argon Cylinder");
        cyl.displayCylinders();
    }
}