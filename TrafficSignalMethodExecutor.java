class TrafficSignalMethodExecutor {
    public static void main(String[] args) {

        Cop cop = new Cop();
        cop.copId = 1;
        cop.name = "Ravi Kumar";
        cop.age = 35;
        cop.rank = "Inspector";
        cop.dutyArea = "MG Road";
        cop.shiftTime = "Morning";
        cop.isOnDuty = true;
        cop.badgeNumber = "TN1234";

        TrafficSignal signal = new TrafficSignal();
        signal.addCop(cop);
        signal.getDetails();
    }
}