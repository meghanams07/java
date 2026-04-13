class TrafficSignal {

    Cop cop;

    public boolean addCop(Cop cop) {
        this.cop = cop;
        return true;
    }

    public TrafficSignal(Cop cop) {
        this.cop = cop;
    }

    public TrafficSignal() {
    }

    public void getDetails() {
        System.out.println(this.cop.copId);
        System.out.println(this.cop.name);
        System.out.println(this.cop.age);
        System.out.println(this.cop.rank);
        System.out.println(this.cop.dutyArea);
        System.out.println(this.cop.shiftTime);
        System.out.println(this.cop.isOnDuty);
        System.out.println(this.cop.badgeNumber);
    }
}