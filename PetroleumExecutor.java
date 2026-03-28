class PetroleumExecutor {
    public static void main(String[] args) {
        Petroleum petro = new Petroleum();

        petro.addProduct("Petrol");
        petro.addProduct("Diesel");
        petro.addProduct("Kerosene");
        petro.addProduct("LPG");
        petro.addProduct("CNG");
        petro.addProduct("Aviation Fuel");
        petro.addProduct("Bitumen");
        petro.addProduct("Lubricating Oil");
        petro.addProduct("Paraffin Wax");
        petro.addProduct("Naphtha");

        petro.displayProducts();

        System.out.println("\nGet Product by Index:");
        petro.getString(3);

        System.out.println("\nGet Index by Name:");
        petro.getIndex("Diesel");

        System.out.println("\nUpdate Product:");
        petro.updateProduct("LPG", "Domestic LPG");
        petro.displayProducts();

        System.out.println("\nDelete Product:");
        petro.deleteProduct("Bitumen");
        petro.displayProducts();
    }
}