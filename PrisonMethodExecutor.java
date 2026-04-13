class PrisonMethodExecutor {
    public static void main(String[] args) {

        Criminal criminal = new Criminal();
        criminal.criminalId = 1;
        criminal.name = "Ramesh";
        criminal.age = 40;
        criminal.crimeType = "Robbery";
        criminal.sentenceYears = 5;
        criminal.prisonBlock = "Block A";
        criminal.isDangerous = true;
        criminal.nationality = "Indian";

        Prison prison = new Prison();
        prison.addCriminal(criminal);
        prison.getDetails();
    }
}