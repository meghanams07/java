class ProjectExecutor {
    public static void main(String[] args) {
        
        Project p1 = new Project(101, "E-Commerce Platform", "Retail", "Spring Boot, React", 25, 12, 500000.0,
            "Active", "Ravi Kumar", "2025-01-15", "2026-01-14", "High", "Web App",
            "React Native", "BigBasket", "Bengaluru", "Mobile-First", "Agile", "v2.1", "IT");
        Company c1 = new Company(1, "Tata Consultancy Services", "Mumbai", "K. Krithivasan",
            1968, 650000, 27100.0, "IT Services", "www.tcs.com", "TCS.NS",
            "Active", "Public Limited", "Mumbai", "India", "Technology", 
            "Experience. Talent. Teamwork.", "Global leader in IT services", 
            "4.2/5", "ISO 9001", "Global Giant", p1);
        c1.getCompanyDetails();

        Project p2 = new Project(102, "Banking Portal", "Finance", "Java, Angular", 35, 18, 750000.0,
            "Active", "Priya Sharma", "2025-02-01", "2026-08-01", "Critical", "Enterprise",
            "Web", "HDFC Bank", "Mumbai", "Web Application", "Waterfall", "v1.5", "Finance");
        Company c2 = new Company(2, "Infosys", "Bengaluru", "Salil Parekh",
            1981, 250000, 16500.0, "IT Services", "www.infosys.com", "INFY.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Innovate. Transform. Excel.", "Building tomorrow's enterprise", 
            "4.1/5", "CMMI Level 5", "Global Leader", p2);
        c2.getCompanyDetails();

        Project p3 = new Project(103, "Healthcare App", "Healthcare", "Python, Flutter", 20, 10, 350000.0,
            "Testing", "Amit Patel", "2025-03-10", "2026-01-10", "Medium", "Mobile App",
            "iOS & Android", "Apollo Hospitals", "Chennai", "Hybrid App", "Agile", "v1.0", "Healthcare");
        Company c3 = new Company(3, "Wipro", "Bengaluru", "Srinivas Pallia",
            1945, 230000, 10500.0, "IT Services", "www.wipro.com", "WIPRO.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Applying Thought.", "Spirit of winning together", 
            "3.9/5", "ISO 9001", "Multinational", p3);
        c3.getCompanyDetails();

        Project p4 = new Project(104, "Cloud Migration", "Cloud", "AWS, Java", 40, 24, 1200000.0,
            "Planning", "Neha Gupta", "2025-04-01", "2027-04-01", "High", "Infrastructure",
            "AWS Cloud", "ICICI Bank", "Mumbai", "Cloud Native", "DevOps", "v3.2", "Cloud");
        Company c4 = new Company(4, "HCL Technologies", "Noida", "C Vijayakumar",
            1976, 220000, 13000.0, "IT Services", "www.hcltech.com", "HCLTECH.NS",
            "Active", "Public Limited", "Noida", "India", "Technology",
            "Tomorrow. Together.", "Future-proofing businesses", 
            "4.0/5", "ISO 27001", "Global Enterprise", p4);
        c4.getCompanyDetails();

        Project p5 = new Project(105, "AI Chatbot", "AI/ML", "Python, TensorFlow", 15, 8, 280000.0,
            "Development", "Rajesh Iyer", "2025-05-15", "2025-12-15", "Medium", "AI Solution",
            "Web API", "Reliance Jio", "Navi Mumbai", "AI Service", "Agile", "v2.0", "AI");
        Company c5 = new Company(5, "Tech Mahindra", "Pune", "Mohit Joshi",
            1986, 145000, 6200.0, "IT Services", "www.techmahindra.com", "TECHM.NS",
            "Active", "Public Limited", "Pune", "India", "Technology",
            "FutureFit.", "Transforming at speed", 
            "3.8/5", "SEI CMMI Level 5", "Global Player", p5);
        c5.getCompanyDetails();

        Project p6 = new Project(106, "ERP Implementation", "Enterprise", "SAP, Java", 50, 36, 2500000.0,
            "Active", "Sunita Reddy", "2024-11-01", "2027-11-01", "Critical", "ERP System",
            "SAP S/4HANA", "Tata Steel", "Jamshedpur", "Enterprise Solution", "Waterfall", "v2025", "Manufacturing");
        Company c6 = new Company(6, "LTIMindtree", "Bengaluru", "Debashis Chatterjee",
            1997, 82000, 4200.0, "IT Services", "www.ltimindtree.com", "LTIM.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Growth. Simplified.", "Digital transformation partner", 
            "4.3/5", "ISO 20000", "Fast Growing", p6);
        c6.getCompanyDetails();

        Project p7 = new Project(107, "Logistics Platform", "Logistics", "Node.js, MongoDB", 30, 15, 650000.0,
            "Active", "Vikram Singh", "2025-06-01", "2026-09-01", "High", "SaaS Platform",
            "Cloud", "Blue Dart", "Bengaluru", "Microservices", "Agile", "v1.8", "Logistics");
        Company c7 = new Company(7, "Mphasis", "Bengaluru", "Mukund Raj",
            1998, 30000, 1700.0, "IT Services", "www.mphasis.com", "MPHASIS.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Unlocking value.", "Digital risk guardian", 
            "3.7/5", "ISO 9001", "Mid-sized", p7);
        c7.getCompanyDetails();

        Project p8 = new Project(108, "Digital Marketing Tool", "Marketing", "React, Python", 18, 9, 420000.0,
            "Testing", "Anjali Menon", "2025-07-10", "2026-04-10", "Medium", "Marketing Automation",
            "Web", "Flipkart", "Bengaluru", "SaaS", "Agile", "v3.0", "Marketing");
        Company c8 = new Company(8, "Cognizant", "Chennai", "Ravi Kumar S",
            1994, 350000, 19300.0, "IT Services", "www.cognizant.com", "CTSH",
            "Active", "Public Limited", "Chennai", "India", "Technology",
            "Everything Digital.", "Future of work", 
            "3.9/5", "CMMI Level 5", "Global Giant", p8);
        c8.getCompanyDetails();

        Project p9 = new Project(109, "Inventory Management", "Retail", ".NET, SQL Server", 22, 11, 380000.0,
            "Development", "Karthik Nair", "2025-08-01", "2026-07-01", "Medium", "Enterprise App",
            "Desktop", "Reliance Retail", "Mumbai", "Windows App", "Waterfall", "v2.5", "Retail");
        Company c9 = new Company(9, "L&T Technology Services", "Vadodara", "Amit Chadha",
            2012, 24000, 1000.0, "Engineering Services", "www.ltts.com", "LTTS.NS",
            "Active", "Public Limited", "Vadodara", "India", "Engineering",
            "Engineers of Choice.", "Tomorrow's experiences", 
            "4.1/5", "ISO 9001", "Engineering Leader", p9);
        c9.getCompanyDetails();

        Project p10 = new Project(110, "Cybersecurity Platform", "Security", "Python, AWS", 28, 14, 850000.0,
            "Planning", "Deepa Mohan", "2025-09-15", "2026-11-15", "High", "Security Solution",
            "Cloud", "Infosec India", "Hyderabad", "Cloud Security", "DevSecOps", "v4.1", "Cybersecurity");
        Company c10 = new Company(10, "Mindtree", "Bengaluru", "Debashis Chatterjee",
            1999, 24000, 1100.0, "IT Services", "www.mindtree.com", "LTIM.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Welcome Change.", "Possibilities reimagined", 
            "4.2/5", "SEI CMMI Level 5", "Premium Services", p10);
        c10.getCompanyDetails();

        Project p11 = new Project(111, "EdTech Platform", "Education", "React Native, Node.js", 16, 7, 320000.0,
            "Active", "Suresh Babu", "2025-10-01", "2026-05-01", "Medium", "Learning Platform",
            "Mobile", "BYJU'S", "Bengaluru", "Mobile Learning", "Agile", "v3.5", "EdTech");
        Company c11 = new Company(11, "Zensar Technologies", "Pune", "Sandeep Gopalan",
            1991, 9500, 700.0, "IT Services", "www.zensar.com", "ZENSARTECH.NS",
            "Active", "Public Limited", "Pune", "India", "Technology",
            "Do. Beautifully.", "Experience engineering", 
            "3.8/5", "ISO 27001", "Midcap IT", p11);
        c11.getCompanyDetails();

        Project p12 = new Project(112, "Supply Chain Management", "Logistics", "SAP, Java", 45, 30, 1800000.0,
            "Active", "Meera Nair", "2025-11-01", "2028-05-01", "Critical", "Supply Chain",
            "SAP Cloud", "Aditya Birla", "Mumbai", "Enterprise ERP", "Waterfall", "v2026", "Supply Chain");
        Company c12 = new Company(12, "Hexaware Technologies", "Mumbai", "R Srikrishna",
            1990, 25000, 1100.0, "IT Services", "www.hexaware.com", "HEXAWARE.NS",
            "Active", "Public Limited", "Mumbai", "India", "Technology",
            "Grow. Transcend. Together.", "Business reinvention", 
            "4.0/5", "ISO 9001", "Digital Transformation", p12);
        c12.getCompanyDetails();

        Project p13 = new Project(113, "Telecom Billing", "Telecom", "Oracle, Java", 38, 20, 950000.0,
            "Testing", "Prakash Rao", "2026-01-01", "2027-09-01", "High", "Billing System",
            "Cloud", "Airtel", "Gurgaon", "Microservices", "Agile", "v5.2", "Telecom");
        Company c13 = new Company(13, "NIIT Technologies", "Noida", "Kiran Cherukuri",
            1981, 10000, 500.0, "IT Services", "www.niit-tech.com", "COFORGE.NS",
            "Active", "Public Limited", "Noida", "India", "Technology",
            "Intelligent. Digital.", "Digital transformation services", 
            "3.9/5", "CMMI Level 5", "Digital Services", p13);
        c13.getCompanyDetails();

        Project p14 = new Project(114, "HR Management System", "HR", ".NET Core, Angular", 24, 12, 520000.0,
            "Development", "Lakshmi Devi", "2026-02-15", "2027-02-15", "Medium", "HR Tech",
            "Web Portal", "Tata Group", "Mumbai", "SaaS", "Agile", "v2.8", "HR");
        Company c14 = new Company(14, "Syntel", "Mumbai", "Rakesh Kumar",
            1980, 20000, 1200.0, "IT Services", "www.syntelinc.com", "ATOS.NS",
            "Active", "Public Limited", "Mumbai", "India", "Technology",
            "Business. Transformed.", "Digital business services", 
            "3.7/5", "ISO 20000", "Enterprise Services", p14);
        c14.getCompanyDetails();

        Project p15 = new Project(115, "Gaming Platform", "Gaming", "Unity, C#", 32, 16, 720000.0,
            "Active", "Arjun Reddy", "2026-03-01", "2027-07-01", "High", "Game Development",
            "Mobile & PC", "Dream11", "Bengaluru", "Cross Platform", "Agile", "v4.0", "Gaming");
        Company c15 = new Company(15, "KPIT Technologies", "Pune", "Kishor Patil",
            1990, 12000, 400.0, "Engineering Services", "www.kpit.com", "KPITTECH.NS",
            "Active", "Public Limited", "Pune", "India", "Automotive",
            "Innovate. Partner. Perform.", "Software-defined vehicles", 
            "4.1/5", "ISO 26262", "Auto Tech Leader", p15);
        c15.getCompanyDetails();

        Project p16 = new Project(116, "Smart City Solution", "Smart City", "IoT, Java", 55, 48, 3500000.0,
            "Planning", "Nisha Kamath", "2025-12-01", "2029-12-01", "Critical", "Smart City",
            "IoT Platform", "Smart City Mission", "Pune", "IoT Solution", "Waterfall", "v1.0", "Smart City");
        Company c16 = new Company(16, "Tata Elxsi", "Bengaluru", "Manoj Das",
            1989, 12000, 800.0, "Design Services", "www.tataelxsi.com", "TATAELXSI.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Design",
            "Engineered for imagination.", "Tomorrow moves us", 
            "4.3/5", "ISO 9001", "Design Innovation", p16);
        c16.getCompanyDetails();

        Project p17 = new Project(117, "Fintech Wallet", "Fintech", "React, Node.js", 26, 13, 680000.0,
            "Active", "Vijay Kumar", "2026-04-01", "2027-05-01", "High", "Digital Wallet",
            "Mobile", "Paytm", "Noida", "Fintech App", "Agile", "v3.1", "Fintech");
        Company c17 = new Company(17, "Sonata Software", "Bengaluru", "Samir Desai",
            1986, 6000, 300.0, "IT Services", "www.sonata-software.com", "SONATSOFTW.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Simply. Better. Software.", "Digital transformation", 
            "3.8/5", "ISO 27001", "Microsoft Partner", p17);
        c17.getCompanyDetails();

        Project p18 = new Project(118, "E-Learning Portal", "Education", "LMS, PHP", 19, 10, 450000.0,
            "Testing", "Pooja Sharma", "2026-05-15", "2027-03-15", "Medium", "Learning Portal",
            "Web", "Unacademy", "Bengaluru", "Web LMS", "Agile", "v2.2", "EdTech");
        Company c18 = new Company(18, "Happiest Minds", "Bengaluru", "Joseph Anantharaju",
            2011, 7000, 400.0, "IT Services", "www.happiestminds.com", "HAPPSTMNDS.NS",
            "Active", "Public Limited", "Bengaluru", "India", "Technology",
            "Delight every moment.", "User experience first", 
            "4.2/5", "ISO 9001", "Digital Engineering", p18);
        c18.getCompanyDetails();

        Project p19 = new Project(119, "Data Analytics Platform", "Analytics", "Python, Tableau", 27, 14, 780000.0,
            "Development", "Rohit Jain", "2026-06-01", "2027-08-01", "High", "Analytics Platform",
            "Cloud BI", "Mu Sigma", "Bengaluru", "Data Science", "Agile", "v1.9", "Analytics");
        Company c19 = new Company(19, "Cyient", "Hyderabad", "K. Lakshman",
            1991, 15000, 700.0, "Engineering Services", "www.cyient.com", "CYIENT.NS",
            "Active", "Public Limited", "Hyderabad", "India", "Engineering",
            "Engineering. Redefined.", "Tomorrow. Together.", 
            "3.9/5", "AS9100", "ER&D Leader", p19);
        c19.getCompanyDetails();

        Project p20 = new Project(120, "Blockchain Supply Chain", "Blockchain", "Hyperledger, Node.js", 33, 18, 1100000.0,
            "Planning", "Anita Desai", "2026-07-01", "2028-01-01", "High", "Blockchain Solution",
            "Enterprise Blockchain", "Mahindra Logistics", "Mumbai", "DApp", "Agile", "v2.0", "Blockchain");
        Company c20 = new Company(20, "Mastek", "Mumbai", "Ashank Desai",
            1982, 6000, 350.0, "IT Services", "www.mastek.com", "MASTEK.NS",
            "Active", "Public Limited", "Mumbai", "India", "Technology",
            "Accelerate. Digital. Transformation.", "Enterprise digital transformation", 
            "4.0/5", "ISO 20000", "Digital Services", p20);
        c20.getCompanyDetails();
    }
}
