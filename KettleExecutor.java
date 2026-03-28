class KettleExecutor {
    public static void main(String[] args) {
        Kettle kettle = new Kettle();

        kettle.addKettle("Electric Kettle");
        kettle.addKettle("Stainless Steel Kettle");
        kettle.addKettle("Glass Kettle");
        kettle.addKettle("Travel Kettle");
        kettle.addKettle("Cordless Kettle");
        kettle.addKettle("Whistling Kettle");
        kettle.addKettle("Ceramic Kettle");
        kettle.addKettle("Smart Kettle");
        kettle.addKettle("Mini Kettle");
        kettle.addKettle("Insulated Kettle");

        kettle.displayKettles();

        System.out.println("\nGet Kettle by Index:");
        kettle.getString(3);

        System.out.println("\nGet Index by Name:");
        kettle.getIndex("Smart Kettle");

        System.out.println("\nUpdate Kettle:");
        kettle.updateKettle("Mini Kettle", "Portable Mini Kettle");
        kettle.displayKettles();

        System.out.println("\nDelete Kettle:");
        kettle.deleteKettle("Glass Kettle");
        kettle.displayKettles();
    }
}