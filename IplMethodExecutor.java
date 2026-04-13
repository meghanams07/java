class IplMethodExecutor {
    public static void main(String[] args) {

        Rcb rcb = new Rcb();
        rcb.teamId = 18;
        rcb.teamName = "Royal Challengers Bangalore";
        rcb.captain = "Faf du Plessis";
        rcb.coach = "Andy Flower";
        rcb.totalPlayers = 25;
        rcb.homeGround = "Chinnaswamy Stadium";
        rcb.matchesWon = 10;
        rcb.matchesLost = 4;

        Ipl ipl = new Ipl();
        ipl.addRcb(rcb);
        ipl.getDetails();
    }
}