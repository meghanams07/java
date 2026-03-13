class DroneExecutor {

    public static void main(String[] args) {

        Drone d1  = new Drone("DJI");
        Drone d2  = new Drone("DJI","Mini 3");
        Drone d3  = new Drone("DJI","Mini 3",48);
        Drone d4  = new Drone("DJI","Mini 3",48,38);
        Drone d5  = new Drone("DJI","Mini 3",48,38,72000);
        Drone d6  = new Drone("DJI","Mini 3",48,38,72000,10000);
        Drone d7  = new Drone("DJI","Mini 3",48,38,72000,10000,true);
        Drone d8  = new Drone("DJI","Mini 3",48,38,72000,10000,true,true);
        Drone d9  = new Drone("DJI","Mini 3",48,38,72000,10000,true,true,0.25);
        Drone d10 = new Drone("DJI","Mini 3",48,38,72000,10000,true,true,0.25,true);
        Drone d11 = new Drone("DJI","Mini 3",48,38,72000,10000,true,true,0.25,true,true);
        Drone d12 = new Drone("DJI","Mini 3",48,38,72000,10000,true,true,0.25,true,true,true);

    }
}