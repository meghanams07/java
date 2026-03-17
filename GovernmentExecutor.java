class GovernmentExecutor {
    public static void main(String[] args) {
	
        Policy p1 = new Policy(101, "Digital India", "IT Ministry", "Technology", "2015", "Citizens",
                "Digital Transformation", "Online Services", "All Citizens", "Nationwide",
                "Government Program", "₹1 Lakh Crore", "10 Years", "Ongoing", "digitalindia.gov.in",
                "1800-111-555", "English", "Cabinet", "Improved Digital Access", "Promotes digital infrastructure");

        Policy p2 = new Policy(102, "Affordable Care Act", "Health Department", "Healthcare", "2010", "Citizens",
                "Healthcare Access", "Insurance Coverage", "All Citizens", "Nationwide", "Legislation",
                "$1 Trillion", "Ongoing", "Active", "healthcare.gov", "1-800-318-2596", "English",
                "Congress", "Universal Healthcare", "Healthcare reform program");

        Policy p3 = new Policy(103, "NHS", "Health Department", "Healthcare", "1948", "Residents",
                "Free Healthcare", "Universal Treatment", "All Residents", "Nationwide", "Public Service",
                "£180 Billion", "Ongoing", "Active", "nhs.uk", "111", "English", "Parliament",
                "Free Healthcare", "National Health Service");

        Policy p4 = new Policy(104, "Energiewende", "Energy Ministry", "Energy", "2010", "Citizens",
                "Renewable Energy", "Clean Energy", "All Citizens", "Nationwide", "Energy Policy",
                "€500 Billion", "Ongoing", "Active", "bundesregierung.de", "030-4000", "German",
                "Bundestag", "Green Energy", "Energy transition program");

        Policy p5 = new Policy(105, "Macron Plan", "Economy Ministry", "Economy", "2017", "Businesses",
                "Economic Reform", "Tax Cuts", "Companies", "Nationwide", "Reform Package",
                "€75 Billion", "5 Years", "Ongoing", "economie.gouv.fr", "01-53-18-40-00", "French",
                "Parliament", "Business Growth", "Economic transformation plan");

        Policy p6 = new Policy(106, "Society 5.0", "Cabinet Office", "Technology", "2016", "Citizens",
                "Digital Society", "Smart Cities", "All Citizens", "Nationwide", "National Strategy",
                "¥100 Trillion", "10 Years", "Ongoing", "japan.go.jp", "03-3581-1100", "Japanese",
                "Cabinet", "Digital Transformation", "Super smart society initiative");

        Policy p7 = new Policy(107, "Canada Child Benefit", "Finance Ministry", "Social Welfare", "2016", "Families",
                "Child Support", "Monthly Payments", "Parents", "Nationwide", "Benefit Program",
                "$24 Billion", "Ongoing", "Active", "canada.ca", "1-800-387-1193", "English & French",
                "Parliament", "Family Support", "Child benefit program");

        Policy p8 = new Policy(108, "NDIS", "Social Services", "Disability", "2013", "Disabled",
                "Disability Support", "Personalized Care", "Disabled Citizens", "Nationwide", "Insurance Scheme",
                "$40 Billion", "Ongoing", "Active", "ndis.gov.au", "1800-800-110", "English",
                "Parliament", "Disability Rights", "National Disability Insurance");

        Policy p9 = new Policy(109, "Bolsa Família", "Social Development", "Social Welfare", "2003", "Poor Families",
                "Poverty Reduction", "Cash Transfers", "Low Income", "Nationwide", "Conditional Cash",
                "R$150 Billion", "Ongoing", "Active", "gov.br", "121", "Portuguese", "Congress",
                "Poverty Alleviation", "Family grant program");

        Policy p10 = new Policy(110, "National Projects", "Presidential Administration", "Development", "2018", "Citizens",
                "National Development", "Infrastructure", "All Citizens", "Nationwide", "Mega Projects",
                "25 Trillion Rubles", "6 Years", "Ongoing", "nationalprojects.ru", "8-800-200-23-02", "Russian",
                "President", "Modernization", "12 national development projects");

        Policy p11 = new Policy(111, "Belt and Road", "State Council", "Infrastructure", "2013", "Global Partners",
                "Trade Connectivity", "Infrastructure Projects", "Partner Countries", "Global", "International Initiative",
                "$1 Trillion", "Ongoing", "Active", "beltandroad.gov.cn", "010-12345678", "Mandarin",
                "State Council", "Global Trade", "Global infrastructure initiative");

        Policy p12 = new Policy(112, "Superbonus", "Economy Ministry", "Construction", "2020", "Homeowners",
                "Building Renovation", "110% Tax Credit", "Property Owners", "Nationwide", "Tax Incentive",
                "€200 Billion", "5 Years", "Ongoing", "governo.it", "06-67791", "Italian",
                "Parliament", "Green Buildings", "Building renovation incentive");

        Policy p13 = new Policy(113, "Next Generation EU", "Economy Ministry", "Recovery", "2021", "Businesses",
                "Economic Recovery", "Digital & Green", "Companies", "Nationwide", "Recovery Fund",
                "€140 Billion", "6 Years", "Ongoing", "lamoncloa.gob.es", "91-335-43-00", "Spanish",
                "EU Commission", "Post-COVID Recovery", "EU recovery and resilience plan");

        Policy p14 = new Policy(114, "Digital New Deal", "Science Ministry", "Digital Economy", "2019", "Citizens",
                "Digital Transformation", "AI & Data Economy", "All Citizens", "Nationwide", "National Strategy",
                "58 Trillion Won", "5 Years", "Ongoing", "korea.go.kr", "02-738-5114", "Korean",
                "President", "Digital Leadership", "Digital economy transformation");

        Policy p15 = new Policy(115, "Climate Agreement", "Infrastructure Ministry", "Climate", "2019", "Citizens",
                "Carbon Neutral", "Climate Action", "All Sectors", "Nationwide", "Climate Pact",
                "€35 Billion", "10 Years", "Ongoing", "klimaatakkoord.nl", "070-426-42-64", "Dutch",
                "Parliament", "Climate Goals", "National climate agreement");

        Policy p16 = new Policy(116, "Fossil Free Sweden", "Environment Ministry", "Environment", "2009", "Society",
                "Fossil Free", "Sustainable Energy", "All Sectors", "Nationwide", "Energy Policy",
                "SEK 100 Billion", "2050 Target", "Ongoing", "fossilfrittsverige.se", "08-405-10-00", "Swedish",
                "Government", "Green Transition", "Fossil fuel independence initiative");

        Policy p17 = new Policy(117, "Energy Strategy 2050", "Environment Office", "Energy", "2017", "Energy Sector",
                "Energy Security", "Renewable Energy", "Energy Companies", "Nationwide", "Energy Policy",
                "CHF 1 Billion", "2050", "Ongoing", "admin.ch", "058-462-11-11", "German, French, Italian",
                "Parliament", "Energy Independence", "Long-term energy strategy");

        Policy p18 = new Policy(118, "500+ Program", "Family Ministry", "Social Welfare", "2016", "Families",
                "Child Support", "Monthly Child Benefit", "Parents", "Nationwide", "Cash Benefit",
                "PLN 40 Billion", "Ongoing", "Active", "gov.pl", "22-694-20-00", "Polish",
                "Parliament", "Birth Rate Increase", "Child benefit program");

        Policy p19 = new Policy(119, "Green Deal", "Environment Ministry", "Climate", "2021", "Citizens",
                "Climate Neutral", "Sustainable Development", "All Sectors", "Nationwide", "Climate Plan",
                "€10 Billion", "2050", "Ongoing", "belgium.be", "02-513-44-11", "Dutch, French",
                "Government", "Green Economy", "Federal climate strategy");

        Policy p20 = new Policy(120, "Vision 2023", "Presidency", "Development", "2011", "Citizens",
                "Top 10 Economy", "Infrastructure Development", "All Citizens", "Nationwide", "Vision Plan",
                "1 Trillion USD", "2023", "Completed", "turkiye.gov.tr", "184", "Turkish",
                "President", "Economic Growth", "Long-term development vision");

        Government g1 = new Government(1, "Government of India", "India", "New Delhi", "Prime Minister",
                1947, 1400000000, "Indian Rupee", "Democratic", "Hindi & English", "Bicameral",
                28, 50, "india.gov.in", "011123456", "Central Government", "High",
                "Public Administration", "Active", "Governing body of India", p1);

        Government g2 = new Government(2, "Government of USA", "United States", "Washington D.C.", "President",
                1776, 331000000, "US Dollar", "Federal Republic", "English", "Bicameral",
                50, 15, "usa.gov", "202-456-1111", "Federal Government", "High", "Executive",
                "Active", "Federal government of USA", p2);

        Government g3 = new Government(3, "Government of UK", "United Kingdom", "London", "Prime Minister",
                1707, 67800000, "Pound Sterling", "Parliamentary", "English", "Bicameral",
                4, 22, "gov.uk", "0370-000-2288", "Central Government", "Medium", "Parliamentary",
                "Active", "Government of United Kingdom", p3);

        Government g4 = new Government(4, "Government of Germany", "Germany", "Berlin", "Chancellor",
                1949, 83000000, "Euro", "Federal Republic", "German", "Bicameral",
                16, 14, "bundesregierung.de", "030-4000", "Federal Government", "High", "Federal",
                "Active", "Federal government of Germany", p4);

        Government g5 = new Government(5, "Government of France", "France", "Paris", "President",
                1958, 67000000, "Euro", "Semi-Presidential", "French", "Bicameral",
                18, 16, "gouvernement.fr", "01-42-75-80-01", "Central Government", "High", "Executive",
                "Active", "Government of France", p5);

        Government g6 = new Government(6, "Government of Japan", "Japan", "Tokyo", "Prime Minister",
                1947, 125000000, "Yen", "Parliamentary", "Japanese", "Bicameral",
                47, 12, "japan.go.jp", "03-3581-1100", "Central Government", "High", "Cabinet",
                "Active", "Government of Japan", p6);

        Government g7 = new Government(7, "Government of Canada", "Canada", "Ottawa", "Prime Minister",
                1867, 38000000, "Canadian Dollar", "Parliamentary", "English & French", "Bicameral",
                10, 37, "canada.ca", "1-800-622-6232", "Federal Government", "Medium", "Federal",
                "Active", "Federal government of Canada", p7);

        Government g8 = new Government(8, "Government of Australia", "Australia", "Canberra", "Prime Minister",
                1901, 26000000, "Australian Dollar", "Parliamentary", "English", "Bicameral",
                6, 20, "australia.gov.au", "13-22-81", "Federal Government", "Medium", "Federal",
                "Active", "Federal government of Australia", p8);

        Government g9 = new Government(9, "Government of Brazil", "Brazil", "Brasília", "President",
                1988, 214000000, "Brazilian Real", "Federal Republic", "Portuguese", "Bicameral",
                26, 23, "gov.br", "0800-978-9000", "Federal Government", "Medium", "Federal",
                "Active", "Federal government of Brazil", p9);

        Government g10 = new Government(10, "Government of Russia", "Russia", "Moscow", "President",
                1993, 146000000, "Russian Ruble", "Federal Republic", "Russian", "Bicameral",
                85, 18, "government.ru", "8-800-200-23-02", "Federal Government", "High", "Federal",
                "Active", "Federal government of Russia", p10);

        Government g11 = new Government(11, "Government of China", "China", "Beijing", "Premier",
                1949, 1410000000, "Renminbi", "Socialist Republic", "Mandarin", "Unicameral",
                34, 26, "gov.cn", "010-12345678", "Central Government", "Very High", "Centralized",
                "Active", "Central government of China", p11);

        Government g12 = new Government(12, "Government of Italy", "Italy", "Rome", "Prime Minister",
                1948, 60000000, "Euro", "Parliamentary Republic", "Italian", "Bicameral",
                20, 15, "governo.it", "06-67791", "Central Government", "Medium", "Parliamentary",
                "Active", "Government of Italy", p12);

        Government g13 = new Government(13, "Government of Spain", "Spain", "Madrid", "Prime Minister",
                1978, 47000000, "Euro", "Parliamentary", "Spanish", "Bicameral",
                17, 22, "lamoncloa.gob.es", "91-335-43-00", "Central Government", "Medium", "Parliamentary",
                "Active", "Government of Spain", p13);

        Government g14 = new Government(14, "Government of South Korea", "South Korea", "Seoul", "President",
                1948, 52000000, "Won", "Presidential Republic", "Korean", "Unicameral",
                17, 18, "korea.go.kr", "02-738-5114", "Central Government", "High", "Executive",
                "Active", "Government of South Korea", p14);

        Government g15 = new Government(15, "Government of Netherlands", "Netherlands", "Amsterdam", "Prime Minister",
                1848, 17500000, "Euro", "Parliamentary", "Dutch", "Bicameral",
                12, 13, "government.nl", "070-426-42-64", "Central Government", "Medium", "Parliamentary",
                "Active", "Government of Netherlands", p15);

        Government g16 = new Government(16, "Government of Sweden", "Sweden", "Stockholm", "Prime Minister",
                1809, 10400000, "Swedish Krona", "Parliamentary", "Swedish", "Unicameral",
                21, 11, "regeringen.se", "08-405-10-00", "Central Government", "Medium", "Parliamentary",
                "Active", "Government of Sweden", p16);

        Government g17 = new Government(17, "Government of Switzerland", "Switzerland", "Bern", "Federal Council",
                1848, 8700000, "Swiss Franc", "Federal Republic", "German, French, Italian", "Bicameral",
                26, 7, "admin.ch", "058-462-11-11", "Federal Government", "High", "Federal",
                "Active", "Federal government of Switzerland", p17);

        Government g18 = new Government(18, "Government of Poland", "Poland", "Warsaw", "Prime Minister",
                1997, 38000000, "Zloty", "Parliamentary Republic", "Polish", "Bicameral",
                16, 20, "gov.pl", "22-694-20-00", "Central Government", "Medium", "Parliamentary",
                "Active", "Government of Poland", p18);

        Government g19 = new Government(19, "Government of Belgium", "Belgium", "Brussels", "Prime Minister",
                1831, 11600000, "Euro", "Federal Parliamentary", "Dutch, French, German", "Bicameral",
                3, 15, "belgium.be", "02-513-44-11", "Federal Government", "Medium", "Federal",
                "Active", "Federal government of Belgium", p19);

        Government g20 = new Government(20, "Government of Turkey", "Turkey", "Ankara", "President",
                1923, 85000000, "Turkish Lira", "Presidential Republic", "Turkish", "Unicameral",
                81, 17, "turkiye.gov.tr", "184", "Central Government", "High", "Presidential",
                "Active", "Government of Turkey", p20);

        System.out.println("GLOBAL GOVERNMENTS AND KEY POLICIES - 2026\n");
        
        g1.displayDetails();
        g2.displayDetails();
        g3.displayDetails();
        g4.displayDetails();
        g5.displayDetails();
        g6.displayDetails();
        g7.displayDetails();
        g8.displayDetails();
        g9.displayDetails();
        g10.displayDetails();
        g11.displayDetails();
        g12.displayDetails();
        g13.displayDetails();
        g14.displayDetails();
        g15.displayDetails();
        g16.displayDetails();
        g17.displayDetails();
        g18.displayDetails();
        g19.displayDetails();
        g20.displayDetails();

        System.out.println("\nGovernance shapes nations through strategic policies.");
    }
}