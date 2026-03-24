class PetShopExecutor {
    public static void main(String[] args) {

        PetShopManager manager = new PetShopManager();

        manager.addAccessory("Dog Collar");
        manager.addAccessory("Leash");
        manager.addAccessory("Pet Food Bowl");
        manager.addAccessory("Water Dispenser");
        manager.addAccessory("Pet Bed");
        manager.addAccessory("Pet Shampoo");
        manager.addAccessory("Grooming Brush");
        manager.addAccessory("Nail Clipper");
        manager.addAccessory("Pet Toys");
        manager.addAccessory("Cat Litter Box");
        manager.addAccessory("Scratching Post");
        manager.addAccessory("Fish Tank");
        manager.addAccessory("Bird Cage");
        manager.addAccessory("Pet Carrier");
        manager.addAccessory("Training Pads");
        manager.addAccessory("Pet Clothes");
        manager.addAccessory("Dental Chew");
        manager.addAccessory("Pet Harness");
        manager.addAccessory("Tick Remover");
        manager.addAccessory("Pet Blanket");

        manager.getAccessories();
    }
}