class GpsDetailsExecutor {
    public static void main(String[] args) {

        GpsDetails g1 = new GpsDetails();
        g1.setGpsId(1); g1.setDeviceName("Device1"); g1.setLatitude("12.97"); g1.setLongitude("77.59");
        g1.setSpeed("60"); g1.setDirection("North"); g1.setAltitude("900"); g1.setStatus("Active"); g1.setTimestamp("10:00AM");
        System.out.println(g1.getGpsId()); System.out.println(g1.getDeviceName()); System.out.println(g1.getLatitude());
        System.out.println(g1.getLongitude()); System.out.println(g1.getSpeed()); System.out.println(g1.getDirection());
        System.out.println(g1.getAltitude()); System.out.println(g1.getStatus()); System.out.println(g1.getTimestamp());

        GpsDetails g2 = new GpsDetails();
        g2.setGpsId(2); g2.setDeviceName("Device2"); g2.setLatitude("13.08"); g2.setLongitude("80.27");
        g2.setSpeed("50"); g2.setDirection("East"); g2.setAltitude("800"); g2.setStatus("Active"); g2.setTimestamp("11:00AM");
        System.out.println(g2.getGpsId()); System.out.println(g2.getDeviceName()); System.out.println(g2.getLatitude());
        System.out.println(g2.getLongitude()); System.out.println(g2.getSpeed()); System.out.println(g2.getDirection());
        System.out.println(g2.getAltitude()); System.out.println(g2.getStatus()); System.out.println(g2.getTimestamp());

        GpsDetails g3 = new GpsDetails();
        g3.setGpsId(3); g3.setDeviceName("Device3"); g3.setLatitude("17.38"); g3.setLongitude("78.48");
        g3.setSpeed("70"); g3.setDirection("West"); g3.setAltitude("850"); g3.setStatus("Inactive"); g3.setTimestamp("12:00PM");
        System.out.println(g3.getGpsId()); System.out.println(g3.getDeviceName()); System.out.println(g3.getLatitude());
        System.out.println(g3.getLongitude()); System.out.println(g3.getSpeed()); System.out.println(g3.getDirection());
        System.out.println(g3.getAltitude()); System.out.println(g3.getStatus()); System.out.println(g3.getTimestamp());

        GpsDetails g4 = new GpsDetails();
        g4.setGpsId(4); g4.setDeviceName("Device4"); g4.setLatitude("28.61"); g4.setLongitude("77.20");
        g4.setSpeed("55"); g4.setDirection("South"); g4.setAltitude("700"); g4.setStatus("Active"); g4.setTimestamp("1:00PM");
        System.out.println(g4.getGpsId()); System.out.println(g4.getDeviceName()); System.out.println(g4.getLatitude());
        System.out.println(g4.getLongitude()); System.out.println(g4.getSpeed()); System.out.println(g4.getDirection());
        System.out.println(g4.getAltitude()); System.out.println(g4.getStatus()); System.out.println(g4.getTimestamp());

        GpsDetails g5 = new GpsDetails();
        g5.setGpsId(5); g5.setDeviceName("Device5"); g5.setLatitude("19.07"); g5.setLongitude("72.87");
        g5.setSpeed("65"); g5.setDirection("North-East"); g5.setAltitude("600"); g5.setStatus("Active"); g5.setTimestamp("2:00PM");
        System.out.println(g5.getGpsId()); System.out.println(g5.getDeviceName()); System.out.println(g5.getLatitude());
        System.out.println(g5.getLongitude()); System.out.println(g5.getSpeed()); System.out.println(g5.getDirection());
        System.out.println(g5.getAltitude()); System.out.println(g5.getStatus()); System.out.println(g5.getTimestamp());

        GpsDetails g6 = new GpsDetails();
        g6.setGpsId(6); g6.setDeviceName("Device6"); g6.setLatitude("22.57"); g6.setLongitude("88.36");
        g6.setSpeed("45"); g6.setDirection("South-West"); g6.setAltitude("500"); g6.setStatus("Inactive"); g6.setTimestamp("3:00PM");
        System.out.println(g6.getGpsId()); System.out.println(g6.getDeviceName()); System.out.println(g6.getLatitude());
        System.out.println(g6.getLongitude()); System.out.println(g6.getSpeed()); System.out.println(g6.getDirection());
        System.out.println(g6.getAltitude()); System.out.println(g6.getStatus()); System.out.println(g6.getTimestamp());

        GpsDetails g7 = new GpsDetails();
        g7.setGpsId(7); g7.setDeviceName("Device7"); g7.setLatitude("15.30"); g7.setLongitude("74.12");
        g7.setSpeed("52"); g7.setDirection("North"); g7.setAltitude("650"); g7.setStatus("Active"); g7.setTimestamp("4:00PM");
        System.out.println(g7.getGpsId()); System.out.println(g7.getDeviceName()); System.out.println(g7.getLatitude());
        System.out.println(g7.getLongitude()); System.out.println(g7.getSpeed()); System.out.println(g7.getDirection());
        System.out.println(g7.getAltitude()); System.out.println(g7.getStatus()); System.out.println(g7.getTimestamp());

        GpsDetails g8 = new GpsDetails();
        g8.setGpsId(8); g8.setDeviceName("Device8"); g8.setLatitude("11.01"); g8.setLongitude("76.96");
        g8.setSpeed("48"); g8.setDirection("East"); g8.setAltitude("700"); g8.setStatus("Active"); g8.setTimestamp("5:00PM");
        System.out.println(g8.getGpsId()); System.out.println(g8.getDeviceName()); System.out.println(g8.getLatitude());
        System.out.println(g8.getLongitude()); System.out.println(g8.getSpeed()); System.out.println(g8.getDirection());
        System.out.println(g8.getAltitude()); System.out.println(g8.getStatus()); System.out.println(g8.getTimestamp());

        GpsDetails g9 = new GpsDetails();
        g9.setGpsId(9); g9.setDeviceName("Device9"); g9.setLatitude("9.93"); g9.setLongitude("76.26");
        g9.setSpeed("40"); g9.setDirection("West"); g9.setAltitude("300"); g9.setStatus("Inactive"); g9.setTimestamp("6:00PM");
        System.out.println(g9.getGpsId()); System.out.println(g9.getDeviceName()); System.out.println(g9.getLatitude());
        System.out.println(g9.getLongitude()); System.out.println(g9.getSpeed()); System.out.println(g9.getDirection());
        System.out.println(g9.getAltitude()); System.out.println(g9.getStatus()); System.out.println(g9.getTimestamp());

        GpsDetails g10 = new GpsDetails();
        g10.setGpsId(10); g10.setDeviceName("Device10"); g10.setLatitude("26.91"); g10.setLongitude("75.78");
        g10.setSpeed("62"); g10.setDirection("South"); g10.setAltitude("450"); g10.setStatus("Active"); g10.setTimestamp("7:00PM");
        System.out.println(g10.getGpsId()); System.out.println(g10.getDeviceName()); System.out.println(g10.getLatitude());
        System.out.println(g10.getLongitude()); System.out.println(g10.getSpeed()); System.out.println(g10.getDirection());
        System.out.println(g10.getAltitude()); System.out.println(g10.getStatus()); System.out.println(g10.getTimestamp());

        GpsDetails g11 = new GpsDetails();
        g11.setGpsId(11); g11.setDeviceName("Device11"); g11.setLatitude("23.02"); g11.setLongitude("72.57");
        g11.setSpeed("58"); g11.setDirection("North"); g11.setAltitude("400"); g11.setStatus("Active"); g11.setTimestamp("8:00PM");
        System.out.println(g11.getGpsId()); System.out.println(g11.getDeviceName()); System.out.println(g11.getLatitude());
        System.out.println(g11.getLongitude()); System.out.println(g11.getSpeed()); System.out.println(g11.getDirection());
        System.out.println(g11.getAltitude()); System.out.println(g11.getStatus()); System.out.println(g11.getTimestamp());

        GpsDetails g12 = new GpsDetails();
        g12.setGpsId(12); g12.setDeviceName("Device12"); g12.setLatitude("18.52"); g12.setLongitude("73.85");
        g12.setSpeed("66"); g12.setDirection("East"); g12.setAltitude("600"); g12.setStatus("Active"); g12.setTimestamp("9:00PM");
        System.out.println(g12.getGpsId()); System.out.println(g12.getDeviceName()); System.out.println(g12.getLatitude());
        System.out.println(g12.getLongitude()); System.out.println(g12.getSpeed()); System.out.println(g12.getDirection());
        System.out.println(g12.getAltitude()); System.out.println(g12.getStatus()); System.out.println(g12.getTimestamp());

        GpsDetails g13 = new GpsDetails();
        g13.setGpsId(13); g13.setDeviceName("Device13"); g13.setLatitude("25.59"); g13.setLongitude("85.13");
        g13.setSpeed("44"); g13.setDirection("West"); g13.setAltitude("350"); g13.setStatus("Inactive"); g13.setTimestamp("10:00PM");
        System.out.println(g13.getGpsId()); System.out.println(g13.getDeviceName()); System.out.println(g13.getLatitude());
        System.out.println(g13.getLongitude()); System.out.println(g13.getSpeed()); System.out.println(g13.getDirection());
        System.out.println(g13.getAltitude()); System.out.println(g13.getStatus()); System.out.println(g13.getTimestamp());

        GpsDetails g14 = new GpsDetails();
        g14.setGpsId(14); g14.setDeviceName("Device14"); g14.setLatitude("21.17"); g14.setLongitude("72.83");
        g14.setSpeed("59"); g14.setDirection("South"); g14.setAltitude("420"); g14.setStatus("Active"); g14.setTimestamp("11:00PM");
        System.out.println(g14.getGpsId()); System.out.println(g14.getDeviceName()); System.out.println(g14.getLatitude());
        System.out.println(g14.getLongitude()); System.out.println(g14.getSpeed()); System.out.println(g14.getDirection());
        System.out.println(g14.getAltitude()); System.out.println(g14.getStatus()); System.out.println(g14.getTimestamp());

        GpsDetails g15 = new GpsDetails();
        g15.setGpsId(15); g15.setDeviceName("Device15"); g15.setLatitude("16.50"); g15.setLongitude("80.64");
        g15.setSpeed("63"); g15.setDirection("North-East"); g15.setAltitude("480"); g15.setStatus("Active"); g15.setTimestamp("12:00AM");
        System.out.println(g15.getGpsId()); System.out.println(g15.getDeviceName()); System.out.println(g15.getLatitude());
        System.out.println(g15.getLongitude()); System.out.println(g15.getSpeed()); System.out.println(g15.getDirection());
        System.out.println(g15.getAltitude()); System.out.println(g15.getStatus()); System.out.println(g15.getTimestamp());

        GpsDetails g16 = new GpsDetails();
        g16.setGpsId(16); g16.setDeviceName("Device16"); g16.setLatitude("10.79"); g16.setLongitude("78.70");
        g16.setSpeed("55"); g16.setDirection("South-West"); g16.setAltitude("500"); g16.setStatus("Inactive"); g16.setTimestamp("1:00AM");
        System.out.println(g16.getGpsId()); System.out.println(g16.getDeviceName()); System.out.println(g16.getLatitude());
        System.out.println(g16.getLongitude()); System.out.println(g16.getSpeed()); System.out.println(g16.getDirection());
        System.out.println(g16.getAltitude()); System.out.println(g16.getStatus()); System.out.println(g16.getTimestamp());

        GpsDetails g17 = new GpsDetails();
        g17.setGpsId(17); g17.setDeviceName("Device17"); g17.setLatitude("12.29"); g17.setLongitude("76.63");
        g17.setSpeed("60"); g17.setDirection("North"); g17.setAltitude("650"); g17.setStatus("Active"); g17.setTimestamp("2:00AM");
        System.out.println(g17.getGpsId()); System.out.println(g17.getDeviceName()); System.out.println(g17.getLatitude());
        System.out.println(g17.getLongitude()); System.out.println(g17.getSpeed()); System.out.println(g17.getDirection());
        System.out.println(g17.getAltitude()); System.out.println(g17.getStatus()); System.out.println(g17.getTimestamp());

        GpsDetails g18 = new GpsDetails();
        g18.setGpsId(18); g18.setDeviceName("Device18"); g18.setLatitude("13.34"); g18.setLongitude("74.74");
        g18.setSpeed("52"); g18.setDirection("East"); g18.setAltitude("700"); g18.setStatus("Active"); g18.setTimestamp("3:00AM");
        System.out.println(g18.getGpsId()); System.out.println(g18.getDeviceName()); System.out.println(g18.getLatitude());
        System.out.println(g18.getLongitude()); System.out.println(g18.getSpeed()); System.out.println(g18.getDirection());
        System.out.println(g18.getAltitude()); System.out.println(g18.getStatus()); System.out.println(g18.getTimestamp());

        GpsDetails g19 = new GpsDetails();
        g19.setGpsId(19); g19.setDeviceName("Device19"); g19.setLatitude("17.68"); g19.setLongitude("83.22");
        g19.setSpeed("47"); g19.setDirection("West"); g19.setAltitude("300"); g19.setStatus("Inactive"); g19.setTimestamp("4:00AM");
        System.out.println(g19.getGpsId()); System.out.println(g19.getDeviceName()); System.out.println(g19.getLatitude());
        System.out.println(g19.getLongitude()); System.out.println(g19.getSpeed()); System.out.println(g19.getDirection());
        System.out.println(g19.getAltitude()); System.out.println(g19.getStatus()); System.out.println(g19.getTimestamp());

        GpsDetails g20 = new GpsDetails();
        g20.setGpsId(20); g20.setDeviceName("Device20"); g20.setLatitude("30.73"); g20.setLongitude("76.77");
        g20.setSpeed("61"); g20.setDirection("South"); g20.setAltitude("450"); g20.setStatus("Active"); g20.setTimestamp("5:00AM");
        System.out.println(g20.getGpsId()); System.out.println(g20.getDeviceName()); System.out.println(g20.getLatitude());
        System.out.println(g20.getLongitude()); System.out.println(g20.getSpeed()); System.out.println(g20.getDirection());
        System.out.println(g20.getAltitude()); System.out.println(g20.getStatus()); System.out.println(g20.getTimestamp());

        GpsDetails g21 = new GpsDetails();
        g21.setGpsId(21); g21.setDeviceName("Device21"); g21.setLatitude("26.14"); g21.setLongitude("91.73");
        g21.setSpeed("53"); g21.setDirection("North"); g21.setAltitude("500"); g21.setStatus("Active"); g21.setTimestamp("6:00AM");
        System.out.println(g21.getGpsId()); System.out.println(g21.getDeviceName()); System.out.println(g21.getLatitude());
        System.out.println(g21.getLongitude()); System.out.println(g21.getSpeed()); System.out.println(g21.getDirection());
        System.out.println(g21.getAltitude()); System.out.println(g21.getStatus()); System.out.println(g21.getTimestamp());

        GpsDetails g22 = new GpsDetails();
        g22.setGpsId(22); g22.setDeviceName("Device22"); g22.setLatitude("24.82"); g22.setLongitude("93.95");
        g22.setSpeed("46"); g22.setDirection("East"); g22.setAltitude("600"); g22.setStatus("Active"); g22.setTimestamp("7:00AM");
        System.out.println(g22.getGpsId()); System.out.println(g22.getDeviceName()); System.out.println(g22.getLatitude());
        System.out.println(g22.getLongitude()); System.out.println(g22.getSpeed()); System.out.println(g22.getDirection());
        System.out.println(g22.getAltitude()); System.out.println(g22.getStatus()); System.out.println(g22.getTimestamp());

        GpsDetails g23 = new GpsDetails();
        g23.setGpsId(23); g23.setDeviceName("Device23"); g23.setLatitude("34.08"); g23.setLongitude("74.79");
        g23.setSpeed("42"); g23.setDirection("West"); g23.setAltitude("700"); g23.setStatus("Inactive"); g23.setTimestamp("8:00AM");
        System.out.println(g23.getGpsId()); System.out.println(g23.getDeviceName()); System.out.println(g23.getLatitude());
        System.out.println(g23.getLongitude()); System.out.println(g23.getSpeed()); System.out.println(g23.getDirection());
        System.out.println(g23.getAltitude()); System.out.println(g23.getStatus()); System.out.println(g23.getTimestamp());

        GpsDetails g24 = new GpsDetails();
        g24.setGpsId(24); g24.setDeviceName("Device24"); g24.setLatitude("31.63"); g24.setLongitude("74.87");
        g24.setSpeed("60"); g24.setDirection("South"); g24.setAltitude("450"); g24.setStatus("Active"); g24.setTimestamp("9:00AM");
        System.out.println(g24.getGpsId()); System.out.println(g24.getDeviceName()); System.out.println(g24.getLatitude());
        System.out.println(g24.getLongitude()); System.out.println(g24.getSpeed()); System.out.println(g24.getDirection());
        System.out.println(g24.getAltitude()); System.out.println(g24.getStatus()); System.out.println(g24.getTimestamp());

        GpsDetails g25 = new GpsDetails();
        g25.setGpsId(25); g25.setDeviceName("Device25"); g25.setLatitude("15.82"); g25.setLongitude("74.49");
        g25.setSpeed("55"); g25.setDirection("North-East"); g25.setAltitude("480"); g25.setStatus("Active"); g25.setTimestamp("10:00AM");
        System.out.println(g25.getGpsId()); System.out.println(g25.getDeviceName()); System.out.println(g25.getLatitude());
        System.out.println(g25.getLongitude()); System.out.println(g25.getSpeed()); System.out.println(g25.getDirection());
        System.out.println(g25.getAltitude()); System.out.println(g25.getStatus()); System.out.println(g25.getTimestamp());

        GpsDetails g26 = new GpsDetails();
        g26.setGpsId(26); g26.setDeviceName("Device26"); g26.setLatitude("11.25"); g26.setLongitude("75.77");
        g26.setSpeed("49"); g26.setDirection("South-West"); g26.setAltitude("500"); g26.setStatus("Inactive"); g26.setTimestamp("11:00AM");
        System.out.println(g26.getGpsId()); System.out.println(g26.getDeviceName()); System.out.println(g26.getLatitude());
        System.out.println(g26.getLongitude()); System.out.println(g26.getSpeed()); System.out.println(g26.getDirection());
        System.out.println(g26.getAltitude()); System.out.println(g26.getStatus()); System.out.println(g26.getTimestamp());

        GpsDetails g27 = new GpsDetails();
        g27.setGpsId(27); g27.setDeviceName("Device27"); g27.setLatitude("12.91"); g27.setLongitude("74.85");
        g27.setSpeed("58"); g27.setDirection("North"); g27.setAltitude("650"); g27.setStatus("Active"); g27.setTimestamp("12:00PM");
        System.out.println(g27.getGpsId()); System.out.println(g27.getDeviceName()); System.out.println(g27.getLatitude());
        System.out.println(g27.getLongitude()); System.out.println(g27.getSpeed()); System.out.println(g27.getDirection());
        System.out.println(g27.getAltitude()); System.out.println(g27.getStatus()); System.out.println(g27.getTimestamp());

        GpsDetails g28 = new GpsDetails();
        g28.setGpsId(28); g28.setDeviceName("Device28"); g28.setLatitude("13.62"); g28.setLongitude("79.42");
        g28.setSpeed("52"); g28.setDirection("East"); g28.setAltitude("700"); g28.setStatus("Active"); g28.setTimestamp("1:00PM");
        System.out.println(g28.getGpsId()); System.out.println(g28.getDeviceName()); System.out.println(g28.getLatitude());
        System.out.println(g28.getLongitude()); System.out.println(g28.getSpeed()); System.out.println(g28.getDirection());
        System.out.println(g28.getAltitude()); System.out.println(g28.getStatus()); System.out.println(g28.getTimestamp());

        GpsDetails g29 = new GpsDetails();
        g29.setGpsId(29); g29.setDeviceName("Device29"); g29.setLatitude("10.85"); g29.setLongitude("76.27");
        g29.setSpeed("45"); g29.setDirection("West"); g29.setAltitude("300"); g29.setStatus("Inactive"); g29.setTimestamp("2:00PM");
        System.out.println(g29.getGpsId()); System.out.println(g29.getDeviceName()); System.out.println(g29.getLatitude());
        System.out.println(g29.getLongitude()); System.out.println(g29.getSpeed()); System.out.println(g29.getDirection());
        System.out.println(g29.getAltitude()); System.out.println(g29.getStatus()); System.out.println(g29.getTimestamp());
    }
}