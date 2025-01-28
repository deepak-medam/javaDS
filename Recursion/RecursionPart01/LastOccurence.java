public class LastOccurence {

    public static int lastOccurence(int arr[], int k, int i) {
        // check if current element has the key if it does retun the index
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, k, i + 1);
        if (isFound == -1 && arr[i] == k) {
            return i;
        }

        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(lastOccurence(arr, 5, 0));
    }

}
