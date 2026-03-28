class PlayListExecutor {
    public static void main(String[] args) {

        PlayList playlist = new PlayList();

        playlist.addSong("Why This Kolaveri Di");
        playlist.addSong("Arabic Kuthu");
        playlist.addSong("Vaathi Coming");
        playlist.addSong("Rowdy Baby");
        playlist.addSong("Enjoy Enjaami");
        playlist.addSong("Kutty Story");
        playlist.addSong("Naatu Naatu");
        playlist.addSong("Butta Bomma");
        playlist.addSong("Samajavaragamana");
        playlist.addSong("Tum Hi Ho");
        playlist.addSong("Kesariya");
        playlist.addSong("Ranjha");
        playlist.addSong("Malare");
        playlist.addSong("Anbil Avan");
        playlist.addSong("Munbe Vaa");

        playlist.getSongs();

        System.out.println();

        int index = 5;
        String song = playlist.getSongByIndex(index);
        if (song != null) {
            System.out.println("The song at index " + index + " is " + song);
        }

        String songName = "Malare";
        int i = playlist.getIndexBySongName(songName);
        System.out.println("The song " + songName + " is at index " + i);
    }
}