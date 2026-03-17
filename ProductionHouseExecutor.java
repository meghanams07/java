class ProductionHouseExecutor {
    public static void main(String[] args) {
	
        Movie m1 = new Movie(101, "Jailer", "Nelson", "Rajinikanth", "Ramya Krishnan",
                           "Tamil", "Action", 170, 2023, "Sun Pictures", "Anirudh",
                           "Vijay Kartik", "R Nirmal", "India", "Theatre", "8/10",
                           200, 600, "Blockbuster", "Best Actor");

        Movie m2 = new Movie(102, "2.0", "S Shankar", "Rajinikanth", "Amy Jackson",
                           "Tamil", "Sci-Fi Action", 168, 2018, "Lyca Productions", "A R Rahman",
                           "Nirav Shah", "Anthony", "India", "Theatre", "7.5/10",
                           550, 800, "Super Hit", "Technical Awards");

        Movie m3 = new Movie(103, "Leo", "Lokesh Kanagaraj", "Vijay", "Trisha",
                           "Tamil", "Action Thriller", 160, 2023, "7 Screen Studio", "Anirudh",
                           "Manoj Paramahamsa", "Anand Ekaraj", "India", "Theatre", "8.2/10",
                           280, 620, "Blockbuster", "Best Director");

        Movie m4 = new Movie(104, "Asuran", "Vetrimaaran", "Dhanush", "Manju Warrier",
                           "Tamil", "Action Drama", 151, 2019, "AGS Entertainment", "G V Prakash",
                           "Vetri Palaniswamy", "R Ramar", "India", "Theatre", "8.8/10",
                           25, 110, "Super Hit", "National Award");

        Movie m5 = new Movie(105, "Annapoorani", "Nilesh Krishnaa", "Jai", "Nayanthara",
                           "Tamil", "Drama", 158, 2023, "Wonder Studios", "Yuvan Shankar Raja",
                           "Kalaiselvan", "Govi", "India", "Theatre/OTT", "7.2/10",
                           15, 45, "Hit", "Best Actress");

        Movie m6 = new Movie(106, "Master", "Lokesh Kanagaraj", "Vijay", "Vijay Sethupathi",
                           "Tamil", "Action Thriller", 179, 2021, "Kalanithi Maran", "Anirudh",
                           "Sathyan Sooryan", "Anand Ekaraj", "India", "Theatre/OTT", "8.1/10",
                           135, 300, "Blockbuster", "Best Film");

        Movie m7 = new Movie(107, "Good Night", "Vinayak Vaithiyanathan", "Mithun", "Meetha Raghunath",
                           "Tamil", "Comedy Drama", 125, 2023, "Axess Film Factory", "Sean Roldan",
                           "Prince Vijay", "R Ramar", "India", "Theatre", "7.8/10",
                           5, 25, "Hit", "Best Debut");

        Movie m8 = new Movie(108, "Blue Star", "S A Rajkumar", "Ashok Selvan", "Shanthnu Bhagyaraj",
                           "Tamil", "Sports Drama", 162, 2024, "Freshworks Studio", "Govind Vasantha",
                           "Mari Selvaraj", "Shivan", "India", "Theatre/OTT", "8.5/10",
                           12, 35, "Critical Acclaim", "Best Film");

        Movie m9 = new Movie(109, "Sardar", "PS Mithran", "Karthi", "Rashi Khanna",
                           "Tamil", "Spy Thriller", 158, 2022, "Think Studios", "G V Prakash",
                           "Vijay Kartik Kannan", "NJ Rathnam", "India", "Theatre", "7.9/10",
                           40, 95, "Hit", "Best Thriller");

        Movie m10 = new Movie(110, "Leo Special Edition", "Fan Edit", "Vijay", "Trisha",
                            "Tamil", "Action Fan Edit", 165, 2024, "V House Productions", "Anirudh",
                            "Fan Compilation", "Fan Editors", "India", "YouTube", "9/10",
                            1, 0, "Viral Hit", "Fan Favorite");

        Movie m11 = new Movie(111, "Karnan", "Mari Selvaraj", "Dhanush", "Lakshmi Priyaa",
                            "Tamil", "Action Drama", 148, 2021, "2D Entertainment", "Santhosh Narayanan",
                            "Pa Aadhan", "R Ramar", "India", "Theatre/OTT", "8.7/10",
                            20, 65, "Critical Acclaim", "Best Film");

        Movie m12 = new Movie(112, "Vikram", "Lokesh Kanagaraj", "Kamal Haasan", "Fahadh Faasil",
                            "Tamil", "Action Thriller", 174, 2022, "Raaj Kamal Films", "Anirudh",
                            "Girish Gangadharan", "Anand Ekaraj", "India", "Theatre", "9.1/10",
                            80, 425, "All Time Blockbuster", "Best Actor");

        Movie m13 = new Movie(113, "Parasakthi", "Krishnan-Panju", "Sivaji Ganesan", "Pandari Bai",
                            "Tamil", "Social Drama", 183, 1952, "AVM Productions", "R Sudarsanam",
                            "S Maruthi Rao", "T R Sethuraman", "India", "Theatre", "9.5/10",
                            1, 10, "Classic", "Landmark Film");

        Movie m14 = new Movie(114, "Enga Veettu Pillai", "A C Tirulokchander", "M G Ramachandran", "Jayalalithaa",
                            "Tamil", "Family Drama", 178, 1965, "Sri Rajalakshmi Films", "M S Viswanathan",
                            "K S Prasad", "T R Sethuraman", "India", "Theatre", "9.2/10",
                            2, 15, "Jubilee Hit", "Evergreen Classic");

        Movie m15 = new Movie(115, "Ulagam Sutrum Valiban", "M G Ramachandran", "M G Ramachandran", "Jayalalithaa",
                            "Tamil", "Action Adventure", 185, 1970, "Kamala Film Factory", "M S Viswanathan",
                            "P Ellappa", "K Govindan", "India", "Theatre", "8.9/10",
                            3, 20, "Silver Jubilee", "Color Classic");

        Movie m16 = new Movie(116, "Ambuli", "T K Bharathan", "Vinay Rai", "Rupa Manjari",
                            "Tamil", "Horror Thriller", 128, 2011, "Excel Entertainment", "S Thaman",
                            "J Krishnasamy", "K L Praveen", "India", "Theatre", "7.0/10",
                            8, 18, "Average", "Best Horror");

        Movie m17 = new Movie(117, "Irudhi Suttru", "Sudha Kongara", "R Madhavan", "Ritika Singh",
                            "Tamil", "Sports Drama", 134, 2016, "Dream Warriors", "Santhosh Narayanan",
                            "R Velraj", "Sathish Suriyaraj", "India", "Theatre/OTT", "8.4/10",
                            10, 50, "Critical Success", "National Award");

        Movie m18 = new Movie(118, "Puriyatha Puthir", "Rishi Kesavan", "Vijay", "Gayathrie",
                            "Tamil", "Romantic Thriller", 136, 2017, "Global Infotainment", "Sam C S",
                            "Aravinnd Singh", "Lawrence Kishore", "India", "Theatre", "6.5/10",
                            6, 12, "Average", "None");

        Movie m19 = new Movie(119, "7Aum Arivu", "A R Murugadoss", "Suriya", "Shruti Haasan",
                            "Tamil", "Sci-Fi Thriller", 167, 2011, "UTV Motion Pictures", "A R Rahman",
                            "R Ganesh", "A Sreekar Prasad", "India", "Theatre", "7.3/10",
                            45, 115, "Hit", "Technical Excellence");

        Movie m20 = new Movie(120, "Kaathuvaakula Rendu Kaadhal", "Vignesh Shivan", "Vijay Sethupathi", "Samantha, Nayanthara",
                            "Tamil", "Romantic Comedy", 156, 2022, "Red Giant Movies", "Anirudh",
                            "Vishnu Rangasamy", "A Sreekar Prasad", "India", "Theatre/OTT", "7.6/10",
                            35, 110, "Hit", "Best Comedy");

        ProductionHouse ph1 = new ProductionHouse(1, "Sun Pictures", "Kalanithi Maran", "Chennai",
                                                "Chennai", "India", 2000, 50, "Kalanithi Maran",
                                                "Film Production", "Kollywood", "sunpictures.in",
                                                "044123456", "info@sunpictures.in", "Red", 200,
                                                "Private", "National Awards", "Active", "Jailer", m1);

        ProductionHouse ph2 = new ProductionHouse(2, "Lyca Productions", "S Subaskaran", "Chennai",
                                                "Chennai", "India", 2009, 25, "S Subaskaran",
                                                "Film Production", "Kollywood", "lycaproductions.com",
                                                "044223456", "info@lyca.in", "Gold", 150,
                                                "Private", "National Film Awards", "Active", "2.0", m2);

        ProductionHouse ph3 = new ProductionHouse(3, "7 Screen Studio", "Kalanithi Maran", "Chennai",
                                                "Chennai", "India", 2022, 5, "Kalanithi Maran",
                                                "Film Production", "Kollywood", "7screenstudio.com",
                                                "044323456", "info@7screen.in", "Blue", 100,
                                                "Private", "Filmfare Awards", "Active", "Leo", m3);

        ProductionHouse ph4 = new ProductionHouse(4, "Ags Entertainment", "A G Subramaniam", "Chennai",
                                                "Chennai", "India", 2008, 30, "A G Subramaniam",
                                                "Film Production", "Kollywood", "agsentertainment.com",
                                                "044423456", "info@ags.in", "Silver", 120,
                                                "Private", "Vijay Awards", "Active", "Asuran", m4);

        ProductionHouse ph5 = new ProductionHouse(5, "Wonder Studios", "Nayanthara", "Chennai",
                                                "Chennai", "India", 2021, 3, "Nayanthara",
                                                "Film Production", "Kollywood", "wonderstudios.in",
                                                "044523456", "info@wonder.in", "Purple", 50,
                                                "Private", "Filmfare South", "Active", "Annapoorani", m5);

        ProductionHouse ph6 = new ProductionHouse(6, "Kalanithi Maran Productions", "Kalanithi Maran", "Chennai",
                                                "Chennai", "India", 1993, 75, "Kalanithi Maran",
                                                "Film Production", "Kollywood", "sunnetwork.in",
                                                "044623456", "films@sun.in", "Orange", 300,
                                                "Private", "Multiple National Awards", "Active", "Master", m6);

        ProductionHouse ph7 = new ProductionHouse(7, "Axess Film Factory", "Axess Group", "Chennai",
                                                "Chennai", "India", 2020, 8, "Axess Group",
                                                "Film Production", "Kollywood", "axessfilmfactory.com",
                                                "044723456", "info@axess.in", "Green", 80,
                                                "Private", "Vijay Awards", "Active", "Good Night", m7);

        ProductionHouse ph8 = new ProductionHouse(8, "Freshworks Studio", "Freshworks Team", "Chennai",
                                                "Chennai", "India", 2023, 1, "Freshworks CEO",
                                                "Film Production", "Kollywood", "freshworksstudio.com",
                                                "044823456", "films@freshworks.in", "Tech Blue", 30,
                                                "Corporate", "None", "Active", "Blue Star", m8);

        ProductionHouse ph9 = new ProductionHouse(9, "Think Studios", "Think Music Team", "Chennai",
                                                "Chennai", "India", 2018, 12, "Think Music CEO",
                                                "Film Production", "Kollywood", "thinkmusic.in",
                                                "044923456", "films@think.in", "Black", 60,
                                                "Music Label", "Mirchi Music Awards", "Active", "Sardar", m9);

        ProductionHouse ph10 = new ProductionHouse(10, "V House Productions", "Vijay Team", "Chennai",
                                                 "Chennai", "India", 2024, 1, "Vijay Fans Association",
                                                 "Fan Production", "Kollywood", "vhproductions.in",
                                                 "0441023456", "info@vh.in", "Thalapathy Yellow", 40,
                                                 "Fan-Based", "None", "Active", "Leo Special", m10);

        ProductionHouse ph11 = new ProductionHouse(11, "2D Entertainment", "Dhanush", "Chennai",
                                                 "Chennai", "India", 2014, 10, "Dhanush",
                                                 "Film Production", "Kollywood", "2dentertainment.com",
                                                 "0441123456", "info@2d.in", "Brown", 70,
                                                 "Private", "National Awards", "Active", "Karnan", m11);

        ProductionHouse ph12 = new ProductionHouse(12, "Raaj Kamal Films", "Kamal Haasan", "Chennai",
                                                 "Chennai", "India", 1978, 45, "Kamal Haasan",
                                                 "Film Production", "Kollywood", "raajkamalfilms.com",
                                                 "0442123456", "info@rkf.in", "Ulaga Nayagan Blue", 180,
                                                 "Private", "Multiple National Awards", "Active", "Vikram", m12);

        ProductionHouse ph13 = new ProductionHouse(13, "AVM Productions", "A V Meiyappan", "Chennai",
                                                 "Chennai", "India", 1935, 175, "M Balasubramaniam",
                                                 "Film Production", "Kollywood", "avmproductions.com",
                                                 "0443123456", "info@avm.in", "Classic Gold", 400,
                                                 "Legacy Studio", "Dadasaheb Phalke Award", "Active", "Parasakthi", m13);

        ProductionHouse ph14 = new ProductionHouse(14, "Sri Rajalakshmi Films", "M G Ramachandran", "Chennai",
                                                 "Chennai", "India", 1959, 35, "MGR Family",
                                                 "Film Production", "Kollywood", "srirajalakshmi.com",
                                                 "0444123456", "info@sri.in", "MGR Green", 90,
                                                 "Legacy", "State Awards", "Active", "Enga Veettu Pillai", m14);

        ProductionHouse ph15 = new ProductionHouse(15, "Kamala Film Factory", "M S Viswanathan Family", "Chennai",
                                                 "Chennai", "India", 1961, 40, "MSV Family",
                                                 "Film Production", "Kollywood", "kamalafilms.com",
                                                 "0445123456", "info@kamala.in", "Music Purple", 110,
                                                 "Music Legacy", "Music Awards", "Active", "Ulagam Sutrum Valiban", m15);

        ProductionHouse ph16 = new ProductionHouse(16, "Excel Entertainment", "Ritesh Sidhwani, Farhan Akhtar", "Mumbai",
                                                 "Mumbai", "India", 1999, 20, "Ritesh Sidhwani",
                                                 "Film Production", "Bollywood/Kollywood", "excelmovies.com",
                                                 "0226123456", "info@excel.in", "Excel Red", 200,
                                                 "Pan-India", "National Awards", "Active", "Ambuli", m16);

        ProductionHouse ph17 = new ProductionHouse(17, "Dream Warriors", "R Madhavan", "Chennai",
                                                 "Chennai", "India", 2010, 8, "R Madhavan",
                                                 "Film Production", "Kollywood", "dreamwarriors.in",
                                                 "0447123456", "info@dream.in", "Dream Blue", 65,
                                                 "Private", "Filmfare Awards", "Active", "Irudhi Suttru", m17);

        ProductionHouse ph18 = new ProductionHouse(18, "Global Infotainment", "Arya", "Chennai",
                                                 "Chennai", "India", 2013, 15, "Arya",
                                                 "Film Production", "Kollywood", "globalinfotainment.com",
                                                 "0448123456", "info@global.in", "Global Green", 85,
                                                 "Private", "Vijay Awards", "Active", "Puriyatha Puthir", m18);

        ProductionHouse ph19 = new ProductionHouse(19, "UTV Motion Pictures", "Ronnie Screwvala", "Mumbai",
                                                 "Mumbai", "India", 2004, 50, "Disney India",
                                                 "Film Production", "Bollywood/Kollywood", "utvdisney.in",
                                                 "0229123456", "films@utv.in", "Disney Magic", 350,
                                                 "Corporate", "National Awards", "Active", "7Aum Arivu", m19);

        ProductionHouse ph20 = new ProductionHouse(20, "Red Giant Movies", "Udhayanidhi Stalin", "Chennai",
                                                 "Chennai", "India", 2007, 60, "Udhayanidhi Stalin",
                                                 "Film Distribution", "Kollywood", "redgiantmovies.com",
                                                 "0442923456", "info@redgiant.in", "Red", 250,
                                                 "Distribution", "Distribution Excellence", "Active", "Kaathuvaakula Rendu Kaadhal", m20);


        System.out.println("=== KOLLYWOOD PRODUCTION HOUSES & THEIR FAMOUS MOVIES ===\n");
        
        ph1.getProductionHouseDetails();
        ph2.getProductionHouseDetails();
        ph3.getProductionHouseDetails();
        ph4.getProductionHouseDetails();
        ph5.getProductionHouseDetails();
        ph6.getProductionHouseDetails();
        ph7.getProductionHouseDetails();
        ph8.getProductionHouseDetails();
        ph9.getProductionHouseDetails();
        ph10.getProductionHouseDetails();
        ph11.getProductionHouseDetails();
        ph12.getProductionHouseDetails();
        ph13.getProductionHouseDetails();
        ph14.getProductionHouseDetails();
        ph15.getProductionHouseDetails();
        ph16.getProductionHouseDetails();
        ph17.getProductionHouseDetails();
        ph18.getProductionHouseDetails();
        ph19.getProductionHouseDetails();
        ph20.getProductionHouseDetails();

        System.out.println("\n=== END OF PRODUCTION HOUSE DETAILS ===");
    }
}
