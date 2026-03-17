class LinkedInExecutor {
    public static void main(String[] args) {
        System.out.println("=== LINKEDIN APPS & ASSOCIATED PROFILES ===\n");

        Profile p1 = new Profile(101, "Nilav", "Software Engineering Student", "Student",
                               "Learner", 1, "Bangalore", "CSE", "Java, SQL",
                               "nilav@gmail.com", "987654321", "github.com", 500,
                               "Software", "English", "Java Certification", "Web Traffic Analysis App",
                               "Open to Work", "Student", "Passionate about Software Development");

        Profile p2 = new Profile(102, "Meghana M", "Final Year CSE Student | Campus Placements 2026", "Student",
                               "Software Engineering Aspirant", 0, "Tumkūr, Karnataka", "B.E. Computer Science",
                               "Java, JavaScript, C#, Python, DSA", "meghana@gmail.com", "8881234567",
                               "github.com/meghanam", 250, "Information Technology",
                               "English, Kannada, Hindi", "HackerRank Java, SQL", "ProductionHouse Management System",
                               "Open to Work", "Student", "Final-year CSE student preparing for TCS, Cognizant placements");

        Profile p3 = new Profile(103, "Ravi Kumar", "Full Stack Developer | TCS", "Tata Consultancy Services",
                               "Software Engineer", 3, "Bangalore", "B.Tech CSE", "Java, Spring Boot, React, AWS",
                               "ravi.tcs@gmail.com", "987654322", "linkedin.com/in/ravikumartcs", 1200,
                               "IT Services", "English, Hindi", "AWS Certified Developer", "Enterprise Banking Portal",
                               "Actively Hiring", "Professional", "Building scalable web applications at TCS");

        Profile p4 = new Profile(104, "Priya Sharma", "Technical Recruiter | Cognizant", "Cognizant Technology Solutions",
                               "Senior Recruiter", 5, "Chennai", "MBA HR", "Technical Recruitment, Campus Hiring",
                               "priya@cognizant.com", "984567890", "linkedin.com/in/priyasharmarecruiter", 3000,
                               "IT Services", "English, Tamil", "SHRM Certified", "Campus Placement Drives",
                               "Hiring Freshers", "Recruiter", "Hiring CSE freshers for Cognizant GenC roles");

        Profile p5 = new Profile(105, "Arjun Patel", "Account Executive | Toshiba Software", "Toshiba Software India",
                               "Sales Manager", 7, "Hyderabad", "B.Tech + MBA", "B2B Sales, Enterprise Software",
                               "arjun@toshiba.com", "995677890", "linkedin.com/in/arjunpatelsales", 2500,
                               "Enterprise Software", "English, Telugu", "Salesforce Certified", "Enterprise Deal Pipeline",
                               "Open to Connect", "Sales Professional", "Closing enterprise software deals for Toshiba");

        Profile p6 = new Profile(106, "Sanjay Reddy", "Campus Recruitment Lead | iNube", "iNube Software Solutions",
                               "Talent Acquisition Head", 4, "Bangalore", "MCA", "Campus Recruitment, Tech Hiring",
                               "sanjay@inube.com", "9901234567", "linkedin.com/in/sanjayreddyrecruiter", 1800,
                               "InsurTech", "English, Kannada", "LinkedIn Recruiter Certified", "iNube Campus Hiring Program",
                               "Hiring Now", "Recruiter", "Leading campus placements for iNube");

        Profile p7 = new Profile(107, "Aishwarya N", "CSE Graduate | Open to Opportunities", "Freelancer",
                               "Full Stack Developer", 1, "Tumkūr", "B.E. Computer Science", "React, Node.js, MongoDB",
                               "aishwarya.n@gmail.com", "876543210", "github.com/aishwaryan", 350,
                               "Software Development", "English, Kannada", "MongoDB Developer", "E-commerce Full Stack App",
                               "Actively Looking", "Fresh Graduate", "Full stack developer seeking first full-time role");

        Profile p8 = new Profile(108, "Vikram Singh", "Technical Lead | Xworkz Technologies", "Xworkz Technologies",
                               "Tech Lead", 6, "Bangalore", "M.Tech", "Java, Microservices, Docker",
                               "vikram@xworkz.com", "934567890", "linkedin.com/in/vikramsinghtl", 2200,
                               "EdTech", "English, Hindi", "Docker Certified", "Online Coding Platform",
                               "Open to Mentor", "Tech Lead", "Leading Java development team at Xworkz");

        Profile p9 = new Profile(109, "Deepa Rani", "Data Science Student | Dhee Code Lab", "Dhee Code Lab",
                               "Data Science Intern", 0, "Hyderabad", "B.Tech CSE", "Python, Pandas, Machine Learning",
                               "deepa@dheecode.com", "901234567", "linkedin.com/in/deeparanids", 180,
                               "Data Science", "English, Telugu", "Google Data Analytics", "Healthcare AI Model",
                               "Learning & Networking", "Student", "Data Science enthusiast exploring ML applications");

        Profile p10 = new Profile(110, "Karthik M", "Tech Content Writer | Medium", "Freelance Writer",
                                "Technical Blogger", 2, "Chennai", "B.E. IT", "Technical Writing, DSA, System Design",
                                "karthik@techwriter.in", "944567890", "medium.com/@karthiktech", 800,
                                "Content Creation", "English, Tamil", "Google Technical Writing", "System Design Articles",
                                "Open to Collaborate", "Content Creator", "Writing about DSA, System Design & Placements");

        Profile p11 = new Profile(111, "Rahul V", "Data Analyst | TCS Analytics Team", "Tata Consultancy Services",
                                "Data Analyst", 2, "Bangalore", "M.Sc. Data Science", "Python, Tableau, SQL, Power BI",
                                "rahul.v@tcs.com", "9988776655", "linkedin.com/in/rahulvdata", 950,
                                "Analytics", "English, Kannada", "Tableau Desktop Specialist", "Customer Analytics Dashboard",
                                "Open to Opportunities", "Analyst", "Building data visualizations for enterprise clients");

        Profile p12 = new Profile(112, "Neha Gupta", "Digital Marketing | Cognizant Digital", "Cognizant Digital Business",
                                "Marketing Manager", 4, "Mumbai", "MBA Marketing", "LinkedIn Ads, Google Ads, SEO",
                                "neha.gupta@cognizant.com", "9876543321", "linkedin.com/in/nehaguptamarketing", 1500,
                                "Digital Marketing", "English, Hindi", "Google Analytics Certified", "B2B Lead Generation Campaigns",
                                "Actively Hiring", "Marketer", "Running LinkedIn ad campaigns for IT services");

        Profile p13 = new Profile(113, "Anand Raj", "Community Manager | Toshiba India", "Toshiba Software India",
                                "Social Media Manager", 3, "Hyderabad", "BA Journalism", "Content Strategy, Community Building",
                                "anand.raj@toshiba.com", "9244667788", "linkedin.com/in/anandrajcm", 1100,
                                "Social Media", "English, Telugu", "Hootsuite Certified", "Toshiba India LinkedIn Presence",
                                "Open to Connect", "Community Manager", "Managing Toshiba India LinkedIn showcase pages");

        Profile p14 = new Profile(114, "Pooja K", "Alumni Coordinator | VTU Alumni", "Visvesvaraya Technological University",
                                "Alumni Relations", 2, "Belagavi", "B.E. CSE VTU", "Alumni Networking, Event Management",
                                "pooja.k@vtu.ac.in", "8333998877", "linkedin.com/in/poojakvtualumni", 600,
                                "Education", "English, Kannada", "LinkedIn Alumni Tool", "VTU CSE Alumni Network",
                                "Building Network", "Alumni Coordinator", "Connecting VTU CSE alumni through LinkedIn");

        Profile p15 = new Profile(115, "Suresh M", "Content Strategist | iNube Marketing", "iNube Software Solutions",
                                "Digital Content Creator", 1, "Bangalore", "B.Com", "LinkedIn Stories, Video Editing",
                                "suresh@inube.com", "7979797979", "linkedin.com/in/sureshinube", 420,
                                "Digital Content", "English, Kannada", "Canva Design School", "iNube LinkedIn Stories Series",
                                "Content Creator", "Content Strategist", "Creating engaging LinkedIn Stories for iNube");

        Profile p16 = new Profile(116, "Lakshmi P", "Tech Evangelist | Xworkz Technologies", "Xworkz Technologies",
                                "Technical Evangelist", 3, "Bangalore", "M.Tech CSE", "Public Speaking, Live Streaming",
                                "lakshmi@xworkz.com", "9944556677", "linkedin.com/in/lakshmiptech", 1300,
                                "EdTech", "English, Kannada", "LinkedIn Live Certified", "Weekly Tech Live Sessions",
                                "Live Streaming", "Tech Evangelist", "Hosting live coding sessions on LinkedIn Live");

        Profile p17 = new Profile(117, "Manoj Kumar", "DSA Newsletter | 5K+ Subscribers", "Freelance Writer",
                                "Newsletter Author", 1, "Tumkūr", "B.E. CSE", "Technical Writing, DSA",
                                "manoj.dsa@gmail.com", "7890123456", "linkedin.com/in/manojdsanews", 750,
                                "Content Creation", "English", "Newsletter Creator", "Daily DSA Problems Newsletter",
                                "Writing Weekly", "Newsletter Writer", "Curating daily DSA problems for placements");

        Profile p18 = new Profile(118, "Geetha R", "Clubhouse Host | Dhee Code Lab", "Dhee Code Lab",
                                "Audio Event Host", 1, "Hyderabad", "MCA", "Audio Hosting, Tech Discussions",
                                "geetha@dheecode.com", "9123456789", "linkedin.com/in/geethaaudio", 380,
                                "EdTech", "English, Telugu", "LinkedIn Audio Events", "Weekly Coding Clubhouse",
                                "Hosting Live", "Audio Host", "Hosting tech discussions on LinkedIn Audio Events");

        Profile p19 = new Profile(119, "Vijayalakshmi S", "Top Voice India | Placement Guru", "Independent Coach",
                                "Career Coach", 8, "Bangalore", "MBA HR", "Career Coaching, Interview Prep",
                                "viji.coach@gmail.com", "9444556677", "linkedin.com/in/vijiplacementguru", 5000,
                                "Career Coaching", "English, Kannada, Hindi", "LinkedIn Top Voice 2025", "Placement Success Stories",
                                "Top Voice", "Influencer", "LinkedIn Top Voice helping students crack placements");

        Profile p20 = new Profile(120, "Arunesh K", "LinkedIn API Developer | Tap", "Tap",
                                "API Integration Specialist", 2, "Bangalore", "B.Tech CSE", "LinkedIn API, OAuth, REST APIs",
                                "arunesh@tap.com", "9998887776", "linkedin.com/in/aruneshapi", 650,
                                "API Development", "English", "LinkedIn API Certified", "LinkedIn Integration for Tap",
                                "Open to API Projects", "Developer", "Building LinkedIn API integrations for enterprise apps");

        LinkedIn l1 = new LinkedIn(1, "LinkedIn", "Microsoft", "Reid Hoffman", 2003, "California", 900000000,
                                 "Web & Mobile", "Professional Network", "linkedin.com", "support@linkedin.com",
                                 "123456789", "High", "Subscription", "10.0", "Blue", "24/7", "Active", "USA", "Multi-language", p1);

        LinkedIn l2 = new LinkedIn(2, "LinkedIn Premium", "Microsoft", "Reid Hoffman", 2003, "Sunnyvale, California", 900000000,
                                 "Web & Mobile", "Professional Network", "linkedin.com/premium", "premium@linkedin.com",
                                 "223456789", "Very High", "Premium Subscription", "10.1", "Royal Blue", "Priority 24/7", "Active", "USA", "Multi-language", p2);

        LinkedIn l3 = new LinkedIn(3, "LinkedIn Learning", "Microsoft", "Reid Hoffman", 2016, "Sunnyvale, California", 900000000,
                                 "Web & Mobile", "Professional Learning", "linkedin.com/learning", "learning@linkedin.com",
                                 "323456789", "High", "Subscription", "9.5", "Teal", "24/7", "Active", "USA", "Multi-language", p3);

        LinkedIn l4 = new LinkedIn(4, "LinkedIn Recruiter", "Microsoft", "Reid Hoffman", 2008, "Sunnyvale, California", 900000000,
                                 "Web", "Talent Acquisition", "linkedin.com/recruiter", "recruiter@linkedin.com",
                                 "423456789", "Enterprise High", "Enterprise License", "11.0", "Enterprise Blue", "Dedicated Account Manager", "Active", "USA", "Multi-language", p4);

        LinkedIn l5 = new LinkedIn(5, "Sales Navigator", "Microsoft", "Reid Hoffman", 2014, "Sunnyvale, California", 900000000,
                                 "Web & Mobile", "Sales CRM", "linkedin.com/sales", "sales@linkedin.com",
                                 "523456789", "High", "Sales Subscription", "8.2", "Gold Blue", "Priority Support", "Active", "USA", "Multi-language", p5);

        LinkedIn l6 = new LinkedIn(6, "LinkedIn Events", "Microsoft", "Reid Hoffman", 2019, "Sunnyvale, California", 900000000,
                                 "Web & Mobile", "Networking Events", "linkedin.com/events", "events@linkedin.com",
                                 "623456789", "High", "Event Tickets", "3.1", "Event Purple", "Event Support", "Active", "USA", "Multi-language", p6);

        LinkedIn l7 = new LinkedIn(7, "LinkedIn Jobs", "Microsoft", "Reid Hoffman", 2011, "Sunnyvale, California", 900000000,
                                 "Web & Mobile", "Job Search", "linkedin.com/jobs", "jobs@linkedin.com",
                                 "723456789", "High", "Job Postings", "7.8", "Career Green", "24/7", "Active", "USA", "Multi-language", p7);

        LinkedIn l8 = new LinkedIn(8, "LinkedIn Messaging", "Microsoft", "Reid Hoffman", 2006, "Sunnyvale, California", 900000000,
                                 "Mobile", "Professional Messaging", "linkedin.com/messaging", "messaging@linkedin.com",
                                 "823456789", "Encrypted", "Premium Features", "5.2", "Chat Blue", "In-app", "Active", "USA", "Multi-language", p8);

        LinkedIn l9 = new LinkedIn(9, "LinkedIn Groups", "Microsoft", "Reid Hoffman", 2007, "Sunnyvale, California", 900000000,
                                 "Web & Mobile", "Professional Communities", "linkedin.com/groups", "groups@linkedin.com",
                                 "923456789", "High", "Free", "4.5", "Community Orange", "Community Moderators", "Active", "USA", "Multi-language", p9);

        LinkedIn 10 = new LinkedIn(10, "LinkedIn Pulse", "Microsoft", "Reid Hoffman", 2012, "Sunnyvale, California", 900000000,
                                  "Web & Mobile", "Content Publishing", "linkedin.com/pulse", "pulse@linkedin.com",
                                  "102345678", "High", "Free", "6.0", "Content Grey", "Editorial Team", "Active", "USA", "Multi-language", p10);

        LinkedIn 11 = new LinkedIn(11, "LinkedIn Analytics", "Microsoft", "Reid Hoffman", 2015, "Sunnyvale, California", 900000000,
                                  "Web Dashboard", "Performance Analytics", "linkedin.com/analytics", "analytics@linkedin.com",
                                  "112345678", "High", "Premium", "4.2", "Data Blue", "Analytics Support", "Active", "USA", "Multi-language", p11);

        LinkedIn l2 = new LinkedIn(12, "LinkedIn Ads", "Microsoft", "Reid Hoffman", 2008, "Sunnyvale, California", 900000000,
                                  "Web & Mobile", "Advertising Platform", "linkedin.com/ads", "ads@linkedin.com",
                                  "122345678", "High", "CPC/CPM", "9.8", "Ad Green", "Ad Support", "Active", "USA", "Multi-language", p12);

        LinkedIn 13 = new LinkedIn(13, "LinkedIn Showcase", "Microsoft", "Reid Hoffman", 2013, "Sunnyvale, California", 900000000,
                                  "Web Pages", "Brand Pages", "linkedin.com/showcase", "showcase@linkedin.com",
                                  "132345678", "High", "Premium", "3.5", "Brand Colors", "Brand Support", "Active", "USA", "Multi-language", p13);

        LinkedIn 14 = new LinkedIn(14, "LinkedIn Alumni", "Microsoft", "Reid Hoffman", 2014, "Sunnyvale, California", 900000000,
                                  "Web Tool", "Networking Tool", "linkedin.com/alumni", "alumni@linkedin.com",
                                  "142345678", "High", "Free", "2.8", "Alumni Gold", "Basic Support", "Active", "USA", "Multi-language", p14);

        LinkedIn l5 = new LinkedIn(15, "LinkedIn Stories", "Microsoft", "Reid Hoffman", 2017, "Sunnyvale, California", 900000000,
                                  "Mobile", "Short-form Content", "linkedin.com/stories", "stories@linkedin.com",
                                  "152345678", "High", "Free", "1.9", "Story Gradient", "In-app", "Active", "USA", "Multi-language", p15);

        LinkedIn l6 = new LinkedIn(16, "LinkedIn Live", "Microsoft", "Reid Hoffman", 2019, "Sunnyvale, California", 900000000,
                                  "Web & Mobile", "Live Streaming", "linkedin.com/live", "live@linkedin.com",
                                  "162345678", "High", "Event Tickets", "2.3", "Live Red", "Live Support", "Active", "USA", "Multi-language", p16);

        LinkedIn l7 = new LinkedIn(17, "LinkedIn Newsletters", "Microsoft", "Reid Hoffman", 2017, "Sunnyvale, California", 900000000,
                                  "Web & Mobile", "Email Newsletter", "linkedin.com/newsletters", "newsletters@linkedin.com",
                                  "172345678", "High", "Free", "3.1", "Newsletter Teal", "Creator Support", "Active", "USA", "Multi-language", p17);

        LinkedIn l8 = new LinkedIn(18, "LinkedIn Audio Events", "Microsoft", "Reid Hoffman", 2021, "Sunnyvale, California", 900000000,
                                  "Mobile", "Audio Events", "linkedin.com/audio-events", "audio@linkedin.com",
                                  "182345678", "High", "Free", "1.4", "Audio Purple", "Event Support", "Active", "USA", "Multi-language", p18);

        LinkedIn l9 = new LinkedIn(19, "LinkedIn Top Voices", "Microsoft", "Reid Hoffman", 2015, "Sunnyvale, California", 900000000,
                                  "Web Recognition", "Influencer Program", "linkedin.com/topvoices", "topvoices@linkedin.com",
                                  "192345678", "High", "Recognition", "2.0", "VIP Gold", "VIP Support", "Active", "USA", "Multi-language", p19);

        LinkedIn 20 = new LinkedIn(20, "LinkedIn Developer", "Microsoft", "Reid Hoffman", 2015, "Sunnyvale, California", 900000000,
                                  "API Platform", "Developer Platform", "developer.linkedin.com", "developers@linkedin.com",
                                  "202345678", "API Security", "API Credits", "5.1", "Dev Black", "Developer Support", "Active", "USA", "Multi-language", p20);

        l1.getLinkedInDetails();
        l2.getLinkedInDetails();
        l3.getLinkedInDetails();
        l4.getLinkedInDetails();
        l5.getLinkedInDetails();
        l6.getLinkedInDetails();
        l7.getLinkedInDetails();
        l8.getLinkedInDetails();
        l9.getLinkedInDetails();
        l10.getLinkedInDetails();
        l11.getLinkedInDetails();
        l12.getLinkedInDetails();
        l13.getLinkedInDetails();
        l14.getLinkedInDetails();
        l15.getLinkedInDetails();
        l16.getLinkedInDetails();
        l17.getLinkedInDetails();
        l18.getLinkedInDetails();
        l19.getLinkedInDetails();
        l20.getLinkedInDetails();

        System.out.println("\n=== END OF LINKEDIN APPS & PROFILES ANALYSIS ===");
        System.out.println("Total LinkedIn Apps: 20 | Total Profiles: 20");
    }
}