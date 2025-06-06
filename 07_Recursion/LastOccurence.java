public class LastOccurence {
    /* My approach
    public static int lastOccurence(int arr[], int key, int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    */
    /* Lesson approach */
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        // int i = arr.length-1;
        System.out.println(lastOccurence(arr, key, 0));
    }    
}
