class WonderlaManager {
    private String[] waterGames = new String[25];
    int index = 0;

    public boolean addWaterGame(String gameName) {
        boolean isAdded = false;

        if (gameName != null && !gameName.isEmpty()) {
            if (index < waterGames.length) {
                waterGames[index] = gameName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Water games list is full");
            }
        } else {
            System.out.println("Invalid game name");
        }

        return isAdded;
    }

    public void getWaterGames() {
        for (String game : waterGames) {
            if (game != null) {
                System.out.println(game);
            }
        }
    }
}

