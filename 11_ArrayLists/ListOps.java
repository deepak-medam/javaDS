import java.util.ArrayList;
public class ListOps {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // Add operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Get operation
        int element = list.get(2); //O(1)
        System.out.println(element);

        // Delete
        list.remove(2);
        System.out.println(list);

        // Set
        list.set(2, 10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // size
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
