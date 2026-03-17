class TrainExecutor {
    public static void main(String[] train) {
        Boggi boggi1 = new Boggi(102, "Sleeper", 80, "SL", 22, 2, "Red", 210, "Steel", 2,
                                "None", 12, 24, "IR", 2018, 26, 4, 4, "Good", "Active");

        Boggi boggi2 = new Boggi(103, "AC", 72, "AC2", 20, 2, "Green", 205, "Steel", 3,
                                "Central", 10, 20, "IR", 2019, 25, 4, 4, "Good", "Active");

        Boggi boggi3 = new Boggi(104, "Sleeper", 78, "SL", 22, 2, "White", 200, "Steel", 4,
                                "None", 12, 22, "IR", 2020, 26, 4, 4, "Good", "Active");

        Boggi boggi4 = new Boggi(105, "AC", 70, "AC3", 20, 2, "Yellow", 205, "Steel", 5,
                                "Central", 10, 20, "IR", 2019, 25, 4, 4, "Good", "Active");

        Boggi boggi5 = new Boggi(106, "Sleeper", 80, "SL", 22, 2, "Blue", 210, "Steel", 6,
                                "None", 12, 24, "IR", 2018, 26, 4, 4, "Good", "Active");

        Boggi boggi6 = new Boggi(107, "AC", 72, "AC2", 20, 2, "Red", 205, "Steel", 7,
                                "Central", 10, 20, "IR", 2020, 25, 4, 4, "Good", "Active");

        Boggi boggi7 = new Boggi(108, "Sleeper", 78, "SL", 22, 2, "Green", 210, "Steel", 8,
                                "None", 12, 22, "IR", 2019, 26, 4, 4, "Good", "Active");

        Boggi boggi8 = new Boggi(109, "Sleeper", 78, "SL", 22, 2, "Orange", 210, "Steel", 9,
                                "None", 12, 22, "IR", 2019, 26, 4, 4, "Good", "Active");

        Boggi boggi9 = new Boggi(110, "AC", 72, "AC3", 20, 2, "Blue", 205, "Steel", 10,
                                 "Central", 10, 20, "IR", 2020, 25, 4, 4, "Good", "Active");

        Boggi boggi10 = new Boggi(111, "AC", 70, "AC2", 20, 2, "Red", 205, "Steel", 11,
                                 "Central", 10, 20, "IR", 2019, 25, 4, 4, "Good", "Active");

        Boggi boggi12 = new Boggi(112, "Sleeper", 78, "SL", 22, 2, "White", 210, "Steel", 12,
                                 "None", 12, 22, "IR", 2018, 26, 4, 4, "Good", "Active");

        Boggi boggi13 = new Boggi(113, "AC", 72, "AC3", 20, 2, "Blue", 205, "Steel", 13,
                                 "Central", 10, 20, "IR", 2020, 25, 4, 4, "Good", "Active");

        Boggi boggi14 = new Boggi(114, "Sleeper", 78, "SL", 22, 2, "Green", 210, "Steel", 14,
                                 "None", 12, 22, "IR", 2019, 26, 4, 4, "Good", "Active");

        Boggi boggi15 = new Boggi(115, "AC", 70, "AC2", 20, 2, "Yellow", 205, "Steel", 15,
                                 "Central", 10, 20, "IR", 2021, 25, 4, 4, "Good", "Active");

        Boggi boggi16 = new Boggi(116, "Sleeper", 80, "SL", 22, 2, "Red", 210, "Steel", 16,
                                 "None", 12, 24, "IR", 2020, 26, 4, 4, "Good", "Active");

        Boggi boggi17 = new Boggi(117, "AC", 72, "AC3", 20, 2, "White", 205, "Steel", 17,
                                 "Central", 10, 20, "IR", 2021, 25, 4, 4, "Good", "Active");

        Boggi boggi18 = new Boggi(118, "Sleeper", 78, "SL", 22, 2, "Green", 210, "Steel", 18,
                                 "None", 12, 22, "IR", 2019, 26, 4, 4, "Good", "Active");

        Boggi boggi19 = new Boggi(119, "AC", 72, "AC3", 20, 2, "Blue", 205, "Steel", 19,
                                 "Central", 10, 20, "IR", 2021, 25, 4, 4, "Good", "Active");

        Boggi boggi20 = new Boggi(120, "Sleeper", 78, "SL", 22, 2, "Yellow", 210, "Steel", 20,
                                 "None", 12, 22, "IR", 2020, 26, 4, 4, "Good", "Active");

        // Create Train objects using parameterized constructors
        Train train2 = new Train(2, "Express2", "Delhi", "Mumbai", 120, 850, 22, "Superfast", 2,
                                "Suresh", 2021, "IndianRailway", 102, 5002, "Red", 400,
                                "Running", "Passenger", 950, "07:00AM", boggi2);

        Train train3 = new Train(3, "Express3", "Hyderabad", "Chennai", 115, 820, 21, "Passenger", 3,
                                "Mahesh", 2019, "IndianRailway", 103, 5003, "Green", 360,
                                "Running", "Passenger", 920, "08:00AM", boggi3);

        Train train4 = new Train(4, "Express4", "Mysore", "Bangalore", 100, 750, 18, "Passenger", 4,
                                "Ravi", 2022, "IndianRailway", 104, 5004, "White", 150,
                                "Running", "Passenger", 880, "09:00AM", boggi4);

        Train train5 = new Train(5, "Express5", "Pune", "Goa", 105, 780, 19, "Passenger", 5,
                                "Kiran", 2020, "IndianRailway", 105, 5005, "Yellow", 300,
                                "Running", "Passenger", 890, "10:00AM", boggi5);

        Train train6 = new Train(6, "Express6", "Chennai", "Madurai", 110, 790, 20, "Superfast", 6,
                                "Manoj", 2021, "IndianRailway", 106, 5006, "Blue", 420,
                                "Running", "Passenger", 900, "11:00AM", boggi6);

        Train train7 = new Train(7, "Express7", "Kolkata", "Delhi", 125, 860, 23, "Superfast", 7,
                                "Anil", 2022, "IndianRailway", 107, 5007, "Red", 500,
                                "Running", "Passenger", 960, "12:00PM", boggi7);

        Train train8 = new Train(8, "Express8", "Ahmedabad", "Jaipur", 115, 800, 20, "Passenger", 8,
                                "Vijay", 2021, "IndianRailway", 108, 5008, "Green", 380,
                                "Running", "Passenger", 910, "01:00PM", boggi8);

        Train train9 = new Train(9, "Express9", "Bhopal", "Indore", 105, 760, 18, "Passenger", 9,
                                "Arjun", 2019, "IndianRailway", 109, 5009, "Orange", 200,
                                "Running", "Passenger", 870, "02:00PM", boggi9);

        Train train10 = new Train(10, "Express10", "Nagpur", "Pune", 110, 800, 20, "Superfast", 10,
                                 "Deepak", 2020, "IndianRailway", 110, 5010, "Blue", 450,
                                 "Running", "Passenger", 900, "03:00PM", boggi10);

        Train train11 = new Train(11, "Express11", "Surat", "Mumbai", 120, 820, 21, "Superfast", 11,
                                 "Rohan", 2021, "IndianRailway", 111, 5011, "Red", 280,
                                 "Running", "Passenger", 910, "04:00PM", boggi11);

        Train train12 = new Train(12, "Express12", "Lucknow", "Kanpur", 100, 700, 17, "Passenger", 12,
                                 "Sanjay", 2018, "IndianRailway", 112, 5012, "White", 90,
                                 "Running", "Passenger", 850, "05:00PM", boggi12);

        Train train13 = new Train(13, "Express13", "Coimbatore", "Chennai", 110, 790, 20, "Superfast", 3,
                                 "Karthik", 2021, "IndianRailway", 113, 5013, "Blue", 500,
                                 "Running", "Passenger", 900, "06:30PM", boggi13);

        Train train14 = new Train(14, "Express14", "Trichy", "Madurai", 100, 750, 18, "Passenger", 4,
                                 "Venkatesh", 2019, "IndianRailway", 114, 5014, "Green", 140,
                                 "Running", "Passenger", 880, "07:30PM", boggi14);

        Train train15 = new Train(15, "Express15", "Hubli", "Bangalore", 105, 770, 19, "Passenger", 5,
                                 "Prakash", 2020, "IndianRailway", 115, 5015, "Yellow", 410,
                                 "Running", "Passenger", 890, "08:30PM", boggi15);

        Train train16 = new Train(16, "Express16", "Patna", "Delhi", 120, 830, 22, "Superfast", 6,
                                 "Rajesh", 2022, "IndianRailway", 116, 5016, "Red", 900,
                                 "Running", "Passenger", 950, "09:30PM", boggi16);

        Train train17 = new Train(17, "Express17", "Jaipur", "Delhi", 115, 810, 21, "Superfast", 7,
                                 "Amit", 2021, "IndianRailway", 117, 5017, "White", 280,
                                 "Running", "Passenger", 910, "10:00PM", boggi17);

        Train train18 = new Train(18, "Express18", "Kerala", "Bangalore", 110, 790, 20, "Passenger", 8,
                                 "Joseph", 2020, "IndianRailway", 118, 5018, "Green", 600,
                                 "Running", "Passenger", 900, "11:00PM", boggi18);

        Train train19 = new Train(19, "Express19", "Vizag", "Hyderabad", 115, 800, 20, "Superfast", 9,
                                 "Srinivas", 2022, "IndianRailway", 119, 5019, "Blue", 700,
                                 "Running", "Passenger", 920, "11:30PM", boggi19);

        Train train20 = new Train(20, "Express20", "Bangalore", "Mangalore", 105, 780, 19, "Passenger", 10,
                                 "Naveen", 2021, "IndianRailway", 120, 5020, "Yellow", 350,
                                 "Running", "Passenger", 890, "05:30AM", boggi20);

        train2.displayDetails();
        train3.displayDetails();
        train4.displayDetails();
        train5.displayDetails();
        train6.displayDetails();
        train7.displayDetails();
        train8.displayDetails();
        train9.displayDetails();
        train10.displayDetails();
        train11.displayDetails();
        train12.displayDetails();
        train13.displayDetails();
        train14.displayDetails();
        train15.displayDetails();
        train16.displayDetails();
        train17.displayDetails();
        train18.displayDetails();
        train19.displayDetails();
        train20.displayDetails();
    }
}