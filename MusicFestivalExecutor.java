class MusicFestivalExecutor{
    public static void main(String[] args){

        MusicFestival festival = new MusicFestival();
        festival.festivalName = "Rhythm Night";
        festival.organizerName = "Arjun";
        festival.location = "Chennai";
        festival.totalStages = 3;
        festival.ticketPrice = 1500;

        System.out.println("Festival name is :"+festival.festivalName);
        System.out.println("Organizer name is :"+festival.organizerName);
        System.out.println("Location is :"+festival.location);
        System.out.println("Total stages :"+festival.totalStages);
        System.out.println("Ticket price :"+festival.ticketPrice);

        String singerNames[] = {"Anirudh","Sid Sriram","Shreya Ghoshal","Yuvan"};
        System.out.println("Singer names are :");
        for(String singerName : singerNames){
            System.out.println(singerName);
        }

        String performanceTimes[] = {"6:00 pm","7:30 pm","9:00 pm","10:30 pm"};
        System.out.println("Performance times are :");
        for(String performanceTime : performanceTimes){
            System.out.println(performanceTime);
        }

        int audienceCounts[] = {5000,6500,7000,8000};
        System.out.println("Audience counts are :");
        for(int audienceCount : audienceCounts){
            System.out.println(audienceCount);
        }

        String sponsorNames[] = {"Pepsi","Spotify","RedBull","JBL"};
        System.out.println("Sponsor names are :");
        for(String sponsorName : sponsorNames){
            System.out.println(sponsorName);
        }

        double sponsorAmounts[] = {200000.50,300000.75,250000.25,150000.00};
        System.out.println("Sponsor amounts are :");
        for(double sponsorAmount : sponsorAmounts){
            System.out.println(sponsorAmount);
        }
    }
}