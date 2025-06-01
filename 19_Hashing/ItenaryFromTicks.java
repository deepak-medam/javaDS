import java.util.*;
public class ItenaryFromTicks {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String toKey: tickets.keySet()){
            revMap.put(tickets.get(toKey), toKey);
        }

        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; // Starting point
            }
        }

        return null;
    }

    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumabai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key: tickets.keySet()){
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
    
}
