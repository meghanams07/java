class IplReferenceExecutor {
    public static void main(String[] args) {

        Rcb rcb = new Rcb();
        rcb.teamId = 18;
        rcb.teamName = "RCB";
        rcb.captain = "Virat Kohli";
        rcb.coach = "Andy Flower";
        rcb.totalPlayers = 22;
        rcb.homeGround = "Bangalore";
        rcb.matchesWon = 8;
        rcb.matchesLost = 6;

        Ipl ipl = new Ipl();
        ipl.rcb = rcb;
        ipl.getDetails();
    }
}