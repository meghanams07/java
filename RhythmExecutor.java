class RhythmExecutor {

    public static void main(String[] args){

        Rhythms r1 = new Rhythms();

        r1.rhythmId = 1;
        r1.rhythmName = "Adi Tala Rhythm";
        r1.origin = "India";
        r1.genre = "Classical";
        r1.tempo = 120;
        r1.culture = "Carnatic";
        r1.beatPattern = "Adi Tala";
        r1.instrumentType = "Percussion";
        r1.duration = 5;
        r1.composer = "Traditional";
        r1.year = 1800;
        r1.language = "Tamil";
        r1.category = "Music";
        r1.mood = "Peaceful";
        r1.stageType = "Concert";
        r1.festival = "Margazhi";
        r1.artist = "Ariyakudi";
        r1.colorTheme = "Golden";
        r1.status = "Active";
        r1.popularity = "High";

        MusicInstrument mi1 = new MusicInstrument();

        mi1.instrumentId = 101;
        mi1.instrumentName = "Mridangam";
        mi1.type = "Percussion";
        mi1.material = "Wood";
        mi1.originCountry = "India";
        mi1.strings = 0;
        mi1.weight = 8;
        mi1.color = "Brown";
        mi1.brand = "Traditional";
        mi1.year = 1900;
        mi1.soundType = "Bass";
        mi1.tuning = "Manual";
        mi1.category = "Classical";
        mi1.playerType = "Professional";
        mi1.size = "Medium";
        mi1.maintenance = "Regular";
        mi1.usage = "Concert";
        mi1.manufacturer = "Local Makers";
        mi1.status = "Available";
        mi1.priceRange = "15000";

        r1.musicInstrument = mi1;

        r1.getRhythmDetails();

Rhythms r2 = new Rhythms();

        r2.rhythmId = 2;
        r2.rhythmName = "Roopaka Tala";
        r2.origin = "India";
        r2.genre = "Classical";
        r2.tempo = 108;
        r2.culture = "Carnatic";
        r2.beatPattern = "Roopaka";
        r2.instrumentType = "Percussion";
        r2.duration = 4;
        r2.composer = "Tyagaraja";
        r2.year = 1850;
        r2.language = "Telugu";
        r2.category = "Music";
        r2.mood = "Devotional";
        r2.stageType = "Temple";
        r2.festival = "Aradhan";
        r2.artist = "Semmangudi";
        r2.colorTheme = "Red";
        r2.status = "Active";
        r2.popularity = "Medium";

        MusicInstrument mi2 = new MusicInstrument();

        mi2.instrumentId = 102;
        mi2.instrumentName = "Kanjira";
        mi2.type = "Percussion";
        mi2.material = "Jackfruit";
        mi2.originCountry = "India";
        mi2.strings = 0;
        mi2.weight = 1;
        mi2.color = "Natural";
        mi2.brand = "Traditional";
        mi2.year = 1920;
        mi2.soundType = "High";
        mi2.tuning = "Manual";
        mi2.category = "Classical";
        mi2.playerType = "Expert";
        mi2.size = "Small";
        mi2.maintenance = "Daily";
        mi2.usage = "Solo";
        mi2.manufacturer = "Artisans";
        mi2.status = "Available";
        mi2.priceRange = "8000";

        r2.musicInstrument = mi2;

        r2.getRhythmDetails();

Rhythms r3 = new Rhythms();

        r3.rhythmId = 3;
        r3.rhythmName = "Teental Rhythm";
        r3.origin = "India";
        r3.genre = "Classical";
        r3.tempo = 115;
        r3.culture = "Hindustani";
        r3.beatPattern = "Teental";
        r3.instrumentType = "Percussion";
        r3.duration = 6;
        r3.composer = "Traditional";
        r3.year = 1700;
        r3.language = "Hindi";
        r3.category = "Music";
        r3.mood = "Serene";
        r3.stageType = "Darbar";
        r3.festival = "Diwali";
        r3.artist = "Zakir";
        r3.colorTheme = "Silver";
        r3.status = "Active";
        r3.popularity = "High";

        MusicInstrument mi3 = new MusicInstrument();

        mi3.instrumentId = 103;
        mi3.instrumentName = "Tabla";
        mi3.type = "Percussion";
        mi3.material = "Wood";
        mi3.originCountry = "India";
        mi3.strings = 0;
        mi3.weight = 5;
        mi3.color = "Black";
        mi3.brand = "Delhi";
        mi3.year = 1950;
        mi3.soundType = "Melodic";
        mi3.tuning = "Leather";
        mi3.category = "Classical";
        mi3.playerType = "Maestro";
        mi3.size = "Medium";
        mi3.maintenance = "Frequent";
        mi3.usage = "Accompaniment";
        mi3.manufacturer = "Pandit";
        mi3.status = "Available";
        mi3.priceRange = "25000";

        r3.musicInstrument = mi3;

        r3.getRhythmDetails();

Rhythms r4 = new Rhythms();

        r4.rhythmId = 4;
        r4.rhythmName = "Kerala Panchari";
        r4.origin = "India";
        r4.genre = "Folk";
        r4.tempo = 140;
        r4.culture = "Kerala";
        r4.beatPattern = "Panchari";
        r4.instrumentType = "Percussion";
        r4.duration = 3;
        r4.composer = "Folk";
        r4.year = 1600;
        r4.language = "Malayalam";
        r4.category = "Music";
        r4.mood = "Festive";
        r4.stageType = "Festival";
        r4.festival = "Onam";
        r4.artist = "Theyyam";
        r4.colorTheme = "Green";
        r4.status = "Active";
        r4.popularity = "Regional";

        MusicInstrument mi4 = new MusicInstrument();

        mi4.instrumentId = 104;
        mi4.instrumentName = "Chenda";
        mi4.type = "Percussion";
        mi4.material = "Wood";
        mi4.originCountry = "India";
        mi4.strings = 0;
        mi4.weight = 12;
        mi4.color = "Red";
        mi4.brand = "Kerala";
        mi4.year = 1800;
        mi4.soundType = "Loud";
        mi4.tuning = "Tight";
        mi4.category = "Folk";
        mi4.playerType = "Drummer";
        mi4.size = "Large";
        mi4.maintenance = "Heavy";
        mi4.usage = "Procession";
        mi4.manufacturer = "Temple";
        mi4.status = "Available";
        mi4.priceRange = "20000";

        r4.musicInstrument = mi4;

        r4.getRhythmDetails();

Rhythms r5 = new Rhythms();

        r5.rhythmId = 5;
        r5.rhythmName = "Thiruppugazh";
        r5.origin = "India";
        r5.genre = "Devotional";
        r5.tempo = 95;
        r5.culture = "Tamil";
        r5.beatPattern = "Misra Chapu";
        r5.instrumentType = "Percussion";
        r5.duration = 7;
        r5.composer = "Arunagiri";
        r5.year = 1400;
        r5.language = "Tamil";
        r5.category = "Music";
        r5.mood = "Spiritual";
        r5.stageType = "Temple";
        r5.festival = "Pugazh";
        r5.artist = "Devotees";
        r5.colorTheme = "Saffron";
        r5.status = "Active";
        r5.popularity = "Medium";

        MusicInstrument mi5 = new MusicInstrument();

        mi5.instrumentId = 105;
        mi5.instrumentName = "Udukku";
        mi5.type = "Percussion";
        mi5.material = "Clay";
        mi5.originCountry = "India";
        mi5.strings = 0;
        mi5.weight = 2;
        mi5.color = "Red";
        mi5.brand = "Temple";
        mi5.year = 1500;
        mi5.soundType = "Resonant";
        mi5.tuning = "Natural";
        mi5.category = "Devotional";
        mi5.playerType = "Priest";
        mi5.size = "Small";
        mi5.maintenance = "Simple";
        mi5.usage = "Puja";
        mi5.manufacturer = "Potters";
        mi5.status = "Available";
        mi5.priceRange = "3000";

        r5.musicInstrument = mi5;

        r5.getRhythmDetails();
        Rhythms r6 = new Rhythms();

        r6.rhythmId = 6;
        r6.rhythmName = "Misra Chapu";
        r6.origin = "India";
        r6.genre = "Classical";
        r6.tempo = 130;
        r6.culture = "Carnatic";
        r6.beatPattern = "Misra Chapu";
        r6.instrumentType = "Percussion";
        r6.duration = 4;
        r6.composer = "Traditional";
        r6.year = 1750;
        r6.language = "Tamil";
        r6.category = "Music";
        r6.mood = "Meditative";
        r6.stageType = "Recital";
        r6.festival = "Navaratri";
        r6.artist = "Palghat Mani";
        r6.colorTheme = "Blue";
        r6.status = "Active";
        r6.popularity = "High";

        MusicInstrument mi6 = new MusicInstrument();

        mi6.instrumentId = 106;
        mi6.instrumentName = "Ghatam";
        mi6.type = "Percussion";
        mi6.material = "Clay";
        mi6.originCountry = "India";
        mi6.strings = 0;
        mi6.weight = 6;
        mi6.color = "Red";
        mi6.brand = "Manamadurai";
        mi6.year = 1880;
        mi6.soundType = "Resonant";
        mi6.tuning = "Natural";
        mi6.category = "Classical";
        mi6.playerType = "Master";
        mi6.size = "Medium";
        mi6.maintenance = "Careful";
        mi6.usage = "Accompaniment";
        mi6.manufacturer = "Potters";
        mi6.status = "Available";
        mi6.priceRange = "12000";

        r6.musicInstrument = mi6;

        r6.getRhythmDetails();

Rhythms r7 = new Rhythms();

        r7.rhythmId = 7;
        r7.rhythmName = "Khanda Chapu";
        r7.origin = "India";
        r7.genre = "Classical";
        r7.tempo = 105;
        r7.culture = "Carnatic";
        r7.beatPattern = "Khanda Chapu";
        r7.instrumentType = "Percussion";
        r7.duration = 5;
        r7.composer = "Dikshitar";
        r7.year = 1820;
        r7.language = "Sanskrit";
        r7.category = "Music";
        r7.mood = "Majestic";
        r7.stageType = "Sabha";
        r7.festival = "Pongal";
        r7.artist = "T A Janakiraman";
        r7.colorTheme = "Purple";
        r7.status = "Active";
        r7.popularity = "Medium";

        MusicInstrument mi7 = new MusicInstrument();

        mi7.instrumentId = 107;
        mi7.instrumentName = "Morsing";
        mi7.type = "Percussion";
        mi7.material = "Metal";
        mi7.originCountry = "India";
        mi7.strings = 1;
        mi7.weight = 0.5;
        mi7.color = "Silver";
        mi7.brand = "Traditional";
        mi7.year = 1900;
        mi7.soundType = "Twang";
        mi7.tuning = "Mouth";
        mi7.category = "Classical";
        mi7.playerType = "Specialist";
        mi7.size = "Tiny";
        mi7.maintenance = "Minimal";
        mi7.usage = "Solo";
        mi7.manufacturer = "Blacksmiths";
        mi7.status = "Available";
        mi7.priceRange = "2000";

        r7.musicInstrument = mi7;

        r7.getRhythmDetails();

Rhythms r8 = new Rhythms();

        r8.rhythmId = 8;
        r8.rhythmName = "Dadra Tala";
        r8.origin = "India";
        r8.genre = "Semi-Classical";
        r8.tempo = 125;
        r8.culture = "Hindustani";
        r8.beatPattern = "Dadra";
        r8.instrumentType = "Percussion";
        r8.duration = 3;
        r8.composer = "Thumri";
        r8.year = 1920;
        r8.language = "Hindi";
        r8.category = "Music";
        r8.mood = "Romantic";
        r8.stageType = "Mehfil";
        r8.festival = "Holi";
        r8.artist = "Girija Devi";
        r8.colorTheme = "Pink";
        r8.status = "Active";
        r8.popularity = "High";

        MusicInstrument mi8 = new MusicInstrument();

        mi8.instrumentId = 108;
        mi8.instrumentName = "Dholak";
        mi8.type = "Percussion";
        mi8.material = "Wood";
        mi8.originCountry = "India";
        mi8.strings = 0;
        mi8.weight = 4;
        mi8.color = "Red";
        mi8.brand = "Punjab";
        mi8.year = 1940;
        mi8.soundType = "Bass-Treble";
        mi8.tuning = "Straps";
        mi8.category = "Folk";
        mi8.playerType = "Versatile";
        mi8.size = "Medium";
        mi8.maintenance = "Regular";
        mi8.usage = "Bhajan";
        mi8.manufacturer = "Artisans";
        mi8.status = "Available";
        mi8.priceRange = "5000";

        r8.musicInstrument = mi8;

        r8.getRhythmDetails();

Rhythms r9 = new Rhythms();

        r9.rhythmId = 9;
        r9.rhythmName = "Parai Rhythm";
        r9.origin = "India";
        r9.genre = "Folk";
        r9.tempo = 150;
        r9.culture = "Tamil";
        r9.beatPattern = "4 beats";
        r9.instrumentType = "Percussion";
        r9.duration = 2;
        r9.composer = "Folk";
        r9.year = 1000;
        r9.language = "Tamil";
        r9.category = "Music";
        r9.mood = "Energetic";
        r9.stageType = "Street";
        r9.festival = "Pongal";
        r9.artist = "Paraiyar";
        r9.colorTheme = "Earth";
        r9.status = "Active";
        r9.popularity = "Local";

        MusicInstrument mi9 = new MusicInstrument();

        mi9.instrumentId = 109;
        mi9.instrumentName = "Parai";
        mi9.type = "Percussion";
        mi9.material = "Leather";
        mi9.originCountry = "India";
        mi9.strings = 0;
        mi9.weight = 10;
        mi9.color = "Black";
        mi9.brand = "Traditional";
        mi9.year = 1200;
        mi9.soundType = "Loud";
        mi9.tuning = "Tension";
        mi9.category = "Folk";
        mi9.playerType = "Community";
        mi9.size = "Large";
        mi9.maintenance = "Heavy";
        mi9.usage = "Festival";
        mi9.manufacturer = "Village";
        mi9.status = "Available";
        mi9.priceRange = "4000";

        r9.musicInstrument = mi9;

        r9.getRhythmDetails();

Rhythms r10 = new Rhythms();

        r10.rhythmId = 10;
        r10.rhythmName = "Thavil Beat";
        r10.origin = "India";
        r10.genre = "Folk-Classical";
        r10.tempo = 135;
        r10.culture = "Tamil Nadu";
        r10.beatPattern = "5 beats";
        r10.instrumentType = "Percussion";
        r10.duration = 4;
        r10.composer = "Nadaswaram";
        r10.year = 1650;
        r10.language = "Tamil";
        r10.category = "Music";
        r10.mood = "Ceremonial";
        r10.stageType = "Wedding";
        r10.festival = "Temple";
        r10.artist = "Sheik Chinna";
        r10.colorTheme = "Orange";
        r10.status = "Active";
        r10.popularity = "High";

        MusicInstrument mi10 = new MusicInstrument();

        mi10.instrumentId = 110;
        mi10.instrumentName = "Thavil";
        mi10.type = "Percussion";
        mi10.material = "Jackfruit";
        mi10.originCountry = "India";
        mi10.strings = 0;
        mi10.weight = 7;
        mi10.color = "Polished";
        mi10.brand = "Nagore";
        mi10.year = 1700;
        mi10.soundType = "Shrill";
        mi10.tuning = "Manual";
        mi10.category = "Classical";
        mi10.playerType = "Expert";
        mi10.size = "Medium";
        mi10.maintenance = "Daily";
        mi10.usage = "Procession";
        mi10.manufacturer = "Maestros";
        mi10.status = "Available";
        mi10.priceRange = "18000";

        r10.musicInstrument = mi10;

        r10.getRhythmDetails();

Rhythms r11 = new Rhythms();

        r11.rhythmId = 11;
        r11.rhythmName = "Keherwa Tala";
        r11.origin = "India";
        r11.genre = "Light Classical";
        r11.tempo = 110;
        r11.culture = "Hindustani";
        r11.beatPattern = "Keherwa";
        r11.instrumentType = "Percussion";
        r11.duration = 3;
        r11.composer = "Film Music";
        r11.year = 1950;
        r11.language = "Hindi";
        r11.category = "Music";
        r11.mood = "Melancholic";
        r11.stageType = "Ghazal";
        r11.festival = "Basant";
        r11.artist = "Harjit Singh";
        r11.colorTheme = "Yellow";
        r11.status = "Active";
        r11.popularity = "Very High";

        MusicInstrument mi11 = new MusicInstrument();

        mi11.instrumentId = 111;
        mi11.instrumentName = "Dholki";
        mi11.type = "Percussion";
        mi11.material = "Wood";
        mi11.originCountry = "India";
        mi11.strings = 0;
        mi11.weight = 3;
        mi11.color = "Brown";
        mi11.brand = "Rajasthan";
        mi11.year = 1960;
        mi11.soundType = "Soft";
        mi11.tuning = "Loose";
        mi11.category = "Folk";
        mi11.playerType = "Qawwal";
        mi11.size = "Small";
        mi11.maintenance = "Easy";
        mi11.usage = "Devotional";
        mi11.manufacturer = "Local";
        mi11.status = "Available";
        mi11.priceRange = "3500";

        r11.musicInstrument = mi11;

        r11.getRhythmDetails();

Rhythms r12 = new Rhythms();

        r12.rhythmId = 12;
        r12.rhythmName = "Eka Tala";
        r12.origin = "India";
        r12.genre = "Classical";
        r12.tempo = 98;
        r12.culture = "Hindustani";
        r12.beatPattern = "Eka";
        r12.instrumentType = "Percussion";
        r12.duration = 8;
        r12.composer = "Pakhawaj";
        r12.year = 1600;
        r12.language = "Sanskrit";
        r12.category = "Music";
        r12.mood = "Solemn";
        r12.stageType = "Dhrupad";
        r12.festival = "Gita Jayanti";
        r12.artist = "Pandit Ram";
        r12.colorTheme = "White";
        r12.status = "Active";
        r12.popularity = "Niche";

        MusicInstrument mi12 = new MusicInstrument();

        mi12.instrumentId = 112;
        mi12.instrumentName = "Pakhawaj";
        mi12.type = "Percussion";
        mi12.material = "Clay";
        mi12.originCountry = "India";
        mi12.strings = 0;
        mi12.weight = 15;
        mi12.color = "Red";
        mi12.brand = "Mathura";
        mi12.year = 1550;
        mi12.soundType = "Deep";
        mi12.tuning = "Complex";
        mi12.category = "Classical";
        mi12.playerType = "Virtuoso";
        mi12.size = "Large";
        mi12.maintenance = "Expert";
        mi12.usage = "Dhrupad";
        mi12.manufacturer = "Gharana";
        mi12.status = "Rare";
        mi12.priceRange = "50000";

        r12.musicInstrument = mi12;

        r12.getRhythmDetails();

Rhythms r13 = new Rhythms();

        r13.rhythmId = 13;
        r13.rhythmName = "Thappu Beat";
        r13.origin = "India";
        r13.genre = "Folk";
        r13.tempo = 145;
        r13.culture = "Tamil Folk";
        r13.beatPattern = "Fast 4";
        r13.instrumentType = "Percussion";
        r13.duration = 2;
        r13.composer = "Village";
        r13.year = 1200;
        r13.language = "Tamil";
        r13.category = "Music";
        r13.mood = "Joyful";
        r13.stageType = "Village";
        r13.festival = "Aadi";
        r13.artist = "Thappu Players";
        r13.colorTheme = "Green";
        r13.status = "Active";
        r13.popularity = "Local";

        MusicInstrument mi13 = new MusicInstrument();

        mi13.instrumentId = 113;
        mi13.instrumentName = "Thappu";
        mi13.type = "Percussion";
        mi13.material = "Leather";
        mi13.originCountry = "India";
        mi13.strings = 0;
        mi13.weight = 5;
        mi13.color = "White";
        mi13.brand = "Rural";
        mi13.year = 1300;
        mi13.soundType = "Sharp";
        mi13.tuning = "Hand";
        mi13.category = "Folk";
        mi13.playerType = "Group";
        mi13.size = "Medium";
        mi13.maintenance = "Simple";
        mi13.usage = "Dance";
        mi13.manufacturer = "Farmers";
        mi13.status = "Available";
        mi13.priceRange = "1500";

        r13.musicInstrument = mi13;

        r13.getRhythmDetails();

Rhythms r14 = new Rhythms();

        r14.rhythmId = 14;
        r14.rhythmName = "Jathiswaram Tala";
        r14.origin = "India";
        r14.genre = "Dance";
        r14.tempo = 125;
        r14.culture = "Bharatanatyam";
        r14.beatPattern = "Adi Variations";
        r14.instrumentType = "Percussion";
        r14.duration = 10;
        r14.composer = "Traditional";
        r14.year = 1900;
        r14.language = "Sanskrit";
        r14.category = "Music";
        r14.mood = "Graceful";
        r14.stageType = "Dance";
        r14.festival = "Dance Fest";
        r14.artist = "Alarmel Valli";
        r14.colorTheme = "Peacock";
        r14.status = "Active";
        r14.popularity = "High";

        MusicInstrument mi14 = new MusicInstrument();

        mi14.instrumentId = 114;
        mi14.instrumentName = "Morsing";
        mi14.type = "Percussion";
        mi14.material = "Iron";
        mi14.originCountry = "India";
        mi14.strings = 1;
        mi14.weight = 0.4;
        mi14.color = "Brass";
        mi14.brand = "Chennai";
        mi14.year = 1950;
        mi14.soundType = "Jew's Harp";
        mi14.tuning = "Oral";
        mi14.category = "Dance";
        mi14.playerType = "Natya";
        mi14.size = "Mini";
        mi14.maintenance = "None";
        mi14.usage = "Nritta";
        mi14.manufacturer = "Metalwork";
        mi14.status = "Available";
        mi14.priceRange = "2500";

        r14.musicInstrument = mi14;

        r14.getRhythmDetails();

Rhythms r15 = new Rhythms();

        r15.rhythmId = 15;
        r15.rhythmName = "Kriti Rhythm";
        r15.origin = "India";
        r15.genre = "Classical";
        r15.tempo = 115;
        r15.culture = "Carnatic";
        r15.beatPattern = "Rupaka";
        r15.instrumentType = "Percussion";
        r15.duration = 6;
        r15.composer = "Syama Sastri";
        r15.year = 1780;
        r15.language = "Telugu";
        r15.category = "Music";
        r15.mood = "Devout";
        r15.stageType = "Katcheri";
        r15.festival = "Sankranti";
        r15.artist = "M S Subbulakshmi";
        r15.colorTheme = "Royal Blue";
        r15.status = "Active";
        r15.popularity = "Legendary";

        MusicInstrument mi15 = new MusicInstrument();

        mi15.instrumentId = 115;
        mi15.instrumentName = "Kanjira";
        mi15.type = "Percussion";
        mi15.material = "Wood";
        mi15.originCountry = "India";
        mi15.strings = 0;
        mi15.weight = 1.2;
        mi15.color = "Brown";
        mi15.brand = "Professional";
        mi15.year = 1970;
        mi15.soundType = "Frame Drum";
        mi15.tuning = "Shellac";
        mi15.category = "Classical";
        mi15.playerType = "Accompanist";
        mi15.size = "Small";
        mi15.maintenance = "Daily";
        mi15.usage = "Kriti";
        mi15.manufacturer = "Masters";
        mi15.status = "Available";
        mi15.priceRange = "10000";

        r15.musicInstrument = mi15;

        r15.getRhythmDetails();

Rhythms r16 = new Rhythms();

        r16.rhythmId = 16;
        r16.rhythmName = "Tillana Tala";
        r16.origin = "India";
        r16.genre = "Classical";
        r16.tempo = 140;
        r16.culture = "Carnatic";
        r16.beatPattern = "Adi Fast";
        r16.instrumentType = "Percussion";
        r16.duration = 4;
        r16.composer = "Patnam Subramania";
        r16.year = 1890;
        r16.language = "Sanskrit";
        r16.category = "Music";
        r16.mood = "Brisk";
        r16.stageType = "Closing";
        r16.festival = "Music Season";
        r16.artist = "Sudha Ragunathan";
        r16.colorTheme = "Vibrant";
        r16.status = "Active";
        r16.popularity = "High";

        MusicInstrument mi16 = new MusicInstrument();

        mi16.instrumentId = 116;
        mi16.instrumentName = "Ghatam";
        mi16.type = "Percussion";
        mi16.material = "Pottery";
        mi16.originCountry = "India";
        mi16.strings = 0;
        mi16.weight = 5.5;
        mi16.color = "Black";
        mi16.brand = "Tamil Nadu";
        mi16.year = 1980;
        mi16.soundType = "Pot Drum";
        mi16.tuning = "Clay";
        mi16.category = "Classical";
        mi16.playerType = "Tamil Nadu";
        mi16.size = "Medium";
        mi16.maintenance = "Delicate";
        mi16.usage = "Tillana";
        mi16.manufacturer = "Potters";
        mi16.status = "Available";
        mi16.priceRange = "15000";

        r16.musicInstrument = mi16;

        r16.getRhythmDetails();

Rhythms r17 = new Rhythms();

        r17.rhythmId = 17;
        r17.rhythmName = "Varali Tala";
        r17.origin = "India";
        r17.genre = "Classical";
        r17.tempo = 102;
        r17.culture = "Carnatic";
        r17.beatPattern = "Ata Tala";
        r17.instrumentType = "Percussion";
        r17.duration = 9;
        r17.composer = "Traditional";
        r17.year = 1830;
        r17.language = "Telugu";
        r17.category = "Music";
        r17.mood = "Introspective";
        r17.stageType = "Main";
        r17.festival = "December";
        r17.artist = "Bombay Jayashri";
        r17.colorTheme = "Indigo";
        r17.status = "Active";
        r17.popularity = "Medium";

        MusicInstrument mi17 = new MusicInstrument();

        mi17.instrumentId = 117;
        mi17.instrumentName = "Mridangam";
        mi17.type = "Percussion";
        mi17.material = "Jackwood";
        mi17.originCountry = "India";
        mi17.strings = 0;
        mi17.weight = 8.5;
        mi17.color = "Mahogany";
        mi17.brand = "Tanjavur";
        mi17.year = 1925;
        mi17.soundType = "Rich Bass";
        mi17.tuning = "Expert";
        mi17.category = "Classical";
        mi17.playerType = "Principal";
        mi17.size = "Standard";
        mi17.maintenance = "Professional";
        mi17.usage = "Kriti";
        mi17.manufacturer = "Thanjavur";
        mi17.status = "Premium";
        mi17.priceRange = "30000";

        r17.musicInstrument = mi17;

        r17.getRhythmDetails();

Rhythms r18 = new Rhythms();

        r18.rhythmId = 18;
        r18.rhythmName = "Kaapi Rhythm";
        r18.origin = "India";
        r18.genre = "Classical";
        r18.tempo = 118;
        r18.culture = "Carnatic";
        r18.beatPattern = "Adi Tala";
        r18.instrumentType = "Percussion";
        r18.duration = 5;
        r18.composer = "Papanasam Sivan";
        r18.year = 1930;
        r18.language = "Tamil";
        r18.category = "Music";
        r18.mood = "Sweet";
        r18.stageType = "Evening";
        r18.festival = "Music Academy";
        r18.artist = "Sanjay Subrahmanyan";
        r18.colorTheme = "Coral";
        r18.status = "Active";
        r18.popularity = "Very High";

        MusicInstrument mi18 = new MusicInstrument();

        mi18.instrumentId = 118;
        mi18.instrumentName = "Kanjira";
        mi18.type = "Percussion";
        mi18.material = "Vengai";
        mi18.originCountry = "India";
        mi18.strings = 0;
        mi18.weight = 1.1;
        mi18.color = "Golden";
        mi18.brand = "Master Craft";
        mi18.year = 2000;
        mi18.soundType = "Crisp";
        mi18.tuning = "Perfect";
        mi18.category = "Classical";
        mi18.playerType = "Star";
        mi18.size = "Professional";
        mi18.maintenance = "Meticulous";
        mi18.usage = "Ragam Tanam";
        mi18.manufacturer = "Heritage";
        mi18.status = "Available";
        mi18.priceRange = "15000";

        r18.musicInstrument = mi18;

        r18.getRhythmDetails();

Rhythms r19 = new Rhythms();

        r19.rhythmId = 19;
        r19.rhythmName = "Shanmukhapriya";
        r19.origin = "India";
        r19.genre = "Classical";
        r19.tempo = 112;
        r19.culture = "Carnatic";
        r19.beatPattern = "Triputa";
        r19.instrumentType = "Percussion";
        r19.duration = 7;
        r19.composer = "Modern";
        r19.year = 1985;
        r19.language = "Tamil";
        r19.category = "Music";
        r19.mood = "Emotional";
        r19.stageType = "Main Concert";
        r19.festival = "Cleveland";
        r19.artist = "R K Shriramkumar";
        r19.colorTheme = "Emerald";
        r19.status = "Active";
        r19.popularity = "Rising";

        MusicInstrument mi19 = new MusicInstrument();

        mi19.instrumentId = 119;
        mi19.instrumentName = "Ghatam";
        mi19.type = "Percussion";
        mi19.material = "Special Clay";
        mi19.originCountry = "India";
        mi19.strings = 0;
        mi19.weight = 6.2;
        mi19.color = "Matte Black";
        mi19.brand = "Embar Kannan";
        mi19.year = 2010;
        mi19.soundType = "Concert";
        mi19.tuning = "Master-tuned";
        mi19.category = "Classical";
        mi19.playerType = "Contemporary";
        mi19.size = "Concert";
        mi19.maintenance = "Professional";
        mi19.usage = "Ragamalika";
        mi19.manufacturer = "Modern";
        mi19.status = "Available";
        mi19.priceRange = "25000";

        r19.musicInstrument = mi19;

        r19.getRhythmDetails();

Rhythms r20 = new Rhythms();

        r20.rhythmId = 20;
        r20.rhythmName = "Sindhu Bhairavi";
        r20.origin = "India";
        r20.genre = "Classical";
        r20.tempo = 122;
        r20.culture = "Carnatic";
        r20.beatPattern = "Adi Tala";
        r20.instrumentType = "Percussion";
        r20.duration = 6;
        r20.composer = "Madras Mani";
        r20.year = 1940;
        r20.language = "Tamil";
        r20.category = "Music";
        r20.mood = "Soulful";
        r20.stageType = "Grand Finale";
        r20.festival = "Music Festival";
        r20.artist = "Sudha Raghunathan";
        r20.colorTheme = "Sunset";
        r20.status = "Active";
        r20.popularity = "Iconic";

        MusicInstrument mi20 = new MusicInstrument();

        mi20.instrumentId = 120;
        mi20.instrumentName = "Mridangam";
        mi20.type = "Percussion";
        mi20.material = "Premium Wood";
        mi20.originCountry = "India";
        mi20.strings = 0;
        mi20.weight = 9;
        mi20.color = "Deep Brown";
        mi20.brand = "Suma";
        mi20.year = 2020;
        mi20.soundType = "Perfect Tone";
        mi20.tuning = "Concert Ready";
        mi20.category = "Classical";
        mi20.playerType = "Legend";
        mi20.size = "Master";
        mi20.maintenance = "Elite";
        mi20.usage = "RTP";
        mi20.manufacturer = "Top Makers";
        mi20.status = "Available";
        mi20.priceRange = "45000";

        r20.musicInstrument = mi20;

        r20.getRhythmDetails();
    }
}