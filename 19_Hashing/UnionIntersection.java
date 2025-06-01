import java.util.HashSet;

public class UnionIntersection {
    public static void main(String args[]){
        int arr1[] = {7, 3, 9, 2};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> unionSet = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            unionSet.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            unionSet.add(arr2[i]);
        }
        System.out.println("No of elements in union set is: " + unionSet.size());

        // can use set.clear() and use same set
        // Intersection
        HashSet<Integer> intersectionSet = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            intersectionSet.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(intersectionSet.contains(arr2[i])){
                count++;
                intersectionSet.remove(arr2[i]);
            }
        }

        System.out.println("No of elements in intersection set is: " + count);
    }
    
}
