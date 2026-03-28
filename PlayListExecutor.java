class PlayListExecutor {
    public static void main(String[] args) {
        PlayList playlist = new PlayList();

        playlist.addSong("Why This Kolaveri Di");
        playlist.addSong("Arabic Kuthu");
        playlist.addSong("Vaathi Coming");
        playlist.addSong("Rowdy Baby");
        playlist.addSong("Enjoy Enjaami");
        playlist.addSong("Tum Hi Ho");
        playlist.addSong("Kesariya");
        playlist.addSong("Butta Bomma");
        playlist.addSong("Samajavaragamana");
        playlist.addSong("Shape of You");
        playlist.addSong("Believer");
        playlist.addSong("Faded");
        playlist.addSong("Perfect");
        playlist.addSong("Levitating");
        playlist.addSong("Blinding Lights");

        playlist.displaySongs();

        System.out.println("\nGet Song by Index:");
        playlist.getString(3);

        System.out.println("\nGet Index by Name:");
        playlist.getIndex("Faded");

        System.out.println("\nUpdate Song:");
        playlist.updateSong("Rowdy Baby", "Rowdy Baby Remix");
        playlist.displaySongs();

        System.out.println("\nDelete Song:");
        playlist.deleteSong("Kesariya");
        playlist.displaySongs();
    }
}