class SingerExecutor {
    public static void main(String[] args) {
        Singer singer = new Singer();

        singer.addSinger("Arijit Singh");
        singer.addSinger("Sid Sriram");
        singer.addSinger("Anirudh Ravichander");
        singer.addSinger("Shreya Ghoshal");
        singer.addSinger("Sonu Nigam");
        singer.addSinger("SP Balasubrahmanyam");
        singer.addSinger("Hariharan");
        singer.addSinger("KK");
        singer.addSinger("Neha Kakkar");
        singer.addSinger("Armaan Malik");

        singer.displaySingers();

        System.out.println("\nGet Singer by Index:");
        singer.getString(2);

        System.out.println("\nGet Index by Name:");
        singer.getIndex("KK");

        System.out.println("\nUpdate Singer:");
        singer.updateSinger("KK", "Krishnakumar Kunnath");
        singer.displaySingers();

        System.out.println("\nDelete Singer:");
        singer.deleteSinger("Neha Kakkar");
        singer.displaySingers();
    }
}