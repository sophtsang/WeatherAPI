import java.util.Map;
import java.util.ArrayList;

public class Weather extends OpenWeatherAPI {

    public String name;

    public Weather() {
    }

    public String getData()
    {
        ArrayList<Map<String, Object>> weathers = (ArrayList<Map<String, Object>>)respMap().get("weather");
        Map<String, Object> weatherMap = weathers.get(0);
        Object weather = weatherMap.get("main");
        return "Weather is: " + weather.toString();
    }
    
}
