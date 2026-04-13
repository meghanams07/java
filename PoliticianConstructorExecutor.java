class PoliticianConstructorExecutor {
    public static void main(String[] args) {

        Voter voter = new Voter();
        voter.voterId = 3;
        voter.name = "Arun";
        voter.age = 35;
        voter.gender = "Male";
        voter.constituency = "Mysore";
        voter.hasVoted = true;
        voter.voterCardNumber = "LMN456789";
        voter.address = "Mysore City";

        Politician pol = new Politician(voter);
        pol.getDetails();
    }
}