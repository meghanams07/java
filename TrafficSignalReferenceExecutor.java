class TrafficSignalReferenceExecutor {
    public static void main(String[] args) {

        Cop cop = new Cop();
        cop.copId = 2;
        cop.name = "Suresh";
        cop.age = 40;
        cop.rank = "Sub Inspector";
        cop.dutyArea = "Brigade Road";
        cop.shiftTime = "Evening";
        cop.isOnDuty = true;
        cop.badgeNumber = "KA5678";

        TrafficSignal signal = new TrafficSignal();
        signal.cop = cop;
        signal.getDetails();
    }
}