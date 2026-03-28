class WonderlaExecutor {
    public static void main(String[] args) {
        Wonderla wonderla = new Wonderla();

        wonderla.addWaterGame("Wave Pool");
        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Rain Disco");
        wonderla.addWaterGame("Water Slides");
        wonderla.addWaterGame("Cyclone Ride");
        wonderla.addWaterGame("Boomerang");
        wonderla.addWaterGame("Aqua Loop");
        wonderla.addWaterGame("Splash Pool");
        wonderla.addWaterGame("Kids Play Pool");
        wonderla.addWaterGame("Family Slide");
        wonderla.addWaterGame("Drop Slide");
        wonderla.addWaterGame("High Thrill Slide");
        wonderla.addWaterGame("Rapid River");
        wonderla.addWaterGame("Twister Ride");
        wonderla.addWaterGame("Tunnel Slide");
        wonderla.addWaterGame("Multi Lane Racer");
        wonderla.addWaterGame("Body Slide");
        wonderla.addWaterGame("Float Ride");
        wonderla.addWaterGame("Wave Rider");
        wonderla.addWaterGame("Water Coaster");

        wonderla.displayWaterGames();

        System.out.println("\nGet Game by Index:");
        wonderla.getString(4);

        System.out.println("\nGet Index by Name:");
        wonderla.getIndex("Rain Disco");

        System.out.println("\nUpdate Game:");
        wonderla.updateWaterGame("Lazy River", "Lazy River Deluxe");
        wonderla.displayWaterGames();

        System.out.println("\nDelete Game:");
        wonderla.deleteWaterGame("Splash Pool");
        wonderla.displayWaterGames();
    }
}