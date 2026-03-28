class RCB {
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String player){
        boolean isValid = false;
        if(player != null && !player.isEmpty()){
            if(index < playerNames.length){
                playerNames[index] = player;
                index++;
                isValid = true;
            } else {
                System.out.println("Player list is full");
            }
        } else {
            System.out.println(player + " Not Valid");
        }
        return isValid;
    }

    public void displayPlayers(){
        System.out.println("\n--- RCB Players ---");
        for(String player : playerNames){
            if(player != null){
                System.out.println(player);
            }
        }
    }

    public String getString(int index){
        String player = null;
        if(index < playerNames.length){
            player = playerNames[index];
            System.out.println(player);
            index++;
        } else System.out.println("Invalid");
        return player;
    }

    public int getIndex(String player){
        int index = 0;
        for(String p : playerNames){
            if(p == player){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updatePlayer(String existingPlayer, String updatedPlayer){
        boolean isUpdated = false;
        for(int index = 0; index < playerNames.length; index++){
            if(playerNames[index] == existingPlayer){
                playerNames[index] = updatedPlayer;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Player Not Found");
        }
        return isUpdated;
    }

    public boolean deletePlayer(String player){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < playerNames.length; index++){
            if(playerNames[index].equals(player)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < playerNames.length - 1; j++){
                playerNames[j] = playerNames[j + 1];
            }
            playerNames[playerNames.length - 1] = null;
        }
        return isFound;
    }
}