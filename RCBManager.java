class RCBManager {
    private String[] playerNames = new String[15];
    int index = 0;

    public boolean addPlayer(String playerName) {
        boolean isAdded = false;

        if (playerName != null && !playerName.isEmpty()) {
            if (index < playerNames.length) {
                playerNames[index] = playerName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Team is full");
            }
        } else {
            System.out.println("Invalid player name");
        }

        return isAdded;
    }

    public void getPlayers() {
        for (String player : playerNames) {
            if (player != null) {
                System.out.println(player);
            }
        }
    }
}

