class PlayList {
    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String song) {
        boolean isAdded = false;

        if (song != null && !song.isEmpty()) {
            if (index < songNames.length) {
                songNames[index++] = song;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(song + " is invalid song");
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

    public String getSongByIndex(int index) {
        if (index < songNames.length && songNames[index] != null) {
            return songNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexBySongName(String songName) {
        for (int i = 0; i < songNames.length; i++) {
            if (songNames[i] != null && songNames[i].equals(songName)) {
                return i;
            }
        }
        System.out.println("invalid song " + songName);
        return -1;
    }
}