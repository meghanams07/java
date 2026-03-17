class TvExecutor {
    public static void main(String[] args) {

        Channel c1 = new Channel(101, "Sun TV", "Tamil", "Entertainment", "India", 1993,
                "Sun Network", "Chennai", "Yes", 456, "Satellite", "HD", "Orange",
                "Serials", "24 Hours", 1000000, "suntv.in", "044123456", "Active", "DTH");
        Tv t1 = new Tv(1, "Samsung", "Smart TV", 55, "4K", "LED", "Dolby", 3, 2,
                "Yes", "Yes", "Black", 2024, "150W", "Smart Remote", "Tizen",
                "Samsung", "Electronics", "1 Year", "Working", c1);

        Channel c2 = new Channel(102, "Vijay TV", "Tamil", "GEC", "India", 1994,
                "Vijay Television", "Chennai", "Yes", 462, "Cable & DTH", "HD", "Purple",
                "Bigg Boss Tamil", "24 Hours", 1200000, "vijaytv.in", "044223456", "Active", "DTH & Cable");
        Tv t2 = new Tv(2, "LG", "OLED TV", 65, "8K", "OLED", "Dolby Atmos", 4, 3,
                "Yes", "Yes", "Silver", 2024, "180W", "Magic Remote", "webOS",
                "LG", "Electronics", "2 Years", "Working", c2);

        Channel c3 = new Channel(103, "Zee Tamil", "Tamil", "Entertainment", "India", 2009,
                "Zee Entertainment", "Mumbai", "Yes", 468, "Satellite", "Full HD", "Red",
                "Ethirneechal", "24 Hours", 800000, "zeetamil.com", "022123456", "Active", "DTH");
        Tv t3 = new Tv(3, "Sony", "Bravia", 75, "4K", "QLED", "Acoustic Surface", 4, 2,
                "Yes", "Yes", "Black", 2023, "220W", "Voice Remote", "Google TV",
                "Sony", "Electronics", "1 Year", "Working", c3);

        Channel c4 = new Channel(104, "Star Vijay", "Tamil", "Music", "India", 2007,
                "Star India", "Mumbai", "Yes", 474, "Satellite", "HD", "Green",
                "Super Singer", "24 Hours", 900000, "vijaymusic.com", "022323456", "Active", "DTH");
        Tv t4 = new Tv(4, "Samsung", "QLED", 43, "Full HD", "QLED", "Dolby Digital", 2, 1,
                "Yes", "No", "Charcoal", 2024, "100W", "Standard Remote", "Tizen",
                "Samsung", "Electronics", "1 Year", "Working", c4);

        Channel c5 = new Channel(105, "Kalaignar TV", "Tamil", "News", "India", 2007,
                "Kalaignar Corporation", "Chennai", "Yes", 480, "Satellite", "SD", "Blue",
                "News Hour", "24 Hours", 600000, "kalaignartv.in", "044423456", "Active", "DTH");
        Tv t5 = new Tv(5, "Mi", "Smart TV 4A", 50, "4K", "LED", "Dolby Audio", 3, 2,
                "Yes", "Yes", "Black", 2024, "130W", "Bluetooth Remote", "PatchWall",
                "Xiaomi", "Electronics", "1 Year", "Working", c5);

        Channel c6 = new Channel(106, "Captain TV", "Tamil", "News", "India", 2008,
                "Captain TV", "Chennai", "No", 486, "Cable", "SD", "Yellow",
                "News Debates", "24 Hours", 400000, "captaintv.in", "044523456", "Active", "Cable");
        Tv t6 = new Tv(6, "OnePlus", "Q1 Pro", 55, "4K", "QLED", "DTS", 3, 2,
                "Yes", "Yes", "Gray", 2023, "140W", "Voice Remote", "Android TV",
                "OnePlus", "Electronics", "1 Year", "Working", c6);

        Channel c7 = new Channel(107, "Polimer TV", "Tamil", "Entertainment", "India", 2010,
                "Polimer Network", "Chennai", "Yes", 492, "DTH", "HD", "Pink",
                "Reality Shows", "24 Hours", 700000, "polimernews.com", "044623456", "Active", "DTH");
        Tv t7 = new Tv(7, "TCL", "C645", 65, "4K", "QLED", "Onkyo", 3, 2,
                "Yes", "Yes", "Black", 2024, "190W", "Voice Remote", "Google TV",
                "TCL", "Electronics", "2 Years", "Working", c7);

        Channel c8 = new Channel(108, "News18 Tamil", "Tamil", "News", "India", 2020,
                "Network18", "Chennai", "Yes", 498, "Satellite", "HD", "White",
                "Prime Time News", "24 Hours", 500000, "news18tamil.com", "044723456", "Active", "DTH");
        Tv t8 = new Tv(8, "Philips", "Ambilight TV", 58, "4K", "LED", "Bowers & Wilkins", 4, 2,
                "Yes", "Yes", "Dark Grey", 2024, "160W", "Smart Remote", "Android TV",
                "Philips", "Electronics", "1 Year", "Working", c8);

        Channel c9 = new Channel(109, "Thanthi TV", "Tamil", "News", "India", 2017,
                "Dynamic Television", "Chennai", "Yes", 504, "Satellite", "HD", "Green",
                "Breaking News", "24 Hours", 450000, "thanthitv.com", "044823456", "Active", "DTH");
        Tv t9 = new Tv(9, "Vu", "PremiumPro", 75, "4K", "QLED", "Dolby Atmos", 4, 3,
                "Yes", "Yes", "Black", 2024, "210W", "Voice Remote", "Android TV",
                "Vu", "Electronics", "1 Year", "Working", c9);

        Channel c10 = new Channel(110, "DD Tamil", "Tamil", "Public Service", "India", 1970,
                "Doordarshan", "Delhi", "Yes", 510, "Terrestrial", "SD", "Saffron",
                "Cultural Programs", "18 Hours", 2000000, "prasarbharati.gov.in", "011923456", "Active", "DD Free Dish");
        Tv t10 = new Tv(10, "Motorola", "EnvisionX", 43, "Full HD", "LED", "Dolby Audio", 3, 2,
                "Yes", "Yes", "Midnight Blue", 2023, "90W", "Standard Remote", "Android TV",
                "Motorola", "Electronics", "1 Year", "Working", c10);

        Channel c11 = new Channel(111, "Megaserials", "Tamil", "Serials", "India", 2012,
                "Megaserials Network", "Chennai", "Yes", 516, "DTH", "HD", "Magenta",
                "Daily Serials", "24 Hours", 550000, "megaserials.net", "044923456", "Active", "DTH");
        Tv t11 = new Tv(11, "Hisense", "U8GQ", 65, "4K", "Mini-LED", "Dolby Atmos", 4, 3,
                "Yes", "Yes", "Titanium Grey", 2024, "200W", "Voice Remote", "VIDAA U",
                "Hisense", "Electronics", "2 Years", "Working", c11);

        Channel c12 = new Channel(112, "Adithya TV", "Tamil", "Entertainment", "India", 2007,
                "Adithya Raaj", "Chennai", "Yes", 522, "Satellite", "SD", "Red",
                "Mythological Serials", "24 Hours", 650000, "adithyatv.com", "0441023456", "Active", "Cable & DTH");
        Tv t12 = new Tv(12, "Realme", "Vision Pro", 55, "4K", "QLED", "Dolby Audio", 3, 2,
                "Yes", "Yes", "Black", 2024, "145W", "Voice Remote", "Android TV",
                "Realme", "Electronics", "1 Year", "Working", c12);

        Channel c13 = new Channel(113, "Sirippoli TV", "Tamil", "Comedy", "India", 2013,
                "Sirippoli Network", "Chennai", "Yes", 528, "DTH", "HD", "Yellow",
                "Comedy Shows", "24 Hours", 400000, "sirippoliatv.com", "0442023456", "Active", "DTH");
        Tv t13 = new Tv(13, "Kodak", "Special Edition", 43, "Full HD", "LED", "Stereo", 2, 2,
                "Yes", "No", "White", 2023, "85W", "Standard Remote", "Android TV",
                "Kodak", "Electronics", "1 Year", "Working", c13);

        Channel c14 = new Channel(114, "Vasanth TV", "Tamil", "Entertainment", "India", 2008,
                "Vasantham Broadcasting", "Chennai", "Yes", 534, "Satellite", "HD", "Orange",
                "Family Dramas", "24 Hours", 500000, "vasantv.in", "0443023456", "Active", "DTH");
        Tv t14 = new Tv(14, "Infinix", "Zero Smart", 50, "4K", "LED", "Dolby Digital", 3, 2,
                "Yes", "Yes", "Space Grey", 2024, "120W", "Bluetooth Remote", "XOS TV",
                "Infinix", "Electronics", "1 Year", "Working", c14);

        Channel c15 = new Channel(115, "Jaya TV", "Tamil", "GEC", "India", 1993,
                "Jaya Group", "Chennai", "Yes", 540, "Cable & DTH", "HD", "Pink",
                "Mahabharat", "24 Hours", 1100000, "jayatv.in", "0444023456", "Active", "Cable & DTH");
        Tv t15 = new Tv(15, "Thomson", "Phoenix", 65, "4K", "QLED", "Dolby Audio", 3, 2,
                "Yes", "Yes", "Black", 2024, "175W", "Voice Remote", "Android TV",
                "Thomson", "Electronics", "1 Year", "Working", c15);

        Channel c16 = new Channel(116, "Raj TV", "Tamil", "Movies", "India", 1993,
                "Raj Television", "Chennai", "Yes", 546, "Satellite", "HD", "Blue",
                "Tamil Movies", "24 Hours", 750000, "rajtv.net.in", "0445023456", "Active", "DTH");
        Tv t16 = new Tv(16, "iFFALCON", "K62", 55, "4K", "QLED", "DTS Virtual X", 3, 2,
                "Yes", "Yes", "Obsidian Black", 2024, "155W", "Voice Remote", "Android TV",
                "iFFALCON", "Electronics", "1 Year", "Working", c16);

        Channel c17 = new Channel(117, "Sun News", "Tamil", "News", "India", 2005,
                "Sun Network", "Chennai", "Yes", 552, "Satellite", "HD", "Red",
                "Breaking News", "24 Hours", 1300000, "sunnews.in", "0446023456", "Active", "DTH");
        Tv t17 = new Tv(17, "Blaupunkt", "CyberSound", 50, "4K", "LED", "CyberSound 40", 3, 2,
                "Yes", "Yes", "Shadow Black", 2024, "135W", "Smart Remote", "Android TV",
                "Blaupunkt", "Electronics", "1 Year", "Working", c17);

        Channel c18 = new Channel(118, "Puthiya Thalaimurai", "Tamil", "News", "India", 2011,
                "Thalaimurai Communications", "Chennai", "Yes", 558, "Satellite", "Full HD", "Purple",
                "Investigative News", "24 Hours", 850000, "puthiyathalaimurai.tv", "0447023456", "Active", "DTH");
        Tv t18 = new Tv(18, "Skyworth", "S8 Pro", 75, "4K", "QLED", "Dolby Atmos", 4, 3,
                "Yes", "Yes", "Steel Grey", 2024, "230W", "Voice Remote", "Coolita OS",
                "Skyworth", "Electronics", "2 Years", "Working", c18);

        Channel c19 = new Channel(119, "Win TV", "Tamil", "Movies & Music", "India", 2009,
                "Win Network", "Chennai", "Yes", 564, "DTH", "HD", "Gold",
                "Movie Premieres", "24 Hours", 600000, "wintv.in", "0448023456", "Active", "DTH");
        Tv t19 = new Tv(19, "Haier", "Horizon Series", 58, "4K", "LED", "Dolby Audio", 3, 2,
                "Yes", "Yes", "Onyx Black", 2024, "165W", "Voice Remote", "Google TV",
                "Haier", "Electronics", "1 Year", "Working", c19);

        Channel c20 = new Channel(120, "Lotus News", "Tamil", "News", "India", 2014,
                "Lotus Media", "Chennai", "Yes", 570, "Satellite", "HD", "Orange",
                "News Analysis", "24 Hours", 350000, "lotusnews247.com", "0449023456", "Active", "DTH");
        Tv t20 = new Tv(20, "Vestel", "Smart 4K", 55, "4K", "LED", "Stereo", 3, 2,
                "Yes", "Yes", "Black", 2024, "140W", "Smart Remote", "VIDAA",
                "Vestel", "Electronics", "1 Year", "Working", c20);

        System.out.println("=== DISPLAYING ALL 20 TVS WITH THEIR CHANNELS ===");
        System.out.println();
        
        t1.displayDetails();
        t2.displayDetails();
        t3.displayDetails();
        t4.displayDetails();
        t5.displayDetails();
        t6.displayDetails();
        t7.displayDetails();
        t8.displayDetails();
        t9.displayDetails();
        t10.displayDetails();
        t11.displayDetails();
        t12.displayDetails();
        t13.displayDetails();
        t14.displayDetails();
        t15.displayDetails();
        t16.displayDetails();
        t17.displayDetails();
        t18.displayDetails();
        t19.displayDetails();
        t20.displayDetails();

        System.out.println("=== END OF DISPLAY ===");
    }
}
