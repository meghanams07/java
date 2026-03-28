class BedExecutor {
    public static void main(String[] args) {
        Bed bed = new Bed();

        bed.addBed("Single Bed");
        bed.addBed("Double Bed");
        bed.addBed("Queen Size Bed");
        bed.addBed("King Size Bed");
        bed.addBed("Bunk Bed");
        bed.addBed("Sofa Bed");
        bed.addBed("Folding Bed");
        bed.addBed("Hydraulic Bed");
        bed.addBed("Platform Bed");
        bed.addBed("Adjustable Bed");

        bed.displayBeds();

        System.out.println("\nGet Bed by Index:");
        bed.getString(2);

        System.out.println("\nGet Index by Name:");
        bed.getIndex("Bunk Bed");

        System.out.println("\nUpdate Bed:");
        bed.updateBed("Single Bed", "Standard Single Bed");
        bed.displayBeds();

        System.out.println("\nDelete Bed:");
        bed.deleteBed("Folding Bed");
        bed.displayBeds();
    }
}