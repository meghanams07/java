class MallExecutor {
    public static void main(String[] args) {
        
        Shop s1 = new Shop(101, "Zudio", "Clothing", "Tata", 15, 1, "Fashion", "10AM", "10PM", "Blue", 2000, "Zudio", 500, "UPI", "Central", 6, "Rahul", "Active", 2018, "Bangalore");
        Mall m1 = new Mall(1, "Orion Mall", "Rajajinagar", 5, 120, "Brigade Group", 500, "10AM", "10PM", "High", "Yes", "PVR", 10, 12, "White", 2013, "Bangalore", "India", "Open", "Luxury", s1);
        m1.displayDetails();

        
        Shop s2 = new Shop(102, "Pantaloons", "Clothing", "Aditya Birla", 12, 2, "Fashion", "10AM", "10PM", "Red", 1800, "Pantaloons", 400, "Card", "Central", 5, "Suresh", "Active", 2017, "Bangalore");
        Mall m2 = new Mall(2, "Forum Mall", "Koramangala", 4, 90, "Prestige Group", 400, "10AM", "10PM", "Medium", "Yes", "PVR", 8, 10, "Grey", 2004, "Bangalore", "India", "Open", "Premium", s2);
        m2.displayDetails();

        
        Shop s3 = new Shop(103, "Reliance Trends", "Clothing", "Reliance", 14, 2, "Fashion", "10AM", "10PM", "Black", 1700, "Reliance", 450, "UPI", "Central", 5, "Ajay", "Active", 2016, "Bangalore");
        Mall m3 = new Mall(3, "Garuda Mall", "Magrath Road", 6, 110, "Garuda Group", 450, "10AM", "10PM", "High", "Yes", "INOX", 9, 11, "White", 2008, "Bangalore", "India", "Open", "Premium", s3);
        m3.displayDetails();

       
        Shop s4 = new Shop(104, "Nike", "Sports", "Nike Inc", 10, 1, "Sportswear", "10AM", "10PM", "Black", 1500, "Nike", 300, "Card", "Central", 4, "Ravi", "Active", 2015, "Bangalore");
        Mall m4 = new Mall(4, "GT Mall", "Magadi Road", 5, 80, "GT Group", 300, "10AM", "10PM", "Medium", "Yes", "PVR", 7, 8, "Grey", 2010, "Bangalore", "India", "Open", "Standard", s4);
        m4.displayDetails();

       
        Shop s5 = new Shop(105, "Adidas", "Sports", "Adidas Group", 11, 2, "Sportswear", "10AM", "10PM", "Black", 1600, "Adidas", 350, "Card", "Central", 4, "Arjun", "Active", 2017, "Bangalore");
        Mall m5 = new Mall(5, "Mantri Square", "Malleshwaram", 6, 200, "Mantri Group", 800, "10AM", "10PM", "High", "Yes", "INOX", 12, 15, "White", 2010, "Bangalore", "India", "Open", "Luxury", s5);
        m5.displayDetails();

       
        Shop s6 = new Shop(106, "Puma", "Sports", "Puma SE", 9, 1, "Sportswear", "10AM", "10PM", "Black", 1400, "Puma", 280, "UPI", "Central", 4, "Kiran", "Active", 2018, "Bangalore");
        Mall m6 = new Mall(6, "Central Mall", "Bellandur", 5, 95, "Future Group", 420, "10AM", "10PM", "Medium", "Yes", "PVR", 9, 10, "Blue", 2014, "Bangalore", "India", "Open", "Premium", s6);
        m6.displayDetails();

       
        Shop s7 = new Shop(107, "Max Fashion", "Clothing", "Landmark Group", 13, 2, "Casual Wear", "9AM", "11PM", "Green", 1650, "Max", 380, "Card", "East Wing", 5, "Priya", "Active", 2019, "Bangalore");
        Mall m7 = new Mall(7, "Phoenix Marketcity", "Whitefield", 4.5, 135, "Prestige Group", 650, "10AM", "11PM", "High", "Yes", "INOX", 10, 13, "Gold", 2015, "Bangalore", "India", "Open", "Family", s7);
        m7.displayDetails();

        
        Shop s8 = new Shop(108, "H&M", "Clothing", "H&M Group", 16, 1, "Fashion", "11AM", "10PM", "Red", 1900, "H&M", 600, "UPI", "North Wing", 6, "Sneha", "Active", 2020, "Bangalore");
        Mall m8 = new Mall(8, "VR Bengaluru", "Whitefield", 5.5, 130, "V R Bengaluru", 700, "10AM", "11PM", "High", "Yes", "Cinepolis", 11, 14, "Silver", 2016, "Bangalore", "India", "Open", "Modern", s8);
        m8.displayDetails();

        Shop s9 = new Shop(109, "H&M", "Clothing", "H&M Group", 16, 1, "Fashion", "10AM", "10PM", "Red", 1800, "H&M", 600, "Card", "Central", 6, "Rakesh", "Active", 2019, "Bangalore");
        Mall m9 = new Mall(9, "Elements Mall", "Thanisandra", 5, 85, "Elements Group", 350, "10AM", "10PM", "Medium", "Yes", "INOX", 7, 9, "White", 2015, "Bangalore", "India", "Open", "Premium", s9);
        m9.displayDetails();

        
        Shop s10 = new Shop(110, "Bata", "Footwear", "Bata Ltd", 9, 1, "Shoes", "10AM", "10PM", "Brown", 1200, "Bata", 250, "UPI", "Central", 3, "Mahesh", "Active", 2016, "Bangalore");
        Mall m10 = new Mall(10, "Gopalan Mall", "Bannerghatta Road", 4, 70, "Gopalan Group", 300, "10AM", "10PM", "Medium", "Yes", "Cinepolis", 6, 8, "Grey", 2012, "Bangalore", "India", "Open", "Standard", s10);
        m10.displayDetails();

        Shop s11 = new Shop(111, "Woodland", "Footwear", "Aero Group", 8, 1, "Shoes", "10AM", "9PM", "Green", 1100, "Woodland", 200, "Cash", "Central", 3, "Karthik", "Active", 2015, "Bangalore");
        Mall m11 = new Mall(11, "Sigma Mall", "Cunningham Road", 4, 60, "Sigma Group", 200, "10AM", "9PM", "Low", "Yes", "No", 4, 6, "White", 2005, "Bangalore", "India", "Open", "Standard", s11);
        m11.displayDetails();


        Shop s12 = new Shop(112, "Zara", "Clothing", "Inditex", 18, 2, "Fashion", "10AM", "10PM", "Black", 2000, "Zara", 650, "Card", "Central", 7, "Anil", "Active", 2020, "Bangalore");
        Mall m12 = new Mall(12, "Royal Meenakshi Mall", "Bannerghatta", 5, 100, "Royal Group", 400, "10AM", "10PM", "High", "Yes", "INOX", 8, 10, "Cream", 2011, "Bangalore", "India", "Open", "Premium", s12);
        m12.displayDetails();


        Shop s13 = new Shop(113, "Lifestyle", "Clothing", "Landmark Group", 17, 2, "Fashion", "10AM", "10PM", "Purple", 1900, "Lifestyle", 550, "Card", "Central", 6, "Vinay", "Active", 2018, "Bangalore");
        Mall m13 = new Mall(13, "Garuda Mall 2", "Yelahanka", 5, 95, "Garuda Group", 360, "10AM", "10PM", "High", "Yes", "PVR", 7, 9, "White", 2016, "Bangalore", "India", "Open", "Premium", s13);
        m13.displayDetails();

        Shop s14 = new Shop(114, "Apple Store", "Electronics", "Apple Inc", 20, 1, "Gadgets", "10AM", "10PM", "White", 2100, "Apple", 300, "Card", "Central", 8, "Rohan", "Active", 2021, "Bangalore");
        Mall m14 = new Mall(14, "VR Mall", "Whitefield", 6, 140, "Virtuous Retail", 600, "10AM", "10PM", "High", "Yes", "PVR", 11, 14, "Grey", 2015, "Bangalore", "India", "Open", "Luxury", s14);
        m14.displayDetails();

        Shop s15 = new Shop(115, "Starbucks", "Cafe", "Starbucks", 12, 1, "Food", "9AM", "11PM", "Green", 900, "Starbucks", 150, "UPI", "Central", 3, "Deepak", "Active", 2019, "Bangalore");
        Mall m15 = new Mall(15, "Phoenix Marketcity", "Mahadevapura", 7, 200, "Phoenix Group", 900, "10AM", "11PM", "High", "Yes", "PVR", 14, 18, "Brown", 2011, "Bangalore", "India", "Open", "Luxury", s15);
        m15.displayDetails();


        Shop s16 = new Shop(116, "Decathlon", "Sports", "Decathlon Group", 25, 2, "Sportswear", "10AM", "10PM", "Blue", 2200, "Decathlon", 800, "UPI", "Central", 7, "Ramesh", "Active", 2020, "Bangalore");
        Mall m16 = new Mall(16, "Lulu Mall", "Rajajinagar", 6, 180, "Lulu Group", 850, "10AM", "11PM", "High", "Yes", "PVR", 12, 16, "White", 2021, "Bangalore", "India", "Open", "Luxury", s16);
        m16.displayDetails();


        Shop s17 = new Shop(117, "Under Armour", "Sports", "UA Inc", 12, 1, "Sportswear", "10AM", "10PM", "Black", 1400, "UA", 320, "Card", "Central", 4, "Prakash", "Active", 2019, "Bangalore");
        Mall m17 = new Mall(17, "Inorbit Mall", "Whitefield", 5, 110, "Inorbit Group", 450, "10AM", "10PM", "High", "Yes", "INOX", 8, 10, "Grey", 2016, "Bangalore", "India", "Open", "Premium", s17);
        m17.displayDetails();

        Shop s18 = new Shop(118, "Reebok", "Sports", "Adidas Group", 9, 2, "Sportswear", "10AM", "10PM", "White", 1200, "Reebok", 260, "UPI", "Central", 3, "Sunil", "Active", 2018, "Bangalore");
        Mall m18 = new Mall(18, "Arena Mall", "Electronic City", 4, 75, "Arena Group", 300, "10AM", "10PM", "Medium", "Yes", "Cinepolis", 6, 7, "Blue", 2014, "Bangalore", "India", "Open", "Standard", s18);
        m18.displayDetails();

        Shop s19 = new Shop(119, "Spar", "Supermarket", "Spar Group", 20, 1, "Grocery", "9AM", "10PM", "Green", 2500, "Spar", 1200, "UPI", "Central", 8, "Naveen", "Active", 2017, "Bangalore");
        Mall m19 = new Mall(19, "Metro Mall", "Indiranagar", 3, 60, "Metro Group", 200, "10AM", "9PM", "Medium", "Yes", "No", 4, 5, "Cream", 2012, "Bangalore", "India", "Open", "Standard", s19);
        m19.displayDetails();


        Shop s20 = new Shop(120, "Marks & Spencer", "Clothing", "M&S Group", 14, 2, "Fashion", "10AM", "10PM", "Black", 1800, "M&S", 420, "Card", "Central", 5, "Vikram", "Active", 2019, "Bangalore");
        Mall m20 = new Mall(20, "City Center Mall", "Jayanagar", 4, 80, "City Group", 350, "10AM", "10PM", "Medium", "Yes", "INOX", 6, 8, "White", 2013, "Bangalore", "India", "Open", "Premium", s20);
        m20.displayDetails();
    }
}
