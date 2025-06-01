import java.util.*;
public class IterateHS {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");

        Iterator itr = cities.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String city: cities){
            System.out.println(city);
        }
    }
    
}