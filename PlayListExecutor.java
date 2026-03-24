class PlayListExecutor {
    public static void main(String[] args) {

        PlayListManager manager = new PlayListManager();

        manager.addSong("Why This Kolaveri Di");
        manager.addSong("Vaathi Coming");
        manager.addSong("Arabic Kuthu");
        manager.addSong("Rowdy Baby");
        manager.addSong("Enjoy Enjaami");
        manager.addSong("Megham Karukatha");
        manager.addSong("Tum Hi Ho");
        manager.addSong("Kesariya");
        manager.addSong("Butta Bomma");
        manager.addSong("Samajavaragamana");
        manager.addSong("Shape of You");
        manager.addSong("Blinding Lights");
        manager.addSong("Levitating");
        manager.addSong("Perfect");
        manager.addSong("Senorita");

        manager.getSongs();
    }
}