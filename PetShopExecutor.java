class PetShopExecutor {
    public static void main(String[] args) {

        PetShop shop = new PetShop();

        shop.addAccessory("Dog Collar");
        shop.addAccessory("Leash");
        shop.addAccessory("Pet Food Bowl");
        shop.addAccessory("Water Dispenser");
        shop.addAccessory("Pet Bed");
        shop.addAccessory("Dog Shampoo");
        shop.addAccessory("Cat Litter Box");
        shop.addAccessory("Scratching Post");
        shop.addAccessory("Pet Carrier");
        shop.addAccessory("Fish Tank");
        shop.addAccessory("Aquarium Filter");
        shop.addAccessory("Bird Cage");
        shop.addAccessory("Chew Toys");
        shop.addAccessory("Pet Blanket");
        shop.addAccessory("Nail Clipper");
        shop.addAccessory("Pet Comb");
        shop.addAccessory("Training Pads");
        shop.addAccessory("Pet Jacket");
        shop.addAccessory("GPS Tracker");
        shop.addAccessory("Pet Harness");

        shop.getAccessories();

        System.out.println();

        int index = 3;
        String accessory = shop.getAccessoryByIndex(index);
        if (accessory != null) {
            System.out.println("The accessory at index " + index + " is " + accessory);
        }

        String accessoryName = "Leash";
        int i = shop.getIndexByAccessoryName(accessoryName);
        System.out.println("The accessory " + accessoryName + " is at index " + i);
    }
}