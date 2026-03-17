class FactoryExecutor {
    public static void main(String[] args) {
	
        Machine m1 = new Machine(101, "Cutting Machine", "Industrial", "Bosch", "CMX200",
                                500, "Electric", "Blue", 1500, "Steel", 3000, "Automatic",
                                "Air Cooling", 200, "High", 2023, "Active", "Cutting",
                                "Monthly", "Section A");
        Factory f1 = new Factory(1, "ABC Factory", "Bangalore", "Ramesh", 200, "Steel", 5000,
                                "Day & Night", 50, "Electric", "Suresh", 2010, "Bangalore",
                                "India", "High", "Gray", 1000, "Running", "Manufacturing",
                                "ISO Certified", m1);
        f1.getFactoryDetails();


        Machine m2 = new Machine(102, "Grinding Machine", "Industrial", "Siemens", "GMX100",
                                400, "Electric", "Green", 1200, "Iron", 2500, "Automatic",
                                "Water Cooling", 180, "High", 2022, "Active", "Grinding",
                                "Monthly", "Section B");
        Factory f2 = new Factory(2, "XYZ Factory", "Mysore", "Suresh", 150, "Cement", 4000,
                                "Day", 40, "Electric", "Kiran", 2012, "Mysore", "India",
                                "Medium", "White", 800, "Running", "Construction",
                                "ISO Certified", m2);
        f2.getFactoryDetails();


        Machine m3 = new Machine(103, "Molding Machine", "Industrial", "Hitachi", "MMX300",
                                450, "Electric", "Yellow", 1400, "Steel", 2700, "Automatic",
                                "Air Cooling", 220, "High", 2024, "Active", "Molding",
                                "Weekly", "Section C");
        Factory f3 = new Factory(3, "Delta Factory", "Chennai", "Arun", 220, "Plastic", 6000,
                                "Day & Night", 60, "Electric", "Manoj", 2015, "Chennai",
                                "India", "High", "Blue", 1200, "Running", "Manufacturing",
                                "Gov Approved", m3);
        f3.getFactoryDetails();

        Machine m4 = new Machine(104, "Glass Cutting Machine", "Industrial", "Bosch", "GCM200",
                                420, "Electric", "Silver", 1300, "Steel", 2600, "Automatic",
                                "Air Cooling", 210, "High", 2021, "Active", "Cutting",
                                "Monthly", "Section D");
        Factory f4 = new Factory(4, "Omega Factory", "Hyderabad", "Ravi", 180, "Glass", 4500,
                                "Day & Night", 55, "Electric", "Naveen", 2011, "Hyderabad",
                                "India", "High", "White", 900, "Running", "Manufacturing",
                                "ISO Certified", m4);
        f4.getFactoryDetails();

        Machine m5 = new Machine(105, "Rubber Press Machine", "Industrial", "Siemens", "RPM500",
                                390, "Electric", "Red", 1250, "Iron", 2400, "Semi Automatic",
                                "Water Cooling", 170, "Medium", 2020, "Active", "Press",
                                "Monthly", "Section E");
        Factory f5 = new Factory(5, "Prime Factory", "Pune", "Karthik", 160, "Rubber", 4200,
                                "Day", 48, "Electric", "Ajay", 2014, "Pune", "India",
                                "Medium", "Black", 750, "Running", "Manufacturing",
                                "Gov Approved", m5);
        f5.getFactoryDetails();

        Machine m6 = new Machine(106, "Aluminium Cutting Machine", "Industrial", "Bosch", "ACM600",
                                460, "Electric", "Gray", 1450, "Steel", 2800, "Automatic",
                                "Air Cooling", 230, "High", 2023, "Active", "Cutting",
                                "Monthly", "Section F");
        Factory f6 = new Factory(6, "Star Factory", "Delhi", "Mahesh", 210, "Aluminium", 5200,
                                "Day & Night", 65, "Electric", "Rohit", 2016, "Delhi",
                                "India", "High", "Silver", 1100, "Running", "Metal",
                                "ISO Certified", m6);
        f6.getFactoryDetails();

        Machine m7 = new Machine(107, "Textile Weaving Machine", "Industrial", "Siemens", "TWM700",
                                410, "Electric", "Blue", 1350, "Iron", 2600, "Semi Automatic",
                                "Water Cooling", 200, "Medium", 2021, "Active", "Weaving",
                                "Monthly", "Section G");
        Factory f7 = new Factory(7, "Sunrise Factory", "Mumbai", "Anil", 190, "Textile", 4700,
                                "Day", 52, "Electric", "Deepak", 2013, "Mumbai", "India",
                                "Medium", "Yellow", 850, "Running", "Textile",
                                "Gov Approved", m7);
        f7.getFactoryDetails();

        Machine m8 = new Machine(108, "Cotton Spinning Machine", "Industrial", "Bosch", "CSM800",
                                420, "Electric", "Green", 1320, "Steel", 2550, "Automatic",
                                "Air Cooling", 190, "High", 2022, "Active", "Spinning",
                                "Monthly", "Section H");
        Factory f8 = new Factory(8, "Galaxy Factory", "Coimbatore", "Prakash", 170, "Cotton", 4300,
                                "Day & Night", 50, "Electric", "Harish", 2017, "Coimbatore",
                                "India", "High", "White", 780, "Running", "Textile",
                                "ISO Certified", m8);
        f8.getFactoryDetails();

        Machine m9 = new Machine(109, "Chemical Mixing Machine", "Industrial", "Siemens", "CMM900",
                                470, "Electric", "Silver", 1500, "Steel", 2750, "Automatic",
                                "Water Cooling", 240, "High", 2023, "Active", "Mixing",
                                "Monthly", "Section I");
        Factory f9 = new Factory(9, "Future Factory", "Ahmedabad", "Vikas", 200, "Chemicals", 5100,
                                "Day & Night", 58, "Electric", "Sanjay", 2018, "Ahmedabad",
                                "India", "High", "Gray", 950, "Running", "Chemical",
                                "Gov Approved", m9);
        f9.getFactoryDetails();

        Machine m10 = new Machine(110, "Marble Cutting Machine", "Industrial", "Bosch", "MCM1000",
                                 430, "Electric", "Gray", 1400, "Steel", 2500, "Automatic",
                                 "Water Cooling", 210, "Medium", 2021, "Active", "Cutting",
                                 "Monthly", "Section J");
        Factory f10 = new Factory(10, "Royal Factory", "Jaipur", "Rahul", 175, "Marble", 4800,
                                 "Day", 45, "Electric", "Vijay", 2014, "Jaipur", "India",
                                 "Medium", "White", 820, "Running", "Stone",
                                 "ISO Certified", m10);
        f10.getFactoryDetails();


        Machine m11 = new Machine(111, "Diamond Polishing Machine", "Industrial", "Hitachi", "DPM1100",
                                 350, "Electric", "Blue", 1100, "Iron", 2300, "Automatic",
                                 "Air Cooling", 180, "High", 2022, "Active", "Polishing",
                                 "Monthly", "Section K");
        Factory f11 = new Factory(11, "Vision Factory", "Surat", "Amit", 165, "Diamond", 4100,
                                 "Day", 42, "Electric", "Nitin", 2019, "Surat", "India",
                                 "High", "Silver", 700, "Running", "Jewellery",
                                 "Gov Approved", m11);
        f11.getFactoryDetails();

        Machine m13 = new Machine(113, "Battery Assembly Machine", "Industrial", "Siemens", "BAM1300",
                                 470, "Electric", "Silver", 1500, "Steel", 2750, "Automatic",
                                 "Air Cooling", 230, "High", 2024, "Active", "Assembly",
                                 "Monthly", "Section M");
        Factory f13 = new Factory(13, "PowerTech Factory", "Bhopal", "Vivek", 195, "Batteries", 4900,
                                 "Day & Night", 57, "Electric", "Tarun", 2017, "Bhopal",
                                 "India", "High", "Gray", 920, "Running", "Electronics",
                                 "Gov Approved", m13);
        f13.getFactoryDetails();

        Machine m14 = new Machine(114, "Wood Cutting Machine", "Industrial", "Bosch", "WCM1400",
                                 390, "Electric", "Brown", 1200, "Iron", 2400, "Semi Automatic",
                                 "Air Cooling", 180, "Medium", 2020, "Active", "Cutting",
                                 "Monthly", "Section N");
        Factory f14 = new Factory(14, "Neo Factory", "Lucknow", "Pradeep", 175, "Furniture", 4400,
                                 "Day", 46, "Electric", "Kamal", 2013, "Lucknow", "India",
                                 "Medium", "Brown", 760, "Running", "Wood",
                                 "ISO Certified", m14);
        f14.getFactoryDetails();

        Machine m15 = new Machine(115, "Circuit Assembly Machine", "Industrial", "Siemens", "CAM1500",
                                 480, "Electric", "Silver", 1550, "Steel", 2900, "Automatic",
                                 "Water Cooling", 240, "High", 2023, "Active", "Assembly",
                                 "Monthly", "Section O");
        Factory f15 = new Factory(15, "Smart Factory", "Indore", "Rohit", 205, "Electronics", 5300,
                                 "Day & Night", 62, "Electric", "Manish", 2018, "Indore",
                                 "India", "High", "White", 1000, "Running", "Electronics",
                                 "Gov Approved", m15);
        f15.getFactoryDetails();


        Machine m16 = new Machine(116, "Paper Cutting Machine", "Industrial", "Bosch", "PCM1600",
                                 370, "Electric", "Gray", 1180, "Steel", 2300, "Semi Automatic",
                                 "Air Cooling", 170, "Medium", 2021, "Active", "Cutting",
                                 "Monthly", "Section P");
        Factory f16 = new Factory(16, "Ultra Factory", "Patna", "Akhil", 190, "Paper", 4700,
                                 "Day", 49, "Electric", "Suresh", 2012, "Patna", "India",
                                 "Medium", "White", 780, "Running", "Paper",
                                 "ISO Certified", m16);
        f16.getFactoryDetails();

        Machine m17 = new Machine(117, "Steel Rolling Machine", "Industrial", "Siemens", "SRM1700",
                                 500, "Electric", "Silver", 1600, "Steel", 3000, "Automatic",
                                 "Water Cooling", 260, "High", 2024, "Active", "Rolling",
                                 "Monthly", "Section Q");
        Factory f17 = new Factory(17, "Advance Factory", "Kolkata", "Sanjay", 210, "Steel Rods", 5500,
                                 "Day & Night", 68, "Electric", "Rakesh", 2019, "Kolkata",
                                 "India", "High", "Gray", 1200, "Running", "Metal",
                                 "Gov Approved", m17);
        f17.getFactoryDetails();

        Machine m18 = new Machine(118, "Plastic Recycling Machine", "Industrial", "Hitachi", "PRM1800",
                                 420, "Electric", "Green", 1300, "Steel", 2500, "Automatic",
                                 "Air Cooling", 200, "High", 2023, "Active", "Recycling",
                                 "Monthly", "Section R");
        Factory f18 = new Factory(18, "Eco Factory", "Goa", "Kiran", 140, "Recycled Plastic", 3900,
                                 "Day", 35, "Solar", "Naveen", 2020, "Goa", "India",
                                 "High", "Green", 650, "Running", "Recycling",
                                 "ISO Certified", m18);
        f18.getFactoryDetails();

        Machine m19 = new Machine(119, "CNC Machine", "Industrial", "Bosch", "CNC1900",
                                 520, "Electric", "Black", 1700, "Steel", 3100, "Automatic",
                                 "Water Cooling", 270, "High", 2024, "Active", "CNC",
                                 "Monthly", "Section S");
        Factory f19 = new Factory(19, "Mega Factory", "Chandigarh", "Arjun", 220, "Automobile Parts", 6000,
                                 "Day & Night", 72, "Electric", "Vikram", 2015, "Chandigarh",
                                 "India", "High", "Black", 1300, "Running", "Automobile",
                                 "Gov Approved", m19);
        f19.getFactoryDetails();

        Machine m20 = new Machine(120, "Robot Assembly Machine", "Industrial", "Siemens", "RAM2000",
                                 600, "Electric", "Silver", 1800, "Steel", 3200, "Automatic",
                                 "Water Cooling", 300, "High", 2025, "Active", "Assembly",
                                 "Monthly", "Section T");
        Factory f20 = new Factory(20, "Global Factory", "Bangalore", "Karthik", 250, "Robotics", 6500,
                                 "Day & Night", 80, "Electric", "Aditya", 2021, "Bangalore",
                                 "India", "High", "Silver", 1500, "Running", "Robotics",
                                 "ISO Certified", m20);
        f20.getFactoryDetails();
    }
}