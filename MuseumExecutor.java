class MuseumExecutor {
    public static void main(String[] args) {
        
        Diamond d1 = new Diamond(101, "Kohinoor", 105.6, "Colorless", "Very High", "India", 1300, "Golconda Mines", "Oval", "Brilliant", "Precious", "10 Mohs", 100000000, "Royal Collection", "Diamond Gallery", "Royal Jewel", "LED", "Preserved", "Exhibition", "Very Rare");
        Museum m1 = new Museum(1, "National Museum", "Delhi", "New Delhi", "India", "Government of India", 1949, 20, 2000, "10 AM", "5 PM", "Historical", "Ancient Diamonds", "High", "Online & Offline", "nationalmuseumindia.gov", "011123456", "Gold", "Open", "Government", d1);
        m1.getMuseumDetails();

        Diamond d2 = new Diamond(102, "Hope Diamond Replica", 45.52, "Blue", "High", "India", 1666, "Jean-Baptiste Tavernier", "Cushion", "Fancy", "Precious", "10 Mohs", 50000000, "Museum Collection", "Jewel Gallery", "GIA Certified", "Spotlight", "Display", "Exhibition", "Rare");
        Museum m2 = new Museum(2, "Salar Jung Museum", "Hyderabad", "Hyderabad", "India", "Mir Yousuf Ali Khan", 1951, 38, 5000, "10 AM", "5 PM", "Art", "Veiled Rebecca Statue", "High", "Online & Offline", "salarjungmuseum.in", "04023445678", "Maroon", "Open", "Government", d2);
        m2.getMuseumDetails();

        Diamond d3 = new Diamond(103, "Great Mogul", 280, "White", "Very High", "India", 1650, "Mogul Empire", "Rose", "Oval", "Precious", "10 Mohs", 75000000, "Historical Collection", "Gem Vault", "Mogul Certified", "LED", "Preserved", "Research", "Extremely Rare");
        Museum m3 = new Museum(3, "Indian Museum", "Kolkata", "Kolkata", "India", "Asiatic Society", 1814, 35, 3000, "10 AM", "6 PM", "Natural History", "Ashoka Pillar", "Medium", "Offline", "indianmuseumkolkata.org", "03322529803", "Green", "Open", "Government", d3);
        m3.getMuseumDetails();

        Diamond d4 = new Diamond(104, "Star of Bombay", 34.95, "Cornflower Blue", "Very High", "India", 1880, "Bombay Mines", "Cabochon", "Star", "Precious", "10 Mohs", 45000000, "Museum Trust", "Star Gems", "GIA", "Fiber Optic", "Display", "Exhibition", "Very Rare");
        Museum m4 = new Museum(4, "Chhatrapati Shivaji Maharaj Vastu Sangrahalaya", "Mumbai", "Mumbai", "India", "George Wittet", 1905, 45, 4000, "10:30 AM", "6 PM", "Art & History", "Indus Valley Seals", "High", "Online & Offline", "csmvs.in", "02222844848", "Royal Blue", "Open", "Public", d4);
        m4.getMuseumDetails();

        Diamond d5 = new Diamond(105, "Timur Ruby", 361, "Pigeon Blood Red", "High", "India", 1370, "Timur Empire", "Carved", "Oval", "Precious", "10 Mohs", 30000000, "Crown Jewels", "Ruby Vault", "Historical", "LED", "Preserved", "Display", "Unique");
        Museum m5 = new Museum(5, "Victoria Memorial", "Kolkata", "Kolkata", "India", "King George V", 1921, 25, 10000, "10 AM", "5 PM", "Colonial History", "Queen Victoria Portrait", "Medium", "Online", "victoriamemorial-cal.org", "03322235171", "White Marble", "Open", "Government", d5);
        m5.getMuseumDetails();

        Diamond d6 = new Diamond(106, "Orlov Diamond Replica", 199.6, "White", "Very High", "India", 1741, "Partnaba Mines", "Rose", "Oval", "Precious", "10 Mohs", 60000000, "Museum Replica", "Russian Gems", "Replica Certified", "Spotlight", "Display", "Education", "Rare");
        Museum m6 = new Museum(6, "Government Museum", "Chennai", "Chennai", "India", "Government of Madras", 1851, 46, 2500, "9 AM", "5 PM", "Archaeology", "Bronze Chola Statues", "High", "Offline", "egm.gov.in", "04428171175", "Terracotta", "Open", "Government", d6);
        m6.getMuseumDetails();

        Diamond d7 = new Diamond(107, "Darya-i-Noor Replica", 186, "Pale Pink", "High", "India", 1730, "Nader Shah", "Rose", "Oval", "Precious", "10 Mohs", 55000000, "Persian Collection", "Pink Diamonds", "Replica", "LED", "Display", "Exhibition", "Very Rare");
        Museum m7 = new Museum(7, "Prince of Wales Museum", "Mumbai", "Mumbai", "India", "Government of Bombay", 1909, 30, 3500, "10:15 AM", "6 PM", "Natural History", "Miniature Paintings", "High", "Online & Offline", "csmvs.in", "02222847937", "Indigo", "Open", "Public", d7);
        m7.getMuseumDetails();

        Diamond d8 = new Diamond(108, "Millennium Star", 203, "White", "Very High", "India", 1990, "Modern Mines", "Modern Brilliant", "Heart", "Precious", "10 Mohs", 80000000, "Private Donation", "Modern Gems", "IGI", "LED", "Display", "Exhibition", "Rare");
        Museum m8 = new Museum(8, "Nehru Memorial Museum", "Delhi", "New Delhi", "India", "Government of India", 1964, 18, 1500, "9 AM", "5 PM", "Modern History", "Nehru Manuscripts", "Medium", "Online", "nehrumemorial.nic.in", "01123011771", "Tricolor", "Open", "Government", d8);
        m8.getMuseumDetails();

        Diamond d9 = new Diamond(109, "Regent Diamond Replica", 140.64, "White", "Very High", "India", 1701, "Partnaba", "Cushion", "Drop", "Precious", "10 Mohs", 40000000, "French Replica", "Colonial Gems", "Replica", "Spotlight", "Display", "Education", "Rare");
        Museum m9 = new Museum(9, "Archaeological Survey of India Museum", "Delhi", "New Delhi", "India", "ASI", 1867, 12, 1000, "10 AM", "5 PM", "Archaeology", "Harappan Seals", "High", "Offline", "asi.nic.in", "01123011912", "Sandstone", "Open", "Government", d9);
        m9.getMuseumDetails();

        Diamond d10 = new Diamond(110, "Akbar Shah Diamond", 73.6, "White", "High", "India", 1840, "Mogul Mines", "Mogul", "Oval", "Precious", "10 Mohs", 35000000, "University Collection", "Mogul Gallery", "Historical", "LED", "Preserved", "Research", "Very Rare");
        Museum m10 = new Museum(10, "Bharat Kala Bhavan", "Varanasi", "Varanasi", "India", "Banaras Hindu University", 1920, 22, 1200, "10:30 AM", "4:30 PM", "Art", "Raja Ravi Varma Paintings", "Medium", "Offline", "bhu.ac.in", "05422360138", "Saffron", "Open", "University", d10);
        m10.getMuseumDetails();

        Diamond d11 = new Diamond(111, "Sancy Diamond Replica", 55, "Champagne", "High", "India", 1570, "Golconda", "Pear", "Fancy", "Precious", "10 Mohs", 25000000, "Private Collection", "Folk Jewels", "Replica", "Natural", "Display", "Exhibition", "Rare");
        Museum m11 = new Museum(11, "Raja Dinkar Kelkar Museum", "Pune", "Pune", "India", "Dinkar Kelkar", 1962, 42, 800, "9:30 AM", "6 PM", "Folk Art", "Mastani Mahal Replica", "Medium", "Offline", "dinkarkelkar.com", "02024451347", "Wood Brown", "Open", "Private", d11);
        m11.getMuseumDetails();

        Diamond d12 = new Diamond(112, "Florentine Diamond", 137.27, "Yellow", "Medium", "India", 1490, "Golconda Mines", "Double Rose", "Hexagon", "Precious", "10 Mohs", 30000000, "Medici Replica", "Yellow Gems", "Historical", "LED", "Display", "Research", "Very Rare");
        Museum m12 = new Museum(12, "Salar Jung Museum Annexe", "Hyderabad", "Hyderabad", "India", "Salar Jung Family", 1951, 15, 2000, "10 AM", "5 PM", "Manuscripts", "Quran Collections", "High", "Online", "salarjungmuseum.in", "04023310152", "Persian Green", "Open", "Government", d12);
        m12.getMuseumDetails();

        Diamond d13 = new Diamond(113, "Lesotho Legend", 910, "Colorless", "Very High", "Africa", 2006, "Gem Diamonds", "Rough", "Octahedron", "Precious", "10 Mohs", 400000000, "Special Exhibit", "Giant Gems", "GIA", "Spotlight", "Temporary", "Special Show", "World Record");
        Museum m13 = new Museum(13, "National Rail Museum", "Delhi", "New Delhi", "India", "Indian Railways", 1977, 10, 3000, "9:30 AM", "5:30 PM", "Transport", "Fairy Queen Locomotive", "Low", "Offline", "nrmindia.org", "01126885807", "Railway Blue", "Open", "Government", d13);
        m13.getMuseumDetails();

        Diamond d14 = new Diamond(114, "Graff Venus", 118.78, "Pink", "Very High", "India", 2000, "Graff Diamonds", "Heart", "Venus", "Precious", "10 Mohs", 150000000, "Private Loan", "Pink Gallery", "Graff", "LED", "Temporary", "Exhibition", "Exceptional");
        Museum m14 = new Museum(14, "Calico Museum of Textiles", "Ahmedabad", "Ahmedabad", "India", "Gujarat Government", 1949, 8, 500, "10 AM", "5 PM", "Textiles", "Patola Sarees", "Medium", "Prior Booking", "calicomuseum.com", "07926445608", "Multicolor", "Open", "Private", d14);
        m14.getMuseumDetails();

        Diamond d15 = new Diamond(115, "Pink Star", 59.60, "Vivid Pink", "Very High", "India", 1999, "Steinmetz", "Oval", "Fancy", "Precious", "10 Mohs", 71000000, "Royal Collection", "Royal Jewels", "Sotheby's", "LED", "Display", "Exhibition", "Auction Record");
        Museum m15 = new Museum(15, "City Palace Museum", "Jaipur", "Jaipur", "India", "Maharaja Sawai Man Singh II", 1727, 20, 8000, "9:30 AM", "5 PM", "Royal", "Peacock Gate", "High", "Online & Offline", "royaljaipur.in", "01412622515", "Pink City", "Open", "Royal", d15);
        m15.getMuseumDetails();

        Diamond d16 = new Diamond(116, "Cullinan I Replica", 530.4, "Colorless", "Very High", "South Africa", 1905, "Cullinan Mine", "Pear", "Great Star", "Precious", "10 Mohs", 500000000, "Royal Replica", "Crown Jewels", "Replica", "Spotlight", "Display", "Ceremonial", "Largest Cut");
        Museum m16 = new Museum(16, "Mysore Palace Museum", "Mysore", "Mysore", "India", "Wodeyar Dynasty", 1912, 15, 20000, "10 AM", "5:30 PM", "Royal Palace", "Golden Throne", "Very High", "Offline", "mysorepalace.karnataka.gov.in", "08212524411", "Golden Yellow", "Open", "Royal", d16);
        m16.getMuseumDetails();

        Diamond d17 = new Diamond(117, "Blue Moon", 12.03, "Fancy Vivid Blue", "Very High", "South Africa", 1966, "Cullinan Mine", "Cushion", "Fancy", "Precious", "10 Mohs", 48000000, "Special Exhibit", "Blue Diamonds", "Sotheby's", "LED", "Temporary", "Auction Display", "Exceptional");
        Museum m17 = new Museum(17, "Udaipur City Palace Museum", "Udaipur", "Udaipur", "India", "Mewar Dynasty", 1734, 25, 5000, "9:30 AM", "5:30 PM", "Royal Heritage", "Moti Mahal", "High", "Online", "udaipurpalace.in", "02942526541", "Lake Blue", "Open", "Royal", d17);
        m17.getMuseumDetails();

        Diamond d18 = new Diamond(118, "Winston Legacy", 101.73, "Fancy Dark Brown", "Very High", "India", 1908, "Golconda", "Pear", "Fancy", "Precious", "10 Mohs", 26000000, "Harry Winston", "Fancy Browns", "GIA", "LED", "Display", "Exhibition", "Very Rare");
        Museum m18 = new Museum(18, "Patwon Ki Haveli Museum", "Jaisalmer", "Jaisalmer", "India", "Guman Chand Patwa", 1805, 5, 1500, "9 AM", "5 PM", "Architecture", "Golden Haveli", "Medium", "Offline", "jaisalmerhaveli.com", "02992251974", "Golden Sand", "Open", "Private", d18);
        m18.getMuseumDetails();

        Diamond d19 = new Diamond(119, "Golden Jubilee", 545.67, "Fancy Yellow", "Very High", "South Africa", 1985, "Premier Mine", "Cut Corner", "Rectangle", "Precious", "10 Mohs", 35000000, "Thai Royal Gift", "Yellow Diamonds", "De Beers", "Spotlight", "Display", "Ceremonial", "Exceptional");
        Museum m19 = new Museum(19, "Albert Hall Museum", "Jaipur", "Jaipur", "India", "Prince Albert", 1887, 16, 2500, "9 AM", "5 PM", "Indo-Saracenic", "Egyptian Mummy", "Medium", "Online & Offline", "alberthallmuseumjaipur.gov.in", "01412614021", "Red Sandstone", "Open", "Government", d19);
        m19.getMuseumDetails();

        Diamond d20 = new Diamond(120, "Lesotho Promise", 910, "Colorless", "Very High", "Lesotho", 2018, "Gem Diamonds", "Rough", "Raw Crystal", "Precious", "10 Mohs", 500000000, "Special Exhibit", "Modern Giants", "GIA", "LED", "Temporary", "Special Exhibition", "World Class");
        Museum m20 = new Museum(20, "Sabarmati Ashram Museum", "Ahmedabad", "Ahmedabad", "India", "Mahatma Gandhi", 1920, 8, 4000, "8:30 AM", "6:15 PM", "Freedom Struggle", "Gandhi Charkha", "Low", "Free Entry", "gandhiashramsabarmati.org", "07927557155", "Khadi White", "Open", "Memorial", d20);
        m20.getMuseumDetails();
    }
}