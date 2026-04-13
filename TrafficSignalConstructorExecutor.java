class TrafficSignalConstructorExecutor {
    public static void main(String[] args) {

        Cop cop = new Cop();
        cop.copId = 3;
        cop.name = "Manoj";
        cop.age = 30;
        cop.rank = "Constable";
        cop.dutyArea = "City Market";
        cop.shiftTime = "Night";
        cop.isOnDuty = false;
        cop.badgeNumber = "KA9999";

        TrafficSignal signal = new TrafficSignal(cop);
        signal.getDetails();
    }
}