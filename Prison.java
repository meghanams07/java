class Prison {

    Criminal criminal;

    public boolean addCriminal(Criminal criminal) {
        this.criminal = criminal;
        return true;
    }

    public Prison(Criminal criminal) {
        this.criminal = criminal;
    }

    public Prison() {
    }

    public void getDetails() {
        System.out.println(this.criminal.criminalId);
        System.out.println(this.criminal.name);
        System.out.println(this.criminal.age);
        System.out.println(this.criminal.crimeType);
        System.out.println(this.criminal.sentenceYears);
        System.out.println(this.criminal.prisonBlock);
        System.out.println(this.criminal.isDangerous);
        System.out.println(this.criminal.nationality);
    }
}