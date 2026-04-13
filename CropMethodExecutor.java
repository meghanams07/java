class CropMethodExecutor {
    public static void main(String[] args) {

        Season season = new Season();
        season.seasonName = "Kharif";
        season.durationMonths = 4;
        season.climateType = "Humid";
        season.averageTemperature = 30.5;
        season.rainfallLevel = "High";
        season.startMonth = "June";
        season.endMonth = "October";
        season.isSuitableForFarming = true;

        Crop crop = new Crop();
        crop.addSeason(season);
        crop.getDetails();
    }
}