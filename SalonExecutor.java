class SalonExecutor {
    public static void main(String[] args) {
        Service sv1 = new Service(101, "Hair Cut", "Hair", "Grooming", 30, 300, "INR",
                "Hair Stylist", "Professional Shampoo", "Scissors & Trimmer", "Walk-in",
                "Daily", "Unisex", "Layer Cut", "4.7", "10%", "Available", "High", "5 Years",
                "Professional hair styling service");

        Service sv2 = new Service(102, "Hair Coloring", "Hair", "Coloring", 90, 2500, "INR",
                "Color Expert", "Lakme Color", "Color Bowls & Brushes", "Appointment",
                "Daily", "Unisex", "Global Color", "4.8", "15%", "Available", "Very High", "8 Years",
                "Professional hair coloring service");

        Service sv3 = new Service(103, "Keratin Treatment", "Hair", "Treatment", 120, 4500, "INR",
                "Keratin Expert", "Keratin Solution", "Hair Straightener", "Appointment",
                "Mon-Sat", "Unisex", "Brazilian Keratin", "4.9", "20%", "Available", "High", "10 Years",
                "Hair straightening treatment");

        Service sv4 = new Service(104, "Facial", "Skin", "Skincare", 60, 1500, "INR",
                "Skin Therapist", "VLCC Creams", "Steam Machine", "Appointment",
                "Daily", "Unisex", "Hydra Facial", "4.6", "10%", "Available", "Very High", "12 Years",
                "Deep cleansing facial treatment");

        Service sv5 = new Service(105, "Hair Spa", "Hair", "Treatment", 75, 2000, "INR",
                "Hair Therapist", "Toni & Guy Products", "Spa Equipment", "Appointment",
                "Daily", "Unisex", "Scalp Treatment", "4.8", "15%", "Available", "High", "7 Years",
                "Hair nourishment spa treatment");

        Service sv6 = new Service(106, "Manicure", "Nails", "Nail Care", 45, 500, "INR",
                "Nail Artist", "OPI Polish", "Nail Tools", "Walk-in",
                "Daily", "Unisex", "French Manicure", "4.5", "20%", "Available", "Medium", "4 Years",
                "Professional nail grooming service");

        Service sv7 = new Service(107, "Pedicure", "Nails", "Foot Care", 60, 700, "INR",
                "Foot Therapist", "Foot Creams", "Foot Spa Basin", "Appointment",
                "Daily", "Unisex", "Spa Pedicure", "4.4", "15%", "Available", "High", "6 Years",
                "Complete foot care treatment");

        Service sv8 = new Service(108, "Bridal Makeup", "Makeup", "Wedding", 180, 25000, "INR",
                "Bridal Artist", "MAC Cosmetics", "Professional Kit", "Appointment",
                "Daily", "Women", "Airbrush Makeup", "4.9", "5%", "Available", "Very High", "15 Years",
                "Premium bridal makeup service");

        Service sv9 = new Service(109, "Threading", "Facial Hair", "Grooming", 15, 100, "INR",
                "Threading Expert", "Organic Thread", "Cotton Thread", "Walk-in",
                "Daily", "Women", "Traditional Threading", "4.6", "25%", "Available", "High", "10 Years",
                "Precision eyebrow threading");

        Service sv10 = new Service(110, "Waxing", "Hair Removal", "Grooming", 30, 400, "INR",
                "Waxing Expert", "Veet Wax", "Heated Wax", "Walk-in",
                "Daily", "Unisex", "Strip Waxing", "4.2", "30%", "Available", "Medium", "3 Years",
                "Professional hair removal service");

        Service sv11 = new Service(111, "Hair Rebonding", "Hair", "Styling", 180, 8000, "INR",
                "Rebonding Expert", "Rebonding Chemicals", "Straightening Iron", "Appointment",
                "Mon-Sat", "Unisex", "Japanese Rebonding", "4.8", "10%", "Available", "High", "9 Years",
                "Permanent hair straightening");

        Service sv12 = new Service(112, "Massage", "Body", "Relaxation", 60, 1200, "INR",
                "Massage Therapist", "Aroma Oils", "Massage Table", "Appointment",
                "Daily", "Unisex", "Swedish Massage", "4.6", "20%", "Available", "Medium", "5 Years",
                "Relaxing body massage therapy");

        Service sv13 = new Service(113, "Smoothening", "Hair", "Treatment", 120, 3500, "INR",
                "Smoothening Expert", "Kerastase", "Hair Dryer", "Appointment",
                "Mon-Sat", "Unisex", "Cezanne Smoothening", "4.5", "15%", "Available", "High", "6 Years",
                "Frizz-free hair treatment");

        Service sv14 = new Service(114, "Party Makeup", "Makeup", "Event", 90, 3000, "INR",
                "Makeup Artist", "Bobbi Brown", "Makeup Brushes", "Appointment",
                "Daily", "Women", "Smokey Eye", "4.7", "10%", "Available", "High", "8 Years",
                "Event makeup styling");

        Service sv15 = new Service(115, "Beard Trim", "Beard", "Grooming", 20, 200, "INR",
                "Barber", "Beard Oil", "Trimmer", "Walk-in",
                "Daily", "Men", "Fade Trim", "4.4", "20%", "Available", "High", "4 Years",
                "Professional beard styling");

        Service sv16 = new Service(116, "Microblading", "Eyebrows", "Permanent Makeup", 120, 12000, "INR",
                "Microblading Artist", "Organic Pigments", "Microblading Pen", "Appointment",
                "Tue-Sun", "Women", "6D Microblading", "4.9", "5%", "Available", "Medium", "7 Years",
                "Semi-permanent eyebrow tattoo");

        Service sv17 = new Service(117, "Scalp Treatment", "Scalp", "Hair Care", 45, 800, "INR",
                "Scalp Specialist", "Medicated Oils", "Massage Tools", "Appointment",
                "Daily", "Unisex", "Derma Roller", "4.5", "25%", "Available", "Medium", "5 Years",
                "Hair growth scalp treatment");

        Service sv18 = new Service(118, "Lash Extension", "Eyelashes", "Eye Enhancement", 120, 4000, "INR",
                "Lash Technician", "Mink Lashes", "Eyelash Curler", "Appointment",
                "Mon-Sat", "Women", "Volume Lashes", "4.8", "15%", "Available", "High", "6 Years",
                "Eyelash extension service");

        Service sv19 = new Service(119, "At Home Haircut", "Hair", "Grooming", 45, 500, "INR",
                "Mobile Stylist", "Travel Kit", "Portable Tools", "App Booking",
                "24/7", "Unisex", "Express Cut", "4.4", "10%", "Available", "Very High", "3 Years",
                "Home service haircut");

        Service sv20 = new Service(120, "Rainbow Highlights", "Hair", "Coloring", 150, 5000, "INR",
                "Color Specialist", "Wella Color", "Balayage Tools", "Appointment",
                "Fri-Sun", "Unisex", "Balayage Highlights", "4.9", "20%", "Available", "High", "4 Years",
                "Trendy colored highlights");

        Salon s1 = new Salon(1, "Green Trends", "Ravi", "MG Road", "Bangalore", "India",
                2010, 15, "Beauty Salon", "greentrends.com", "080123456", "info@greentrends.com",
                "9 AM", "9 PM", "Cash/UPI/Card", "4.5", "Green", "Indoor", "Active",
                "Popular beauty salon", sv1);

        Salon s2 = new Salon(2, "Lakme Salon", "Priya", "Brigade Road", "Bangalore", "India",
                2008, 12, "Beauty Salon", "lakmesalon.in", "080234567", "info@lakmesalon.in",
                "10 AM", "8 PM", "Cash/UPI/Card", "4.6", "Pink", "Indoor", "Active",
                "Premium beauty salon chain", sv2);

        Salon s3 = new Salon(3, "Jawed Habib", "Jawed Habib", "Jayanagar", "Bangalore", "India",
                2005, 20, "Hair Salon", "jawedhabib.com", "080345678", "book@jawedhabib.com",
                "9 AM", "10 PM", "Cash/UPI/Card", "4.4", "Black", "Indoor", "Active",
                "Celebrity hair salon chain", sv3);

        Salon s4 = new Salon(4, "VLCC", "VLCC Group", "Malleshwaram", "Bangalore", "India",
                1996, 25, "Wellness Salon", "vlccwellness.com", "080456789", "care@vlcc.com",
                "8 AM", "9 PM", "Cash/UPI/Card", "4.3", "Blue", "Indoor", "Active",
                "Wellness and beauty center", sv4);

        Salon s5 = new Salon(5, "Toni & Guy", "Toni & Guy", "Indiranagar", "Bangalore", "India",
                2012, 18, "Premium Salon", "toniandguy.in", "080567890", "bangalore@toniandguy.in",
                "10 AM", "8 PM", "Card/UPI", "4.7", "Red", "Luxury Indoor", "Active",
                "International premium salon", sv5);

        Salon s6 = new Salon(6, "Matrix Salon", "Anita", "Koramangala", "Bangalore", "India",
                2015, 10, "Unisex Salon", "matrixsalon.in", "080678901", "matrix@salon.in",
                "9 AM", "9 PM", "Cash/UPI/Card", "4.2", "Purple", "Indoor", "Active",
                "Trendy unisex salon", sv6);

        Salon s7 = new Salon(7, "Looks Salon", "Suresh", "Whitefield", "Bangalore", "India",
                2011, 14, "Beauty Salon", "looksalon.in", "080789012", "whitefield@looksalon.in",
                "9:30 AM", "8:30 PM", "Cash/UPI/Card", "4.1", "Orange", "Indoor", "Active",
                "Affordable beauty salon", sv7);

        Salon s8 = new Salon(8, "Jean-Claude Biguine", "Jean-Claude Biguine", "UB City", "Bangalore", "India",
                2014, 22, "Luxury Salon", "biguine.com", "080890123", "ubcity@biguine.com",
                "11 AM", "9 PM", "Card/UPI", "4.8", "Gold", "Luxury Indoor", "Active",
                "French luxury salon", sv8);

        Salon s9 = new Salon(9, "Geetanjali Salon", "Geetanjali", "HSR Layout", "Bangalore", "India",
                2009, 16, "Beauty Salon", "geetanjalisalon.com", "080901234", "hsr@geetanjali.com",
                "9 AM", "9 PM", "Cash/UPI/Card", "4.3", "White", "Indoor", "Active",
                "Family beauty salon", sv9);

        Salon s10 = new Salon(10, "Rass beauty", "Rass", "Electronic City", "Bangalore", "India",
                2016, 8, "Unisex Salon", "rassbeauty.com", "080012345", "eclty@rass.com",
                "8 AM", "10 PM", "Cash/UPI", "4.0", "Blue", "Indoor", "Active",
                "Budget friendly salon", sv10);

        Salon s11 = new Salon(11, "BBlunt", "BBlunt", "Phoenix Marketcity", "Bangalore", "India",
                2013, 19, "Premium Salon", "bblunt.com", "0801234567", "phoenix@bblunt.com",
                "10 AM", "10 PM", "Card/UPI", "4.7", "Black", "Luxury", "Active",
                "High-end salon experience", sv11);

        Salon s12 = new Salon(12, "Envy Salon", "Kavya", "Marathahalli", "Bangalore", "India",
                2017, 11, "Beauty Salon", "envysalon.in", "0802345678", "marathahalli@envy.in",
                "9 AM", "9 PM", "Cash/UPI/Card", "4.4", "Pink", "Indoor", "Active",
                "Modern beauty salon", sv12);

        Salon s13 = new Salon(13, "Hair Studio", "Ramesh", "BTM Layout", "Bangalore", "India",
                2014, 9, "Hair Salon", "hairstudiobangalore.com", "0803456789", "btm@hairstudio.com",
                "8:30 AM", "8:30 PM", "Cash/UPI", "4.1", "Green", "Indoor", "Active",
                "Specialized hair salon", sv13);

        Salon s14 = new Salon(14, "Glamour Beauty", "Neha", "JP Nagar", "Bangalore", "India",
                2018, 13, "Beauty Salon", "glamourbeauty.in", "0804567890", "jpnagar@glamour.in",
                "10 AM", "8 PM", "Cash/UPI/Card", "4.3", "Silver", "Indoor", "Active",
                "Glamorous beauty services", sv14);

        Salon s15 = new Salon(15, "Style N Scissors", "Vijay", "Yelahanka", "Bangalore", "India",
                2012, 10, "Unisex Salon", "stylenscissors.com", "0805678901", "yelahanka@style.com",
                "9 AM", "9 PM", "Cash/UPI/Card", "4.2", "Yellow", "Indoor", "Active",
                "Trendy unisex salon", sv15);

        Salon s16 = new Salon(16, "Amore Beauty", "Divya", "Rajajinagar", "Bangalore", "India",
                2010, 17, "Beauty Salon", "amorebeauty.in", "0806789012", "rajaji@amore.in",
                "9:30 AM", "8 PM", "Cash/Card", "4.5", "Rose", "Indoor", "Active",
                "Elegant beauty salon", sv16);

        Salon s17 = new Salon(17, "Nova Salon", "Arjun", "Kammanahalli", "Bangalore", "India",
                2019, 12, "Unisex Salon", "novasalon.in", "0807890123", "kamma@nova.in",
                "10 AM", "10 PM", "UPI/Card", "4.3", "Teal", "Indoor", "Active",
                "Contemporary salon", sv17);

        Salon s18 = new Salon(18, "Elite Looks", "Sangeeta", "Frazer Town", "Bangalore", "India",
                2007, 15, "Premium Beauty", "elitelooks.in", "0808901234", "frazer@elite.in",
                "9 AM", "9 PM", "Cash/UPI/Card", "4.6", "Maroon", "Indoor", "Active",
                "Elite beauty services", sv18);

        Salon s19 = new Salon(19, "Urban Company Salon", "Urban Company", "Multiple Locations", "Bangalore", "India",
                2015, 50, "On-demand Salon", "urbancompany.com", "0809012345", "support@urban.com",
                "6 AM", "11 PM", "UPI/App", "4.5", "Orange", "At Home", "Active",
                "On-demand beauty services", sv19);

        Salon s20 = new Salon(20, "Vibes Salon", "Kiran", "Sarjapur Road", "Bangalore", "India",
                2020, 7, "Trendy Salon", "vibessalon.in", "0800123456", "sarjapur@vibes.in",
                "11 AM", "10 PM", "Cash/UPI/Card", "4.4", "Neon", "Indoor", "Active",
                "Youth-focused trendy salon", sv20);

        System.out.println("BANGALORE SALON EXPERIENCE 2026 - 20 PREMIUM SALONS\n");
        
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        s5.displayDetails();
        s6.displayDetails();
        s7.displayDetails();
        s8.displayDetails();
        s9.displayDetails();
        s10.displayDetails();
        s11.displayDetails();
        s12.displayDetails();
        s13.displayDetails();
        s14.displayDetails();
        s15.displayDetails();
        s16.displayDetails();
        s17.displayDetails();
        s18.displayDetails();
        s19.displayDetails();
        s20.displayDetails();

        System.out.println("\nBangalore's premier salons offer world-class beauty services.");
    }
}