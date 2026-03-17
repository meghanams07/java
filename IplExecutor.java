class IplExecutor {
    public static void main(String[] args) {

        Player p1 = new Player(18, "Virat Kohli", "Batsman", "India", 35, "Right Hand",
                              "Right Arm Medium", 18, 240, 7500, 4, 100, "RCB", 135, 8,
                              "Top Order", 2008, "Active", "15 Years", "Orange Cap");
        Ipl i1 = new Ipl(1, "Royal Challengers Bangalore", "Virat Kohli", "Andy Flower",
                        "Chinnaswamy Stadium", 0, 25, "United Spirits", "Bangalore",
                        "Qatar Airways", 2008, "Red", "T20", 250, 120, 130, 240, "Active",
                        "Mike Hesson", "IPL", p1);
        i1.getIplDetails();

        Player p2 = new Player(7, "MS Dhoni", "Wicket Keeper", "India", 42, "Right Hand",
                              "Right Arm Medium", 7, 250, 5200, 0, 150, "CSK", 135, 0,
                              "Finisher", 2008, "Active", "16 Years", "IPL Trophy");
        Ipl i2 = new Ipl(2, "Chennai Super Kings", "Ruturaj Gaikwad", "Stephen Fleming",
                        "Chepauk Stadium", 5, 25, "India Cements", "Chennai", "Etihad Airways",
                        2008, "Yellow", "T20", 230, 140, 90, 280, "Active", "Russell Radhakrishnan",
                        "IPL", p2);
        i2.getIplDetails();

        Player p3 = new Player(45, "Rohit Sharma", "Batsman", "India", 36, "Right Hand",
                              "Right Arm Off Spin", 45, 240, 6200, 15, 120, "MI", 130, 7,
                              "Opener", 2008, "Active", "16 Years", "IPL Trophy");
        Ipl i3 = new Ipl(3, "Mumbai Indians", "Hardik Pandya", "Mark Boucher", "Wankhede Stadium",
                        5, 25, "Reliance", "Mumbai", "Slice", 2008, "Blue", "T20", 240, 135,
                        105, 270, "Active", "Rahul Sanghvi", "IPL", p3);
        i3.getIplDetails();

        Player p4 = new Player(41, "Sunil Narine", "All Rounder", "West Indies", 35, "Left Hand",
                              "Off Spin", 41, 180, 1200, 160, 60, "KKR", 150, 6, "Bowler",
                              2012, "Active", "12 Years", "MVP");
        Ipl i4 = new Ipl(4, "Kolkata Knight Riders", "Shreyas Iyer", "Chandrakant Pandit",
                        "Eden Gardens", 2, 25, "Shah Rukh Khan", "Kolkata", "My11Circle",
                        2008, "Purple", "T20", 230, 120, 110, 240, "Active", "Wayne Bentley",
                        "IPL", p4);
        i4.getIplDetails();

        Player p5 = new Player(17, "Rishabh Pant", "Wicket Keeper", "India", 27, "Left Hand",
                              "None", 17, 110, 3200, 0, 80, "DC", 150, 0, "Middle Order",
                              2016, "Active", "8 Years", "Best Young Player");
        Ipl i5 = new Ipl(5, "Delhi Capitals", "Rishabh Pant", "Ricky Ponting",
                        "Arun Jaitley Stadium", 0, 25, "JSW Group", "Delhi", "JSW",
                        2008, "Blue", "T20", 220, 105, 115, 210, "Active", "Vijay Bharadwaj",
                        "IPL", p5);
        i5.getIplDetails();

        Player p6 = new Player(11, "Sanju Samson", "Wicket Keeper", "India", 29, "Right Hand",
                              "None", 11, 150, 3800, 0, 95, "RR", 140, 0, "Top Order",
                              2013, "Active", "11 Years", "Emerging Player");
        Ipl i6 = new Ipl(6, "Rajasthan Royals", "Sanju Samson", "Kumar Sangakkara",
                        "Sawai Mansingh Stadium", 1, 25, "Manoj Badale", "Jaipur", "Red Bull",
                        2008, "Pink", "T20", 210, 100, 110, 200, "Active", "Romesh Kaluwitharana",
                        "IPL", p6);
        i6.getIplDetails();

        Player p7 = new Player(42, "Shikhar Dhawan", "Batsman", "India", 38, "Left Hand",
                              "Right Arm Off Spin", 42, 220, 6700, 4, 110, "PBKS", 128, 7,
                              "Opener", 2008, "Active", "16 Years", "Orange Cap");
        Ipl i7 = new Ipl(7, "Punjab Kings", "Shikhar Dhawan", "Trevor Bayliss", "Mohali Stadium",
                        0, 25, "Preity Zinta", "Punjab", "BKT", 2008, "Red", "T20", 215, 95,
                        120, 190, "Active", "Anil Kumble", "IPL", p7);
        i7.getIplDetails();

        Player p8 = new Player(63, "Pat Cummins", "All Rounder", "Australia", 31, "Right Hand",
                              "Right Arm Fast", 30, 70, 500, 70, 30, "SRH", 150, 8, "Bowler",
                              2014, "Active", "10 Years", "Player of Match");
        Ipl i8 = new Ipl(8, "Sunrisers Hyderabad", "Pat Cummins", "Daniel Vettori",
                        "Rajiv Gandhi Stadium", 1, 25, "Sun TV Network", "Hyderabad", "Dream11",
                        2013, "Orange", "T20", 190, 95, 95, 190, "Active", "Tom Moody", "IPL", p8);
        i8.getIplDetails();

        Player p9 = new Player(77, "Shubman Gill", "Batsman", "India", 25, "Right Hand",
                              "Right Arm Off Spin", 77, 100, 3200, 2, 45, "GT", 140, 7,
                              "Opener", 2018, "Active", "7 Years", "Orange Cap");
        Ipl i9 = new Ipl(9, "Gujarat Titans", "Shubman Gill", "Ashish Nehra",
                        "Narendra Modi Stadium", 1, 25, "CVC Capital", "Ahmedabad", "Dream11",
                        2022, "Dark Blue", "T20", 40, 24, 16, 48, "Active", "Vikram Solanki",
                        "IPL", p9);
        i9.getIplDetails();

        Player p10 = new Player(1, "KL Rahul", "Batsman", "India", 31, "Right Hand", "None", 1,
                               130, 4700, 0, 60, "LSG", 135, 0, "Opener", 2013, "Active",
                               "11 Years", "Orange Cap");
        Ipl i10 = new Ipl(10, "Lucknow Super Giants", "KL Rahul", "Justin Langer", "Ekana Stadium",
                         0, 25, "RPSG Group", "Lucknow", "Greenply", 2022, "Blue", "T20", 40,
                         22, 18, 44, "Active", "Andy Flower", "IPL", p10);
        i10.getIplDetails();

        Player p11 = new Player(13, "Faf du Plessis", "Batsman", "South Africa", 39, "Right Hand",
                               "Right Arm Medium", 13, 130, 3500, 5, 80, "RCB", 138, 7,
                               "Opener", 2012, "Active", "12 Years", "Player of Match");
        Ipl i11 = new Ipl(11, "Royal Challengers Bangalore", "Faf du Plessis", "Andy Flower",
                         "Chinnaswamy Stadium", 0, 25, "United Spirits", "Bangalore",
                         "Qatar Airways", 2008, "Red", "T20", 250, 120, 130, 240, "Active",
                         "Mike Hesson", "IPL", p11);
        i11.getIplDetails();

        Player p12 = new Player(31, "Ruturaj Gaikwad", "Batsman", "India", 27, "Right Hand",
                               "None", 31, 70, 2300, 0, 35, "CSK", 138, 0, "Opener",
                               2020, "Active", "4 Years", "Orange Cap");
        Ipl i12 = new Ipl(12, "Chennai Super Kings", "Ruturaj Gaikwad", "Stephen Fleming",
                         "Chepauk Stadium", 5, 25, "India Cements", "Chennai", "TVS Eurogrip",
                         2008, "Yellow", "T20", 230, 140, 90, 280, "Active",
                         "Russell Radhakrishnan", "IPL", p12);
        i12.getIplDetails();

        Player p13 = new Player(93, "Jasprit Bumrah", "Bowler", "India", 30, "Right Hand",
                               "Right Arm Fast", 93, 130, 80, 160, 25, "MI", 90, 7,
                               "Fast Bowler", 2013, "Active", "11 Years", "Purple Cap");
        Ipl i13 = new Ipl(13, "Mumbai Indians", "Hardik Pandya", "Mark Boucher", "Wankhede Stadium",
                         5, 25, "Reliance", "Mumbai", "Slice", 2008, "Blue", "T20", 240, 135,
                         105, 270, "Active", "Rahul Sanghvi", "IPL", p13);
        i13.getIplDetails();

        Player p14 = new Player(19, "Andre Russell", "All Rounder", "West Indies", 36, "Right Hand",
                               "Right Arm Fast", 12, 120, 2300, 100, 60, "KKR", 175, 8,
                               "All Rounder", 2014, "Active", "10 Years", "MVP");
        Ipl i14 = new Ipl(14, "Kolkata Knight Riders", "Shreyas Iyer", "Chandrakant Pandit",
                         "Eden Gardens", 2, 25, "Shah Rukh Khan", "Kolkata", "My11Circle",
                         2008, "Purple", "T20", 230, 120, 110, 240, "Active",
                         "Wayne Bentley", "IPL", p14);
        i14.getIplDetails();

        Player p15 = new Player(5, "David Warner", "Batsman", "Australia", 37, "Left Hand",
                               "Right Arm Leg Spin", 31, 180, 6500, 5, 90, "SRH", 142, 7,
                               "Opener", 2009, "Active", "15 Years", "Orange Cap");
        Ipl i15 = new Ipl(15, "Sunrisers Hyderabad", "Pat Cummins", "Daniel Vettori",
                         "Rajiv Gandhi Stadium", 1, 25, "Sun TV Network", "Hyderabad", "Dream11",
                         2013, "Orange", "T20", 190, 95, 95, 190, "Active", "Tom Moody", "IPL", p15);
        i15.getIplDetails();

        Player p16 = new Player(64, "Arshdeep Singh", "Bowler", "India", 25, "Left Hand",
                               "Left Arm Fast", 2, 60, 50, 75, 10, "PBKS", 80, 8,
                               "Fast Bowler", 2019, "Active", "5 Years", "Emerging Player");
        Ipl i16 = new Ipl(16, "Punjab Kings", "Shikhar Dhawan", "Trevor Bayliss", "Mohali Stadium",
                         0, 25, "Preity Zinta", "Punjab", "BKT", 2008, "Red", "T20", 215, 95,
                         120, 190, "Active", "Anil Kumble", "IPL", p16);
        i16.getIplDetails();

        Player p17 = new Player(99, "Jos Buttler", "Wicket Keeper Batsman", "England", 33, "Right Hand",
                               "None", 63, 100, 3500, 0, 70, "RR", 150, 0, "Opener",
                               2016, "Active", "8 Years", "Orange Cap");
        Ipl i17 = new Ipl(17, "Rajasthan Royals", "Sanju Samson", "Kumar Sangakkara",
                         "Sawai Mansingh Stadium", 1, 25, "Manoj Badale", "Jaipur", "Red Bull",
                         2008, "Pink", "T20", 210, 100, 110, 200, "Active",
                         "Romesh Kaluwitharana", "IPL", p17);
        i17.getIplDetails();

        Player p18 = new Player(66, "David Warner", "Batsman", "Australia", 37, "Left Hand",
                               "Right Arm Leg Spin", 31, 180, 6500, 5, 90, "DC", 142, 7,
                               "Opener", 2009, "Active", "15 Years", "Orange Cap");
        Ipl i18 = new Ipl(18, "Delhi Capitals", "Rishabh Pant", "Ricky Ponting",
                         "Arun Jaitley Stadium", 0, 25, "JSW Group", "Delhi", "JSW",
                         2008, "Blue", "T20", 220, 105, 115, 210, "Active",
                         "Vijay Bharadwaj", "IPL", p18);
        i18.getIplDetails();

        Player p19 = new Player(33, "Rashid Khan", "Bowler", "Afghanistan", 25, "Right Hand",
                               "Leg Spin", 19, 120, 400, 150, 50, "GT", 120, 6, "Spinner",
                               2017, "Active", "7 Years", "Purple Cap");
        Ipl i19 = new Ipl(19, "Gujarat Titans", "Shubman Gill", "Ashish Nehra",
                         "Narendra Modi Stadium", 1, 25, "CVC Capital", "Ahmedabad", "Dream11",
                         2022, "Dark Blue", "T20", 40, 24, 16, 48, "Active",
                         "Vikram Solanki", "IPL", p19);
        i19.getIplDetails();

        Player p20 = new Player(29, "Nicholas Pooran", "Wicket Keeper Batsman", "West Indies", 28,
                               "Left Hand", "None", 29, 80, 1800, 0, 40, "LSG", 160, 0,
                               "Finisher", 2019, "Active", "5 Years", "Best Finisher");
        Ipl i20 = new Ipl(20, "Lucknow Super Giants", "KL Rahul", "Justin Langer", "Ekana Stadium",
                         0, 25, "RPSG Group", "Lucknow", "Greenply", 2022, "Blue", "T20", 40,
                         22, 18, 44, "Active", "Andy Flower", "IPL", p20);
        i20.getIplDetails();
		
		}
		}
