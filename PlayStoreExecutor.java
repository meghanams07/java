class PlayStoreExecutor {
    public static void main(String[] args) {
        Application a1 = new Application(101, "WhatsApp", "Meta", "Messaging", 500000000, 4.5, 80, "2.24", "2026", "Multi-language", "Android", "Contacts, Storage", "Free", "Green", 100000000, "support@whatsapp.com", "whatsapp.com", "Active", "End-to-End Encryption", "Chat, Call, Video");
        PlayStore ps1 = new PlayStore(1, "Google Play Store", "Google", "USA", 3000000, 1000000000L, "Mobile Apps", "Play Console", "Google Pay", "High", "Automatic", 2012, "Alphabet", "Green", "38.0", 5, "support@google.com", "play.google.com", "Active", "Android", a1);
        ps1.getPlayStoreDetails();

        Application a2 = new Application(102, "Instagram", "Meta", "Social Media", 1000000000, 4.6, 90, "310.0", "2026", "Multi-language", "Android", "Camera, Storage", "Free", "Purple", 800000000, "support@instagram.com", "instagram.com", "Active", "High", "Photos, Reels, Chat");
        PlayStore ps2 = new PlayStore(2, "Google Play Store", "Google", "USA", 3000000, 2000000000L, "Mobile Apps", "Play Console", "Google Pay", "High", "Automatic", 2012, "Alphabet", "Green", "38.1", 5, "support@google.com", "play.google.com", "Active", "Android", a2);
        ps2.getPlayStoreDetails();

        Application a3 = new Application(103, "YouTube", "Google", "Video", 1000000000, 4.7, 120, "19.0", "2026", "Multi-language", "Android", "Camera, Storage", "Free", "Red", 900000000, "support@youtube.com", "youtube.com", "Active", "High", "Video, Shorts, Live");
        PlayStore ps3 = new PlayStore(3, "Google Play Store", "Google", "USA", 3000000, 3000000000L, "Mobile Apps", "Play Console", "Google Pay", "High", "Automatic", 2012, "Alphabet", "Green", "38.2", 5, "support@google.com", "play.google.com", "Active", "Android", a3);
        ps3.getPlayStoreDetails();

        Application a4 = new Application(104, "Facebook", "Meta", "Social", 1000000000, 4.3, 110, "430.0", "2026", "Multi-language", "Android", "Contacts, Camera", "Free", "Blue", 900000000, "support@facebook.com", "facebook.com", "Active", "High", "Post, Chat, Video");
        PlayStore ps4 = new PlayStore(4, "Google Play Store", "Google", "USA", 3000000, 4000000000L, "Mobile Apps", "Play Console", "Google Pay", "High", "Automatic", 2012, "Alphabet", "Green", "38.3", 5, "support@google.com", "play.google.com", "Active", "Android", a4);
        ps4.getPlayStoreDetails();

        Application a5 = new Application(105, "Instagram", "Meta", "Photo & Video", 2000000000, 4.6, 180, "320.2", "2025", "Multi-language", "iOS", "Camera, Microphone, Location", "Free", "Gradient", 1900000000, "support@instagram.com", "instagram.com", "Active", "High", "Stories, Reels, Chat");
        PlayStore ps5 = new PlayStore(5, "Apple App Store", "Apple", "USA", 2500000, 3500000000L, "Mobile Apps", "App Store Connect", "Apple Pay", "Very High", "Automatic", 2008, "Apple Inc.", "White", "15.1", 5, "support@apple.com", "apps.apple.com", "Active", "iOS", a5);
        ps5.getPlayStoreDetails();

        Application a6 = new Application(106, "Skype", "Microsoft", "Communication", 500000000, 4.1, 90, "9.210", "2025", "Multi-language", "Windows", "Camera, Microphone", "Free", "Light Blue", 450000000, "support@skype.com", "skype.com", "Active", "Medium", "Chat, Voice Call, Video Call");
        PlayStore ps6 = new PlayStore(6, "Microsoft Store", "Microsoft", "USA", 800000, 900000000L, "PC & Mobile Apps", "Partner Center", "Credit Card", "High", "Manual", 2012, "Microsoft Corporation", "Blue", "10.0", 4, "support@microsoft.com", "microsoft.com/store", "Active", "Windows", a6);
        ps6.getPlayStoreDetails();

        Application a7 = new Application(107, "Prime Video", "Amazon", "Entertainment", 800000000, 4.5, 160, "3.10", "2026", "Multi-language", "Android, Fire OS", "Storage, Location", "Subscription", "Dark Blue", 750000000, "support@primevideo.com", "primevideo.com", "Active", "High", "Movies, Series, Downloads");
        PlayStore ps7 = new PlayStore(7, "Amazon Appstore", "Amazon", "USA", 600000, 700000000L, "Mobile & TV Apps", "Amazon Developer Console", "Amazon Pay", "High", "Automatic", 2011, "Amazon Inc.", "Orange", "9.4", 4, "dev-support@amazon.com", "amazon.com/appstore", "Active", "Android, Fire OS", a7);
        ps7.getPlayStoreDetails();

        Application a8 = new Application(108, "Samsung Health", "Samsung", "Health & Fitness", 300000000, 4.4, 85, "6.25", "2025", "Multi-language", "Android", "Location, Sensors", "Free", "Teal", 270000000, "healthsupport@samsung.com", "samsunghealth.com", "Active", "High", "Steps, Heart Rate, Sleep");
        PlayStore ps8 = new PlayStore(8, "Samsung Galaxy Store", "Samsung", "South Korea", 400000, 500000000L, "Mobile Apps", "Samsung Developer", "Samsung Pay", "High", "Automatic", 2009, "Samsung Electronics", "Blue", "6.3", 4, "support@samsung.com", "galaxystore.samsung.com", "Active", "Android", a8);
        ps8.getPlayStoreDetails();

        Application a9 = new Application(109, "Petal Maps", "Huawei", "Navigation", 150000000, 4.2, 70, "4.6", "2026", "Multi-language", "Android", "Location", "Free", "Blue", 140000000, "support@petalmaps.com", "petalmaps.com", "Active", "Medium", "Navigation, Traffic, Offline Maps");
        PlayStore ps9 = new PlayStore(9, "Huawei AppGallery", "Huawei", "China", 500000, 600000000L, "Mobile Apps", "Huawei Developer", "Huawei Pay", "High", "Automatic", 2011, "Huawei Technologies", "Red", "12.0", 4, "support@appgallery.huawei.com", "appgallery.huawei.com", "Active", "Android", a9);
        ps9.getPlayStoreDetails();

        Application a10 = new Application(110, "Mi Home", "Xiaomi", "Lifestyle", 200000000, 4.0, 65, "8.2", "2025", "Multi-language", "Android", "Location, Bluetooth", "Free", "White", 180000000, "support@mihome.com", "home.mi.com", "Active", "Medium", "Smart Devices, Automation");
        PlayStore ps10 = new PlayStore(10, "Xiaomi GetApps", "Xiaomi", "China", 300000, 400000000L, "Mobile Apps", "Mi Developer", "Credit Card", "Medium", "Automatic", 2013, "Xiaomi Corporation", "Orange", "5.1", 3, "support@getapps.com", "global.app.mi.com", "Active", "Android", a10);
        ps10.getPlayStoreDetails();

        Application a11 = new Application(111, "Oppo Cloud", "Oppo", "Productivity", 80000000, 3.8, 40, "2.1", "2025", "Multi-language", "Android", "Storage", "Free", "Green", 75000000, "cloud@oppo.com", "cloud.oppo.com", "Active", "Medium", "Backup, Sync");
        PlayStore ps11 = new PlayStore(11, "Oppo App Market", "Oppo", "China", 250000, 250000000L, "Mobile Apps", "Oppo Developer", "Credit Card", "Medium", "Automatic", 2014, "Oppo Electronics", "Green", "3.4", 3, "support@oppo.com", "appmarket.oppo.com", "Active", "Android", a11);
        ps11.getPlayStoreDetails();

        Application a12 = new Application(112, "Vivo Cloud", "Vivo", "Productivity", 60000000, 3.9, 35, "1.9", "2025", "Multi-language", "Android", "Storage", "Free", "Blue", 55000000, "cloud@vivo.com", "cloud.vivo.com", "Active", "Medium", "Backup, Contacts Sync");
        PlayStore ps12 = new PlayStore(12, "Vivo App Store", "Vivo", "China", 220000, 230000000L, "Mobile Apps", "Vivo Developer", "Credit Card", "Medium", "Automatic", 2014, "Vivo Communication", "Blue", "4.0", 3, "support@vivo.com", "appstore.vivo.com", "Active", "Android", a12);
        ps12.getPlayStoreDetails();

        Application a13 = new Application(113, "LG TV Plus", "LG", "Tools", 50000000, 4.0, 50, "5.0", "2024", "Multi-language", "Android, iOS", "WiFi, Infrared", "Free", "Red", 48000000, "tvplus@lg.com", "lg.com/tvplus", "Active", "Medium", "Remote, TV Control");
        PlayStore ps13 = new PlayStore(13, "LG SmartWorld", "LG", "South Korea", 120000, 100000000L, "Mobile & TV Apps", "LG Developer", "Credit Card", "Medium", "Manual", 2011, "LG Electronics", "Red", "7.2", 3, "support@lg.com", "lgsmartworld.com", "Active", "Android, WebOS", a13);
        ps13.getPlayStoreDetails();

        Application a14 = new Application(114, "Sony Music", "Sony", "Music & Audio", 70000000, 4.1, 60, "8.1", "2024", "Multi-language", "Android", "Storage, Microphone", "Free", "Dark", 65000000, "music@sony.com", "music.sony.com", "Active", "Medium", "Offline Playlists, Equalizer");
        PlayStore ps14 = new PlayStore(14, "Sony Select", "Sony", "Japan", 90000, 80000000L, "Mobile & TV Apps", "Sony Developer", "Credit Card", "Medium", "Manual", 2012, "Sony Corporation", "Black", "4.2", 3, "support@sony.com", "sonyselect.sony.com", "Active", "Android", a14);
        ps14.getPlayStoreDetails();

        Application a15 = new Application(115, "Razer Cortex", "Razer", "Tools", 40000000, 4.2, 55, "2.5", "2025", "Multi-language", "Android", "Storage", "Free", "Neon Green", 38000000, "cortex@razer.com", "cortex.razer.com", "Active", "Medium", "Game Boost, Deals");
        PlayStore ps15 = new PlayStore(15, "Razer Cortex Games", "Razer", "Singapore", 40000, 50000000L, "Games", "Razer Developer", "Credit Card", "Medium", "Automatic", 2013, "Razer Inc.", "Neon Green", "3.8", 4, "support@razer.com", "razer.com/cortex", "Active", "Android", a15);
        ps15.getPlayStoreDetails();

        Application a16 = new Application(116, "CS: GO 2", "Valve", "Action", 80000000, 4.8, 30000, "2.1", "2026", "Multi-language", "Windows", "Online Access", "Paid", "Dark", 78000000, "support@csgo.com", "csgo.com", "Active", "High", "Multiplayer, Competitive, Skins");
        PlayStore ps16 = new PlayStore(16, "Steam", "Valve", "USA", 50000, 150000000L, "PC Games", "Steamworks", "Credit Card, Wallet", "Very High", "Automatic", 2003, "Valve Corporation", "Dark Grey", "25.0", 5, "support@steampowered.com", "store.steampowered.com", "Active", "Windows, macOS, Linux", a16);
        ps16.getPlayStoreDetails();

        Application a17 = new Application(117, "Fortnite", "Epic Games", "Battle Royale", 70000000, 4.4, 50000, "30.0", "2026", "Multi-language", "Windows, Console", "Online Access", "Free", "Vibrant", 68000000, "support@fortnite.com", "fortnite.com", "Active", "High", "Multiplayer, Events, Skins");
        PlayStore ps17 = new PlayStore(17, "Epic Games Store", "Epic Games", "USA", 2000, 90000000L, "PC Games", "Epic Developer", "Credit Card", "High", "Automatic", 2018, "Epic Games Inc.", "Black", "6.0", 4, "help@epicgames.com", "store.epicgames.com", "Active", "Windows, macOS", a17);
        ps17.getPlayStoreDetails();

        Application a18 = new Application(118, "The Witcher 3", "CD Projekt RED", "RPG", 20000000, 4.9, 35000, "1.32", "2023", "Multi-language", "Windows", "Online Access", "Paid", "Dark", 19000000, "support@thewitcher.com", "thewitcher.com", "Active", "High", "Story, Open World, DLCs");
        PlayStore ps18 = new PlayStore(18, "GOG Galaxy", "CD Projekt", "Poland", 3000, 30000000L, "PC Games", "GOG Dev", "Credit Card", "High", "Automatic", 2008, "CD Projekt", "Purple", "3.0", 4, "support@gog.com", "gog.com", "Active", "Windows, macOS, Linux", a18);
        ps18.getPlayStoreDetails();

        Application a19 = new Application(119, "Zelda: BOTW", "Nintendo", "Adventure", 25000000, 4.9, 15000, "1.6", "2022", "Multi-language", "Nintendo Switch", "No Special", "Paid", "Green", 24000000, "zelda@nintendo.com", "zelda.com", "Active", "High", "Open World, Quests");
        PlayStore ps19 = new PlayStore(19, "Nintendo eShop", "Nintendo", "Japan", 5000, 40000000L, "Console Games", "Nintendo Developer Portal", "Credit Card", "High", "Automatic", 2011, "Nintendo Co., Ltd.", "Red", "9.0", 5, "support@nintendo.com", "nintendo.com/eshop", "Active", "Nintendo Switch", a19);
        ps19.getPlayStoreDetails();

        Application a20 = new Application(120, "Spider-Man 2", "Insomniac Games", "Action", 15000000, 4.8, 80000, "1.1", "2024", "Multi-language", "PlayStation 5", "No Special", "Paid", "Red & Blue", 14500000, "support@insomniac.com", "insomniac.games", "Active", "High", "Story, Open World, Action");
        PlayStore ps20 = new PlayStore(20, "PlayStation Store", "Sony", "Japan", 7000, 60000000L, "Console Games", "PlayStation Partners", "Credit Card, Wallet", "Very High", "Automatic", 2006, "Sony Interactive Entertainment", "Blue", "8.5", 5, "support@playstation.com", "store.playstation.com", "Active", "PlayStation", a20);
        ps20.getPlayStoreDetails();
    }
}