class TourismExecutor {
    public static void main(String[] args) {

        Package p1 = new Package(101, "Goa Holiday", "Goa", 5, 4, "Flight", "3 Star", "Breakfast",
                "Available", "May 10", "May 15", "25000", "INR", "Beach", "Water Sports",
                "Summer", "Included", "Available", "10%", "Goa beach vacation package");

        Package p2 = new Package(102, "Kerala Backwaters", "Kerala", 7, 6, "Flight + Bus", "4 Star",
                "MAP (Breakfast+Dinner)", "Local Guide", "April 20", "April 27", "35000", "INR",
                "Nature", "Houseboat, Ayurveda", "Summer", "Included", "Available", "15%",
                "Luxury Kerala backwaters and Ayurveda package");

        Package p3 = new Package(103, "Mysore Palace Special", "Mysore", 3, 2, "AC Coach", "3 Star",
                "Breakfast", "Included", "Every Friday", "Sunday", "8000", "INR", "Heritage",
                "Palace, Zoo, Brindavan", "All Seasons", "Included", "Available", "5%",
                "Weekend heritage tour to Mysore");

        Package p4 = new Package(104, "Europe Highlights", "Paris, Amsterdam, Brussels", 10, 9, "Flight",
                "4 Star", "Breakfast", "Multilingual", "June 5", "June 15", "165000", "INR",
                "International", "Eiffel Tower, Canal Cruise", "Summer", "Included", "Limited Seats",
                "Early Bird 10%", "10-day Europe group tour from Bangalore");

        Package p5 = new Package(105, "Maldives Honeymoon", "Maldives", 6, 5, "Flight", "Water Villa",
                "All Inclusive", "On Request", "All Year", "+5 Days", "95000", "INR", "Honeymoon",
                "Snorkeling, Spa", "All Seasons", "Included", "Available", "20% Couple",
                "Luxury Maldives honeymoon from Bangalore");

        Package p6 = new Package(106, "Dubai Shopping Festival", "Dubai", 5, 4, "Flight", "5 Star",
                "Breakfast", "City Tour", "January 1", "January 6", "55000", "INR", "Shopping",
                "Burj Khalifa, Mall Tours", "Winter", "Included", "Available", "Group 12%",
                "Dubai shopping festival with luxury stay");

        Package p7 = new Package(107, "Kashi Vaishno Devi", "Varanasi, Katra", 8, 7, "Flight + Train",
                "3 Star", "Breakfast + Dinner", "Religious Guide", "Monthly", "+7 Days", "28000", "INR",
                "Pilgrimage", "Ganga Aarti, Vaishno Devi", "All Seasons", "Included", "Available",
                "Group Discount", "Spiritual tour to Kashi and Vaishno Devi");

        Package p8 = new Package(108, "Heritage Karnataka", "Hampi, Badami, Aihole", 6, 5, "AC Bus",
                "Heritage Hotels", "Breakfast", "Archaeologist", "Every Saturday", "Thursday", "22000", "INR",
                "Heritage", "UNESCO Sites, Temple Tours", "Winter", "Included", "Available", "Student 20%",
                "Karnataka UNESCO heritage circuit");

        Package p9 = new Package(109, "Coorg Hill Station", "Coorg", 4, 3, "Bus", "Resort",
                "All Meals", "Local", "Daily", "+3 Days", "15000", "INR", "Hill Station",
                "Coffee Plantation, Waterfalls", "Monsoon", "Included", "High Demand", "Member 25%",
                "Coorg resort stay with all meals");

        Package p10 = new Package(110, "Andaman Islands", "Port Blair, Havelock", 7, 6, "Flight",
                "Beach Resort", "Breakfast + Dinner", "Island Expert", "Weekly", "+6 Days", "42000", "INR",
                "Island", "Scuba Diving, Coral Reef", "Winter", "Included", "Few Seats", "Online 10%",
                "Andaman island adventure package");

        Package p11 = new Package(111, "Singapore Business", "Singapore", 4, 3, "Flight", "5 Star Business",
                "Breakfast", "On Request", "Monthly", "+3 Days", "75000", "INR", "Business",
                "Marina Bay, Business Meetings", "All Seasons", "Included", "Available", "Corporate 15%",
                "Singapore business travel package");

        Package p12 = new Package(112, "Switzerland Alps", "Zurich, Lucerne, Interlaken", 12, 11, "Flight",
                "5 Star", "Breakfast + Dinner", "English Speaking", "July 10", "July 22", "245000", "INR",
                "Luxury", "Jungfrau, Lake Cruises", "Summer", "Premium", "Limited Seats", "Early Bird 10%",
                "Luxury Switzerland alpine tour");

        Package p13 = new Package(113, "Australia Discovery", "Sydney, Melbourne, Gold Coast", 14, 13, "Flight",
                "4 Star", "Breakfast", "Local Expert", "September 1", "September 15", "185000", "INR",
                "International", "Opera House, Great Barrier Reef", "Spring", "Included", "Available", "Group 12%",
                "Complete Australia east coast tour");

        Package p14 = new Package(114, "Himalaya Trekking", "Manali, Rohtang Pass", 8, 7, "Flight + 4x4",
                "Mountain Lodge", "All Meals", "Trekking Expert", "October 15", "October 23", "45000", "INR",
                "Adventure", "Trekking, Camping, River Rafting", "Autumn", "Adventure Cover", "Limited Seats", "Group 15%",
                "Himalayan adventure trekking expedition");

        Package p15 = new Package(115, "Karnataka Complete", "Coorg, Mysore, Chikmagalur", 9, 8, "AC Innova",
                "Homestay", "Karnataka Cuisine", "Local Expert", "Every Monday", "+8 Days", "32000", "INR",
                "State Tour", "Coffee Plantation, Temples", "All Seasons", "Included", "High Demand", "Family 10%",
                "Complete Karnataka culture and nature tour");

        Package p16 = new Package(116, "USA East Coast", "New York, Washington DC, Niagara", 11, 10, "Flight",
                "4 Star", "Breakfast", "Multilingual", "August 5", "August 16", "220000", "INR",
                "International", "Statue of Liberty, Niagara Falls", "Summer", "Comprehensive", "Few Seats", "Visa Package 8%",
                "USA East Coast with visa assistance");

        Package p17 = new Package(117, "Rajasthan Royals", "Jaipur, Udaipur, Jodhpur", 7, 6, "AC Bus",
                "Heritage Hotel", "Breakfast + Dinner", "History Expert", "Every Wednesday", "+6 Days", "28000", "INR",
                "Heritage", "Forts, Palaces, Camel Safari", "Winter", "Included", "Available", "Group 20%",
                "Budget Rajasthan royal heritage tour");

        Package p18 = new Package(118, "Tamil Nadu Temples", "Madurai, Rameshwaram, Thanjavur", 6, 5, "AC Coach",
                "3 Star", "South Indian Meals", "Temple Expert", "Every Thursday", "+5 Days", "21000", "INR",
                "Spiritual", "Temple Darshan, Rituals", "All Seasons", "Included", "High Demand", "Family 10%",
                "South Indian temple pilgrimage tour");

        Package p19 = new Package(119, "Ooty Weekend", "Ooty, Coonoor", 3, 2, "AC Bus", "Resort",
                "Breakfast + Dinner", "Local", "Every Friday", "Sunday", "12500", "INR", "Weekend",
                "Boat Ride, Tea Plantation", "All Seasons", "Included", "Very High Demand", "Couple 15%",
                "Nilgiri hills weekend getaway from Bangalore");

        Package p20 = new Package(120, "Educational Singapore", "Singapore", 5, 4, "Flight", "3 Star",
                "Breakfast", "Educational", "School Holidays", "+4 Days", "65000", "INR", "Educational",
                "Science Centre, Gardens by the Bay", "Summer Vacation", "Student Cover", "Group Bookings", "Student 25%",
                "Educational tour for college students");

        TourismAngadi t1 = new TourismAngadi(1, "Tourism Angadi", "MG Road", "Bangalore", "India",
                "Ramesh", 2015, 50, "tourismangadi.com", "080123456", "info@tourismangadi.com",
                "Travel Agency", "Tour Packages", "Gov Approved", "4.5", "24/7", "Blue",
                "Online/Offline", "Active", "Bangalore", p1);

        TourismAngadi t2 = new TourismAngadi(2, "GT Holidays", "MG Road", "Bangalore", "India",
                "GT Management", 1995, 120, "gtholidays.in", "080223456", "info@gtholidays.in",
                "Travel Agency", "International Tours", "Gov Approved", "4.7", "24/7", "Green",
                "Online/Offline", "Active", "Bangalore Main", p2);

        TourismAngadi t3 = new TourismAngadi(3, "Nirmala Travels", "Church Street", "Bangalore", "India",
                "Nirmala Family", 1971, 80, "nirmalatravels.com", "080323456", "book@nirmalatravels.com",
                "Coach Tours", "Group Tours", "Gov Approved", "4.4", "Office Hours", "Orange",
                "Cash/Card", "Active", "Bangalore", p3);

        TourismAngadi t4 = new TourismAngadi(4, "Veena World Bangalore", "Indiranagar", "Bangalore", "India",
                "Veena Patil", 1997, 200, "veenaworld.com", "080423456", "bangalore@veenaworld.com",
                "International Tours", "Europe Tours", "Gov Approved", "4.8", "24/7", "Purple",
                "Online/EMI", "Active", "Bangalore Branch", p4);

        TourismAngadi t5 = new TourismAngadi(5, "Skyway International", "Koramangala", "Bangalore", "India",
                "Skyway Group", 2005, 65, "skywaytour.com", "080523456", "reservations@skywaytour.com",
                "Custom Tours", "Honeymoon Packages", "Gov Approved", "4.6", "24/7", "Pink",
                "Online/Offline", "Active", "Bangalore", p5);

        TourismAngadi t6 = new TourismAngadi(6, "Thomas Cook Bangalore", "Residency Road", "Bangalore", "India",
                "Thomas Cook India", 1881, 300, "thomascook.in", "080623456", "bangalore@thomascook.in",
                "Full Service", "Visa + Tours", "Gov Approved", "4.9", "24/7", "Red",
                "All Modes", "Active", "Bangalore Central", p6);

        TourismAngadi t7 = new TourismAngadi(7, "SOTC Travel Bangalore", "Brigade Road", "Bangalore", "India",
                "Kuwait Airways", 1949, 150, "sotc.in", "080723456", "sotc.bangalore@sotc.in",
                "Group Tours", "Pilgrimage Tours", "Gov Approved", "4.5", "24/7", "Gold",
                "Online/Offline", "Active", "Bangalore", p7);

        TourismAngadi t8 = new TourismAngadi(8, "Karnataka Tourism", "Badami House", "Bangalore", "India",
                "Govt of Karnataka", 1960, 200, "karnatakatourism.org", "080823456", "info@karnatakatourism.org",
                "Government", "Heritage Tours", "Government", "4.3", "Office Hours", "Green White",
                "Online", "Active", "Head Office", p8);

        TourismAngadi t9 = new TourismAngadi(9, "Club Mahindra Bangalore", "Jayanagar", "Bangalore", "India",
                "Mahindra Holidays", 1996, 100, "clubmahindra.com", "080923456", "bangalore@clubmahindra.com",
                "Resort Membership", "Timeshare", "Gov Approved", "4.6", "24/7", "Brown",
                "Membership", "Active", "Bangalore", p9);

        TourismAngadi t10 = new TourismAngadi(10, "MakeMyTrip Local", "Whitefield", "Bangalore", "India",
                "MakeMyTrip Ltd", 2000, 75, "makemytrip.com", "0801023456", "local.blr@makemytrip.com",
                "OTA Branch", "Custom Packages", "Gov Approved", "4.2", "24/7", "Yellow",
                "Online Only", "Active", "Whitefield", p10);

        TourismAngadi t11 = new TourismAngadi(11, "Intercontinental Travels", "Infantry Road", "Bangalore", "India",
                "Intercontinental Group", 1985, 45, "intercontinentaltravels.com", "0801123456", "info@intercontinentaltravels.com",
                "Corporate Travel", "Business Tours", "Gov Approved", "4.4", "Business Hours", "Silver",
                "Corporate Billing", "Active", "Bangalore Central", p11);

        TourismAngadi t12 = new TourismAngadi(12, "Excelsior Travels", "Hare Krishna Road", "Bangalore", "India",
                "Excelsior Family", 1990, 30, "excelsiortravels.com", "0801223456", "book@excelsiortravels.com",
                "Luxury Travel", "Premium Tours", "Gov Approved", "4.7", "24/7", "Gold",
                "Premium Cards", "Active", "Bangalore", p12);

        TourismAngadi t13 = new TourismAngadi(13, "Uniglobe Travel", "Indiranagar 2nd Stage", "Bangalore", "India",
                "Uniglobe Network", 2000, 60, "thetravelcom.com", "0801323456", "bangalore@uniglobe.com",
                "Global Network", "Worldwide Tours", "IATA Approved", "4.6", "24/7", "Blue White",
                "All Modes", "Active", "Indiranagar", p13);

        TourismAngadi t14 = new TourismAngadi(14, "Durga World Travel", "Kamaraj Road", "Bangalore", "India",
                "Durga Group", 1988, 35, "durgaworldtravel.com", "0801423456", "info@durgaworldtravel.com",
                "Adventure Tours", "Trekking Tours", "Gov Approved", "4.5", "24/7", "Green",
                "Online/Offline", "Active", "Bangalore", p14);

        TourismAngadi t15 = new TourismAngadi(15, "Karnataka Holidays", "Jayanagar 40th Cross", "Bangalore", "India",
                "Karnataka Holidays", 2010, 25, "karnataka-holidays.com", "0801523456", "info@karnataka-holidays.com",
                "State Specialist", "Karnataka Tours", "Gov Approved", "4.3", "Office Hours", "Karnataka Green",
                "Online/Cash", "Active", "Jayanagar", p15);

        TourismAngadi t16 = new TourismAngadi(16, "Skyway International", "St Marks Road", "Bangalore", "India",
                "Skyway Group", 2002, 40, "skywayinternational.com", "0801623456", "reservations@skywayint.com",
                "Visa Specialist", "Visa + Tours", "Gov Approved", "4.6", "24/7", "Sky Blue",
                "Online/Offline", "Active", "MG Road", p16);

        TourismAngadi t17 = new TourismAngadi(17, "Big Travels", "Jayanagar 5th Block", "Bangalore", "India",
                "Big Travel Group", 2012, 20, "bigtravels.in", "0801723456", "info@bigtravels.in",
                "Budget Tours", "Group Packages", "Gov Approved", "4.2", "Office Hours", "Red",
                "Cash/Online", "Active", "Jayanagar", p17);

        TourismAngadi t18 = new TourismAngadi(18, "Pushpaka Vimana", "Vijayanagar", "Bangalore", "India",
                "Pushpaka Group", 2015, 28, "pushpakavimana.com", "0801823456", "book@pushpakavimana.com",
                "South India Tours", "Temple Tours", "Gov Approved", "4.4", "24/7", "Saffron",
                "Online/Cash", "Active", "Vijayanagar", p18);

        TourismAngadi t19 = new TourismAngadi(19, "Torana Enterprises", "BSK 2nd Stage", "Bangalore", "India",
                "Torana Group", 2008, 22, "toranaenterprises.com", "0801923456", "info@torana.in",
                "Weekend Getaways", "Short Trips", "Gov Approved", "4.3", "Office Hours", "Orange",
                "Cash/UPI", "Active", "BSK", p19);

        TourismAngadi t20 = new TourismAngadi(20, "Marshall Tours", "Mahalakshmipuram", "Bangalore", "India",
                "Marshall Group", 2011, 18, "marshalltours.in", "0802023456", "book@marshalltours.in",
                "Student Tours", "Educational Tours", "Gov Approved", "4.5", "24/7", "Blue Green",
                "Online/Cash", "Active", "Mahalakshmipuram", p20);

        System.out.println("🏖️ BANGALORE TOURISM AGENCIES - TOP PACKAGES 2026 🏖️\n");
        
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

        System.out.println("\n🌟 BOOK YOUR DREAM VACATION FROM BANGALORE TODAY! 🌟");
        System.out.println("📞 Contact any agency above for best deals!");
    }
}
