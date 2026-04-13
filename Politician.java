class Politician {

    Voter voter;

    public boolean addVoter(Voter voter) {
        this.voter = voter;
        return true;
    }

    public Politician(Voter voter) {
        this.voter = voter;
    }

    public Politician() {
    }

    public void getDetails() {
        System.out.println(this.voter.voterId);
        System.out.println(this.voter.name);
        System.out.println(this.voter.age);
        System.out.println(this.voter.gender);
        System.out.println(this.voter.constituency);
        System.out.println(this.voter.hasVoted);
        System.out.println(this.voter.voterCardNumber);
        System.out.println(this.voter.address);
    }
}