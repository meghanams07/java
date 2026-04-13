class IplConstructorExecutor {
    public static void main(String[] args) {

        Rcb rcb = new Rcb();
        rcb.teamId = 18;
        rcb.teamName = "RCB";
        rcb.captain = "Virat Kohli";
        rcb.coach = "Andy Flower";
        rcb.totalPlayers = 23;
        rcb.homeGround = "M Chinnaswamy";
        rcb.matchesWon = 9;
        rcb.matchesLost = 5;

        Ipl ipl = new Ipl(rcb);
        ipl.getDetails();
    }
}