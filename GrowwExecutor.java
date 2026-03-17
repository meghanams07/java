class GrowwExecutor {
    public static void main(String[] args) {
        System.out.println("=== GROWW INVESTMENT APPS & ASSOCIATED STOCKS ===\n");
        
        Stock s1 = new Stock(101, "Infosys", "Infosys Ltd", "INFY", "NSE",
                           1500.50, 600000000, "IT", "Software Services",
                           2000000, 1480, 1500, 1520, 1470, "INR", "India",
                           "1993", "Equity", "Active", "IT Services Company");

        Stock s2 = new Stock(102, "TCS", "Tata Consultancy Services Ltd", "TCS", "NSE",
                           3800.75, 1400000000, "IT", "IT Services",
                           1500000, 3750, 3795, 3825, 3730, "INR", "India",
                           "2004", "Equity", "Active", "Global IT services company");

        Stock s3 = new Stock(103, "HDFC Bank", "HDFC Bank Ltd", "HDFCBANK", "NSE",
                           1600.25, 900000000, "Banking", "Private Bank",
                           3000000, 1585, 1598, 1615, 1575, "INR", "India",
                           "1995", "Equity", "Active", "Leading private sector bank");

        Stock s4 = new Stock(104, "Reliance Industries", "Reliance Industries Ltd", "RELIANCE", "NSE",
                           2600.00, 1800000000, "Conglomerate", "Energy & Retail",
                           5000000, 2580, 2595, 2625, 2560, "INR", "India",
                           "1978", "Equity", "Active", "Diversified Indian conglomerate");

        Stock s5 = new Stock(105, "Apple Inc", "Apple Inc", "AAPL", "NASDAQ",
                           190.30, 2500000000, "Technology", "Consumer Electronics",
                           80000000, 188.0, 189.5, 192.0, 187.5, "USD", "USA",
                           "1980", "Equity", "Active", "Global tech giant");

        Stock s6 = new Stock(106, "HDFC AMC", "HDFC Asset Management Co", "HDFCAMC", "NSE",
                           3100.90, 650000000, "Financial Services", "Asset Management",
                           450000, 3050, 3090, 3125, 3030, "INR", "India",
                           "2018", "Equity", "Active", "Mutual fund AMC");

        Stock s7 = new Stock(107, "Muthoot Finance", "Muthoot Finance Ltd", "MUTHOOTFIN", "NSE",
                           1250.40, 500000000, "NBFC", "Gold Loans",
                           900000, 1235, 1248, 1265, 1220, "INR", "India",
                           "2011", "Equity", "Active", "Gold loan NBFC");

        Stock s8 = new Stock(108, "NSE Nifty 50 ETF", "Various AMCs", "NIFTYBEES", "NSE",
                           240.75, 200000000, "Index Fund", "ETF",
                           5000000, 238.0, 240.0, 242.5, 237.5, "INR", "India",
                           "2002", "ETF", "Active", "Nifty 50 index ETF");

        Stock s9 = new Stock(109, "NIFTY 50", "NSE Index", "NIFTY", "NSE",
                           22000.00, 0, "Index", "Benchmark Index",
                           0, 21850, 21980, 22100, 21800, "INR", "India",
                           "1996", "Index", "Active", "Benchmark equity index");

        Stock s10 = new Stock(110, "SBI Life", "SBI Life Insurance Co Ltd", "SBILIFE", "NSE",
                            1400.10, 500000000, "Insurance", "Life Insurance",
                            650000, 1385, 1398, 1415, 1375, "INR", "India",
                            "2017", "Equity", "Active", "Life insurance company");

        Stock s11 = new Stock(111, "ITC", "ITC Ltd", "ITC", "NSE",
                            430.40, 600000000, "FMCG", "Consumer Goods",
                            12000000, 425, 429, 435, 423, "INR", "India",
                            "1954", "Equity", "Active", "Diversified FMCG company");

        Stock s12 = new Stock(112, "Axis Bank", "Axis Bank Ltd", "AXISBANK", "NSE",
                            1180.60, 700000000, "Banking", "Private Bank",
                            3200000, 1165, 1178, 1195, 1160, "INR", "India",
                            "1998", "Equity", "Active", "Private sector bank");

        Stock s13 = new Stock(113, "SBI", "State Bank of India", "SBIN", "NSE",
                            780.25, 900000000, "Banking", "PSU Bank",
                            9000000, 770, 778, 785, 768, "INR", "India",
                            "1997", "Equity", "Active", "India's largest public bank");

        Stock s14 = new Stock(114, "REC Ltd Bond", "REC Ltd", "REC-BOND", "NSE-BOND",
                            1025.00, 0, "PSU", "Power Finance",
                            200000, 1020, 1023, 1030, 1018, "INR", "India",
                            "2020", "Bond", "Active", "Tax saving PSU bond");

        Stock s15 = new Stock(115, "Zomato", "Zomato Ltd", "ZOMATO", "NSE",
                            160.00, 450000000, "Internet", "Food Delivery",
                            25000000, 156, 159, 162, 155, "INR", "India",
                            "2021", "Equity", "Active", "Online food delivery platform");

        Stock s16 = new Stock(116, "Bajaj Finance", "Bajaj Finance Ltd", "BAJFINANCE", "NSE",
                            6500.50, 800000000, "NBFC", "Consumer Finance",
                            1200000, 6420, 6485, 6550, 6400, "INR", "India",
                            "1994", "Equity", "Active", "Leading NBFC");

        Stock s17 = new Stock(117, "Tata Power", "Tata Power Co Ltd", "TATAPOWER", "NSE",
                            410.30, 400000000, "Power", "Renewable & Thermal",
                            11000000, 402, 408, 414, 400, "INR", "India",
                            "1911", "Equity", "Active", "Power generation & distribution");

        Stock s18 = new Stock(118, "Bitcoin ETF", "Global AMC", "BTCETF", "NYSE",
                            50.20, 300000000, "Crypto-linked", "ETF",
                            7000000, 49.0, 50.0, 51.5, 48.8, "USD", "USA",
                            "2021", "ETF", "Active", "Bitcoin price tracking ETF");

        Stock s19 = new Stock(119, "Infosys ADR", "Infosys Ltd", "INFY", "NYSE",
                            19.80, 600000000, "IT", "Software Services",
                            3000000, 19.4, 19.7, 20.1, 19.2, "USD", "USA",
                            "1999", "Equity", "Active", "Infosys ADR in US");

        Stock s20 = new Stock(120, "HUL", "Hindustan Unilever Ltd", "HINDUNILVR", "NSE",
                            2500.80, 1200000000, "FMCG", "Consumer Products",
                            1800000, 2465, 2495, 2515, 2455, "INR", "India",
                            "1956", "Equity", "Active", "Leading FMCG company");

        Groww g1 = new Groww(1, "Groww", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2016, 40000000, "Mobile App", "Investment", "groww.in",
                           "support@groww.in", "080123456", "SEBI Registered", "High",
                           "UPI/Bank", "6.0", "Green", "24/7", "Active", "India", s1);

        Groww g2 = new Groww(2, "Groww Pro", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2020, 10000000, "Web App", "Investment", "pro.groww.in",
                           "prosupport@groww.in", "080200200", "SEBI Registered", "Very High",
                           "UPI/Bank/Cards", "3.5", "Dark Green", "Email Support", "Active", "India", s2);

        Groww g3 = new Groww(3, "Groww Lite", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2019, 5000000, "Mobile App", "Investment", "lite.groww.in",
                           "lite@groww.in", "080300300", "SEBI Registered", "High",
                           "UPI", "2.1", "Light Green", "Chat Support", "Active", "India", s3);

        Groww g4 = new Groww(4, "Groww Derivatives", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2021, 3000000, "Mobile & Web", "Investment", "derivatives.groww.in",
                           "fno@groww.in", "080400400", "SEBI Registered", "High",
                           "UPI/Bank", "1.8", "Blue Green", "Phone Support", "Active", "India", s4);

        Groww g5 = new Groww(5, "Groww Global", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2022, 2000000, "Mobile App", "Investment", "global.groww.in",
                           "global@groww.in", "080500500", "Registered Broker", "High",
                           "Bank Transfer", "1.2", "Teal", "Email Support", "Active", "India", s5);

        Groww g6 = new Groww(6, "Groww SIP", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2018, 7000000, "Mobile App", "Mutual Funds", "sip.groww.in",
                           "sip@groww.in", "080600600", "SEBI Registered", "High",
                           "Auto-debit/UPI", "4.0", "Mint Green", "Chat & Email", "Active", "India", s6);

        Groww g7 = new Groww(7, "Groww Gold", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2020, 2500000, "Mobile App", "Digital Gold", "gold.groww.in",
                           "gold@groww.in", "080700700", "SEBI Registered Partner", "High",
                           "UPI/NetBanking", "1.5", "Gold", "Chat Support", "Active", "India", s7);

        Groww g8 = new Groww(8, "Groww Learn", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2021, 1000000, "Web & Mobile", "Education", "learn.groww.in",
                           "learn@groww.in", "080800800", "EdTech", "High",
                           "UPI/Cards", "1.0", "Blue", "Email", "Active", "India", s8);

        Groww g9 = new Groww(9, "Groww Options", "Groww Technologies", "Lalit Keshre", "Bangalore",
                           2023, 1500000, "Mobile App", "Derivatives", "options.groww.in",
                           "options@groww.in", "080900900", "SEBI Registered", "Very High",
                           "UPI/Bank", "1.1", "Dark Blue", "Phone & Chat", "Active", "India", s9);

        Groww g10 = new Groww(10, "Groww Corporate", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2022, 300000, "Web App", "Wealth Management", "corporate.groww.in",
                            "corp@groww.in", "080111000", "SEBI Registered", "High",
                            "Bank Transfer", "1.3", "Navy Blue", "RM Support", "Active", "India", s10);

        Groww g11 = new Groww(11, "Groww Junior", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2023, 800000, "Mobile App", "Investment Education", "junior.groww.in",
                            "junior@groww.in", "080111111", "Learning", "High",
                            "UPI", "1.0", "Yellow", "Chatbot", "Active", "India", s11);

        Groww g12 = new Groww(12, "Groww Tax Saver", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2019, 2500000, "Mobile & Web", "ELSS/Tax Saving", "tax.groww.in",
                            "tax@groww.in", "080121212", "SEBI Registered", "High",
                            "UPI/NetBanking", "2.4", "Olive Green", "Email & Chat", "Active", "India", s12);

        Groww g13 = new Groww(13, "Groww Pension", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2021, 600000, "Mobile App", "Retirement", "pension.groww.in",
                            "pension@groww.in", "080131313", "PFRDA Partner", "High",
                            "UPI/Bank", "1.3", "Brown", "Phone Support", "Active", "India", s13);

        Groww g14 = new Groww(14, "Groww Bonds", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2022, 400000, "Web & Mobile", "Fixed Income", "bonds.groww.in",
                            "bonds@groww.in", "080141414", "SEBI Registered", "High",
                            "Bank Transfer", "1.0", "Grey", "Email Support", "Active", "India", s14);

        Groww g15 = new Groww(15, "Groww IPO", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2020, 2200000, "Mobile & Web", "IPO Investing", "ipo.groww.in",
                            "ipo@groww.in", "080151515", "SEBI Registered", "High",
                            "UPI", "2.0", "Violet", "Chat Support", "Active", "India", s15);

        Groww g16 = new Groww(16, "Groww Ultra", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2024, 500000, "Mobile App", "Premium Trading", "ultra.groww.in",
                            "ultra@groww.in", "080161616", "SEBI Registered", "Very High",
                            "Bank/UPI", "1.0", "Black", "Priority RM", "Active", "India", s16);

        Groww g17 = new Groww(17, "Groww ESG", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2022, 300000, "Web & Mobile", "ESG Investing", "esg.groww.in",
                            "esg@groww.in", "080171717", "SEBI Registered", "High",
                            "UPI/Bank", "1.0", "Forest Green", "Email", "Active", "India", s17);

        Groww g18 = new Groww(18, "Groww Crypto Watch", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2021, 900000, "Mobile App", "Price Tracking", "crypto.groww.in",
                            "crypto@groww.in", "080181818", "Info Only", "High",
                            "N/A", "1.1", "Purple", "In-app FAQ", "Active", "India", s18);

        Groww g19 = new Groww(19, "Groww Campus", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2023, 200000, "Web", "Student Investing", "campus.groww.in",
                            "campus@groww.in", "080191919", "Learning", "High",
                            "UPI", "1.0", "Sky Blue", "Campus Reps", "Active", "India", s19);

        Groww g20 = new Groww(20, "Groww Family", "Groww Technologies", "Lalit Keshre", "Bangalore",
                            2024, 150000, "Mobile App", "Family Investing", "family.groww.in",
                            "family@groww.in", "080202020", "SEBI Registered", "Very High",
                            "UPI/Bank", "1.0", "Turquoise", "Phone & Chat", "Active", "India", s20);

        g1.getGrowwDetails();
        g2.getGrowwDetails();
        g3.getGrowwDetails();
        g4.getGrowwDetails();
        g5.getGrowwDetails();
        g6.getGrowwDetails();
        g7.getGrowwDetails();
        g8.getGrowwDetails();
        g9.getGrowwDetails();
        g10.getGrowwDetails();
        g11.getGrowwDetails();
        g12.getGrowwDetails();
        g13.getGrowwDetails();
        g14.getGrowwDetails();
        g15.getGrowwDetails();
        g16.getGrowwDetails();
        g17.getGrowwDetails();
        g18.getGrowwDetails();
        g19.getGrowwDetails();
        g20.getGrowwDetails();

        System.out.println("\n=== END OF ALL GROWW APPS & STOCK DETAILS ===");
        System.out.println("Total Groww Apps: 20 | Total Stocks Tracked: 20");
    }
}
