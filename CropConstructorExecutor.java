class CropConstructorExecutor {
    public static void main(String[] args) {

        Season season = new Season();
        season.seasonName = "Zaid";
        season.durationMonths = 2;
        season.climateType = "Hot";
        season.averageTemperature = 35.0;
        season.rainfallLevel = "Very Low";
        season.startMonth = "March";
        season.endMonth = "June";
        season.isSuitableForFarming = false;

        Crop crop = new Crop(season);
        crop.getDetails();
    }
}