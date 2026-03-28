class RCB {
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;

        if (player != null && !player.isEmpty()) {
            if (index < playerNames.length) {
                playerNames[index++] = player;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(player + " is invalid player");
        }
        return isAdded;
    }

    public void getPlayers() {
        for (String p : playerNames) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public String getPlayerByIndex(int index) {
        if (index < playerNames.length && playerNames[index] != null) {
            return playerNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByPlayerName(String playerName) {
        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] != null && playerNames[i].equals(playerName)) {
                return i;
            }
        }
        System.out.println("invalid player " + playerName);
        return -1;
    }
}