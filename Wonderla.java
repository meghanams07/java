class Wonderla {
    private String waterGames[] = new String[25];
    int index;

    public boolean addWaterGame(String game) {
        boolean isAdded = false;

        if (game != null && !game.isEmpty()) {
            if (index < waterGames.length) {
                waterGames[index++] = game;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(game + " is invalid water game");
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

    public String getWaterGameByIndex(int index) {
        if (index < waterGames.length && waterGames[index] != null) {
            return waterGames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByWaterGameName(String gameName) {
        for (int i = 0; i < waterGames.length; i++) {
            if (waterGames[i] != null && waterGames[i].equals(gameName)) {
                return i;
            }
        }
        System.out.println("invalid water game " + gameName);
        return -1;
    }
}