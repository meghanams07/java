class WonderlaExecutor {
    public static void main(String[] args) {

        Wonderla wonderla = new Wonderla();

        wonderla.addWaterGame("Wave Pool");
        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Rain Disco");
        wonderla.addWaterGame("Water Slides");
        wonderla.addWaterGame("Boomerang");
        wonderla.addWaterGame("Twister");
        wonderla.addWaterGame("Cyclone");
        wonderla.addWaterGame("Splash Pool");
        wonderla.addWaterGame("Kids Pool");
        wonderla.addWaterGame("Aqua Loop");
        wonderla.addWaterGame("Vertical Fall");
        wonderla.addWaterGame("Harakiri");
        wonderla.addWaterGame("Drop Loop");
        wonderla.addWaterGame("Super Jumper");
        wonderla.addWaterGame("Fun Racers");
        wonderla.addWaterGame("Wave Rider");
        wonderla.addWaterGame("Crazy River");
        wonderla.addWaterGame("Water Coaster");
        wonderla.addWaterGame("Rapid River");
        wonderla.addWaterGame("Family Slide");

        wonderla.getWaterGames();

        System.out.println();

        int index = 2;
        String game = wonderla.getWaterGameByIndex(index);
        if (game != null) {
            System.out.println("The water game at index " + index + " is " + game);
        }

        String gameName = "Wave Pool";
        int i = wonderla.getIndexByWaterGameName(gameName);
        System.out.println("The water game " + gameName + " is at index " + i);
    }
}