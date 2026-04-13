class PrisonReferenceExecutor {
    public static void main(String[] args) {

        Criminal criminal = new Criminal();
        criminal.criminalId = 2;
        criminal.name = "Suresh";
        criminal.age = 35;
        criminal.crimeType = "Fraud";
        criminal.sentenceYears = 3;
        criminal.prisonBlock = "Block B";
        criminal.isDangerous = false;
        criminal.nationality = "Indian";

        Prison prison = new Prison();
        prison.criminal = criminal;
        prison.getDetails();
    }
}