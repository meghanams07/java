class DanceExecutor {
    public static void main(String[] args) {
        Form f1 = new Form(101, "Alarippu", "Tamil Nadu", "Classical", "Traditional",
                "Carnatic", "Tisra", "Temple Stage", "Solo", 1, 10, "Medium",
                "South Indian", "Nattuvangam", "Orange", "Opening Item", "Tamil",
                "Bharatanatyam Tradition", 1900, "Performed");

        Form f2 = new Form(102, "Thaat", "UP", "Classical", "Traditional", "Hindustani",
                "Slow", "Court", "Solo", 1, 8, "Medium", "Indian", "Tabla", "White",
                "Opening", "Hindi", "Kathak Tradition", 1910, "Performed");

        Form f3 = new Form(103, "Tarangam", "AP", "Classical", "Traditional", "Carnatic",
                "Medium", "Temple", "Solo", 1, 12, "Hard", "South Indian", "Mridangam",
                "Green", "Performance", "Telugu", "Kuchipudi", 1920, "Performed");

        Form f4 = new Form(104, "Mangalacharan", "Odisha", "Classical", "Traditional",
                "Odissi", "Slow", "Temple", "Solo", 1, 10, "Medium", "Indian",
                "Pakhawaj", "White", "Opening", "Odia", "Odissi", 1940, "Performed");

        Form f5 = new Form(105, "Cholkettu", "Kerala", "Classical", "Traditional",
                "Carnatic", "Medium", "Temple", "Solo", 1, 12, "Medium", "South Indian",
                "Mridangam", "White", "Opening", "Malayalam", "Mohiniyattam", 1920, "Performed");

        Form f6 = new Form(106, "Keli", "Kerala", "Classical", "Traditional", "Kerala Music",
                "Fast", "Temple", "Group", 10, 20, "Hard", "Indian", "Chenda", "Green",
                "Opening", "Malayalam", "Kathakali", 1600, "Performed");

        Form f7 = new Form(107, "Ras Leela", "Manipur", "Classical", "Traditional", "Devotional",
                "Slow", "Temple", "Group", 5, 25, "Medium", "Indian", "Pung", "Pink",
                "Devotional", "Manipuri", "Manipuri", 1750, "Performed");

        Form f8 = new Form(108, "Ramdani", "Assam", "Classical", "Traditional", "Devotional",
                "Medium", "Temple", "Group", 3, 15, "Medium", "Indian", "Khol", "Yellow",
                "Performance", "Assamese", "Sattriya", 1500, "Performed");

        Form f9 = new Form(109, "Dandiya", "Gujarat", "Folk", "Traditional", "Folk",
                "Fast", "Festival Stage", "Group", 20, 30, "Easy", "Indian", "Dhol", "Multi",
                "Festival", "Gujarati", "Garba", 1880, "Performed");

        Form f10 = new Form(110, "Jhumar", "Punjab", "Folk", "Traditional", "Punjabi",
                "Fast", "Festival", "Group", 8, 20, "Medium", "Punjabi", "Dhol", "Yellow",
                "Festival", "Punjabi", "Bhangra", 1750, "Performed");

        Form f11 = new Form(111, "Shringar Lavani", "Maharashtra", "Folk", "Traditional",
                "Lavani Music", "Fast", "Stage", "Solo", 1, 10, "Medium", "Indian",
                "Dholki", "Red", "Performance", "Marathi", "Lavani", 1800, "Performed");

        Form f12 = new Form(112, "Traditional Ghoomar", "Rajasthan", "Folk", "Traditional",
                "Folk", "Medium", "Festival Stage", "Group", 10, 15, "Easy", "Indian",
                "Dhol", "Multi", "Festival", "Hindi", "Ghoomar", 1650, "Performed");

        Form f13 = new Form(113, "Prasanga", "Karnataka", "Drama", "Traditional", "Yakshagana",
                "Fast", "Open Stage", "Group", 12, 30, "Hard", "Indian", "Chende", "Red",
                "Drama", "Kannada", "Yakshagana", 1550, "Performed");

        Form f14 = new Form(114, "Temple Dollu", "Karnataka", "Folk", "Traditional", "Drum",
                "Fast", "Temple", "Group", 16, 15, "Medium", "Indian", "Dollu", "Orange",
                "Festival", "Kannada", "Dollu Kunitha", 1450, "Performed");

        Form f15 = new Form(115, "Kolattam Round", "Tamil Nadu", "Folk", "Traditional", "Folk",
                "Medium", "Festival", "Group", 12, 15, "Easy", "Indian", "Stick", "Multi",
                "Festival", "Tamil", "Kolattam", 1650, "Performed");

        Form f16 = new Form(116, "Karagam Balance", "Tamil Nadu", "Folk", "Traditional", "Folk",
                "Medium", "Temple Festival", "Group", 4, 15, "Medium", "Indian", "Thavil",
                "Yellow", "Festival", "Tamil", "Karagattam", 1750, "Performed");

        Form f17 = new Form(117, "Kummi Round", "Tamil Nadu", "Folk", "Traditional", "Folk",
                "Slow", "Festival", "Group", 10, 10, "Easy", "Indian", "Clap", "Multi",
                "Festival", "Tamil", "Kummi", 1650, "Performed");

        Form f18 = new Form(118, "Peacock Dance", "Tamil Nadu", "Folk", "Peacock Costume",
                "Devotional", "Medium", "Temple", "Solo", 1, 10, "Medium", "Indian",
                "Thavil", "Blue", "Devotional", "Tamil", "Mayilattam", 1750, "Performed");

        Form f19 = new Form(119, "Rongali Bihu", "Assam", "Folk", "Traditional", "Folk",
                "Fast", "Festival Stage", "Group", 12, 15, "Easy", "Indian", "Dhol", "Red",
                "Festival", "Assamese", "Bihu", 1650, "Performed");

        Form f20 = new Form(120, "Mask Dance", "Jharkhand", "Martial", "Mask Costume", "Traditional",
                "Fast", "Open Ground", "Group", 8, 20, "Hard", "Indian", "Dhol", "Multi",
                "Drama", "Hindi", "Chhau", 1550, "Performed");


        Dance d1 = new Dance(1, "Bharatanatyam", "India", "Tamil Nadu", "Classical",
                "Carnatic", "Traditional Saree", "High", 1, 60, "Rukmini Devi", "Classical",
                "Theatre", "Adi Tala", "Indian", "Red and Gold", 1930, "Tamil", "Mridangam",
                "Active", f1);

        Dance d2 = new Dance(2, "Kathak", "India", "Uttar Pradesh", "Classical", "Hindustani",
                "Lehenga", "High", 1, 50, "Birju Maharaj", "Classical", "Stage", "Teentaal",
                "North Indian", "White", 1920, "Hindi", "Tabla", "Active", f2);

        Dance d3 = new Dance(3, "Kuchipudi", "India", "Andhra Pradesh", "Classical", "Carnatic",
                "Traditional", "High", 1, 45, "Vempati Chinna Satyam", "Classical", "Stage",
                "Adi", "Telugu", "Green", 1935, "Telugu", "Mridangam", "Active", f3);

        Dance d4 = new Dance(4, "Odissi", "India", "Odisha", "Classical", "Odissi Music",
                "Traditional", "High", 1, 40, "Kelucharan Mohapatra", "Classical", "Stage",
                "Ektali", "Odisha", "Silver", 1950, "Odia", "Pakhawaj", "Active", f4);

        Dance d5 = new Dance(5, "Mohiniyattam", "India", "Kerala", "Classical", "Carnatic",
                "White and Gold", "Medium", 1, 35, "Kalamandalam Kalyanikutty", "Classical",
                "Stage", "Adi", "Kerala", "White", 1930, "Malayalam", "Mridangam", "Active", f5);

        Dance d6 = new Dance(6, "Kathakali", "India", "Kerala", "Classical", "Traditional",
                "Heavy Makeup", "High", 10, 120, "Kalamandalam Gopi", "Drama Dance",
                "Open Stage", "Chenda", "Kerala", "Green", 1700, "Malayalam", "Chenda",
                "Active", f6);

        Dance d7 = new Dance(7, "Manipuri", "India", "Manipur", "Classical", "Traditional",
                "Potloi", "Medium", 4, 40, "Guru Bipin Singh", "Classical", "Stage",
                "Manipuri Tala", "Manipur", "Pink", 1800, "Manipuri", "Pung", "Active", f7);

        Dance d8 = new Dance(8, "Sattriya", "India", "Assam", "Classical", "Devotional",
                "Traditional", "Medium", 3, 30, "Jatin Goswami", "Classical", "Stage", "Khol",
                "Assam", "Yellow", 1600, "Assamese", "Khol", "Active", f8);

        Dance d9 = new Dance(9, "Garba", "India", "Gujarat", "Folk", "Folk Music",
                "Chaniya Choli", "Easy", 20, 60, "Falguni Pathak", "Festival",
                "Open Ground", "Dhol", "Gujarati", "Colorful", 1900, "Gujarati", "Dhol",
                "Active", f9);

        Dance d10 = new Dance(10, "Bhangra", "India", "Punjab", "Folk", "Punjabi",
                "Kurta", "Medium", 8, 25, "Diljit", "Festival", "Open Stage", "Dhol Beat",
                "Punjabi", "Bright", 1800, "Punjabi", "Dhol", "Active", f10);

        Dance d11 = new Dance(11, "Lavani", "India", "Maharashtra", "Folk", "Dholki",
                "Nauvari Saree", "Medium", 2, 20, "Surekha Punekar", "Folk", "Stage",
                "Dholki Beat", "Marathi", "Red", 1850, "Marathi", "Dholki", "Active", f11);

        Dance d12 = new Dance(12, "Ghoomar", "India", "Rajasthan", "Folk", "Rajasthani Folk",
                "Ghagra", "Easy", 10, 25, "Rajasthani Folk Groups", "Festival",
                "Open Stage", "Dhol", "Rajasthani", "Colorful", 1700, "Hindi", "Dhol",
                "Active", f12);

        Dance d13 = new Dance(13, "Yakshagana", "India", "Karnataka", "Theatre Dance",
                "Yakshagana Music", "Heavy Costume", "High", 12, 90, "Keremane Shivarama",
                "Drama", "Open Stage", "Chande", "Kannada", "Bright", 1600, "Kannada",
                "Chende", "Active", f13);

        Dance d14 = new Dance(14, "Dollu Kunitha", "India", "Karnataka", "Folk", "Drum Music",
                "Traditional", "Medium", 16, 20, "Village Artists", "Festival", "Open Ground",
                "Drum Beat", "Kannada", "Orange", 1500, "Kannada", "Dollu", "Active", f14);

        Dance d15 = new Dance(15, "Kolattam", "India", "Tamil Nadu", "Folk", "Folk Music",
                "Traditional", "Easy", 12, 20, "Village Artists", "Festival", "Open Stage",
                "Stick Beat", "Tamil", "Multi", 1700, "Tamil", "Stick", "Active", f15);

        Dance d16 = new Dance(16, "Karagattam", "India", "Tamil Nadu", "Folk", "Folk Music",
                "Traditional", "Medium", 4, 25, "Village Artists", "Festival", "Open Stage",
                "Drum Beat", "Tamil", "Yellow", 1800, "Tamil", "Thavil", "Active", f16);

        Dance d17 = new Dance(17, "Kummi", "India", "Tamil Nadu", "Folk", "Clap Rhythm",
                "Traditional", "Easy", 10, 20, "Village Women", "Festival", "Open Ground",
                "Clap Beat", "Tamil", "Colorful", 1700, "Tamil", "Hand Clap", "Active", f17);

        Dance d18 = new Dance(18, "Mayilattam", "India", "Tamil Nadu", "Folk", "Folk Music",
                "Peacock Costume", "Medium", 2, 15, "Temple Artists", "Devotional",
                "Temple Stage", "Drum Beat", "Tamil", "Blue", 1800, "Tamil", "Thavil",
                "Active", f18);

        Dance d19 = new Dance(19, "Bihu", "India", "Assam", "Folk", "Assamese Folk",
                "Traditional", "Easy", 12, 20, "Assam Artists", "Festival", "Open Stage",
                "Fast Beat", "Assamese", "Red", 1700, "Assamese", "Dhol", "Active", f19);

        Dance d20 = new Dance(20, "Chhau", "India", "Jharkhand", "Martial Dance", "Traditional",
                "Mask Costume", "High", 8, 30, "Chhau Artists", "Drama", "Open Stage",
                "Drum Beat", "Indian", "Multi", 1600, "Hindi", "Dhol", "Active", f20);

        d1.displayDetails();
        System.out.println("----------------------------------------");
        d2.displayDetails();
        System.out.println("----------------------------------------");
        d3.displayDetails();
        System.out.println("----------------------------------------");
        d4.displayDetails();
        System.out.println("----------------------------------------");
        d5.displayDetails();
        System.out.println("----------------------------------------");
        d6.displayDetails();
        System.out.println("----------------------------------------");
        d7.displayDetails();
        System.out.println("----------------------------------------");
        d8.displayDetails();
        System.out.println("----------------------------------------");
        d9.displayDetails();
        System.out.println("----------------------------------------");
        d10.displayDetails();
        System.out.println("----------------------------------------");
        d11.displayDetails();
        System.out.println("----------------------------------------");
        d12.displayDetails();
        System.out.println("----------------------------------------");
        d13.displayDetails();
        System.out.println("----------------------------------------");
        d14.displayDetails();
        System.out.println("----------------------------------------");
        d15.displayDetails();
        System.out.println("----------------------------------------");
        d16.displayDetails();
        System.out.println("----------------------------------------");
        d17.displayDetails();
        System.out.println("----------------------------------------");
        d18.displayDetails();
        System.out.println("----------------------------------------");
        d19.displayDetails();
        System.out.println("----------------------------------------");
        d20.displayDetails();
        System.out.println("----------------------------------------");
    }
}
