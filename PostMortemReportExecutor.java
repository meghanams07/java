class PostMortemReportExecutor {
    public static void main(String[] args) {

        PostMortemReport p1 = new PostMortemReport();
        p1.setReportId(1); p1.setPatientName("Person1"); p1.setAge("45"); p1.setGender("Male");
        p1.setCauseOfDeath("Heart Attack"); p1.setTimeOfDeath("10:00 AM"); p1.setPlaceOfDeath("Hospital");
        p1.setDoctorName("Dr.A"); p1.setRemarks("Natural");
        System.out.println(p1.getReportId()); System.out.println(p1.getPatientName()); System.out.println(p1.getAge());
        System.out.println(p1.getGender()); System.out.println(p1.getCauseOfDeath()); System.out.println(p1.getTimeOfDeath());
        System.out.println(p1.getPlaceOfDeath()); System.out.println(p1.getDoctorName()); System.out.println(p1.getRemarks());

        PostMortemReport p2 = new PostMortemReport();
        p2.setReportId(2); p2.setPatientName("Person2"); p2.setAge("30"); p2.setGender("Female");
        p2.setCauseOfDeath("Accident"); p2.setTimeOfDeath("2:00 PM"); p2.setPlaceOfDeath("Road");
        p2.setDoctorName("Dr.B"); p2.setRemarks("Injury");
        System.out.println(p2.getReportId()); System.out.println(p2.getPatientName()); System.out.println(p2.getAge());
        System.out.println(p2.getGender()); System.out.println(p2.getCauseOfDeath()); System.out.println(p2.getTimeOfDeath());
        System.out.println(p2.getPlaceOfDeath()); System.out.println(p2.getDoctorName()); System.out.println(p2.getRemarks());

        PostMortemReport p3 = new PostMortemReport();
        p3.setReportId(3); p3.setPatientName("Person3"); p3.setAge("60"); p3.setGender("Male");
        p3.setCauseOfDeath("Stroke"); p3.setTimeOfDeath("6:00 AM"); p3.setPlaceOfDeath("Home");
        p3.setDoctorName("Dr.C"); p3.setRemarks("Natural");
        System.out.println(p3.getReportId()); System.out.println(p3.getPatientName()); System.out.println(p3.getAge());
        System.out.println(p3.getGender()); System.out.println(p3.getCauseOfDeath()); System.out.println(p3.getTimeOfDeath());
        System.out.println(p3.getPlaceOfDeath()); System.out.println(p3.getDoctorName()); System.out.println(p3.getRemarks());

        PostMortemReport p4 = new PostMortemReport();
        p4.setReportId(4); p4.setPatientName("Person4"); p4.setAge("25"); p4.setGender("Male");
        p4.setCauseOfDeath("Poison"); p4.setTimeOfDeath("11:00 PM"); p4.setPlaceOfDeath("Unknown");
        p4.setDoctorName("Dr.D"); p4.setRemarks("Suspicious");
        System.out.println(p4.getReportId()); System.out.println(p4.getPatientName()); System.out.println(p4.getAge());
        System.out.println(p4.getGender()); System.out.println(p4.getCauseOfDeath()); System.out.println(p4.getTimeOfDeath());
        System.out.println(p4.getPlaceOfDeath()); System.out.println(p4.getDoctorName()); System.out.println(p4.getRemarks());

        PostMortemReport p5 = new PostMortemReport();
        p5.setReportId(5); p5.setPatientName("Person5"); p5.setAge("50"); p5.setGender("Female");
        p5.setCauseOfDeath("Heart Failure"); p5.setTimeOfDeath("3:00 AM"); p5.setPlaceOfDeath("Hospital");
        p5.setDoctorName("Dr.E"); p5.setRemarks("Natural");
        System.out.println(p5.getReportId()); System.out.println(p5.getPatientName()); System.out.println(p5.getAge());
        System.out.println(p5.getGender()); System.out.println(p5.getCauseOfDeath()); System.out.println(p5.getTimeOfDeath());
        System.out.println(p5.getPlaceOfDeath()); System.out.println(p5.getDoctorName()); System.out.println(p5.getRemarks());

        PostMortemReport p6 = new PostMortemReport();
        p6.setReportId(6); p6.setPatientName("Person6"); p6.setAge("35"); p6.setGender("Male");
        p6.setCauseOfDeath("Accident"); p6.setTimeOfDeath("5:00 PM"); p6.setPlaceOfDeath("Highway");
        p6.setDoctorName("Dr.F"); p6.setRemarks("Severe Injury");
        System.out.println(p6.getReportId()); System.out.println(p6.getPatientName()); System.out.println(p6.getAge());
        System.out.println(p6.getGender()); System.out.println(p6.getCauseOfDeath()); System.out.println(p6.getTimeOfDeath());
        System.out.println(p6.getPlaceOfDeath()); System.out.println(p6.getDoctorName()); System.out.println(p6.getRemarks());

        PostMortemReport p7 = new PostMortemReport();
        p7.setReportId(7); p7.setPatientName("Person7"); p7.setAge("70"); p7.setGender("Male");
        p7.setCauseOfDeath("Old Age"); p7.setTimeOfDeath("7:00 AM"); p7.setPlaceOfDeath("Home");
        p7.setDoctorName("Dr.G"); p7.setRemarks("Natural");
        System.out.println(p7.getReportId()); System.out.println(p7.getPatientName()); System.out.println(p7.getAge());
        System.out.println(p7.getGender()); System.out.println(p7.getCauseOfDeath()); System.out.println(p7.getTimeOfDeath());
        System.out.println(p7.getPlaceOfDeath()); System.out.println(p7.getDoctorName()); System.out.println(p7.getRemarks());

        PostMortemReport p8 = new PostMortemReport();
        p8.setReportId(8); p8.setPatientName("Person8"); p8.setAge("28"); p8.setGender("Female");
        p8.setCauseOfDeath("Drowning"); p8.setTimeOfDeath("1:00 PM"); p8.setPlaceOfDeath("Lake");
        p8.setDoctorName("Dr.H"); p8.setRemarks("Accidental");
        System.out.println(p8.getReportId()); System.out.println(p8.getPatientName()); System.out.println(p8.getAge());
        System.out.println(p8.getGender()); System.out.println(p8.getCauseOfDeath()); System.out.println(p8.getTimeOfDeath());
        System.out.println(p8.getPlaceOfDeath()); System.out.println(p8.getDoctorName()); System.out.println(p8.getRemarks());

        PostMortemReport p9 = new PostMortemReport();
        p9.setReportId(9); p9.setPatientName("Person9"); p9.setAge("40"); p9.setGender("Male");
        p9.setCauseOfDeath("Burns"); p9.setTimeOfDeath("9:00 PM"); p9.setPlaceOfDeath("House");
        p9.setDoctorName("Dr.I"); p9.setRemarks("Accidental");
        System.out.println(p9.getReportId()); System.out.println(p9.getPatientName()); System.out.println(p9.getAge());
        System.out.println(p9.getGender()); System.out.println(p9.getCauseOfDeath()); System.out.println(p9.getTimeOfDeath());
        System.out.println(p9.getPlaceOfDeath()); System.out.println(p9.getDoctorName()); System.out.println(p9.getRemarks());

        PostMortemReport p10 = new PostMortemReport();
        p10.setReportId(10); p10.setPatientName("Person10"); p10.setAge("55"); p10.setGender("Female");
        p10.setCauseOfDeath("Stroke"); p10.setTimeOfDeath("4:00 AM"); p10.setPlaceOfDeath("Hospital");
        p10.setDoctorName("Dr.J"); p10.setRemarks("Natural");
        System.out.println(p10.getReportId()); System.out.println(p10.getPatientName()); System.out.println(p10.getAge());
        System.out.println(p10.getGender()); System.out.println(p10.getCauseOfDeath()); System.out.println(p10.getTimeOfDeath());
        System.out.println(p10.getPlaceOfDeath()); System.out.println(p10.getDoctorName()); System.out.println(p10.getRemarks());

        PostMortemReport p11 = new PostMortemReport();
        p11.setReportId(11); p11.setPatientName("Person11"); p11.setAge("48"); p11.setGender("Male");
        p11.setCauseOfDeath("Heart Attack"); p11.setTimeOfDeath("8:00 AM"); p11.setPlaceOfDeath("Hospital");
        p11.setDoctorName("Dr.K"); p11.setRemarks("Natural");
        System.out.println(p11.getReportId()); System.out.println(p11.getPatientName()); System.out.println(p11.getAge());
        System.out.println(p11.getGender()); System.out.println(p11.getCauseOfDeath()); System.out.println(p11.getTimeOfDeath());
        System.out.println(p11.getPlaceOfDeath()); System.out.println(p11.getDoctorName()); System.out.println(p11.getRemarks());

        PostMortemReport p12 = new PostMortemReport();
        p12.setReportId(12); p12.setPatientName("Person12"); p12.setAge("33"); p12.setGender("Female");
        p12.setCauseOfDeath("Accident"); p12.setTimeOfDeath("6:00 PM"); p12.setPlaceOfDeath("Road");
        p12.setDoctorName("Dr.L"); p12.setRemarks("Injury");
        System.out.println(p12.getReportId()); System.out.println(p12.getPatientName()); System.out.println(p12.getAge());
        System.out.println(p12.getGender()); System.out.println(p12.getCauseOfDeath()); System.out.println(p12.getTimeOfDeath());
        System.out.println(p12.getPlaceOfDeath()); System.out.println(p12.getDoctorName()); System.out.println(p12.getRemarks());

        PostMortemReport p13 = new PostMortemReport();
        p13.setReportId(13); p13.setPatientName("Person13"); p13.setAge("65"); p13.setGender("Male");
        p13.setCauseOfDeath("Stroke"); p13.setTimeOfDeath("5:00 AM"); p13.setPlaceOfDeath("Home");
        p13.setDoctorName("Dr.M"); p13.setRemarks("Natural");
        System.out.println(p13.getReportId()); System.out.println(p13.getPatientName()); System.out.println(p13.getAge());
        System.out.println(p13.getGender()); System.out.println(p13.getCauseOfDeath()); System.out.println(p13.getTimeOfDeath());
        System.out.println(p13.getPlaceOfDeath()); System.out.println(p13.getDoctorName()); System.out.println(p13.getRemarks());

        PostMortemReport p14 = new PostMortemReport();
        p14.setReportId(14); p14.setPatientName("Person14"); p14.setAge("22"); p14.setGender("Female");
        p14.setCauseOfDeath("Poison"); p14.setTimeOfDeath("10:00 PM"); p14.setPlaceOfDeath("Unknown");
        p14.setDoctorName("Dr.N"); p14.setRemarks("Suspicious");
        System.out.println(p14.getReportId()); System.out.println(p14.getPatientName()); System.out.println(p14.getAge());
        System.out.println(p14.getGender()); System.out.println(p14.getCauseOfDeath()); System.out.println(p14.getTimeOfDeath());
        System.out.println(p14.getPlaceOfDeath()); System.out.println(p14.getDoctorName()); System.out.println(p14.getRemarks());

        PostMortemReport p15 = new PostMortemReport();
        p15.setReportId(15); p15.setPatientName("Person15"); p15.setAge("52"); p15.setGender("Male");
        p15.setCauseOfDeath("Heart Failure"); p15.setTimeOfDeath("3:30 AM"); p15.setPlaceOfDeath("Hospital");
        p15.setDoctorName("Dr.O"); p15.setRemarks("Natural");
        System.out.println(p15.getReportId()); System.out.println(p15.getPatientName()); System.out.println(p15.getAge());
        System.out.println(p15.getGender()); System.out.println(p15.getCauseOfDeath()); System.out.println(p15.getTimeOfDeath());
        System.out.println(p15.getPlaceOfDeath()); System.out.println(p15.getDoctorName()); System.out.println(p15.getRemarks());

        PostMortemReport p16 = new PostMortemReport();
        p16.setReportId(16); p16.setPatientName("Person16"); p16.setAge("38"); p16.setGender("Male");
        p16.setCauseOfDeath("Accident"); p16.setTimeOfDeath("7:00 PM"); p16.setPlaceOfDeath("Highway");
        p16.setDoctorName("Dr.P"); p16.setRemarks("Severe Injury");
        System.out.println(p16.getReportId()); System.out.println(p16.getPatientName()); System.out.println(p16.getAge());
        System.out.println(p16.getGender()); System.out.println(p16.getCauseOfDeath()); System.out.println(p16.getTimeOfDeath());
        System.out.println(p16.getPlaceOfDeath()); System.out.println(p16.getDoctorName()); System.out.println(p16.getRemarks());

        PostMortemReport p17 = new PostMortemReport();
        p17.setReportId(17); p17.setPatientName("Person17"); p17.setAge("72"); p17.setGender("Male");
        p17.setCauseOfDeath("Old Age"); p17.setTimeOfDeath("6:30 AM"); p17.setPlaceOfDeath("Home");
        p17.setDoctorName("Dr.Q"); p17.setRemarks("Natural");
        System.out.println(p17.getReportId()); System.out.println(p17.getPatientName()); System.out.println(p17.getAge());
        System.out.println(p17.getGender()); System.out.println(p17.getCauseOfDeath()); System.out.println(p17.getTimeOfDeath());
        System.out.println(p17.getPlaceOfDeath()); System.out.println(p17.getDoctorName()); System.out.println(p17.getRemarks());

        PostMortemReport p18 = new PostMortemReport();
        p18.setReportId(18); p18.setPatientName("Person18"); p18.setAge("27"); p18.setGender("Female");
        p18.setCauseOfDeath("Drowning"); p18.setTimeOfDeath("12:00 PM"); p18.setPlaceOfDeath("River");
        p18.setDoctorName("Dr.R"); p18.setRemarks("Accidental");
        System.out.println(p18.getReportId()); System.out.println(p18.getPatientName()); System.out.println(p18.getAge());
        System.out.println(p18.getGender()); System.out.println(p18.getCauseOfDeath()); System.out.println(p18.getTimeOfDeath());
        System.out.println(p18.getPlaceOfDeath()); System.out.println(p18.getDoctorName()); System.out.println(p18.getRemarks());

        PostMortemReport p19 = new PostMortemReport();
        p19.setReportId(19); p19.setPatientName("Person19"); p19.setAge("41"); p19.setGender("Male");
        p19.setCauseOfDeath("Burns"); p19.setTimeOfDeath("8:30 PM"); p19.setPlaceOfDeath("House");
        p19.setDoctorName("Dr.S"); p19.setRemarks("Accidental");
        System.out.println(p19.getReportId()); System.out.println(p19.getPatientName()); System.out.println(p19.getAge());
        System.out.println(p19.getGender()); System.out.println(p19.getCauseOfDeath()); System.out.println(p19.getTimeOfDeath());
        System.out.println(p19.getPlaceOfDeath()); System.out.println(p19.getDoctorName()); System.out.println(p19.getRemarks());

        PostMortemReport p20 = new PostMortemReport();
        p20.setReportId(20); p20.setPatientName("Person20"); p20.setAge("56"); p20.setGender("Female");
        p20.setCauseOfDeath("Stroke"); p20.setTimeOfDeath("2:30 AM"); p20.setPlaceOfDeath("Hospital");
        p20.setDoctorName("Dr.T"); p20.setRemarks("Natural");
        System.out.println(p20.getReportId()); System.out.println(p20.getPatientName()); System.out.println(p20.getAge());
        System.out.println(p20.getGender()); System.out.println(p20.getCauseOfDeath()); System.out.println(p20.getTimeOfDeath());
        System.out.println(p20.getPlaceOfDeath()); System.out.println(p20.getDoctorName()); System.out.println(p20.getRemarks());

        PostMortemReport p21 = new PostMortemReport();
        p21.setReportId(21); p21.setPatientName("Person21"); p21.setAge("47"); p21.setGender("Male");
        p21.setCauseOfDeath("Heart Attack"); p21.setTimeOfDeath("9:00 AM"); p21.setPlaceOfDeath("Hospital");
        p21.setDoctorName("Dr.U"); p21.setRemarks("Natural");
        System.out.println(p21.getReportId()); System.out.println(p21.getPatientName()); System.out.println(p21.getAge());
        System.out.println(p21.getGender()); System.out.println(p21.getCauseOfDeath()); System.out.println(p21.getTimeOfDeath());
        System.out.println(p21.getPlaceOfDeath()); System.out.println(p21.getDoctorName()); System.out.println(p21.getRemarks());

        PostMortemReport p22 = new PostMortemReport();
        p22.setReportId(22); p22.setPatientName("Person22"); p22.setAge("31"); p22.setGender("Female");
        p22.setCauseOfDeath("Accident"); p22.setTimeOfDeath("7:30 PM"); p22.setPlaceOfDeath("Road");
        p22.setDoctorName("Dr.V"); p22.setRemarks("Injury");
        System.out.println(p22.getReportId()); System.out.println(p22.getPatientName()); System.out.println(p22.getAge());
        System.out.println(p22.getGender()); System.out.println(p22.getCauseOfDeath()); System.out.println(p22.getTimeOfDeath());
        System.out.println(p22.getPlaceOfDeath()); System.out.println(p22.getDoctorName()); System.out.println(p22.getRemarks());

        PostMortemReport p23 = new PostMortemReport();
        p23.setReportId(23); p23.setPatientName("Person23"); p23.setAge("63"); p23.setGender("Male");
        p23.setCauseOfDeath("Stroke"); p23.setTimeOfDeath("5:30 AM"); p23.setPlaceOfDeath("Home");
        p23.setDoctorName("Dr.W"); p23.setRemarks("Natural");
        System.out.println(p23.getReportId()); System.out.println(p23.getPatientName()); System.out.println(p23.getAge());
        System.out.println(p23.getGender()); System.out.println(p23.getCauseOfDeath()); System.out.println(p23.getTimeOfDeath());
        System.out.println(p23.getPlaceOfDeath()); System.out.println(p23.getDoctorName()); System.out.println(p23.getRemarks());

        PostMortemReport p24 = new PostMortemReport();
        p24.setReportId(24); p24.setPatientName("Person24"); p24.setAge("24"); p24.setGender("Female");
        p24.setCauseOfDeath("Poison"); p24.setTimeOfDeath("11:30 PM"); p24.setPlaceOfDeath("Unknown");
        p24.setDoctorName("Dr.X"); p24.setRemarks("Suspicious");
        System.out.println(p24.getReportId()); System.out.println(p24.getPatientName()); System.out.println(p24.getAge());
        System.out.println(p24.getGender()); System.out.println(p24.getCauseOfDeath()); System.out.println(p24.getTimeOfDeath());
        System.out.println(p24.getPlaceOfDeath()); System.out.println(p24.getDoctorName()); System.out.println(p24.getRemarks());

        PostMortemReport p25 = new PostMortemReport();
        p25.setReportId(25); p25.setPatientName("Person25"); p25.setAge("53"); p25.setGender("Male");
        p25.setCauseOfDeath("Heart Failure"); p25.setTimeOfDeath("4:30 AM"); p25.setPlaceOfDeath("Hospital");
        p25.setDoctorName("Dr.Y"); p25.setRemarks("Natural");
        System.out.println(p25.getReportId()); System.out.println(p25.getPatientName()); System.out.println(p25.getAge());
        System.out.println(p25.getGender()); System.out.println(p25.getCauseOfDeath()); System.out.println(p25.getTimeOfDeath());
        System.out.println(p25.getPlaceOfDeath()); System.out.println(p25.getDoctorName()); System.out.println(p25.getRemarks());

        PostMortemReport p26 = new PostMortemReport();
        p26.setReportId(26); p26.setPatientName("Person26"); p26.setAge("36"); p26.setGender("Male");
        p26.setCauseOfDeath("Accident"); p26.setTimeOfDeath("6:45 PM"); p26.setPlaceOfDeath("Highway");
        p26.setDoctorName("Dr.Z"); p26.setRemarks("Severe Injury");
        System.out.println(p26.getReportId()); System.out.println(p26.getPatientName()); System.out.println(p26.getAge());
        System.out.println(p26.getGender()); System.out.println(p26.getCauseOfDeath()); System.out.println(p26.getTimeOfDeath());
        System.out.println(p26.getPlaceOfDeath()); System.out.println(p26.getDoctorName()); System.out.println(p26.getRemarks());

        PostMortemReport p27 = new PostMortemReport();
        p27.setReportId(27); p27.setPatientName("Person27"); p27.setAge("75"); p27.setGender("Male");
        p27.setCauseOfDeath("Old Age"); p27.setTimeOfDeath("7:15 AM"); p27.setPlaceOfDeath("Home");
        p27.setDoctorName("Dr.AA"); p27.setRemarks("Natural");
        System.out.println(p27.getReportId()); System.out.println(p27.getPatientName()); System.out.println(p27.getAge());
        System.out.println(p27.getGender()); System.out.println(p27.getCauseOfDeath()); System.out.println(p27.getTimeOfDeath());
        System.out.println(p27.getPlaceOfDeath()); System.out.println(p27.getDoctorName()); System.out.println(p27.getRemarks());

        PostMortemReport p28 = new PostMortemReport();
        p28.setReportId(28); p28.setPatientName("Person28"); p28.setAge("29"); p28.setGender("Female");
        p28.setCauseOfDeath("Drowning"); p28.setTimeOfDeath("1:30 PM"); p28.setPlaceOfDeath("Lake");
        p28.setDoctorName("Dr.BB"); p28.setRemarks("Accidental");
        System.out.println(p28.getReportId()); System.out.println(p28.getPatientName()); System.out.println(p28.getAge());
        System.out.println(p28.getGender()); System.out.println(p28.getCauseOfDeath()); System.out.println(p28.getTimeOfDeath());
        System.out.println(p28.getPlaceOfDeath()); System.out.println(p28.getDoctorName()); System.out.println(p28.getRemarks());

        PostMortemReport p29 = new PostMortemReport();
        p29.setReportId(29); p29.setPatientName("Person29"); p29.setAge("42"); p29.setGender("Male");
        p29.setCauseOfDeath("Burns"); p29.setTimeOfDeath("9:45 PM"); p29.setPlaceOfDeath("House");
        p29.setDoctorName("Dr.CC"); p29.setRemarks("Accidental");
        System.out.println(p29.getReportId()); System.out.println(p29.getPatientName()); System.out.println(p29.getAge());
        System.out.println(p29.getGender()); System.out.println(p29.getCauseOfDeath()); System.out.println(p29.getTimeOfDeath());
        System.out.println(p29.getPlaceOfDeath()); System.out.println(p29.getDoctorName()); System.out.println(p29.getRemarks());
    }
}