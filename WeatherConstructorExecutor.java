class WeatherConstructorExecutor {
    public static void main(String[] args) {

        Climate climate = new Climate();
        climate.temperature = "18°C";
        climate.humidity = "60%";
        climate.windSpeed = "8 km/h";
        climate.season = "Winter";
        climate.rainfall = "None";
        climate.pressure = "1015 hPa";
        climate.isSunny = true;
        climate.condition = "Cold";

        Weather weather = new Weather(climate);
        weather.getDetails();
    }
}