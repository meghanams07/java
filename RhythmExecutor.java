class RhythmExecutor {
    public static void main(String[] args) {
        
        MusicInstrument mi1 = new MusicInstrument(101, "Mridangam", "Percussion", "Wood", "India", 0, 8, "Brown", "Traditional", 1900, "Bass", "Manual", "Classical", "Professional", "Medium", "Regular", "Concert", "Local Makers", "Available", "15000");
        Rhythms r1 = new Rhythms(1, "Adi Tala Rhythm", "India", "Classical", 120, "Carnatic", "Adi Tala", "Percussion", 5, "Traditional", 1800, "Tamil", "Music", "Peaceful", "Concert", "Margazhi", "Ariyakudi", "Golden", "Active", "High", mi1);
        r1.getRhythmDetails();

        MusicInstrument mi2 = new MusicInstrument(102, "Kanjira", "Percussion", "Jackfruit", "India", 0, 1, "Natural", "Traditional", 1920, "High", "Manual", "Classical", "Expert", "Small", "Daily", "Solo", "Artisans", "Available", "8000");
        Rhythms r2 = new Rhythms(2, "Roopaka Tala", "India", "Classical", 108, "Carnatic", "Roopaka", "Percussion", 4, "Tyagaraja", 1850, "Telugu", "Music", "Devotional", "Temple", "Aradhan", "Semmangudi", "Red", "Active", "Medium", mi2);
        r2.getRhythmDetails();

        MusicInstrument mi3 = new MusicInstrument(103, "Tabla", "Percussion", "Wood", "India", 0, 5, "Black", "Delhi", 1950, "Melodic", "Leather", "Classical", "Maestro", "Medium", "Frequent", "Accompaniment", "Pandit", "Available", "25000");
        Rhythms r3 = new Rhythms(3, "Teental Rhythm", "India", "Classical", 115, "Hindustani", "Teental", "Percussion", 6, "Traditional", 1700, "Hindi", "Music", "Serene", "Darbar", "Diwali", "Zakir", "Silver", "Active", "High", mi3);
        r3.getRhythmDetails();

        MusicInstrument mi4 = new MusicInstrument(104, "Chenda", "Percussion", "Wood", "India", 0, 12, "Red", "Kerala", 1800, "Loud", "Tight", "Folk", "Drummer", "Large", "Heavy", "Procession", "Temple", "Available", "20000");
        Rhythms r4 = new Rhythms(4, "Kerala Panchari", "India", "Folk", 140, "Kerala", "Panchari", "Percussion", 3, "Folk", 1600, "Malayalam", "Music", "Festive", "Festival", "Onam", "Theyyam", "Green", "Active", "Regional", mi4);
        r4.getRhythmDetails();

        MusicInstrument mi5 = new MusicInstrument(105, "Udukku", "Percussion", "Clay", "India", 0, 2, "Red", "Temple", 1500, "Resonant", "Natural", "Devotional", "Priest", "Small", "Simple", "Puja", "Potters", "Available", "3000");
        Rhythms r5 = new Rhythms(5, "Thiruppugazh", "India", "Devotional", 95, "Tamil", "Misra Chapu", "Percussion", 7, "Arunagiri", 1400, "Tamil", "Music", "Spiritual", "Temple", "Pugazh", "Devotees", "Saffron", "Active", "Medium", mi5);
        r5.getRhythmDetails();

        MusicInstrument mi6 = new MusicInstrument(106, "Ghatam", "Percussion", "Clay", "India", 0, 6, "Red", "Manamadurai", 1880, "Resonant", "Natural", "Classical", "Master", "Medium", "Careful", "Accompaniment", "Potters", "Available", "12000");
        Rhythms r6 = new Rhythms(6, "Misra Chapu", "India", "Classical", 130, "Carnatic", "Misra Chapu", "Percussion", 4, "Traditional", 1750, "Tamil", "Music", "Meditative", "Recital", "Navaratri", "Palghat Mani", "Blue", "Active", "High", mi6);
        r6.getRhythmDetails();

        MusicInstrument mi7 = new MusicInstrument(107, "Morsing", "Percussion", "Metal", "India", 1, 1, "Silver", "Traditional", 1900, "Twang", "Mouth", "Classical", "Specialist", "Tiny", "Minimal", "Solo", "Blacksmiths", "Available", "2000");
        Rhythms r7 = new Rhythms(7, "Khanda Chapu", "India", "Classical", 105, "Carnatic", "Khanda Chapu", "Percussion", 5, "Dikshitar", 1820, "Sanskrit", "Music", "Majestic", "Sabha", "Pongal", "T A Janakiraman", "Purple", "Active", "Medium", mi7);
        r7.getRhythmDetails();

        MusicInstrument mi8 = new MusicInstrument(108, "Dholak", "Percussion", "Wood", "India", 0, 4, "Red", "Punjab", 1940, "Bass-Treble", "Straps", "Folk", "Versatile", "Medium", "Regular", "Bhajan", "Artisans", "Available", "5000");
        Rhythms r8 = new Rhythms(8, "Dadra Tala", "India", "Semi-Classical", 125, "Hindustani", "Dadra", "Percussion", 3, "Thumri", 1920, "Hindi", "Music", "Romantic", "Mehfil", "Holi", "Girija Devi", "Pink", "Active", "High", mi8);
        r8.getRhythmDetails();

        MusicInstrument mi9 = new MusicInstrument(109, "Parai", "Percussion", "Leather", "India", 0, 10, "Black", "Traditional", 1200, "Loud", "Tension", "Folk", "Community", "Large", "Heavy", "Festival", "Village", "Available", "4000");
        Rhythms r9 = new Rhythms(9, "Parai Rhythm", "India", "Folk", 150, "Tamil", "4 beats", "Percussion", 2, "Folk", 1000, "Tamil", "Music", "Energetic", "Street", "Pongal", "Paraiyar", "Earth", "Active", "Local", mi9);
        r9.getRhythmDetails();

        MusicInstrument mi10 = new MusicInstrument(110, "Thavil", "Percussion", "Jackfruit", "India", 0, 7, "Polished", "Nagore", 1700, "Shrill", "Manual", "Classical", "Expert", "Medium", "Daily", "Procession", "Maestros", "Available", "18000");
        Rhythms r10 = new Rhythms(10, "Thavil Beat", "India", "Folk-Classical", 135, "Tamil Nadu", "5 beats", "Percussion", 4, "Nadaswaram", 1650, "Tamil", "Music", "Ceremonial", "Wedding", "Temple", "Sheik Chinna", "Orange", "Active", "High", mi10);
        r10.getRhythmDetails();

        MusicInstrument mi11 = new MusicInstrument(111, "Dholki", "Percussion", "Wood", "India", 0, 3, "Brown", "Rajasthan", 1960, "Soft", "Loose", "Folk", "Qawwal", "Small", "Easy", "Devotional", "Local", "Available", "3500");
        Rhythms r11 = new Rhythms(11, "Keherwa Tala", "India", "Light Classical", 110, "Hindustani", "Keherwa", "Percussion", 3, "Film Music", 1950, "Hindi", "Music", "Melancholic", "Ghazal", "Basant", "Harjit Singh", "Yellow", "Active", "Very High", mi11);
        r11.getRhythmDetails();

        MusicInstrument mi12 = new MusicInstrument(112, "Pakhawaj", "Percussion", "Clay", "India", 0, 15, "Red", "Mathura", 1550, "Deep", "Complex", "Classical", "Virtuoso", "Large", "Expert", "Dhrupad", "Gharana", "Rare", "50000");
        Rhythms r12 = new Rhythms(12, "Eka Tala", "India", "Classical", 98, "Hindustani", "Eka", "Percussion", 8, "Pakhawaj", 1600, "Sanskrit", "Music", "Solemn", "Dhrupad", "Gita Jayanti", "Pandit Ram", "White", "Active", "Niche", mi12);
        r12.getRhythmDetails();

        MusicInstrument mi13 = new MusicInstrument(113, "Thappu", "Percussion", "Leather", "India", 0, 5, "White", "Rural", 1300, "Sharp", "Hand", "Folk", "Group", "Medium", "Simple", "Dance", "Farmers", "Available", "1500");
        Rhythms r13 = new Rhythms(13, "Thappu Beat", "India", "Folk", 145, "Tamil Folk", "Fast 4", "Percussion", 2, "Village", 1200, "Tamil", "Music", "Joyful", "Village", "Aadi", "Thappu Players", "Green", "Active", "Local", mi13);
        r13.getRhythmDetails();

        MusicInstrument mi14 = new MusicInstrument(114, "Morsing", "Percussion", "Iron", "India", 1, 0, "Brass", "Chennai", 1950, "Jew's Harp", "Oral", "Dance", "Natya", "Mini", "None", "Nritta", "Metalwork", "Available", "2500");
        Rhythms r14 = new Rhythms(14, "Jathiswaram Tala", "India", "Dance", 125, "Bharatanatyam", "Adi Variations", "Percussion", 10, "Traditional", 1900, "Sanskrit", "Music", "Graceful", "Dance", "Dance Fest", "Alarmel Valli", "Peacock", "Active", "High", mi14);
        r14.getRhythmDetails();

        MusicInstrument mi15 = new MusicInstrument(115, "Kanjira", "Percussion", "Wood", "India", 0, 1, "Brown", "Professional", 1970, "Frame Drum", "Shellac", "Classical", "Accompanist", "Small", "Daily", "Kriti", "Masters", "Available", "10000");
        Rhythms r15 = new Rhythms(15, "Kriti Rhythm", "India", "Classical", 115, "Carnatic", "Rupaka", "Percussion", 6, "Syama Sastri", 1780, "Telugu", "Music", "Devout", "Katcheri", "Sankranti", "M S Subbulakshmi", "Royal Blue", "Active", "Legendary", mi15);
        r15.getRhythmDetails();

        MusicInstrument mi16 = new MusicInstrument(116, "Ghatam", "Percussion", "Pottery", "India", 0, 6, "Black", "Tamil Nadu", 1980, "Pot Drum", "Clay", "Classical", "Tamil Nadu", "Medium", "Delicate", "Tillana", "Potters", "Available", "15000");
        Rhythms r16 = new Rhythms(16, "Tillana Tala", "India", "Classical", 140, "Carnatic", "Adi Fast", "Percussion", 4, "Patnam Subramania", 1890, "Sanskrit", "Music", "Brisk", "Closing", "Music Season", "Sudha Ragunathan", "Vibrant", "Active", "High", mi16);
        r16.getRhythmDetails();

        MusicInstrument mi17 = new MusicInstrument(117, "Mridangam", "Percussion", "Jackwood", "India", 0, 9, "Mahogany", "Tanjavur", 1925, "Rich Bass", "Expert", "Classical", "Principal", "Standard", "Professional", "Kriti", "Thanjavur", "Premium", "30000");
        Rhythms r17 = new Rhythms(17, "Varali Tala", "India", "Classical", 102, "Carnatic", "Ata Tala", "Percussion", 9, "Traditional", 1830, "Telugu", "Music", "Introspective", "Main", "December", "Bombay Jayashri", "Indigo", "Active", "Medium", mi17);
        r17.getRhythmDetails();

        MusicInstrument mi18 = new MusicInstrument(118, "Kanjira", "Percussion", "Vengai", "India", 0, 1, "Golden", "Master Craft", 2000, "Crisp", "Perfect", "Classical", "Star", "Professional", "Meticulous", "Ragam Tanam", "Heritage", "Available", "15000");
        Rhythms r18 = new Rhythms(18, "Kaapi Rhythm", "India", "Classical", 118, "Carnatic", "Adi Tala", "Percussion", 5, "Papanasam Sivan", 1930, "Tamil", "Music", "Sweet", "Evening", "Music Academy", "Sanjay Subrahmanyan", "Coral", "Active", "Very High", mi18);
        r18.getRhythmDetails();

        MusicInstrument mi19 = new MusicInstrument(119, "Ghatam", "Percussion", "Special Clay", "India", 0, 6, "Matte Black", "Embar Kannan", 2010, "Concert", "Master-tuned", "Classical", "Contemporary", "Concert", "Professional", "Ragamalika", "Modern", "Available", "25000");
        Rhythms r19 = new Rhythms(19, "Shanmukhapriya", "India", "Classical", 112, "Carnatic", "Triputa", "Percussion", 7, "Modern", 1985, "Tamil", "Music", "Emotional", "Main Concert", "Cleveland", "R K Shriramkumar", "Emerald", "Active", "Rising", mi19);
        r19.getRhythmDetails();

        MusicInstrument mi20 = new MusicInstrument(120, "Mridangam", "Percussion", "Premium Wood", "India", 0, 9, "Deep Brown", "Suma", 2020, "Perfect Tone", "Concert Ready", "Classical", "Legend", "Master", "Elite", "RTP", "Top Makers", "Available", "45000");
        Rhythms r20 = new Rhythms(20, "Sindhu Bhairavi", "India", "Classical", 122, "Carnatic", "Adi Tala", "Percussion", 6, "Madras Mani", 1940, "Tamil", "Music", "Soulful", "Grand Finale", "Music Festival", "Sudha Raghunathan", "Sunset", "Active", "Iconic", mi20);
        r20.getRhythmDetails();
    }
}