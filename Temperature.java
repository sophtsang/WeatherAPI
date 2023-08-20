import java.util.Map;

public class Temperature extends OpenWeatherAPI{
    public Temperature(){
    }
    
    public String getData(){
        Map<String, Object> mainMap = jsonToMap(respMap().get("main").toString());
        Object temp = mainMap.get("temp");
        Object temp_max = mainMap.get("temp_max");
        Object temp_min = mainMap.get("temp_min");
        return "Temperature is: " + temp.toString() + " F with a high of: " + temp_max + " F and a low of: " + temp_min + " F.";
    }
}
