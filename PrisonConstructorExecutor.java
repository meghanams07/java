class PrisonConstructorExecutor {
    public static void main(String[] args) {

        Criminal criminal = new Criminal();
        criminal.criminalId = 3;
        criminal.name = "Arjun";
        criminal.age = 45;
        criminal.crimeType = "Murder";
        criminal.sentenceYears = 10;
        criminal.prisonBlock = "High Security";
        criminal.isDangerous = true;
        criminal.nationality = "Indian";

        Prison prison = new Prison(criminal);
        prison.getDetails();
    }
}