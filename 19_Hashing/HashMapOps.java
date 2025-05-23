import java.util.*;
public class HashMapOps {
    public static void main(String args[]){

        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // Remove
        System.out.println(hm.remove("China"));

        // Size
        System.out.println(hm.size());
        // Is empty
        System.out.println(hm.isEmpty());
        // clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
