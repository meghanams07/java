class PoliticianReferenceExecutor {
    public static void main(String[] args) {

        Voter voter = new Voter();
        voter.voterId = 2;
        voter.name = "Priya";
        voter.age = 28;
        voter.gender = "Female";
        voter.constituency = "Bangalore North";
        voter.hasVoted = false;
        voter.voterCardNumber = "XYZ987654";
        voter.address = "Indiranagar";

        Politician pol = new Politician();
        pol.voter = voter;
        pol.getDetails();
    }
}