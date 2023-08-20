import java.util.Map;
import java.util.ArrayList;

public class Ozone extends OpenPollutionAPI{
    public Ozone(){
    }

    public String getData(){
        // Casting map as an arraylist, because the pollutants are listed in component form. After the list: "response"
         // is cast as an arraylist, action of getting "list" allows direct casting as map. 
        ArrayList<Map<String, Object>> components = (ArrayList<Map<String, Object>>)respMap().get("list");
        // Within map, "components" in "list" is retrieved as an object: pollutantsMap.
        Map<String, Object> componentsMap = components.get(0);
        Object pollutantsMap = componentsMap.get("components");
        // Having cast the object: componentsMap.get("components") as a map, the specific pollutants in components can be retrieved with .get().
        Object ozone = ((Map<String, Object>)pollutantsMap).get("o3");
        return "Ozone concentration is: " + ozone.toString() + " microg/m^3";
    }
}
