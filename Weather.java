class Weather {

    Climate climate;

    public boolean addClimate(Climate climate) {
        this.climate = climate;
        return true;
    }

    public Weather(Climate climate) {
        this.climate = climate;
    }

    public Weather() {
    }

    public void getDetails() {
        System.out.println(this.climate.temperature);
        System.out.println(this.climate.humidity);
        System.out.println(this.climate.windSpeed);
        System.out.println(this.climate.season);
        System.out.println(this.climate.rainfall);
        System.out.println(this.climate.pressure);
        System.out.println(this.climate.isSunny);
        System.out.println(this.climate.condition);
    }
}