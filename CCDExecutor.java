class CCDExecutor {
    public static void main(String[] args) {

        Coffee cf1 = new Coffee(101, "Cappuccino", "Hot Coffee", "Arabica", "India", "Medium", "Rich",
                "Whole Milk", "Medium", 70, "Medium", "CCD", 180, "INR", "Espresso Machine", "Foam",
                "Beverage", "Available", "High", "Classic Italian coffee");

        Coffee cf2 = new Coffee(102, "South Indian Filter", "Hot Coffee", "Robusta", "Coorg", "Dark", "Malty",
                "Boiled Milk", "Medium", 85, "Steel Tumbler", "CCD", 120, "INR", "Filter Drip", "None",
                "Traditional", "Available", "Very High", "Authentic Karnataka filter coffee");

        Coffee cf3 = new Coffee(103, "Devil's Own", "Cold Coffee", "Arabica Blend", "India", "Medium", "Chocolatey",
                "Cold Milk", "High", 5, "Large", "CCD", 220, "INR", "Blender", "Whipped Cream",
                "Signature", "Available", "Iconic", "CCD's famous cold coffee specialty");

        Coffee cf4 = new Coffee(104, "Espresso Shot", "Hot Coffee", "Robusta", "Chikmagalur", "Dark", "Bold",
                "None", "None", 90, "Small", "CCD", 90, "INR", "Espresso", "None",
                "Quick Service", "Available", "High", "Quick strong coffee for travelers");

        Coffee cf5 = new Coffee(105, "Mocha", "Hot Coffee", "Arabica", "India", "Medium", "Chocolate",
                "Steamed Milk", "Medium", 75, "Medium", "CCD", 200, "INR", "Espresso + Chocolate", "Chocolate Syrup",
                "Flavored", "Available", "Medium", "Chocolate coffee indulgence");

        Coffee cf6 = new Coffee(106, "Irish Coffee", "Hot Coffee", "Arabica", "Ireland Blend", "Medium", "Whiskey",
                "Fresh Cream", "Medium", 80, "Large", "CCD", 280, "INR", "Special Brew", "Whipped Cream",
                "Premium", "Available", "High", "Adult coffee with whiskey flavor");

        Coffee cf7 = new Coffee(107, "Americano", "Hot Coffee", "Arabica Robusta", "Global Blend", "Medium Dark", "Clean",
                "None", "Custom", 88, "Medium", "CCD", 160, "INR", "Espresso + Water", "None",
                "Black Coffee", "Available", "Corporate Favorite", "Classic American style coffee");

        Coffee cf8 = new Coffee(108, "Cold Brew", "Cold Coffee", "Arabica", "India", "Light", "Smooth",
                "Optional", "Low", 4, "Large", "CCD", 210, "INR", "Slow Drip", "Ice",
                "Modern", "Available", "Trendy", "Smooth cold extracted coffee");

        Coffee cf9 = new Coffee(109, "Cafe Latte", "Hot Coffee", "Arabica", "India", "Light Medium", "Silky",
                "Steamed Milk", "Low", 72, "Large", "CCD", 190, "INR", "Espresso + Milk", "Froth",
                "Milk Based", "Available", "Family Favorite", "Smooth milky coffee");

        Coffee cf10 = new Coffee(110, "Single Origin Coorg", "Hot Coffee", "Coorg Arabica", "Coorg, India", "Light", "Floral",
                "None", "None", 92, "Small", "CCD Beanworks", 250, "INR", "Pour Over", "None",
                "Specialty", "Available", "Coffee Lovers", "Premium single origin pour over");

        Coffee cf11 = new Coffee(111, "Caramel Macchiato", "Hot Coffee", "Arabica", "India", "Medium", "Caramel",
                "Steamed Milk", "High", 70, "Medium", "CCD", 210, "INR", "Espresso Layer", "Caramel Drizzle",
                "Flavored", "Available", "Youth Favorite", "Sweet caramel layered coffee");

        Coffee cf12 = new Coffee(112, "Vanilla Frappuccino", "Cold Coffee", "Arabica Blend", "India", "Medium", "Vanilla",
                "Blended Milk", "High", 3, "Large", "CCD", 240, "INR", "Blender", "Whipped Cream",
                "Frozen", "Available", "Mall Favorite", "Icy blended vanilla coffee");

        Coffee cf13 = new Coffee(113, "Flat White", "Hot Coffee", "Arabica", "Australia", "Medium", "Velvety",
                "Microfoam", "None", 75, "Small", "CCD", 200, "INR", "Double Shot", "Velvet Milk",
                "Modern Classic", "Available", "Professional", "Australian style double shot");

        Coffee cf14 = new Coffee(114, "Hot Chocolate", "Hot Beverage", "None", "Belgium Style", "N/A", "Rich Cocoa",
                "Whole Milk", "High", 80, "Large", "CCD", 170, "INR", "Steamed", "Marshmallow",
                "Comfort Drink", "Available", "Family Hit", "Rich Belgian style hot chocolate");

        Coffee cf15 = new Coffee(115, "Nitro Cold Brew", "Cold Coffee", "Arabica", "India", "Medium", "Creamy",
                "Nitrogen", "Low", 4, "Tall", "CCD", 260, "INR", "Nitro Infusion", "Foam Head",
                "Craft", "Available", "Tech Trend", "Nitrogen infused creamy cold brew");

        Coffee cf16 = new Coffee(116, "Masala Coffee", "Hot Coffee", "Robusta", "India", "Dark", "Spiced",
                "Boiled Milk", "Medium", 85, "Medium", "CCD", 140, "INR", "Masala Brew", "Cardamom",
                "Indian Fusion", "Available", "Local Hit", "Spiced Indian style coffee");

        Coffee cf17 = new Coffee(117, "Matcha Latte", "Hot Coffee", "Matcha Powder", "Japan", "N/A", "Earthy",
                "Steamed Milk", "Low", 70, "Medium", "CCD", 230, "INR", "Whisked", "Matcha Dust",
                "Asian Fusion", "Available", "Trendy", "Japanese green tea latte");

        Coffee cf18 = new Coffee(118, "Affogato", "Dessert Coffee", "Espresso", "Italy", "Medium", "Ice Cream",
                "Vanilla Gelato", "High", 10, "Small", "CCD", 220, "INR", "Espresso over Ice Cream", "Chocolate Shavings",
                "Dessert", "Available", "Dessert Lovers", "Hot espresso over vanilla ice cream");

        Coffee cf19 = new Coffee(119, "Ristretto", "Hot Coffee", "Robusta", "Italy", "Dark", "Intense",
                "None", "None", 92, "Extra Small", "CCD", 150, "INR", "Short Espresso", "None",
                "Concentrated", "Available", "Coffee Purists", "Ultra concentrated espresso shot");

        Coffee cf20 = new Coffee(120, "Chemex Pour Over", "Hot Coffee", "Single Origin", "Chikmagalur", "Light", "Bright Acidity",
                "None", "None", 93, "Server", "CCD", 300, "INR", "Chemex Drip", "None",
                "Third Wave", "Available", "Coffee Connoisseurs", "Specialty pour over coffee");

        CCD c1 = new CCD(1, "Cafe Coffee Day", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "ccd.com", "080123456", "info@ccd.com", "Coffee Shop", "Coffee & Snacks", "Red", "Indoor",
                "Available", "Cash/UPI/Card", "9 AM", "11 PM", "Active", cf1);

        CCD c2 = new CCD(2, "CCD Square - MG Road", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080223456", "mgroad@ccd.com", "Premium Cafe", "Filter Coffee", "Red Black", "Indoor + Outdoor",
                "High Speed", "All Modes", "8 AM", "12 AM", "Active", cf2);

        CCD c3 = new CCD(3, "CCD Lounge - Indiranagar", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080323456", "indiranagar@ccd.com", "Lounge Cafe", "Devil's Own", "Red Velvet", "Luxury Lounge",
                "Unlimited", "Digital", "10 AM", "1 AM", "Active", cf3);

        CCD c4 = new CCD(4, "CCD Highway - Hosur Road", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080423456", "highway@ccd.com", "Highway Stop", "Quick Brew", "Red White", "Drive Thru",
                "Available", "UPI/Cards", "6 AM", "12 AM", "Active", cf4);

        CCD c5 = new CCD(5, "CCD Fresh Chat - Jayanagar", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080523456", "jayanagar@ccd.com", "Food Focused", "Cappuccino Muffin", "Red Brown", "Cozy",
                "Free", "All Modes", "8 AM", "11 PM", "Active", cf5);

        CCD c6 = new CCD(6, "CCD Square - Koramangala", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080623456", "kormangala@ccd.com", "Premium Lounge", "Irish Coffee", "Red Gold", "Luxury Sofas",
                "Premium", "Digital", "9 AM", "1 AM", "Active", cf6);

        CCD c7 = new CCD(7, "CCD Express - Whitefield", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080723456", "whitefield@ccd.com", "Quick Service", "Americano", "Red Silver", "Takeaway",
                "Available", "UPI/Cards", "7 AM", "11 PM", "Active", cf7);

        CCD c8 = new CCD(8, "CCD Avenue - Brigade Road", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080823456", "brigade@ccd.com", "Shopping Area", "Cold Brew", "Red Pink", "Street View",
                "Free", "All Modes", "9 AM", "12 AM", "Active", cf8);

        CCD c9 = new CCD(9, "CCD Studio - Malleshwaram", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "080923456", "malleshwaram@ccd.com", "Family Cafe", "Latte", "Red Cream", "Family Area",
                "Family Safe", "All Modes", "8 AM", "11 PM", "Active", cf9);

        CCD c10 = new CCD(10, "CCD Beanworks - ITPL", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801023456", "itpl@ccd.com", "Corporate Cafe", "Single Origin", "Red Grey", "Work Stations",
                "High Speed", "Corporate Cards", "7 AM", "11 PM", "Active", cf10);

        CCD c11 = new CCD(11, "CCD - Aliasker Road", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801123456", "aliasker@ccd.com", "Neighborhood Cafe", "Caramel Macchiato", "Red Cream", "Cozy Corners",
                "High Speed", "All Modes", "8 AM", "11 PM", "Active", cf11);

        CCD c12 = new CCD(12, "CCD - Hebbal Esteem Mall", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801223456", "hebbal@ccd.com", "Mall Cafe", "Frappuccino", "Red Blue", "Mall View",
                "Mall Wifi", "Cards/UPI", "10 AM", "10 PM", "Active", cf12);

        CCD c13 = new CCD(13, "CCD - Vittal Mallya Road", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801323456", "vmroad@ccd.com", "Business District", "Flat White", "Red Corporate", "Professional",
                "Business Speed", "Corporate Cards", "7 AM", "11 PM", "Active", cf13);

        CCD c14 = new CCD(14, "CCD - Jayanagar 4th Block", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801423456", "jayanagar@ccd.com", "Family Cafe", "Hot Chocolate", "Red Warm", "Family Friendly",
                "Free", "All Modes", "8 AM", "11 PM", "Active", cf14);

        CCD c15 = new CCD(15, "CCD - Mahadevapura", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801523456", "mahadevapura@ccd.com", "IT Cafe", "Nitro Cold", "Red Tech", "Work Pods",
                "Ultra Fast", "Digital Only", "7 AM", "12 AM", "Active", cf15);

        CCD c16 = new CCD(16, "CCD - Vijaya Bank Layout", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801623456", "vijayabank@ccd.com", "Residential Cafe", "Masala Coffee", "Red Spice", "Neighborhood",
                "Community", "Cash/UPI", "8 AM", "11 PM", "Active", cf16);

        CCD c17 = new CCD(17, "CCD - CMH Indiranagar", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801723456", "cmhindiranagar@ccd.com", "Trendy Cafe", "Matcha Latte", "Red Green", "Instagram Worthy",
                "Free", "All Modes", "9 AM", "12 AM", "Active", cf17);

        CCD c18 = new CCD(18, "CCD - Narayan Reddy Layout", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801823456", "narayanreddy@ccd.com", "Suburban Cafe", "Affogato", "Red Vanilla", "Garden Area",
                "Available", "Cash/Cards", "8 AM", "11 PM", "Active", cf18);

        CCD c19 = new CCD(19, "CCD - Marathahalli", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0801923456", "marathahalli@ccd.com", "IT Corridor", "Ristretto", "Red Black", "Power Plugs",
                "Ultra Fast", "Digital", "6:30 AM", "12 AM", "Active", cf19);

        CCD c20 = new CCD(20, "CCD - Electronic City", "V. G. Siddhartha", "Bangalore", 1996, 1500, "Bangalore", "India",
                "cafecoffeeday.com", "0802023456", "ecity@ccd.com", "Corporate Campus", "Pour Over", "Red Tech", "Meeting Tables",
                "Enterprise", "Corporate Billing", "6 AM", "1 AM", "Active", cf20);

        System.out.println("BANGALORE CAFE COFFEE DAY OUTLETS - COMPLETE LIST 2026\n");
        
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
        c4.displayDetails();
        c5.displayDetails();
        c6.displayDetails();
        c7.displayDetails();
        c8.displayDetails();
        c9.displayDetails();
        c10.displayDetails();
        c11.displayDetails();
        c12.displayDetails();
        c13.displayDetails();
        c14.displayDetails();
        c15.displayDetails();
        c16.displayDetails();
        c17.displayDetails();
        c18.displayDetails();
        c19.displayDetails();
        c20.displayDetails();

        System.out.println("\nA lot can happen over coffee at CCD!");
        System.out.println("Visit your nearest outlet today.");
    }
}