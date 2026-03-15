class WonderlaExecutor {
public static void main(String[] args) {
Wonderla w1 = new Wonderla();
w1.parkId = 1;
w1.parkName = "Wonderla";
w1.location = "Bangalore";
w1.city = "Bangalore";
w1.state = "Karnataka";
w1.rides = 60;
w1.pools = 10;
w1.visitorsPerDay = 5000;
w1.owner = "Wonderla Holidays";
w1.establishedYear = 2005;
w1.openingTime = "11 AM";
w1.closingTime = "6 PM";
w1.ticketPrice = 1200;
w1.safetyLevel = "High";
w1.parkingFacility = "Available";
w1.foodCourt = "Yes";
w1.website = "wonderla.com";
w1.contact = "080123456";
w1.category = "Amusement Park";
w1.status = "Open";

LazyPool lp1 = new LazyPool();

lp1.poolId = 101;
lp1.poolName = "Lazy River";
lp1.depth = 4;
lp1.length = 200;
lp1.width = 10;
lp1.waterType = "Fresh";
lp1.capacity = 200;
lp1.safetyGuard = "Yes";
lp1.location = "Water Section";
lp1.color = "Blue";
lp1.temperature = "Normal";
lp1.cleaningType = "Automatic";
lp1.filters = 5;
lp1.lighting = "LED";
lp1.music = "Background";
lp1.tubeType = "Rubber";
lp1.lifeguards = 6;
lp1.category = "Water Ride";
lp1.status = "Active";
lp1.maintenance = "Weekly";

w1.lazyPool = lp1;

w1.getWonderlaDetails();

Wonderla w2 = new Wonderla();

w2.parkId = 2;
w2.parkName = "Wonderla Hyderabad";
w2.location = "Hyderabad";
w2.city = "Hyderabad";
w2.state = "Telangana";
w2.rides = 45;
w2.pools = 8;
w2.visitorsPerDay = 4500;
w2.owner = "Wonderla Holidays";
w2.establishedYear = 2010;
w2.openingTime = "10:30 AM";
w2.closingTime = "7 PM";
w2.ticketPrice = 1100;
w2.safetyLevel = "High";
w2.parkingFacility = "Available";
w2.foodCourt = "Yes";
w2.website = "wonderla.com";
w2.contact = "040987654";
w2.category = "Amusement Park";
w2.status = "Open";

LazyPool lp2 = new LazyPool();

lp2.poolId = 102;
lp2.poolName = "Wave Pool";
lp2.depth = 5;
lp2.length = 150;
lp2.width = 20;
lp2.waterType = "Fresh";
lp2.capacity = 300;
lp2.safetyGuard = "Yes";
lp2.location = "Main Pool Area";
lp2.color = "Aqua";
lp2.temperature = "Warm";
lp2.cleaningType = "Manual";
lp2.filters = 8;
lp2.lighting = "Spotlights";
lp2.music = "Party Mix";
lp2.tubeType = "Plastic";
lp2.lifeguards = 8;
lp2.category = "Wave Pool";
lp2.status = "Active";
lp2.maintenance = "Daily";

w2.lazyPool = lp2;

w2.getWonderlaDetails();

Wonderla w3 = new Wonderla();

w3.parkId = 3;
w3.parkName = "Adlabs Imagica";
w3.location = "Khopoli";
w3.city = "Raigad";
w3.state = "Maharashtra";
w3.rides = 50;
w3.pools = 7;
w3.visitorsPerDay = 6000;
w3.owner = "Adlabs Entertainment";
w3.establishedYear = 2013;
w3.openingTime = "11 AM";
w3.closingTime = "8 PM";
w3.ticketPrice = 1400;
w3.safetyLevel = "Very High";
w3.parkingFacility = "Valet Available";
w3.foodCourt = "Yes";
w3.website = "imagicaaworld.com";
w3.contact = "02114-666888";
w3.category = "Theme Park";
w3.status = "Open";

LazyPool lp3 = new LazyPool();

lp3.poolId = 103;
lp3.poolName = "Infinity Pool";
lp3.depth = 3;
lp3.length = 180;
lp3.width = 15;
lp3.waterType = "Chlorinated";
lp3.capacity = 250;
lp3.safetyGuard = "Yes";
lp3.location = "Theme Zone";
lp3.color = "Crystal Clear";
lp3.temperature = "Cool";
lp3.cleaningType = "Automatic";
lp3.filters = 6;
lp3.lighting = "RGB";
lp3.music = "Theme Songs";
lp3.tubeType = "Inflatable";
lp3.lifeguards = 7;
lp3.category = "Relaxation Pool";
lp3.status = "Active";
lp3.maintenance = "Bi-weekly";

w3.lazyPool = lp3;

w3.getWonderlaDetails();

Wonderla w4 = new Wonderla();

w4.parkId = 4;
w4.parkName = "EsselWorld";
w4.location = "Mumbai";
w4.city = "Mumbai";
w4.state = "Maharashtra";
w4.rides = 55;
w4.pools = 6;
w4.visitorsPerDay = 7000;
w4.owner = "Macrotech Developers";
w4.establishedYear = 1978;
w4.openingTime = "10 AM";
w4.closingTime = "7 PM";
w4.ticketPrice = 900;
w4.safetyLevel = "High";
w4.parkingFacility = "Available";
w4.foodCourt = "Yes";
w4.website = "esselworld.in";
w4.contact = "022-28828888";
w4.category = "Amusement Park";
w4.status = "Open";

LazyPool lp4 = new LazyPool();

lp4.poolId = 104;
lp4.poolName = "Rain Dance Pool";
lp4.depth = 4.5;
lp4.length = 120;
lp4.width = 25;
lp4.waterType = "Fresh";
lp4.capacity = 400;
lp4.safetyGuard = "Yes";
lp4.location = "Dance Zone";
lp4.color = "Rainbow";
lp4.temperature = "Normal";
lp4.cleaningType = "Manual";
lp4.filters = 4;
lp4.lighting = "Disco Lights";
lp4.music = "DJ Mix";
lp4.tubeType = "None";
lp4.lifeguards = 10;
lp4.category = "Party Pool";
lp4.status = "Active";
lp4.maintenance = "Daily";

w4.lazyPool = lp4;

w4.getWonderlaDetails();

Wonderla w5 = new Wonderla();

w5.parkId = 5;
w5.parkName = "Nicco Park";
w5.location = "Kolkata";
w5.city = "Kolkata";
w5.state = "West Bengal";
w5.rides = 35;
w5.pools = 5;
w5.visitorsPerDay = 4000;
w5.owner = "Nicco Corporation";
w5.establishedYear = 1991;
w5.openingTime = "2:30 PM";
w5.closingTime = "8 PM";
w5.ticketPrice = 800;
w5.safetyLevel = "Medium";
w5.parkingFacility = "Limited";
w5.foodCourt = "Yes";
w5.website = "niccoparks.com";
w5.contact = "033-23374422";
w5.category = "Amusement Park";
w5.status = "Open";

LazyPool lp5 = new LazyPool();

lp5.poolId = 105;
lp5.poolName = "Kids Splash Pool";
lp5.depth = 2;
lp5.length = 80;
lp5.width = 12;
lp5.waterType = "Fresh";
lp5.capacity = 100;
lp5.safetyGuard = "Yes";
lp5.location = "Kids Zone";
lp5.color = "Yellow";
lp5.temperature = "Warm";
lp5.cleaningType = "Automatic";
lp5.filters = 3;
lp5.lighting = "Soft Lights";
lp5.music = "Kids Songs";
lp5.tubeType = "Small Tubes";
lp5.lifeguards = 4;
lp5.category = "Kids Pool";
lp5.status = "Active";
lp5.maintenance = "Weekly";

w5.lazyPool = lp5;

w5.getWonderlaDetails();

Wonderla w6 = new Wonderla();

w6.parkId = 6;
w6.parkName = "Appu Ghar";
w6.location = "Delhi";
w6.city = "Delhi";
w6.state = "Delhi";
w6.rides = 42;
w6.pools = 4;
w6.visitorsPerDay = 5500;
w6.owner = "Appu Ghar Ventures";
w6.establishedYear = 1984;
w6.openingTime = "11 AM";
w6.closingTime = "7 PM";
w6.ticketPrice = 950;
w6.safetyLevel = "High";
w6.parkingFacility = "Available";
w6.foodCourt = "Yes";
w6.website = "appughar.com";
w6.contact = "011-25591234";
w6.category = "Amusement Park";
w6.status = "Open";

LazyPool lp6 = new LazyPool();

lp6.poolId = 106;
lp6.poolName = "Adventure Pool";
lp6.depth = 6;
lp6.length = 250;
lp6.width = 18;
lp6.waterType = "Chlorinated";
lp6.capacity = 350;
lp6.safetyGuard = "Yes";
lp6.location = "Adventure Zone";
lp6.color = "Green";
lp6.temperature = "Cool";
lp6.cleaningType = "Manual";
lp6.filters = 7;
lp6.lighting = "Night Lights";
lp6.music = "Adventure Theme";
lp6.tubeType = "Heavy Duty";
lp6.lifeguards = 9;
lp6.category = "Thrill Pool";
lp6.status = "Active";
lp6.maintenance = "Bi-weekly";

w6.lazyPool = lp6;

w6.getWonderlaDetails();

Wonderla w7 = new Wonderla();

w7.parkId = 7;
w7.parkName = "Snow World";
w7.location = "Hyderabad";
w7.city = "Hyderabad";
w7.state = "Telangana";
w7.rides = 25;
w7.pools = 12;
w7.visitorsPerDay = 3000;
w7.owner = "Snow World India";
w7.establishedYear = 2007;
w7.openingTime = "10 AM";
w7.closingTime = "10 PM";
w7.ticketPrice = 650;
w7.safetyLevel = "High";
w7.parkingFacility = "Available";
w7.foodCourt = "Yes";
w7.website = "snowworldindia.com";
w7.contact = "040-23077777";
w7.category = "Snow Theme Park";
w7.status = "Open";

LazyPool lp7 = new LazyPool();

lp7.poolId = 107;
lp7.poolName = "Ice Pool";
lp7.depth = 3.5;
lp7.length = 100;
lp7.width = 8;
lp7.waterType = "Ice Cold";
lp7.capacity = 150;
lp7.safetyGuard = "Yes";
lp7.location = "Snow Zone";
lp7.color = "Icy Blue";
lp7.temperature = "Freezing";
lp7.cleaningType = "Specialized";
lp7.filters = 10;
lp7.lighting = "Blue Lights";
lp7.music = "Snow Theme";
lp7.tubeType = "Insulated";
lp7.lifeguards = 5;
lp7.category = "Ice Pool";
lp7.status = "Active";
lp7.maintenance = "Daily";

w7.lazyPool = lp7;

w7.getWonderlaDetails();

Wonderla w8 = new Wonderla();

w8.parkId = 8;
w8.parkName = "Ramoji Film City";
w8.location = "Hyderabad";
w8.city = "Hyderabad";
w8.state = "Telangana";
w8.rides = 30;
w8.pools = 9;
w8.visitorsPerDay = 8000;
w8.owner = "Ramoji Group";
w8.establishedYear = 1996;
w8.openingTime = "9 AM";
w8.closingTime = "9 PM";
w8.ticketPrice = 2500;
w8.safetyLevel = "Very High";
w8.parkingFacility = "Valet Available";
w8.foodCourt = "Multiple";
w8.website = "ramojifilmcity.com";
w8.contact = "040-29899999";
w8.category = "Film Theme Park";
w8.status = "Open";

LazyPool lp8 = new LazyPool();

lp8.poolId = 108;
lp8.poolName = "Film City Lagoon";
lp8.depth = 5;
lp8.length = 300;
lp8.width = 22;
lp8.waterType = "Fresh";
lp8.capacity = 500;
lp8.safetyGuard = "Yes";
lp8.location = "Film Set";
lp8.color = "Emerald";
lp8.temperature = "Warm";
lp8.cleaningType = "Automatic";
lp8.filters = 12;
lp8.lighting = "Cinematic";
lp8.music = "Film Scores";
lp8.tubeType = "Movie Theme";
lp8.lifeguards = 12;
lp8.category = "Cinematic Pool";
lp8.status = "Active";
lp8.maintenance = "Weekly";

w8.lazyPool = lp8;

w8.getWonderlaDetails();

Wonderla w9 = new Wonderla();

w9.parkId = 9;
w9.parkName = "VGP Universal Kingdom";
w9.location = "Chennai";
w9.city = "Chennai";
w9.state = "Tamil Nadu";
w9.rides = 48;
w9.pools = 11;
w9.visitorsPerDay = 5000;
w9.owner = "VGP Group";
w9.establishedYear = 1970;
w9.openingTime = "10 AM";
w9.closingTime = "8 PM";
w9.ticketPrice = 1100;
w9.safetyLevel = "High";
w9.parkingFacility = "Available";
w9.foodCourt = "Yes";
w9.website = "vgpkingdom.com";
w9.contact = "044-28471111";
w9.category = "Amusement Park";
w9.status = "Open";

LazyPool lp9 = new LazyPool();

lp9.poolId = 109;
lp9.poolName = "Golden Beach Pool";
lp9.depth = 4;
lp9.length = 220;
lp9.width = 16;
lp9.waterType = "Sea Water";
lp9.capacity = 280;
lp9.safetyGuard = "Yes";
lp9.location = "Beach Zone";
lp9.color = "Ocean Blue";
lp9.temperature = "Salty";
lp9.cleaningType = "Manual";
lp9.filters = 6;
lp9.lighting = "Sunset Lights";
lp9.music = "Beach Vibes";
lp9.tubeType = "Surf Boards";
lp9.lifeguards = 8;
lp9.category = "Beach Pool";
lp9.status = "Active";
lp9.maintenance = "Daily";

w9.lazyPool = lp9;

w9.getWonderlaDetails();

Wonderla w10 = new Wonderla();

w10.parkId = 10;
w10.parkName = "Queens Land";
w10.location = "Chennai";
w10.city = "Chennai";
w10.state = "Tamil Nadu";
w10.rides = 38;
w10.pools = 6;
w10.visitorsPerDay = 3500;
w10.owner = "Queens Land Pvt Ltd";
w10.establishedYear = 1985;
w10.openingTime = "11 AM";
w10.closingTime = "7 PM";
w10.ticketPrice = 850;
w10.safetyLevel = "Medium";
w10.parkingFacility = "Limited";
w10.foodCourt = "Yes";
w10.website = "queensland.in";
w10.contact = "044-28521122";
w10.category = "Water Park";
w10.status = "Open";

LazyPool lp10 = new LazyPool();

lp10.poolId = 110;
lp10.poolName = "Royal Pool";
lp10.depth = 3.8;
lp10.length = 160;
lp10.width = 14;
lp10.waterType = "Fresh";
lp10.capacity = 220;
lp10.safetyGuard = "Yes";
lp10.location = "Royal Zone";
lp10.color = "Royal Blue";
lp10.temperature = "Normal";
lp10.cleaningType = "Automatic";
lp10.filters = 5;
lp10.lighting = "Golden Lights";
lp10.music = "Royal Music";
lp10.tubeType = "Luxury Tubes";
lp10.lifeguards = 6;
lp10.category = "Premium Pool";
lp10.status = "Active";
lp10.maintenance = "Weekly";

w10.lazyPool = lp10;

w10.getWonderlaDetails();

Wonderla w11 = new Wonderla();

w11.parkId = 11;
w11.parkName = "Splashdown Waterpark";
w11.location = "Bengaluru";
w11.city = "Bengaluru";
w11.state = "Karnataka";
w11.rides = 28;
w11.pools = 15;
w11.visitorsPerDay = 2500;
w11.owner = "Splashdown Group";
w11.establishedYear = 2012;
w11.openingTime = "10 AM";
w11.closingTime = "6 PM";
w11.ticketPrice = 700;
w11.safetyLevel = "High";
w11.parkingFacility = "Available";
w11.foodCourt = "Yes";
w11.website = "splashdown.in";
w11.contact = "080-41234567";
w11.category = "Water Park";
w11.status = "Open";

LazyPool lp11 = new LazyPool();

lp11.poolId = 111;
lp11.poolName = "Splash River";
lp11.depth = 2.5;
lp11.length = 180;
lp11.width = 12;
lp11.waterType = "Fresh";
lp11.capacity = 180;
lp11.safetyGuard = "Yes";
lp11.location = "Splash Zone";
lp11.color = "Turquoise";
lp11.temperature = "Cool";
lp11.cleaningType = "Manual";
lp11.filters = 4;
lp11.lighting = "Waterproof";
lp11.music = "Fun Mix";
lp11.tubeType = "Colorful";
lp11.lifeguards = 5;
lp11.category = "Family Pool";
lp11.status = "Active";
lp11.maintenance = "Weekly";

w11.lazyPool = lp11;

w11.getWonderlaDetails();

Wonderla w12 = new Wonderla();

w12.parkId = 12;
w12.parkName = "Wet N Joy";
w12.location = "Kolkata";
w12.city = "Kolkata";
w12.state = "West Bengal";
w12.rides = 32;
w12.pools = 13;
w12.visitorsPerDay = 3200;
w12.owner = "Wet N Joy Ltd";
w12.establishedYear = 2008;
w12.openingTime = "11 AM";
w12.closingTime = "7 PM";
w12.ticketPrice = 750;
w12.safetyLevel = "Medium";
w12.parkingFacility = "Available";
w12.foodCourt = "Yes";
w12.website = "wetnjoy.com";
w12.contact = "033-25678901";
w12.category = "Water Park";
w12.status = "Open";

LazyPool lp12 = new LazyPool();

lp12.poolId = 112;
lp12.poolName = "Joy Stream";
lp12.depth = 4.2;
lp12.length = 140;
lp12.width = 18;
lp12.waterType = "Chlorinated";
lp12.capacity = 260;
lp12.safetyGuard = "Yes";
lp12.location = "Joy Zone";
lp12.color = "Sapphire";
lp12.temperature = "Warm";
lp12.cleaningType = "Automatic";
lp12.filters = 6;
lp12.lighting = "Party Lights";
lp12.music = "Dance Mix";
lp12.tubeType = "Party Tubes";
lp12.lifeguards = 7;
lp12.category = "Party Pool";
lp12.status = "Active";
lp12.maintenance = "Daily";

w12.lazyPool = lp12;

w12.getWonderlaDetails();

Wonderla w13 = new Wonderla();

w13.parkId = 13;
w13.parkName = "Blue Lagoon";
w13.location = "Pune";
w13.city = "Pune";
w13.state = "Maharashtra";
w13.rides = 22;
w13.pools = 18;
w13.visitorsPerDay = 2800;
w13.owner = "Blue Lagoon Resorts";
w13.establishedYear = 2015;
w13.openingTime = "9:30 AM";
w13.closingTime = "7 PM";
w13.ticketPrice = 800;
w13.safetyLevel = "High";
w13.parkingFacility = "Valet Available";
w13.foodCourt = "Yes";
w13.website = "bluelagoonpune.com";
w13.contact = "020-67890123";
w13.category = "Water Resort";
w13.status = "Open";

LazyPool lp13 = new LazyPool();

lp13.poolId = 113;
lp13.poolName = "Lagoon Paradise";
lp13.depth = 3.2;
lp13.length = 260;
lp13.width = 20;
lp13.waterType = "Fresh";
lp13.capacity = 380;
lp13.safetyGuard = "Yes";
lp13.location = "Paradise Zone";
lp13.color = "Lagoon Blue";
lp13.temperature = "Perfect";
lp13.cleaningType = "Automatic";
lp13.filters = 9;
lp13.lighting = "Tropical";
lp13.music = "Island Beats";
lp13.tubeType = "Tropical";
lp13.lifeguards = 10;
lp13.category = "Resort Pool";
lp13.status = "Active";
lp13.maintenance = "Weekly";

w13.lazyPool = lp13;

w13.getWonderlaDetails();

Wonderla w14 = new Wonderla();

w14.parkId = 14;
w14.parkName = "Aqua Fantasy";
w14.location = "Mumbai";
w14.city = "Mumbai";
w14.state = "Maharashtra";
w14.rides = 40;
w14.pools = 10;
w14.visitorsPerDay = 4200;
w14.owner = "Aqua Fantasy Ltd";
w14.establishedYear = 2011;
w14.openingTime = "10 AM";
w14.closingTime = "8 PM";
w14.ticketPrice = 950;
w14.safetyLevel = "High";
w14.parkingFacility = "Available";
w14.foodCourt = "Multiple";
w14.website = "aquafantasymumbai.com";
w14.contact = "022-34567890";
w14.category = "Water Park";
w14.status = "Open";

LazyPool lp14 = new LazyPool();

lp14.poolId = 114;
lp14.poolName = "Fantasy River";
lp14.depth = 5.2;
lp14.length = 320;
lp14.width = 24;
lp14.waterType = "Fresh";
lp14.capacity = 450;
lp14.safetyGuard = "Yes";
lp14.location = "Fantasy Land";
lp14.color = "Magical Purple";
lp14.temperature = "Warm";
lp14.cleaningType = "Manual";
lp14.filters = 11;
lp14.lighting = "Fantasy Lights";
lp14.music = "Magical Tunes";
lp14.tubeType = "Fantasy Design";
lp14.lifeguards = 11;
lp14.category = "Fantasy Pool";
lp14.status = "Active";
lp14.maintenance = "Bi-weekly";

w14.lazyPool = lp14;

w14.getWonderlaDetails();

Wonderla w15 = new Wonderla();

w15.parkId = 15;
w15.parkName = "Happy Island";
w15.location = "Coimbatore";
w15.city = "Coimbatore";
w15.state = "Tamil Nadu";
w15.rides = 35;
w15.pools = 8;
w15.visitorsPerDay = 3800;
w15.owner = "Happy Island Group";
w15.establishedYear = 2009;
w15.openingTime = "11 AM";
w15.closingTime = "7 PM";
w15.ticketPrice = 900;
w15.safetyLevel = "Medium";
w15.parkingFacility = "Available";
w15.foodCourt = "Yes";
w15.website = "happyislandcb.com";
w15.contact = "0422-45678901";
w15.category = "Amusement Park";
w15.status = "Open";

LazyPool lp15 = new LazyPool();

lp15.poolId = 115;
lp15.poolName = "Island Paradise";
lp15.depth = 4.8;
lp15.length = 200;
lp15.width = 16;
lp15.waterType = "Chlorinated";
lp15.capacity = 320;
lp15.safetyGuard = "Yes";
lp15.location = "Island Zone";
lp15.color = "Paradise Green";
lp15.temperature = "Cool";
lp15.cleaningType = "Automatic";
lp15.filters = 7;
lp15.lighting = "Island Lights";
lp15.music = "Happy Tunes";
lp15.tubeType = "Island Theme";
lp15.lifeguards = 8;
lp15.category = "Family Pool";
lp15.status = "Active";
lp15.maintenance = "Weekly";

w15.lazyPool = lp15;

w15.getWonderlaDetails();

Wonderla w16 = new Wonderla();

w16.parkId = 16;
w16.parkName = "Water Kingdom";
w16.location = "Mumbai";
w16.city = "Mumbai";
w16.state = "Maharashtra";
w16.rides = 52;
w16.pools = 14;
w16.visitorsPerDay = 6500;
w16.owner = "Macrotech Developers";
w16.establishedYear = 1995;
w16.openingTime = "10 AM";
w16.closingTime = "7 PM";
w16.ticketPrice = 1200;
w16.safetyLevel = "Very High";
w16.parkingFacility = "Valet Available";
w16.foodCourt = "Multiple";
w16.website = "waterkingdom.in";
w16.contact = "022-28850000";
w16.category = "Water Park";
w16.status = "Open";

LazyPool lp16 = new LazyPool();

lp16.poolId = 116;
lp16.poolName = "Kingdom Rapids";
lp16.depth = 6.5;
lp16.length = 400;
lp16.width = 30;
lp16.waterType = "Fresh";
lp16.capacity = 600;
lp16.safetyGuard = "Yes";
lp16.location = "Rapids Zone";
lp16.color = "White Water";
lp16.temperature = "Cold";
lp16.cleaningType = "Specialized";
lp16.filters = 15;
lp16.lighting = "Adventure";
lp16.music = "Rapids Sound";
lp16.tubeType = "Rapid Riders";
lp16.lifeguards = 15;
lp16.category = "Adventure Pool";
lp16.status = "Active";
lp16.maintenance = "Daily";

w16.lazyPool = lp16;

w16.getWonderlaDetails();

Wonderla w17 = new Wonderla();

w17.parkId = 17;
w17.parkName = "Paradise Water Park";
w17.location = "Surat";
w17.city = "Surat";
w17.state = "Gujarat";
w17.rides = 29;
w17.pools = 16;
w17.visitorsPerDay = 2900;
w17.owner = "Paradise Group";
w17.establishedYear = 2014;
w17.openingTime = "9 AM";
w17.closingTime = "8 PM";
w17.ticketPrice = 750;
w17.safetyLevel = "High";
w17.parkingFacility = "Available";
w17.foodCourt = "Yes";
w17.website = "paradisewaterpark.com";
w17.contact = "0261-2345678";
w17.category = "Water Park";
w17.status = "Open";

LazyPool lp17 = new LazyPool();

lp17.poolId = 117;
lp17.poolName = "Paradise Lagoon";
lp17.depth = 3.9;
lp17.length = 280;
lp17.width = 22;
lp17.waterType = "Fresh";
lp17.capacity = 420;
lp17.safetyGuard = "Yes";
lp17.location = "Lagoon Area";
lp17.color = "Tropical Blue";
lp17.temperature = "Warm";
lp17.cleaningType = "Automatic";
lp17.filters = 8;
lp17.lighting = "Tropical";
lp17.music = "Paradise Vibes";
lp17.tubeType = "Palm Tree";
lp17.lifeguards = 9;
lp17.category = "Relaxation Pool";
lp17.status = "Active";
lp17.maintenance = "Weekly";

w17.lazyPool = lp17;

w17.getWonderlaDetails();

Wonderla w18 = new Wonderla();

w18.parkId = 18;
w18.parkName = "Jolly Splash";
w18.location = "Ahmedabad";
w18.city = "Ahmedabad";
w18.state = "Gujarat";
w18.rides = 26;
w18.pools = 12;
w18.visitorsPerDay = 2600;
w18.owner = "Jolly Group";
w18.establishedYear = 2013;
w18.openingTime = "10:30 AM";
w18.closingTime = "7 PM";
w18.ticketPrice = 700;
w18.safetyLevel = "Medium";
w18.parkingFacility = "Limited";
w18.foodCourt = "Yes";
w18.website = "jollysplash.com";
w18.contact = "079-45678901";
w18.category = "Water Park";
w18.status = "Open";

LazyPool lp18 = new LazyPool();

lp18.poolId = 118;
lp18.poolName = "Jolly River";
lp18.depth = 4.1;
lp18.length = 190;
lp18.width = 15;
lp18.waterType = "Chlorinated";
lp18.capacity = 240;
lp18.safetyGuard = "Yes";
lp18.location = "Jolly Zone";
lp18.color = "Sunset Orange";
lp18.temperature = "Normal";
lp18.cleaningType = "Manual";
lp18.filters = 5;
lp18.lighting = "Sunset Glow";
lp18.music = "Fun Beats";
lp18.tubeType = "Jolly Tubes";
lp18.lifeguards = 6;
lp18.category = "Family Pool";
lp18.status = "Active";
lp18.maintenance = "Bi-weekly";

w18.lazyPool = lp18;

w18.getWonderlaDetails();

Wonderla w19 = new Wonderla();

w19.parkId = 19;
w19.parkName = "Magic Water World";
w19.location = "Nagpur";
w19.city = "Nagpur";
w19.state = "Maharashtra";
w19.rides = 33;
w19.pools = 11;
w19.visitorsPerDay = 3100;
w19.owner = "Magic World Ltd";
w19.establishedYear = 2010;
w19.openingTime = "11 AM";
w19.closingTime = "8 PM";
w19.ticketPrice = 850;
w19.safetyLevel = "High";
w19.parkingFacility = "Available";
w19.foodCourt = "Yes";
w19.website = "magicwaterworld.com";
w19.contact = "0712-34567890";
w19.category = "Water Park";
w19.status = "Open";

LazyPool lp19 = new LazyPool();

lp19.poolId = 119;
lp19.poolName = "Magic Stream";
lp19.depth = 5.1;
lp19.length = 240;
lp19.width = 19;
lp19.waterType = "Fresh";
lp19.capacity = 360;
lp19.safetyGuard = "Yes";
lp19.location = "Magic Zone";
lp19.color = "Mystic Purple";
lp19.temperature = "Cool";
lp19.cleaningType = "Automatic";
lp19.filters = 10;
lp19.lighting = "Magic Lights";
lp19.music = "Magic Theme";
lp19.tubeType = "Magic Carpet";
lp19.lifeguards = 10;
lp19.category = "Thrill Pool";
lp19.status = "Active";
lp19.maintenance = "Weekly";

w19.lazyPool = lp19;

w19.getWonderlaDetails();

Wonderla w20 = new Wonderla();

w20.parkId = 20;
w20.parkName = "Dream Land";
w20.location = "Indore";
w20.city = "Indore";
w20.state = "Madhya Pradesh";
w20.rides = 41;
w20.pools = 9;
w20.visitorsPerDay = 3700;
w20.owner = "Dream Land Resorts";
w20.establishedYear = 2016;
w20.openingTime = "10 AM";
w20.closingTime = "9 PM";
w20.ticketPrice = 950;
w20.safetyLevel = "Very High";
w20.parkingFacility = "Valet Available";
w20.foodCourt = "Multiple";
w20.website = "dreamlandindore.com";
w20.contact = "0731-23456789";
w20.category = "Theme Park";
w20.status = "Open";

LazyPool lp20 = new LazyPool();

lp20.poolId = 120;
lp20.poolName = "Dream Lagoon";
lp20.depth = 4.7;
lp20.length = 350;
lp20.width = 28;
lp20.waterType = "Fresh";
lp20.capacity = 550;
lp20.safetyGuard = "Yes";
lp20.location = "Dream World";
lp20.color = "Dreamy Pink";
lp20.temperature = "Perfect";
lp20.cleaningType = "Specialized";
lp20.filters = 14;
lp20.lighting = "Dream Lights";
lp20.music = "Dreamy Music";
lp20.tubeType = "Dream Riders";
lp20.lifeguards = 13;
lp20.category = "Premium Pool";
lp20.status = "Active";
lp20.maintenance = "Daily";

w20.lazyPool = lp20;

w20.getWonderlaDetails();

    }
}