class WeatherMethodExecutor {
    public static void main(String[] args) {

        Climate climate = new Climate();
        climate.temperature = "30°C";
        climate.humidity = "70%";
        climate.windSpeed = "15 km/h";
        climate.season = "Summer";
        climate.rainfall = "Low";
        climate.pressure = "1012 hPa";
        climate.isSunny = true;
        climate.condition = "Clear Sky";

        Weather weather = new Weather();
        weather.addClimate(climate);
        weather.getDetails();
    }
}