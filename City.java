public class City extends OpenWeatherAPI {
    public City(){
    }

    public String getData(){
        Object city = respMap().get("name");
        return "In " + city.toString();
    }
}
