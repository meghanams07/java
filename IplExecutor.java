class IplExecutor {

    public static void main(String[] args) {

        Ipl i1 = new Ipl();

        i1.teamId = 1;
        i1.teamName = "Royal Challengers Bangalore";
        i1.captain = "Virat Kohli";
        i1.coach = "Andy Flower";
        i1.homeGround = "Chinnaswamy Stadium";
        i1.championships = 0;
        i1.playersCount = 25;
        i1.owner = "United Spirits";
        i1.city = "Bangalore";
        i1.sponsor = "Qatar Airways";
        i1.foundedYear = 2008;
        i1.color = "Red";
        i1.category = "T20";
        i1.matchesPlayed = 250;
        i1.wins = 120;
        i1.losses = 130;
        i1.points = 240;
        i1.status = "Active";
        i1.manager = "Mike Hesson";
        i1.league = "IPL";

        Player p1 = new Player();

        p1.playerId = 18;
        p1.playerName = "Virat Kohli";
        p1.role = "Batsman";
        p1.country = "India";
        p1.age = 35;
        p1.battingStyle = "Right Hand";
        p1.bowlingStyle = "Right Arm Medium";
        p1.jerseyNumber = 18;
        p1.matches = 240;
        p1.runs = 7500;
        p1.wickets = 4;
        p1.catches = 100;
        p1.team = "RCB";
        p1.strikeRate = 135;
        p1.economy = 8;
        p1.category = "Top Order";
        p1.debutYear = 2008;
        p1.status = "Active";
        p1.experience = "15 Years";
        p1.awards = "Orange Cap";

        i1.player = p1;

        i1.getIplDetails();
		Ipl i2 = new Ipl();

i2.teamId = 2;
i2.teamName = "Chennai Super Kings";
i2.captain = "Ruturaj Gaikwad";
i2.coach = "Stephen Fleming";
i2.homeGround = "Chepauk Stadium";
i2.championships = 5;
i2.playersCount = 25;
i2.owner = "India Cements";
i2.city = "Chennai";
i2.sponsor = "Etihad Airways";
i2.foundedYear = 2008;
i2.color = "Yellow";
i2.category = "T20";
i2.matchesPlayed = 230;
i2.wins = 140;
i2.losses = 90;
i2.points = 280;
i2.status = "Active";
i2.manager = "Russell Radhakrishnan";
i2.league = "IPL";

Player p2 = new Player();

p2.playerId = 7;
p2.playerName = "MS Dhoni";
p2.role = "Wicket Keeper";
p2.country = "India";
p2.age = 42;
p2.battingStyle = "Right Hand";
p2.bowlingStyle = "Right Arm Medium";
p2.jerseyNumber = 7;
p2.matches = 250;
p2.runs = 5200;
p2.wickets = 0;
p2.catches = 150;
p2.team = "CSK";
p2.strikeRate = 135;
p2.economy = 0;
p2.category = "Finisher";
p2.debutYear = 2008;
p2.status = "Active";
p2.experience = "16 Years";
p2.awards = "IPL Trophy";

i2.player = p2;
i2.getIplDetails();
Ipl i3 = new Ipl();

i3.teamId = 3;
i3.teamName = "Mumbai Indians";
i3.captain = "Hardik Pandya";
i3.coach = "Mark Boucher";
i3.homeGround = "Wankhede Stadium";
i3.championships = 5;
i3.playersCount = 25;
i3.owner = "Reliance";
i3.city = "Mumbai";
i3.sponsor = "Slice";
i3.foundedYear = 2008;
i3.color = "Blue";
i3.category = "T20";
i3.matchesPlayed = 240;
i3.wins = 135;
i3.losses = 105;
i3.points = 270;
i3.status = "Active";
i3.manager = "Rahul Sanghvi";
i3.league = "IPL";

Player p3 = new Player();

p3.playerId = 45;
p3.playerName = "Rohit Sharma";
p3.role = "Batsman";
p3.country = "India";
p3.age = 36;
p3.battingStyle = "Right Hand";
p3.bowlingStyle = "Right Arm Off Spin";
p3.jerseyNumber = 45;
p3.matches = 240;
p3.runs = 6200;
p3.wickets = 15;
p3.catches = 120;
p3.team = "MI";
p3.strikeRate = 130;
p3.economy = 7;
p3.category = "Opener";
p3.debutYear = 2008;
p3.status = "Active";
p3.experience = "16 Years";
p3.awards = "IPL Trophy";

i3.player = p3;
i3.getIplDetails();
Ipl i4 = new Ipl();

i4.teamId = 4;
i4.teamName = "Kolkata Knight Riders";
i4.captain = "Shreyas Iyer";
i4.coach = "Chandrakant Pandit";
i4.homeGround = "Eden Gardens";
i4.championships = 2;
i4.playersCount = 25;
i4.owner = "Shah Rukh Khan";
i4.city = "Kolkata";
i4.sponsor = "My11Circle";
i4.foundedYear = 2008;
i4.color = "Purple";
i4.category = "T20";
i4.matchesPlayed = 230;
i4.wins = 120;
i4.losses = 110;
i4.points = 240;
i4.status = "Active";
i4.manager = "Wayne Bentley";
i4.league = "IPL";

Player p4 = new Player();

p4.playerId = 41;
p4.playerName = "Sunil Narine";
p4.role = "All Rounder";
p4.country = "West Indies";
p4.age = 35;
p4.battingStyle = "Left Hand";
p4.bowlingStyle = "Off Spin";
p4.jerseyNumber = 41;
p4.matches = 180;
p4.runs = 1200;
p4.wickets = 160;
p4.catches = 60;
p4.team = "KKR";
p4.strikeRate = 150;
p4.economy = 6;
p4.category = "Bowler";
p4.debutYear = 2012;
p4.status = "Active";
p4.experience = "12 Years";
p4.awards = "MVP";

i4.player = p4;
i4.getIplDetails();
Ipl i5 = new Ipl();

i5.teamId = 5;
i5.teamName = "Delhi Capitals";
i5.captain = "Rishabh Pant";
i5.coach = "Ricky Ponting";
i5.homeGround = "Arun Jaitley Stadium";
i5.championships = 0;
i5.playersCount = 25;
i5.owner = "JSW Group";
i5.city = "Delhi";
i5.sponsor = "JSW";
i5.foundedYear = 2008;
i5.color = "Blue";
i5.category = "T20";
i5.matchesPlayed = 220;
i5.wins = 105;
i5.losses = 115;
i5.points = 210;
i5.status = "Active";
i5.manager = "Vijay Bharadwaj";
i5.league = "IPL";

Player p5 = new Player();

p5.playerId = 17;
p5.playerName = "Rishabh Pant";
p5.role = "Wicket Keeper";
p5.country = "India";
p5.age = 27;
p5.battingStyle = "Left Hand";
p5.bowlingStyle = "None";
p5.jerseyNumber = 17;
p5.matches = 110;
p5.runs = 3200;
p5.wickets = 0;
p5.catches = 80;
p5.team = "DC";
p5.strikeRate = 150;
p5.economy = 0;
p5.category = "Middle Order";
p5.debutYear = 2016;
p5.status = "Active";
p5.experience = "8 Years";
p5.awards = "Best Young Player";

i5.player = p5;

i5.getIplDetails();
Ipl i6 = new Ipl();

i6.teamId = 6;
i6.teamName = "Rajasthan Royals";
i6.captain = "Sanju Samson";
i6.coach = "Kumar Sangakkara";
i6.homeGround = "Sawai Mansingh Stadium";
i6.championships = 1;
i6.playersCount = 25;
i6.owner = "Manoj Badale";
i6.city = "Jaipur";
i6.sponsor = "Red Bull";
i6.foundedYear = 2008;
i6.color = "Pink";
i6.category = "T20";
i6.matchesPlayed = 210;
i6.wins = 100;
i6.losses = 110;
i6.points = 200;
i6.status = "Active";
i6.manager = "Romesh Kaluwitharana";
i6.league = "IPL";

Player p6 = new Player();

p6.playerId = 11;
p6.playerName = "Sanju Samson";
p6.role = "Wicket Keeper";
p6.country = "India";
p6.age = 29;
p6.battingStyle = "Right Hand";
p6.bowlingStyle = "None";
p6.jerseyNumber = 11;
p6.matches = 150;
p6.runs = 3800;
p6.wickets = 0;
p6.catches = 95;
p6.team = "RR";
p6.strikeRate = 140;
p6.economy = 0;
p6.category = "Top Order";
p6.debutYear = 2013;
p6.status = "Active";
p6.experience = "11 Years";
p6.awards = "Emerging Player";

i6.player = p6;

i6.getIplDetails();
Ipl i7 = new Ipl();

i7.teamId = 7;
i7.teamName = "Punjab Kings";
i7.captain = "Shikhar Dhawan";
i7.coach = "Trevor Bayliss";
i7.homeGround = "Mohali Stadium";
i7.championships = 0;
i7.playersCount = 25;
i7.owner = "Preity Zinta";
i7.city = "Punjab";
i7.sponsor = "BKT";
i7.foundedYear = 2008;
i7.color = "Red";
i7.category = "T20";
i7.matchesPlayed = 215;
i7.wins = 95;
i7.losses = 120;
i7.points = 190;
i7.status = "Active";
i7.manager = "Anil Kumble";
i7.league = "IPL";

Player p7 = new Player();

p7.playerId = 42;
p7.playerName = "Shikhar Dhawan";
p7.role = "Batsman";
p7.country = "India";
p7.age = 38;
p7.battingStyle = "Left Hand";
p7.bowlingStyle = "Right Arm Off Spin";
p7.jerseyNumber = 42;
p7.matches = 220;
p7.runs = 6700;
p7.wickets = 4;
p7.catches = 110;
p7.team = "PBKS";
p7.strikeRate = 128;
p7.economy = 7;
p7.category = "Opener";
p7.debutYear = 2008;
p7.status = "Active";
p7.experience = "16 Years";
p7.awards = "Orange Cap";

i7.player = p7;

i7.getIplDetails();
Ipl i8 = new Ipl();

i8.teamId = 8;
i8.teamName = "Sunrisers Hyderabad";
i8.captain = "Pat Cummins";
i8.coach = "Daniel Vettori";
i8.homeGround = "Rajiv Gandhi Stadium";
i8.championships = 1;
i8.playersCount = 25;
i8.owner = "Sun TV Network";
i8.city = "Hyderabad";
i8.sponsor = "Dream11";
i8.foundedYear = 2013;
i8.color = "Orange";
i8.category = "T20";
i8.matchesPlayed = 190;
i8.wins = 95;
i8.losses = 95;
i8.points = 190;
i8.status = "Active";
i8.manager = "Tom Moody";
i8.league = "IPL";

Player p8 = new Player();

p8.playerId = 63;
p8.playerName = "Pat Cummins";
p8.role = "All Rounder";
p8.country = "Australia";
p8.age = 31;
p8.battingStyle = "Right Hand";
p8.bowlingStyle = "Right Arm Fast";
p8.jerseyNumber = 30;
p8.matches = 70;
p8.runs = 500;
p8.wickets = 70;
p8.catches = 30;
p8.team = "SRH";
p8.strikeRate = 150;
p8.economy = 8;
p8.category = "Bowler";
p8.debutYear = 2014;
p8.status = "Active";
p8.experience = "10 Years";
p8.awards = "Player of Match";

i8.player = p8;

i8.getIplDetails();
Ipl i9 = new Ipl();

i9.teamId = 9;
i9.teamName = "Gujarat Titans";
i9.captain = "Shubman Gill";
i9.coach = "Ashish Nehra";
i9.homeGround = "Narendra Modi Stadium";
i9.championships = 1;
i9.playersCount = 25;
i9.owner = "CVC Capital";
i9.city = "Ahmedabad";
i9.sponsor = "Dream11";
i9.foundedYear = 2022;
i9.color = "Dark Blue";
i9.category = "T20";
i9.matchesPlayed = 40;
i9.wins = 24;
i9.losses = 16;
i9.points = 48;
i9.status = "Active";
i9.manager = "Vikram Solanki";
i9.league = "IPL";

Player p9 = new Player();

p9.playerId = 77;
p9.playerName = "Shubman Gill";
p9.role = "Batsman";
p9.country = "India";
p9.age = 25;
p9.battingStyle = "Right Hand";
p9.bowlingStyle = "Right Arm Off Spin";
p9.jerseyNumber = 77;
p9.matches = 100;
p9.runs = 3200;
p9.wickets = 2;
p9.catches = 45;
p9.team = "GT";
p9.strikeRate = 140;
p9.economy = 7;
p9.category = "Opener";
p9.debutYear = 2018;
p9.status = "Active";
p9.experience = "7 Years";
p9.awards = "Orange Cap";

i9.player = p9;

i9.getIplDetails();
Ipl i10 = new Ipl();

i10.teamId = 10;
i10.teamName = "Lucknow Super Giants";
i10.captain = "KL Rahul";
i10.coach = "Justin Langer";
i10.homeGround = "Ekana Stadium";
i10.championships = 0;
i10.playersCount = 25;
i10.owner = "RPSG Group";
i10.city = "Lucknow";
i10.sponsor = "Greenply";
i10.foundedYear = 2022;
i10.color = "Blue";
i10.category = "T20";
i10.matchesPlayed = 40;
i10.wins = 22;
i10.losses = 18;
i10.points = 44;
i10.status = "Active";
i10.manager = "Andy Flower";
i10.league = "IPL";

Player p10 = new Player();

p10.playerId = 1;
p10.playerName = "KL Rahul";
p10.role = "Batsman";
p10.country = "India";
p10.age = 31;
p10.battingStyle = "Right Hand";
p10.bowlingStyle = "None";
p10.jerseyNumber = 1;
p10.matches = 130;
p10.runs = 4700;
p10.wickets = 0;
p10.catches = 60;
p10.team = "LSG";
p10.strikeRate = 135;
p10.economy = 0;
p10.category = "Opener";
p10.debutYear = 2013;
p10.status = "Active";
p10.experience = "11 Years";
p10.awards = "Orange Cap";

i10.player = p10;

i10.getIplDetails();
Ipl i11 = new Ipl();

i11.teamId = 11;
i11.teamName = "Royal Challengers Bangalore";
i11.captain = "Faf du Plessis";
i11.coach = "Andy Flower";
i11.homeGround = "Chinnaswamy Stadium";
i11.championships = 0;
i11.playersCount = 25;
i11.owner = "United Spirits";
i11.city = "Bangalore";
i11.sponsor = "Qatar Airways";
i11.foundedYear = 2008;
i11.color = "Red";
i11.category = "T20";
i11.matchesPlayed = 250;
i11.wins = 120;
i11.losses = 130;
i11.points = 240;
i11.status = "Active";
i11.manager = "Mike Hesson";
i11.league = "IPL";

Player p11 = new Player();

p11.playerId = 13;
p11.playerName = "Faf du Plessis";
p11.role = "Batsman";
p11.country = "South Africa";
p11.age = 39;
p11.battingStyle = "Right Hand";
p11.bowlingStyle = "Right Arm Medium";
p11.jerseyNumber = 13;
p11.matches = 130;
p11.runs = 3500;
p11.wickets = 5;
p11.catches = 80;
p11.team = "RCB";
p11.strikeRate = 138;
p11.economy = 7;
p11.category = "Opener";
p11.debutYear = 2012;
p11.status = "Active";
p11.experience = "12 Years";
p11.awards = "Player of Match";

i11.player = p11;

i11.getIplDetails();
Ipl i12 = new Ipl();

i12.teamId = 12;
i12.teamName = "Chennai Super Kings";
i12.captain = "Ruturaj Gaikwad";
i12.coach = "Stephen Fleming";
i12.homeGround = "Chepauk Stadium";
i12.championships = 5;
i12.playersCount = 25;
i12.owner = "India Cements";
i12.city = "Chennai";
i12.sponsor = "TVS Eurogrip";
i12.foundedYear = 2008;
i12.color = "Yellow";
i12.category = "T20";
i12.matchesPlayed = 230;
i12.wins = 140;
i12.losses = 90;
i12.points = 280;
i12.status = "Active";
i12.manager = "Russell Radhakrishnan";
i12.league = "IPL";

Player p12 = new Player();

p12.playerId = 31;
p12.playerName = "Ruturaj Gaikwad";
p12.role = "Batsman";
p12.country = "India";
p12.age = 27;
p12.battingStyle = "Right Hand";
p12.bowlingStyle = "None";
p12.jerseyNumber = 31;
p12.matches = 70;
p12.runs = 2300;
p12.wickets = 0;
p12.catches = 35;
p12.team = "CSK";
p12.strikeRate = 138;
p12.economy = 0;
p12.category = "Opener";
p12.debutYear = 2020;
p12.status = "Active";
p12.experience = "4 Years";
p12.awards = "Orange Cap";

i12.player = p12;

i12.getIplDetails();
Ipl i13 = new Ipl();

i13.teamId = 13;
i13.teamName = "Mumbai Indians";
i13.captain = "Hardik Pandya";
i13.coach = "Mark Boucher";
i13.homeGround = "Wankhede Stadium";
i13.championships = 5;
i13.playersCount = 25;
i13.owner = "Reliance";
i13.city = "Mumbai";
i13.sponsor = "Slice";
i13.foundedYear = 2008;
i13.color = "Blue";
i13.category = "T20";
i13.matchesPlayed = 240;
i13.wins = 135;
i13.losses = 105;
i13.points = 270;
i13.status = "Active";
i13.manager = "Rahul Sanghvi";
i13.league = "IPL";

Player p13 = new Player();

p13.playerId = 93;
p13.playerName = "Jasprit Bumrah";
p13.role = "Bowler";
p13.country = "India";
p13.age = 30;
p13.battingStyle = "Right Hand";
p13.bowlingStyle = "Right Arm Fast";
p13.jerseyNumber = 93;
p13.matches = 130;
p13.runs = 80;
p13.wickets = 160;
p13.catches = 25;
p13.team = "MI";
p13.strikeRate = 90;
p13.economy = 7;
p13.category = "Fast Bowler";
p13.debutYear = 2013;
p13.status = "Active";
p13.experience = "11 Years";
p13.awards = "Purple Cap";

i13.player = p13;

i13.getIplDetails();
Ipl i14 = new Ipl();

i14.teamId = 14;
i14.teamName = "Kolkata Knight Riders";
i14.captain = "Shreyas Iyer";
i14.coach = "Chandrakant Pandit";
i14.homeGround = "Eden Gardens";
i14.championships = 2;
i14.playersCount = 25;
i14.owner = "Shah Rukh Khan";
i14.city = "Kolkata";
i14.sponsor = "My11Circle";
i14.foundedYear = 2008;
i14.color = "Purple";
i14.category = "T20";
i14.matchesPlayed = 230;
i14.wins = 120;
i14.losses = 110;
i14.points = 240;
i14.status = "Active";
i14.manager = "Wayne Bentley";
i14.league = "IPL";

Player p14 = new Player();

p14.playerId = 19;
p14.playerName = "Andre Russell";
p14.role = "All Rounder";
p14.country = "West Indies";
p14.age = 36;
p14.battingStyle = "Right Hand";
p14.bowlingStyle = "Right Arm Fast";
p14.jerseyNumber = 12;
p14.matches = 120;
p14.runs = 2300;
p14.wickets = 100;
p14.catches = 60;
p14.team = "KKR";
p14.strikeRate = 175;
p14.economy = 8;
p14.category = "All Rounder";
p14.debutYear = 2014;
p14.status = "Active";
p14.experience = "10 Years";
p14.awards = "MVP";

i14.player = p14;

i14.getIplDetails();
Ipl i15 = new Ipl();

i15.teamId = 15;
i15.teamName = "Sunrisers Hyderabad";
i15.captain = "Pat Cummins";
i15.coach = "Daniel Vettori";
i15.homeGround = "Rajiv Gandhi Stadium";
i15.championships = 1;
i15.playersCount = 25;
i15.owner = "Sun TV Network";
i15.city = "Hyderabad";
i15.sponsor = "Dream11";
i15.foundedYear = 2013;
i15.color = "Orange";
i15.category = "T20";
i15.matchesPlayed = 190;
i15.wins = 95;
i15.losses = 95;
i15.points = 190;
i15.status = "Active";
i15.manager = "Tom Moody";
i15.league = "IPL";

Player p15 = new Player();

p15.playerId = 5;
p15.playerName = "David Warner";
p15.role = "Batsman";
p15.country = "Australia";
p15.age = 37;
p15.battingStyle = "Left Hand";
p15.bowlingStyle = "Right Arm Leg Spin";
p15.jerseyNumber = 31;
p15.matches = 180;
p15.runs = 6500;
p15.wickets = 5;
p15.catches = 90;
p15.team = "SRH";
p15.strikeRate = 142;
p15.economy = 7;
p15.category = "Opener";
p15.debutYear = 2009;
p15.status = "Active";
p15.experience = "15 Years";
p15.awards = "Orange Cap";

i15.player = p15;

i15.getIplDetails();
Ipl i16 = new Ipl();

i16.teamId = 16;
i16.teamName = "Punjab Kings";
i16.captain = "Shikhar Dhawan";
i16.coach = "Trevor Bayliss";
i16.homeGround = "Mohali Stadium";
i16.championships = 0;
i16.playersCount = 25;
i16.owner = "Preity Zinta";
i16.city = "Punjab";
i16.sponsor = "BKT";
i16.foundedYear = 2008;
i16.color = "Red";
i16.category = "T20";
i16.matchesPlayed = 215;
i16.wins = 95;
i16.losses = 120;
i16.points = 190;
i16.status = "Active";
i16.manager = "Anil Kumble";
i16.league = "IPL";

Player p16 = new Player();

p16.playerId = 64;
p16.playerName = "Arshdeep Singh";
p16.role = "Bowler";
p16.country = "India";
p16.age = 25;
p16.battingStyle = "Left Hand";
p16.bowlingStyle = "Left Arm Fast";
p16.jerseyNumber = 2;
p16.matches = 60;
p16.runs = 50;
p16.wickets = 75;
p16.catches = 10;
p16.team = "PBKS";
p16.strikeRate = 80;
p16.economy = 8;
p16.category = "Fast Bowler";
p16.debutYear = 2019;
p16.status = "Active";
p16.experience = "5 Years";
p16.awards = "Emerging Player";

i16.player = p16;

i16.getIplDetails();
Ipl i17 = new Ipl();

i17.teamId = 17;
i17.teamName = "Rajasthan Royals";
i17.captain = "Sanju Samson";
i17.coach = "Kumar Sangakkara";
i17.homeGround = "Sawai Mansingh Stadium";
i17.championships = 1;
i17.playersCount = 25;
i17.owner = "Manoj Badale";
i17.city = "Jaipur";
i17.sponsor = "Red Bull";
i17.foundedYear = 2008;
i17.color = "Pink";
i17.category = "T20";
i17.matchesPlayed = 210;
i17.wins = 100;
i17.losses = 110;
i17.points = 200;
i17.status = "Active";
i17.manager = "Romesh Kaluwitharana";
i17.league = "IPL";

Player p17 = new Player();

p17.playerId = 99;
p17.playerName = "Jos Buttler";
p17.role = "Wicket Keeper Batsman";
p17.country = "England";
p17.age = 33;
p17.battingStyle = "Right Hand";
p17.bowlingStyle = "None";
p17.jerseyNumber = 63;
p17.matches = 100;
p17.runs = 3500;
p17.wickets = 0;
p17.catches = 70;
p17.team = "RR";
p17.strikeRate = 150;
p17.economy = 0;
p17.category = "Opener";
p17.debutYear = 2016;
p17.status = "Active";
p17.experience = "8 Years";
p17.awards = "Orange Cap";

i17.player = p17;

i17.getIplDetails();
Ipl i18 = new Ipl();

i18.teamId = 18;
i18.teamName = "Delhi Capitals";
i18.captain = "Rishabh Pant";
i18.coach = "Ricky Ponting";
i18.homeGround = "Arun Jaitley Stadium";
i18.championships = 0;
i18.playersCount = 25;
i18.owner = "JSW Group";
i18.city = "Delhi";
i18.sponsor = "JSW";
i18.foundedYear = 2008;
i18.color = "Blue";
i18.category = "T20";
i18.matchesPlayed = 220;
i18.wins = 105;
i18.losses = 115;
i18.points = 210;
i18.status = "Active";
i18.manager = "Vijay Bharadwaj";
i18.league = "IPL";

Player p18 = new Player();

p18.playerId = 66;
p18.playerName = "David Warner";
p18.role = "Batsman";
p18.country = "Australia";
p18.age = 37;
p18.battingStyle = "Left Hand";
p18.bowlingStyle = "Right Arm Leg Spin";
p18.jerseyNumber = 31;
p18.matches = 180;
p18.runs = 6500;
p18.wickets = 5;
p18.catches = 90;
p18.team = "DC";
p18.strikeRate = 142;
p18.economy = 7;
p18.category = "Opener";
p18.debutYear = 2009;
p18.status = "Active";
p18.experience = "15 Years";
p18.awards = "Orange Cap";

i18.player = p18;

i18.getIplDetails();
Ipl i19 = new Ipl();

i19.teamId = 19;
i19.teamName = "Gujarat Titans";
i19.captain = "Shubman Gill";
i19.coach = "Ashish Nehra";
i19.homeGround = "Narendra Modi Stadium";
i19.championships = 1;
i19.playersCount = 25;
i19.owner = "CVC Capital";
i19.city = "Ahmedabad";
i19.sponsor = "Dream11";
i19.foundedYear = 2022;
i19.color = "Dark Blue";
i19.category = "T20";
i19.matchesPlayed = 40;
i19.wins = 24;
i19.losses = 16;
i19.points = 48;
i19.status = "Active";
i19.manager = "Vikram Solanki";
i19.league = "IPL";

Player p19 = new Player();

p19.playerId = 33;
p19.playerName = "Rashid Khan";
p19.role = "Bowler";
p19.country = "Afghanistan";
p19.age = 25;
p19.battingStyle = "Right Hand";
p19.bowlingStyle = "Leg Spin";
p19.jerseyNumber = 19;
p19.matches = 120;
p19.runs = 400;
p19.wickets = 150;
p19.catches = 50;
p19.team = "GT";
p19.strikeRate = 120;
p19.economy = 6;
p19.category = "Spinner";
p19.debutYear = 2017;
p19.status = "Active";
p19.experience = "7 Years";
p19.awards = "Purple Cap";

i19.player = p19;

i19.getIplDetails();
Ipl i20 = new Ipl();

i20.teamId = 20;
i20.teamName = "Lucknow Super Giants";
i20.captain = "KL Rahul";
i20.coach = "Justin Langer";
i20.homeGround = "Ekana Stadium";
i20.championships = 0;
i20.playersCount = 25;
i20.owner = "RPSG Group";
i20.city = "Lucknow";
i20.sponsor = "Greenply";
i20.foundedYear = 2022;
i20.color = "Blue";
i20.category = "T20";
i20.matchesPlayed = 40;
i20.wins = 22;
i20.losses = 18;
i20.points = 44;
i20.status = "Active";
i20.manager = "Andy Flower";
i20.league = "IPL";

Player p20 = new Player();

p20.playerId = 29;
p20.playerName = "Nicholas Pooran";
p20.role = "Wicket Keeper Batsman";
p20.country = "West Indies";
p20.age = 28;
p20.battingStyle = "Left Hand";
p20.bowlingStyle = "None";
p20.jerseyNumber = 29;
p20.matches = 80;
p20.runs = 1800;
p20.wickets = 0;
p20.catches = 40;
p20.team = "LSG";
p20.strikeRate = 160;
p20.economy = 0;
p20.category = "Finisher";
p20.debutYear = 2019;
p20.status = "Active";
p20.experience = "5 Years";
p20.awards = "Best Finisher";

i20.player = p20;

i20.getIplDetails();
    }
}