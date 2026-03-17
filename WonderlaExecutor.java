class WonderlaExecutor {
    public static void main(String[] args) {
        
        LazyPool lp1 = new LazyPool(101, "Lazy River", 4, 200, 10, "Fresh", 200, "Yes", "Water Section", "Blue", "Normal", "Automatic", 5, "LED", "Background", "Rubber", 6, "Water Ride", "Active", "Weekly");
        Wonderla w1 = new Wonderla(1, "Wonderla", "Bangalore", "Bangalore", "Karnataka", 60, 10, 5000, "Wonderla Holidays", 2005, "11 AM", "6 PM", 1200, "High", "Available", "Yes", "wonderla.com", "080123456", "Amusement Park", "Open", lp1);
        w1.getWonderlaDetails();

        LazyPool lp2 = new LazyPool(102, "Wave Pool", 5, 150, 20, "Fresh", 300, "Yes", "Main Pool Area", "Aqua", "Warm", "Manual", 8, "Spotlights", "Party Mix", "Plastic", 8, "Wave Pool", "Active", "Daily");
        Wonderla w2 = new Wonderla(2, "Wonderla Hyderabad", "Hyderabad", "Hyderabad", "Telangana", 45, 8, 4500, "Wonderla Holidays", 2010, "10:30 AM", "7 PM", 1100, "High", "Available", "Yes", "wonderla.com", "040987654", "Amusement Park", "Open", lp2);
        w2.getWonderlaDetails();

        LazyPool lp3 = new LazyPool(103, "Infinity Pool", 3, 180, 15, "Chlorinated", 250, "Yes", "Theme Zone", "Crystal Clear", "Cool", "Automatic", 6, "RGB", "Theme Songs", "Inflatable", 7, "Relaxation Pool", "Active", "Bi-weekly");
        Wonderla w3 = new Wonderla(3, "Adlabs Imagica", "Khopoli", "Raigad", "Maharashtra", 50, 7, 6000, "Adlabs Entertainment", 2013, "11 AM", "8 PM", 1400, "Very High", "Valet Available", "Yes", "imagicaaworld.com", "02114-666888", "Theme Park", "Open", lp3);
        w3.getWonderlaDetails();

        LazyPool lp4 = new LazyPool(104, "Rain Dance Pool", 4, 120, 25, "Fresh", 400, "Yes", "Dance Zone", "Rainbow", "Normal", "Manual", 4, "Disco Lights", "DJ Mix", "None", 10, "Party Pool", "Active", "Daily");
        Wonderla w4 = new Wonderla(4, "EsselWorld", "Mumbai", "Mumbai", "Maharashtra", 55, 6, 7000, "Macrotech Developers", 1978, "10 AM", "7 PM", 900, "High", "Available", "Yes", "esselworld.in", "022-28828888", "Amusement Park", "Open", lp4);
        w4.getWonderlaDetails();

        LazyPool lp5 = new LazyPool(105, "Kids Splash Pool", 2, 80, 12, "Fresh", 100, "Yes", "Kids Zone", "Yellow", "Warm", "Automatic", 3, "Soft Lights", "Kids Songs", "Small Tubes", 4, "Kids Pool", "Active", "Weekly");
        Wonderla w5 = new Wonderla(5, "Nicco Park", "Kolkata", "Kolkata", "West Bengal", 35, 5, 4000, "Nicco Corporation", 1991, "2:30 PM", "8 PM", 800, "Medium", "Limited", "Yes", "niccoparks.com", "033-23374422", "Amusement Park", "Open", lp5);
        w5.getWonderlaDetails();

        LazyPool lp6 = new LazyPool(106, "Adventure Pool", 6, 250, 18, "Chlorinated", 350, "Yes", "Adventure Zone", "Green", "Cool", "Manual", 7, "Night Lights", "Adventure Theme", "Heavy Duty", 9, "Thrill Pool", "Active", "Bi-weekly");
        Wonderla w6 = new Wonderla(6, "Appu Ghar", "Delhi", "Delhi", "Delhi", 42, 4, 5500, "Appu Ghar Ventures", 1984, "11 AM", "7 PM", 950, "High", "Available", "Yes", "appughar.com", "011-25591234", "Amusement Park", "Open", lp6);
        w6.getWonderlaDetails();

        LazyPool lp7 = new LazyPool(107, "Ice Pool", 3, 100, 8, "Ice Cold", 150, "Yes", "Snow Zone", "Icy Blue", "Freezing", "Specialized", 10, "Blue Lights", "Snow Theme", "Insulated", 5, "Ice Pool", "Active", "Daily");
        Wonderla w7 = new Wonderla(7, "Snow World", "Hyderabad", "Hyderabad", "Telangana", 25, 12, 3000, "Snow World India", 2007, "10 AM", "10 PM", 650, "High", "Available", "Yes", "snowworldindia.com", "040-23077777", "Snow Theme Park", "Open", lp7);
        w7.getWonderlaDetails();

        LazyPool lp8 = new LazyPool(108, "Film City Lagoon", 5, 300, 22, "Fresh", 500, "Yes", "Film Set", "Emerald", "Warm", "Automatic", 12, "Cinematic", "Film Scores", "Movie Theme", 12, "Cinematic Pool", "Active", "Weekly");
        Wonderla w8 = new Wonderla(8, "Ramoji Film City", "Hyderabad", "Hyderabad", "Telangana", 30, 9, 8000, "Ramoji Group", 1996, "9 AM", "9 PM", 2500, "Very High", "Valet Available", "Multiple", "ramojifilmcity.com", "040-29899999", "Film Theme Park", "Open", lp8);
        w8.getWonderlaDetails();

        LazyPool lp9 = new LazyPool(109, "Golden Beach Pool", 4, 220, 16, "Sea Water", 280, "Yes", "Beach Zone", "Ocean Blue", "Salty", "Manual", 6, "Sunset Lights", "Beach Vibes", "Surf Boards", 8, "Beach Pool", "Active", "Daily");
        Wonderla w9 = new Wonderla(9, "VGP Universal Kingdom", "Chennai", "Chennai", "Tamil Nadu", 48, 11, 5000, "VGP Group", 1970, "10 AM", "8 PM", 1100, "High", "Available", "Yes", "vgpkingdom.com", "044-28471111", "Amusement Park", "Open", lp9);
        w9.getWonderlaDetails();

        LazyPool lp10 = new LazyPool(110, "Royal Pool", 3, 160, 14, "Fresh", 220, "Yes", "Royal Zone", "Royal Blue", "Normal", "Automatic", 5, "Golden Lights", "Royal Music", "Luxury Tubes", 6, "Premium Pool", "Active", "Weekly");
        Wonderla w10 = new Wonderla(10, "Queens Land", "Chennai", "Chennai", "Tamil Nadu", 38, 6, 3500, "Queens Land Pvt Ltd", 1985, "11 AM", "7 PM", 850, "Medium", "Limited", "Yes", "queensland.in", "044-28521122", "Water Park", "Open", lp10);
        w10.getWonderlaDetails();

        // Continue with w11-w20 (showing pattern consistency)
        LazyPool lp11 = new LazyPool(111, "Splash River", 2, 180, 12, "Fresh", 180, "Yes", "Splash Zone", "Turquoise", "Cool", "Manual", 4, "Waterproof", "Fun Mix", "Colorful", 5, "Family Pool", "Active", "Weekly");
        Wonderla w11 = new Wonderla(11, "Splashdown Waterpark", "Bengaluru", "Bengaluru", "Karnataka", 28, 15, 2500, "Splashdown Group", 2012, "10 AM", "6 PM", 700, "High", "Available", "Yes", "splashdown.in", "080-41234567", "Water Park", "Open", lp11);
        w11.getWonderlaDetails();

        LazyPool lp12 = new LazyPool(112, "Joy Stream", 4, 140, 18, "Chlorinated", 260, "Yes", "Joy Zone", "Sapphire", "Warm", "Automatic", 6, "Party Lights", "Dance Mix", "Party Tubes", 7, "Party Pool", "Active", "Daily");
        Wonderla w12 = new Wonderla(12, "Wet N Joy", "Kolkata", "Kolkata", "West Bengal", 32, 13, 3200, "Wet N Joy Ltd", 2008, "11 AM", "7 PM", 750, "Medium", "Available", "Yes", "wetnjoy.com", "033-25678901", "Water Park", "Open", lp12);
        w12.getWonderlaDetails();

        LazyPool lp13 = new LazyPool(113, "Lagoon Paradise", 3, 260, 20, "Fresh", 380, "Yes", "Paradise Zone", "Lagoon Blue", "Perfect", "Automatic", 9, "Tropical", "Island Beats", "Tropical", 10, "Resort Pool", "Active", "Weekly");
        Wonderla w13 = new Wonderla(13, "Blue Lagoon", "Pune", "Pune", "Maharashtra", 22, 18, 2800, "Blue Lagoon Resorts", 2015, "9:30 AM", "7 PM", 800, "High", "Valet Available", "Yes", "bluelagoonpune.com", "020-67890123", "Water Resort", "Open", lp13);
        w13.getWonderlaDetails();

        LazyPool lp14 = new LazyPool(114, "Fantasy River", 5, 320, 24, "Fresh", 450, "Yes", "Fantasy Land", "Magical Purple", "Warm", "Manual", 11, "Fantasy Lights", "Magical Tunes", "Fantasy Design", 11, "Fantasy Pool", "Active", "Bi-weekly");
        Wonderla w14 = new Wonderla(14, "Aqua Fantasy", "Mumbai", "Mumbai", "Maharashtra", 40, 10, 4200, "Aqua Fantasy Ltd", 2011, "10 AM", "8 PM", 950, "High", "Available", "Multiple", "aquafantasymumbai.com", "022-34567890", "Water Park", "Open", lp14);
        w14.getWonderlaDetails();

        LazyPool lp15 = new LazyPool(115, "Island Paradise", 4, 200, 16, "Chlorinated", 320, "Yes", "Island Zone", "Paradise Green", "Cool", "Automatic", 7, "Island Lights", "Happy Tunes", "Island Theme", 8, "Family Pool", "Active", "Weekly");
        Wonderla w15 = new Wonderla(15, "Happy Island", "Coimbatore", "Coimbatore", "Tamil Nadu", 35, 8, 3800, "Happy Island Group", 2009, "11 AM", "7 PM", 900, "Medium", "Available", "Yes", "happyislandcb.com", "0422-45678901", "Amusement Park", "Open", lp15);
        w15.getWonderlaDetails();

        LazyPool lp16 = new LazyPool(116, "Kingdom Rapids", 6, 400, 30, "Fresh", 600, "Yes", "Rapids Zone", "White Water", "Cold", "Specialized", 15, "Adventure", "Rapids Sound", "Rapid Riders", 15, "Adventure Pool", "Active", "Daily");
        Wonderla w16 = new Wonderla(16, "Water Kingdom", "Mumbai", "Mumbai", "Maharashtra", 52, 14, 6500, "Macrotech Developers", 1995, "10 AM", "7 PM", 1200, "Very High", "Valet Available", "Multiple", "waterkingdom.in", "022-28850000", "Water Park", "Open", lp16);
        w16.getWonderlaDetails();

        LazyPool lp17 = new LazyPool(117, "Paradise Lagoon", 3, 280, 22, "Fresh", 420, "Yes", "Lagoon Area", "Tropical Blue", "Warm", "Automatic", 8, "Tropical", "Paradise Vibes", "Palm Tree", 9, "Relaxation Pool", "Active", "Weekly");
        Wonderla w17 = new Wonderla(17, "Paradise Water Park", "Surat", "Surat", "Gujarat", 29, 16, 2900, "Paradise Group", 2014, "9 AM", "8 PM", 750, "High", "Available", "Yes", "paradisewaterpark.com", "0261-2345678", "Water Park", "Open", lp17);
        w17.getWonderlaDetails();

        LazyPool lp18 = new LazyPool(118, "Jolly River", 4, 190, 15, "Chlorinated", 240, "Yes", "Jolly Zone", "Sunset Orange", "Normal", "Manual", 5, "Sunset Glow", "Fun Beats", "Jolly Tubes", 6, "Family Pool", "Active", "Bi-weekly");
        Wonderla w18 = new Wonderla(18, "Jolly Splash", "Ahmedabad", "Ahmedabad", "Gujarat", 26, 12, 2600, "Jolly Group", 2013, "10:30 AM", "7 PM", 700, "Medium", "Limited", "Yes", "jollysplash.com", "079-45678901", "Water Park", "Open", lp18);
        w18.getWonderlaDetails();

        LazyPool lp19 = new LazyPool(119, "Magic Stream", 5, 240, 19, "Fresh", 360, "Yes", "Magic Zone", "Mystic Purple", "Cool", "Automatic", 10, "Magic Lights", "Magic Theme", "Magic Carpet", 10, "Thrill Pool", "Active", "Weekly");
        Wonderla w19 = new Wonderla(19, "Magic Water World", "Nagpur", "Nagpur", "Maharashtra", 33, 11, 3100, "Magic World Ltd", 2010, "11 AM", "8 PM", 850, "High", "Available", "Yes", "magicwaterworld.com", "0712-34567890", "Water Park", "Open", lp19);
        w19.getWonderlaDetails();

        LazyPool lp20 = new LazyPool(120, "Dream Lagoon", 4, 350, 28, "Fresh", 550, "Yes", "Dream World", "Dreamy Pink", "Perfect", "Specialized", 14, "Dream Lights", "Dreamy Music", "Dream Riders", 13, "Premium Pool", "Active", "Daily");
        Wonderla w20 = new Wonderla(20, "Dream Land", "Indore", "Indore", "Madhya Pradesh", 41, 9, 3700, "Dream Land Resorts", 2016, "10 AM", "9 PM", 950, "Very High", "Valet Available", "Multiple", "dreamlandindore.com", "0731-23456789", "Theme Park", "Open", lp20);
        w20.getWonderlaDetails();
    }
}