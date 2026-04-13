class Ipl {

    Rcb rcb;

    public boolean addRcb(Rcb rcb) {
        this.rcb = rcb;
        return true;
    }

    public Ipl(Rcb rcb) {
        this.rcb = rcb;
    }

    public Ipl() {
    }

    public void getDetails() {
        System.out.println(this.rcb.teamId);
        System.out.println(this.rcb.teamName);
        System.out.println(this.rcb.captain);
        System.out.println(this.rcb.coach);
        System.out.println(this.rcb.totalPlayers);
        System.out.println(this.rcb.homeGround);
        System.out.println(this.rcb.matchesWon);
        System.out.println(this.rcb.matchesLost);
    }
}