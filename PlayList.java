class PlayList {
    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String song){
        boolean isValid = false;
        if(song != null && !song.isEmpty()){
            if(index < songNames.length){
                songNames[index] = song;
                index++;
                isValid = true;
            } else {
                System.out.println("Song list is full");
            }
        } else {
            System.out.println(song + " Not Valid");
        }
        return isValid;
    }

    public void displaySongs(){
        System.out.println("\n--- Playlist Songs ---");
        for(String song : songNames){
            if(song != null){
                System.out.println(song);
            }
        }
    }

    public String getString(int index){
        String song = null;
        if(index < songNames.length){
            song = songNames[index];
            System.out.println(song);
            index++;
        } else System.out.println("Invalid");
        return song;
    }

    public int getIndex(String song){
        int index = 0;
        for(String s : songNames){
            if(s == song){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateSong(String existingSong, String updatedSong){
        boolean isUpdated = false;
        for(int index = 0; index < songNames.length; index++){
            if(songNames[index] == existingSong){
                songNames[index] = updatedSong;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Song Not Found");
        }
        return isUpdated;
    }

    public boolean deleteSong(String song){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < songNames.length; index++){
            if(songNames[index].equals(song)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < songNames.length - 1; j++){
                songNames[j] = songNames[j + 1];
            }
            songNames[songNames.length - 1] = null;
        }
        return isFound;
    }
}