class Wonderla {
    private String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String game){
        boolean isValid = false;
        if(game != null && !game.isEmpty()){
            if(index < waterGames.length){
                waterGames[index] = game;
                index++;
                isValid = true;
            } else {
                System.out.println("Water games list is full");
            }
        } else {
            System.out.println(game + " Not Valid");
        }
        return isValid;
    }

    public void displayWaterGames(){
        System.out.println("\n--- Wonderla Water Games ---");
        for(String game : waterGames){
            if(game != null){
                System.out.println(game);
            }
        }
    }

    public String getString(int index){
        String game = null;
        if(index < waterGames.length){
            game = waterGames[index];
            System.out.println(game);
            index++;
        } else System.out.println("Invalid");
        return game;
    }

    public int getIndex(String game){
        int index = 0;
        for(String g : waterGames){
            if(g == game){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateWaterGame(String existingGame, String updatedGame){
        boolean isUpdated = false;
        for(int index = 0; index < waterGames.length; index++){
            if(waterGames[index] == existingGame){
                waterGames[index] = updatedGame;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Game Not Found");
        }
        return isUpdated;
    }

    public boolean deleteWaterGame(String game){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < waterGames.length; index++){
            if(waterGames[index].equals(game)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < waterGames.length - 1; j++){
                waterGames[j] = waterGames[j + 1];
            }
            waterGames[waterGames.length - 1] = null;
        }
        return isFound;
    }
}