class CropReferenceExecutor {
    public static void main(String[] args) {

        Season season = new Season();
        season.seasonName = "Rabi";
        season.durationMonths = 5;
        season.climateType = "Cool";
        season.averageTemperature = 20.0;
        season.rainfallLevel = "Low";
        season.startMonth = "October";
        season.endMonth = "March";
        season.isSuitableForFarming = true;

        Crop crop = new Crop();
        crop.season = season;
        crop.getDetails();
    }
}