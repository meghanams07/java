class Casino {
    int casinoId;
    String casinoName;
    String gameType;
    String manager;
    int tables;
    int slotMachines;
    String currency;
    String dressCode;
    String membership;
    String security;
    int staff;
    String lighting;
    String music;
    String restaurant;
    String bar;
    String hotel;
    int entryFee;
    String famousGame;
    String status;
    String country;

    public Casino(int casinoId, String casinoName, String gameType, String manager, int tables,
                  int slotMachines, String currency, String dressCode, String membership,
                  String security, int staff, String lighting, String music, String restaurant,
                  String bar, String hotel, int entryFee, String famousGame, String status,
                  String country) {
        this.casinoId = casinoId;
        this.casinoName = casinoName;
        this.gameType = gameType;
        this.manager = manager;
        this.tables = tables;
        this.slotMachines = slotMachines;
        this.currency = currency;
        this.dressCode = dressCode;
        this.membership = membership;
        this.security = security;
        this.staff = staff;
        this.lighting = lighting;
        this.music = music;
        this.restaurant = restaurant;
        this.bar = bar;
        this.hotel = hotel;
        this.entryFee = entryFee;
        this.famousGame = famousGame;
        this.status = status;
        this.country = country;
    }

    public void displayDetails() {
        System.out.println("CasinoId: " + casinoId);
        System.out.println("CasinoName: " + casinoName);
        System.out.println("GameType: " + gameType);
        System.out.println("Manager: " + manager);
        System.out.println("Tables: " + tables);
        System.out.println("SlotMachines: " + slotMachines);
        System.out.println("Currency: " + currency);
        System.out.println("DressCode: " + dressCode);
        System.out.println("Membership: " + membership);
        System.out.println("Security: " + security);
        System.out.println("Staff: " + staff);
        System.out.println("Lighting: " + lighting);
        System.out.println("Music: " + music);
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Bar: " + bar);
        System.out.println("Hotel: " + hotel);
        System.out.println("EntryFee: " + entryFee);
        System.out.println("FamousGame: " + famousGame);
        System.out.println("Status: " + status);
        System.out.println("Country: " + country);
    }
}