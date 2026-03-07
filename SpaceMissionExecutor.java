class SpaceMissionExecutor{
    public static void main(String[] args){

        SpaceMission mission = new SpaceMission();
        mission.missionName = "Lunar Quest";
        mission.agencyName = "ISRO";
        mission.launchLocation = "Sriharikota";
        mission.totalAstronauts = 4;
        mission.missionBudget = 95000000;

        System.out.println("Mission name is :"+mission.missionName);
        System.out.println("Agency name is :"+mission.agencyName);
        System.out.println("Launch location is :"+mission.launchLocation);
        System.out.println("Total astronauts :"+mission.totalAstronauts);
        System.out.println("Mission budget :"+mission.missionBudget);

        String astronautNames[] = {"Rakesh","Anita","Vikram","Kiran"};
        System.out.println("Astronaut names are :");
        for(String astronautName : astronautNames){
            System.out.println(astronautName);
        }

        String spacecraftNames[] = {"Chandrayaan","Gaganyaan","Orbiter","Lander"};
        System.out.println("Spacecraft names are :");
        for(String spacecraftName : spacecraftNames){
            System.out.println(spacecraftName);
        }

        int missionDurations[] = {7,14,21,30};
        System.out.println("Mission durations are :");
        for(int missionDuration : missionDurations){
            System.out.println(missionDuration);
        }

        String experimentNames[] = {"Soil Study","Gravity Test","Radiation Check","Water Detection"};
        System.out.println("Experiment names are :");
        for(String experimentName : experimentNames){
            System.out.println(experimentName);
        }

        double experimentCosts[] = {12000.50,15000.75,18000.25,20000.00};
        System.out.println("Experiment costs are :");
        for(double experimentCost : experimentCosts){
            System.out.println(experimentCost);
        }
    }
}