import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import com.google.gson.reflect.*;

public abstract class OpenWeatherAPI {
    // THIS IS A CLIENT, I HAVE NO IDEA WHAT THIS MEANS.
    // Map: object that maps key-value pairs, when you call on a key, you get a value. Models mathematical function abstraction.
    // HashMap: stores elements in key-value pairs. Implements the Map interface.
    public static Map<String, Object> jsonToMap(String str){
        Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {}.getType());
        return map;
    }

    static String key = "ba5ccf5770ab9c22ee97be09d81ddcad";
    static double lat = 40.349;
    static double lon = -74.659;
    static String units = "imperial";
    static String urlString = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + key + "&units=" + units;
    
    // Class method for initializing API repository, respMap.
    public static Map<String,Object> respMap(){
        StringBuilder result = new StringBuilder();
        try{
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while((line = rd.readLine()) != null){
                result.append(line);
            }
            rd.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return jsonToMap(result.toString());
    }

    public abstract String getData();
}