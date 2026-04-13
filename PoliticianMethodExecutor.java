class PoliticianMethodExecutor {
    public static void main(String[] args) {

        Voter voter = new Voter();
        voter.voterId = 1;
        voter.name = "Ravi";
        voter.age = 30;
        voter.gender = "Male";
        voter.constituency = "Bangalore South";
        voter.hasVoted = true;
        voter.voterCardNumber = "ABC123456";
        voter.address = "BTM Layout";

        Politician pol = new Politician();
        pol.addVoter(voter);
        pol.getDetails();
    }
}