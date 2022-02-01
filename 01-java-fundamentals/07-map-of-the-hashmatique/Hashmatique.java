import java.util.HashMap;
import java.util.Set;
public class Hashmatique{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Ode to Oatmeal", "Ode to oatmeal, the oats of fruitful fiber");
        trackList.put("Ode to sleep", "I'll stay awake, 'Cause the dark's not taking prisoners tonight");
        trackList.put("Domination", "Domination consumes you, then calls you a friend. It's a twisted fall");
        trackList.put("Back in Black", "Back in the back, Of a Cadillac, Number one with a bullet, I'm a power pack");
        String name = trackList.get("Domination");
        System.out.println(name);
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
    
}