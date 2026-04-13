class WeatherReferenceExecutor {
    public static void main(String[] args) {

        Climate climate = new Climate();
        climate.temperature = "22°C";
        climate.humidity = "85%";
        climate.windSpeed = "10 km/h";
        climate.season = "Monsoon";
        climate.rainfall = "High";
        climate.pressure = "1008 hPa";
        climate.isSunny = false;
        climate.condition = "Rainy";

        Weather weather = new Weather();
        weather.climate = climate;
        weather.getDetails();
    }
}