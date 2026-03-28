class PetShopExecutor {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        shop.addAccessory("Dog Collar");
        shop.addAccessory("Leash");
        shop.addAccessory("Pet Food Bowl");
        shop.addAccessory("Pet Bed");
        shop.addAccessory("Cat Litter Box");
        shop.addAccessory("Scratching Post");
        shop.addAccessory("Pet Shampoo");
        shop.addAccessory("Pet Comb");
        shop.addAccessory("Dog Toys");
        shop.addAccessory("Cat Toys");
        shop.addAccessory("Pet Carrier");
        shop.addAccessory("Aquarium Tank");
        shop.addAccessory("Bird Cage");
        shop.addAccessory("Fish Food");
        shop.addAccessory("Pet Blanket");
        shop.addAccessory("Pet Clothes");
        shop.addAccessory("Pet Harness");
        shop.addAccessory("Training Pads");
        shop.addAccessory("Pet Nail Clipper");
        shop.addAccessory("Pet Toothbrush");

        shop.displayAccessories();

        System.out.println("\nGet Accessory by Index:");
        shop.getString(3);

        System.out.println("\nGet Index by Name:");
        shop.getIndex("Pet Bed");

        System.out.println("\nUpdate Accessory:");
        shop.updateAccessory("Dog Collar", "Smart Dog Collar");
        shop.displayAccessories();

        System.out.println("\nDelete Accessory:");
        shop.deleteAccessory("Fish Food");
        shop.displayAccessories();
    }
}