class Hotel {
    String hotelName;
    int rooms;

    Hotel(String hotelName, int rooms) {
        System.out.println("Hotel constructor");
        this.hotelName = hotelName;
        this.rooms = rooms;
    }

    public void showHotelDetails() {
        System.out.println("Hotel: " + hotelName);
        System.out.println("Rooms: " + rooms);
    }
}