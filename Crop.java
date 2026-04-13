class Crop {

    Season season;

    public boolean addSeason(Season season) {
        this.season = season;
        return true;
    }

    public Crop(Season season) {
        this.season = season;
    }

    public Crop() {
    }

    public void getDetails() {
        System.out.println(this.season.seasonName);
        System.out.println(this.season.durationMonths);
        System.out.println(this.season.climateType);
        System.out.println(this.season.averageTemperature);
        System.out.println(this.season.rainfallLevel);
        System.out.println(this.season.startMonth);
        System.out.println(this.season.endMonth);
        System.out.println(this.season.isSuitableForFarming);
    }
}