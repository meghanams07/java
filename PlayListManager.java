class PlayListManager {
    private String[] songNames = new String[15];
    int index = 0;

    public boolean addSong(String songName) {
        boolean isAdded = false;

        if (songName != null && !songName.isEmpty()) {
            if (index < songNames.length) {
                songNames[index] = songName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Playlist is full");
            }
        } else {
            System.out.println("Invalid song name");
        }

        return isAdded;
    }

    public void getSongs() {
        for (String song : songNames) {
            if (song != null) {
                System.out.println(song);
            }
        }
    }
}

